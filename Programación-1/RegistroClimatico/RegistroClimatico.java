import java.util.Random;

public class RegistroClimatico {
    private static final int MESES = 12;
    private static final int DIAS_MAX = 31;

    public static final int SENTINELA = Integer.MIN_VALUE;

    private static final String[] NOMBRES_MESES = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };
    private static final int[] DIAS_MES  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] TEMP_MIN  = { 7,  8, 10, 11, 14, 18, 20, 21, 18, 15, 11,  8};
    private static final int[] TEMP_MAX  = {17, 18, 20, 21, 24, 28, 31, 31, 28, 24, 20, 17};

    private final int[][] temperaturas = new int[MESES][DIAS_MAX];

    private final Random random = new Random();

    public RegistroClimatico() {
        rellenarTemperaturas();
    }

    private void rellenarTemperaturas() {
        for (int mes = 0; mes < MESES; mes++) {
            for (int dia = 0; dia < DIAS_MAX; dia++) {
                if (dia < DIAS_MES[mes]) {
                    int rango = TEMP_MAX[mes] - TEMP_MIN[mes] + 1;
                    temperaturas[mes][dia] = TEMP_MIN[mes] + random.nextInt(rango);
                } else {
                    temperaturas[mes][dia] = SENTINELA;
                }
            }
        }
    }

    public void mostrarTabla() {
        System.out.println();
        System.out.println("=== TEMPERATURAS DIARIAS DE MÁLAGA (°C) ===");

        System.out.printf("%-11s", "Mes");
        for (int dia = 1; dia <= DIAS_MAX; dia++) {
            System.out.printf("%3d", dia);
        }
        System.out.println();

        for (int mes = 0; mes < MESES; mes++) {
            System.out.printf("%-11s", NOMBRES_MESES[mes]);
            for (int dia = 0; dia < DIAS_MAX; dia++) {
                if (temperaturas[mes][dia] == SENTINELA) {
                    System.out.printf("%3s", "--");
                } else {
                    System.out.printf("%3d", temperaturas[mes][dia]);
                }
            }

            System.out.println();
        }
    }

    public double temperaturaMediaMes(int numeroMes) {
        if (numeroMes < 1 || numeroMes > MESES) {
            throw new IllegalArgumentException(
                "El mes debe estar entre 1 y 12 (has escrito " + numeroMes + ").");
        }

        int indice = numeroMes - 1;

        return (double) sumaDelMes(indice) / DIAS_MES[indice];
    }

    private int sumaDelMes(int indiceMes) {
        int suma = 0;
        for (int dia = 0; dia < DIAS_MES[indiceMes]; dia++) {
            suma += temperaturas[indiceMes][dia];
        }
        return suma;
    }

    public String getNombreMes(int numeroMes) {
        return NOMBRES_MESES[numeroMes - 1];
    }

    public DiaTemperatura diaMasCaluroso() {
        int mesMax = 0;
        int diaMax = 0;

        int maxima = temperaturas[0][0];

        for (int mes = 0; mes < MESES; mes++) {
            for (int dia = 0; dia < DIAS_MAX; dia++) {
                int t = temperaturas[mes][dia];

                if (t != SENTINELA && t > maxima) {
                    maxima = t;
                    mesMax = mes;
                    diaMax = dia;
                }
            }
        }

        return new DiaTemperatura(NOMBRES_MESES[mesMax], diaMax + 1, maxima);
    }

    public DiaTemperatura diaMasFrio() {
        int mesMin = 0;
        int diaMin = 0;

        int minima = temperaturas[0][0];

        for (int mes = 0; mes < MESES; mes++) {
            for (int dia = 0; dia < DIAS_MAX; dia++) {
                int t = temperaturas[mes][dia];

                if (t != SENTINELA && t < minima) {
                    minima = t;
                    mesMin = mes;
                    diaMin = dia;
                }
            }
        }
        return new DiaTemperatura(NOMBRES_MESES[mesMin], diaMin + 1, minima);
    }

    public int contarDiasSuperioresA(int umbral) {
        int contador = 0;
        for (int mes = 0; mes < MESES; mes++) {
            for (int dia = 0; dia < DIAS_MAX; dia++) {
                int t = temperaturas[mes][dia];
                if (t != SENTINELA && t > umbral) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public double mediaVerano() {
        int[] mesesVerano = {5, 6, 7};
        return mediaDeMeses(mesesVerano);
    }

    public double mediaInvierno() {
        int[] mesesInvierno = {11, 0, 1};
        return mediaDeMeses(mesesInvierno);
    }

    private double mediaDeMeses(int[] indicesMeses) {
        int suma = 0;
        int totalDias = 0;

        for (int indice : indicesMeses) {
            suma += sumaDelMes(indice);
            totalDias += DIAS_MES[indice];
        }
        return (double) suma / totalDias;
    }
}

class DiaTemperatura {
    private final String nombreMes;
    private final int dia;
    private final int temperatura;

    public DiaTemperatura(String nombreMes, int dia, int temperatura) {
        this.nombreMes = nombreMes;
        this.dia = dia;
        this.temperatura = temperatura;
    }

    public String getNombreMes() {
        return nombreMes;
    }

    public int getDia() {
        return dia;
    }

    public int getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return temperatura + "°C el " + dia + " de " + nombreMes.toLowerCase();
    }
}