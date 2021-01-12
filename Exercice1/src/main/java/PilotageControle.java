public class PilotageControle extends DepartmentComposite{

    public PilotageControle(String code) {
        super(code);
    }

    @Override
    public void show() {
        System.out.println("this is Pilotage/Controle Department  Code : "+code);
        super.show();
    }
}
