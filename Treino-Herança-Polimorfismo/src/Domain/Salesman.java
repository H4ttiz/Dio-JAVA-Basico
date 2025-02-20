package Domain;

public  non-sealed class Salesman extends Employee {

    private double percentPerSold;

    private double soldAmount;

    public Salesman(String code,
                    String name,
                    String address,
                    int age,
                    double salary,
                    double percentPerSold,
                    double soldAmount) {
        super(code, name, address, age, salary); //  acessar métodos ou atributos da classe pai com construtores
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    }

    public Salesman(){

    }

    @Override // Explica como funciona a Regra de Salario da class Filho para a Pai
    public double getFullSalary() {
        return this.salary + (percentPerSold * soldAmount) / 100;
    }

    @Override // SobrEscrita | super.getCode = Regra da Classe Pai
    public String getCode(){
        return "SL: " + this.code;
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }
}
