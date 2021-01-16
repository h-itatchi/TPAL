public abstract class Observer {

    private Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
    }

    public void update(){
        System.out.print(" State = "+subject.getState()+"  | ");
    };
}
