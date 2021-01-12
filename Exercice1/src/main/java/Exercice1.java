public class Exercice1 {

    public static void main(String[] args) {
        Department finance = new DepartmentFinance("Dep 01");
        Department comptabilite = new DepartmentFinance("Dep 02");
        Department gestion = new DepartmentFinance("Dep 03");
        PilotageControle pilot = new PilotageControle("Dep 04");
        pilot.addDepartment(finance,comptabilite,gestion);
        pilot.show();
    }
}
