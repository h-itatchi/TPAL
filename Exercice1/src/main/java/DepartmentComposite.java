import java.util.ArrayList;

// Composite
public abstract class DepartmentComposite extends Department {

    // Children
    private ArrayList<Department> subDepartments = new ArrayList<>();

    public DepartmentComposite(String code) {
        super(code);
    }

    @Override
    public void show() {
        subDepartments.forEach(d -> {
            d.show();
        });
    }

    public void addDepartment(Department... dep) {
        for (Department d : dep) {
            if (!subDepartments.contains(dep)) {
                subDepartments.add(d);
            }
        }
    }

    public void removeDepartment(Department dep) {
        subDepartments.remove(dep);
    }

    public Department getsubDepartment(String code) {
        Department dep = null;
        for (Department d : subDepartments) {
            if (d.code.equals(code)) {
                dep = d;
            }
        }
        return dep;
    }
}
