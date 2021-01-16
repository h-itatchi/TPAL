public class Duck implements Animal{
    @Override
    public String getAnimal() {
        return "This is Duck Animal";
    }

    @Override
    public void makeSound() {
        System.out.println("wuk!! wuk!!");
    }
}
