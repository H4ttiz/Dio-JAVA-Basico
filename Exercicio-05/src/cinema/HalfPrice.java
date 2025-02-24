package cinema;

public non-sealed class HalfPrice extends Ticket {

    @Override
    protected void calculatePriceFull() {
        if (price == 0 || amount == 0) {
            return; // Não calcula se os valores necessários não estiverem definidos
        }
        this.priceFull = (price * amount) / 2; // Meia-entrada: preço total é metade
    }
}