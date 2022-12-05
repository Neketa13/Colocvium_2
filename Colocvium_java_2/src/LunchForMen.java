public class LunchForMen implements CafeFactory{
    @Override
    public Cake cookCake() {
        return new Cheesecake();
    }

    @Override
    public Coffee cookCoffee() {
        return new Espresso();
    }
}
