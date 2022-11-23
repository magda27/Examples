public class ObjectComparisionExample {
    public static void main(String[]args){

        Double x = 123.45555;
        Long y = 9887544L;
        boolean isE = x.equals(y);
        boolean isW = x.equals(123.45555);

        System.out.println(isE + " " + isW);
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());

        x = 122.44;
        System.out.println(x.hashCode());

        Employee employee1 = new Employee(918, "Maria");
        Employee employee2 = new Employee(918, "Maria");

        int a = employee1.hashCode();
        int b = employee2.hashCode();
        System.out.println("hashcode of emp1 = " + a);
        System.out.println("hashcode of emp2 = " + b);
        System.out.println("Comparing objects emp1 and emp2 = " + employee1.equals(employee2));
    }
}
class Employee{
    private int regno;
    private String name;

    public Employee(int regno, String name) {
        this.regno = regno;
        this.name = name;
    }

    public int getRegno() {
        return regno;
    }
    public void setRegno(int regno) {
        this.regno = regno;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}