public class Exercice3 {

    public static void main(String[] args) {
        Image image = new ImageProxy("pict.jpg");
        System.out.println("\nMain calling show on Proxy object 1st");
        image.showImage();
        System.out.println("\nMain calling show on Proxy object 2nd");
        image.showImage();
    }
}
