import cinema.FamilyPrice;
import cinema.HalfPrice;
import cinema.Ticket;

public class Main {
    public static void main(String[] args) {
        Ticket halfPrice = new HalfPrice();
        halfPrice.setPrice(22.50);
        halfPrice.setAmount(10);
        halfPrice.setType("halfprice"); // O priceFull será calculado automaticamente aqui
        halfPrice.setNameOfMovie("Enilson");

        halfPrice.buy();

        Ticket familyPrice = new FamilyPrice();
        familyPrice.setPrice(20.00);
        familyPrice.setAmount(4);
        familyPrice.setType("familyprice"); // O priceFull será calculado automaticamente aqui
        familyPrice.setNameOfMovie("Família do Futuro");

        familyPrice.buy();
    }
}