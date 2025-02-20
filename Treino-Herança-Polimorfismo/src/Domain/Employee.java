package Domain;

public sealed abstract class Employee permits Maneger, Salesman { // seald(selada) --> permite apenas as classe
                                                                 // no-sealed(não seladas) instanciar-se dela
    protected String code;

    protected String name;

    protected String address;

    protected int age;

    protected double salary;

    public Employee(String code, // construtos com argumentos
                    String name,
                    String address,
                    int age,
                    double salary) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }
    public Employee(){ // construtor sem argumentos

    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract double getFullSalary();
}
