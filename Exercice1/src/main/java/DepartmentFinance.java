public class DepartmentFinance extends Department {

    public DepartmentFinance(String code) {
        super(code);
    }

    @Override
    public void show() {
        System.out.println("    this is Finance Department  Code : "+code);
    }

}
