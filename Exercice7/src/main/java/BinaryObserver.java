public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    @Override
    public void update() {
        super.update();
        System.out.println("BinaryObserver has been updated");
    }
}
