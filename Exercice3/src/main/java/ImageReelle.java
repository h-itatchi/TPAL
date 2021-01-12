public class ImageReelle implements Image{

    private String file;

    public ImageReelle(String file) {
        System.out.println("\nImageReelle.class |instantiation of ImageReelle");
        this.file = file;
    }

    @Override
    public void showImage() {
        System.out.println("ImageReelle.class |showing of Image");
        // show in JavaFX
    }
}
