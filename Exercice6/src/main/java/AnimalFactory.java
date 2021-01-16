public class AnimalFactory implements FactoryMethod{
    public static final String dog="dog",duck="duck";

    @Override
    public Animal createInstance(String type) {
        if(type.toLowerCase().equals(dog)){
            return new Dog();
        }
        if(type.toLowerCase().equals(duck)){
            return new Duck();
        }
        return null;
    }
}
