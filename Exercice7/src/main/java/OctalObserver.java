public class OctalObserver extends Observer{

    public OctalObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    @Override
    public void update() {
        super.update();
        System.out.println("OctalObserver has been updated");
    }
}
