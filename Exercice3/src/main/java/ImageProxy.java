public class ImageProxy implements Image {

    private Image image = null;
    private String file;

    public ImageProxy(String file) {
        System.out.println("\nImageProxy.class  |instantiation of ImageProxy");
        this.file = file;
    }

    @Override
    public void showImage() {
        if (image == null) {
            System.out.println("\nImageProxy.class  |instantiation of ImageReelle");
            this.image = new ImageReelle(file);
        }
        System.out.println("ImageProxy.class  |showing of Image");
        this.image.showImage();
    }

}
