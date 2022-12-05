public class Macarons implements Cake{
    @Override
    public void withChocolate() {
        System.out.println("Шоколад добавлен в десерт");
    }

    @Override
    public void withBerries() {
        System.out.println("Ягоды добавлены в десерт");
    }

    @Override
    public void withVanilla() {
        System.out.println("Ваниль добавлена в десерт");
    }
}
