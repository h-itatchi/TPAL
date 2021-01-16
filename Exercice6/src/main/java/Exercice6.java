public class Exercice6 {

    public static void main(String[] args) {
        AbstractFactory factory;
        factory = new WhiteDuckFactory();
        Animal animal;
        Color color;
        animal = factory.createAnimal();
        color = factory.createColor();
        System.out.println(animal.getAnimal());
        animal.makeSound();
        System.out.println(color.getColor());
        System.out.println("/////////////////////////////////");
        factory = new BrownDogFactory();
        animal = factory.createAnimal();
        color = factory.createColor();
        System.out.println(animal.getAnimal());
        animal.makeSound();
        System.out.println(color.getColor());
    }
}
