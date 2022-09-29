package homework6;

public class AppForEmployee {

    public static void main(String[] args) {
        String name = "Vasya";
        String position = "worker";
        String email = "vasya@gmail.com";
        String phone = "111-22-33";
        int age = 20;

        Employee employee = new Employee(name, position, email, phone, age);

        System.out.println("Employee info" + "\n-------------------------" +
                "\nname: " + employee.getName() + "\nposition: " + employee.getPosition() +
                "\nemail: " + employee.getEmail() + "\nphone: " + employee.getPhone() +
                "\nage: " + employee.getAge());
    }

}
