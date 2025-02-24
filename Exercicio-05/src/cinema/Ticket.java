package cinema;

public sealed abstract class Ticket permits HalfPrice, FamilyPrice {

    protected String nameOfMovie;
    protected double price;
    protected String type;
    protected int amount;
    protected double priceFull;

    public double getPriceFull() {
        return priceFull;
    }

    public void setPriceFull(double priceFull) {
        this.priceFull = priceFull;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }
        this.amount = amount;
        calculatePriceFull(); // Recalcula o preço total quando a quantidade é alterada
    }

    public String getNameOfMovie() {
        return nameOfMovie;
    }

    public void setNameOfMovie(String nameOfMovie) {
        this.nameOfMovie = nameOfMovie;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.price = price;
        calculatePriceFull(); // Recalcula o preço total quando o preço unitário é alterado
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
        calculatePriceFull(); // Recalcula o preço total quando o tipo é alterado
    }

    public void buy() {
        System.out.println("Filme: " + nameOfMovie);
        System.out.println("Preço unitário: " + price);
        System.out.println("Quantidade: " + amount);
        System.out.println("Preço total: " + priceFull);
        System.out.println("Tipo: " + type);
    }

    // Método abstrato para calcular o priceFull
    protected abstract void calculatePriceFull();

}