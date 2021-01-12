public class Exercice2 {

    public static void main(String[] args) {
        USAApp usaApp = new USAApp();
        FRApp frApp = new Adapter(usaApp);
        usaApp.showSpeed();
        frApp.showSpeed();
    }
}
