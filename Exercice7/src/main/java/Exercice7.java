import java.util.Random;

public class Exercice7 {

    public static void main(String[] args) {
        Subject subject = new Subject();
        for (int i = 0; i < 10; i++) {
            int j = (new Random()).nextInt(2);
            switch (j) {
                case 0:
                    subject.attach(new BinaryObserver(subject));
                    break;
                case 1:
                    subject.attach(new OctalObserver(subject));
                    break;
                case 2:
                    subject.attach(new HexaObserver(subject));
            }
        }

        subject.setState(5);
        subject.notifyAllObservers();
    }

}
