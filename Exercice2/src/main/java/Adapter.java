public class Adapter implements FRApp {
    USAApp usaApp = null;

    public Adapter(USAApp usaApp){
        this.usaApp=usaApp;
    }


    @Override
    public double getSpeedKmph() {
        return usaApp.getSpeedMph()*1.6;
    }

    @Override
    public void showSpeed(){
        System.out.println("FR : "+getSpeedKmph()+" Km/H");
    }
}
