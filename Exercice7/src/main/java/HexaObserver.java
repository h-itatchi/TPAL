public class HexaObserver extends Observer{

    public HexaObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    @Override
    public void update() {
        super.update();
        System.out.println("HexaObserver has been updated");
    }
}
