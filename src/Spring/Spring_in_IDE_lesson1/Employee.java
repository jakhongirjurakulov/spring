package Spring.Spring_in_IDE_lesson1;

public class Employee {
    Address address;

    public Employee(Address address) {
//        this.address = new Address(); // tight coupling
        this.address = address;
    }

    public void show() {
        System.out.println(address);
    }
}
