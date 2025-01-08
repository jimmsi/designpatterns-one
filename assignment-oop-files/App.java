public class App {
    public static void main(String[] args) {
        Role role1 = new Role("Teacher");
        Role role2 = new Role("Student");
        Employee employee1 = new Employee("Jimmy", "Yrgo", role1);
        System.out.println(employee1);

        employee1.addRole(role2);
        System.out.println(employee1);

        employee1.removeRole(role2);
        System.out.println(employee1);

    }
}
