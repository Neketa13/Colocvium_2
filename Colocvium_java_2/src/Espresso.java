public class Espresso implements Coffee{
    @Override
    public void addSugar() {
        System.out.println("Сахар добавлен в кофе");
    }

    @Override
    public void addHotWater() {
        System.out.println("Горячая вода добавлена в кофе");
    }

    @Override
    public void addMilk() {
        System.out.println("Молоко добавлено в кофе");
    }
}
