package Domain;

public non-sealed class Maneger extends Employee {
    private String login;

    private String password;

    private double commission;

    public Maneger(String code,
                   String name,
                   String address,
                   int age,
                   double salary,
                   String login,
                   String password,
                   double commission) {
        super(code, name, address, age, salary);
        this.login = login;
        this.password = password;
        this.commission = commission;
    }
    public Maneger(){

    }
    @Override
    public String getCode(){
        return "MNG: " + this.code;
    }

    @Override // Explica como funciona a Regra de Salario da class Filho para a Pai
    public double getFullSalary() {
        return this.salary + this.commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
