public class Cappuccino implements Coffee{
    @Override
    public void addHotWater() {
        System.out.println("Горячая вода добавлена в кофе");
    }

    @Override
    public void addMilk() {
        System.out.println("Молоко добавлено в кофе");
    }

    @Override
    public void addSugar() {
        System.out.println("Сахар добавлен в кофе");
    }
}
