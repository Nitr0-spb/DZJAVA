package Lesson4;

public class Personal {

    String name;
    String status;
    String phone;
    int salary;
    int age;


    Personal(String name, String status, String phone, int salary, int age) {
        this.name = name;
        this.status = status;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String inPersonalAll() {
        return this.name + ", work as a " +
                this.status + ", my number " +
                this.phone + ", my salary in month " +
                this.salary + " and i am " +
                this.age + " years old.";

    }
    String getName() {
        return name;
    }

    String getStatus() {
        return status;
    }

    String getPhone() {
        return phone;
    }

    int getSalary() {
        return (int) salary;
    }

    int getAge() {
        return (int) age;
    }

}
