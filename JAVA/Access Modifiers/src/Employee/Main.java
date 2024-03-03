package Employee;
public class Main {
    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.setName("Jit");
        obj.setEmpId(101);
        obj.setSalary(5000);
        System.out.println(obj.getName());
        System.out.println(obj.getEmpId());
        System.out.println(obj.getSalary());
    }
}