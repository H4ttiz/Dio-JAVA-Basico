package cinema;

public non-sealed class FamilyPrice extends Ticket {

    @Override
    protected void calculatePriceFull() {
        if (price == 0 || amount == 0) {
            return; // Não calcula se os valores necessários não estiverem definidos
        }
        this.priceFull = price * amount * 0.75; // Desconto de 25% para famílias
    }
}