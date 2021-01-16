public class BrownDogFactory implements AbstractFactory {
    private final AnimalFactory animalFactory;
    private final ColorFactory colorFactory;

    public BrownDogFactory() {
        animalFactory = new AnimalFactory();
        colorFactory = new ColorFactory();
    }

    @Override
    public Animal createAnimal() {
        return animalFactory.createInstance("dog");
    }

    @Override
    public Color createColor() {
        return colorFactory.createInstance("brown");
    }
}
