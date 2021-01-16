import java.util.Random;

public class Exercice5 {

    public static void main(String[] args) {
        Calculation calc = new Calculation(new MultiAdd());
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int n1 = r.nextInt(50), n2 = r.nextInt(50);
            System.out.println(n1 + " X " + n2 + " = " + calc.multiplicate(n1, n2));
            if (r.nextBoolean()) {
                calc.setMultipication(new MultiOperator());
            } else {
                calc.setMultipication(new MultiAdd());
            }
        }
    }
}
