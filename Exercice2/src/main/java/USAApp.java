import java.util.Random;

public class USAApp {

    public double getSpeedMph(){
        return (new Random()).nextInt(200);
    }

    public void showSpeed(){
        System.out.println("USA : "+getSpeedMph()+" M/H");
    }
}
