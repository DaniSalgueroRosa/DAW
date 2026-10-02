public class herencias1 {
    public static void main(String[] args) {
        herencias canary = new herencias ("Piolin","Fringllidae");
        herencias dog = new herencias("Cerbero", "Canidae");

        System.out.println(canary.getName());
        canary.makeSound();
        System.out.println(dog.getName());
        dog.makeSound();
    }
}
