public class LunchForWomen implements CafeFactory{
    @Override
    public Coffee cookCoffee() {
        return new Cappuccino();
    }

    @Override
    public Cake cookCake() {
        return new Macarons();
    }
}
