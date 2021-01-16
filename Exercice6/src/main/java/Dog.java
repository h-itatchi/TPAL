public class Dog implements Animal {
    @Override
    public String getAnimal() {
        return "This is Dog Animal";
    }

    @Override
    public void makeSound() {
        System.out.println("wuf!! wuf!! ");
    }
}
