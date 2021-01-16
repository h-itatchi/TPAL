public class ColorFactory implements FactoryMethod{
    public static final String white="white",brown="brown";

    @Override
    public Color createInstance(String type) {
        if(type.toLowerCase().equals(white)){
            return new White();
        }
        if(type.toLowerCase().equals(brown)){
            return new Brown();
        }
        return null;
    }
}
