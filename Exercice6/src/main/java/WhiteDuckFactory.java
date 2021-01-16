public class WhiteDuckFactory implements AbstractFactory {
    private final AnimalFactory animalFactory;
    private final ColorFactory colorFactory;

    public WhiteDuckFactory() {
        animalFactory = new AnimalFactory();
        colorFactory = new ColorFactory();
    }

    @Override
    public Animal createAnimal() {
        return animalFactory.createInstance("duck");
    }

    @Override
    public Color createColor() {
        return colorFactory.createInstance("white");
    }
}
