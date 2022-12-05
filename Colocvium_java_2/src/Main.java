import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StartCafe startCafe=new StartCafe();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Men или Women для получения ланч");

        String line = scanner.nextLine();
        System.out.println("Выберите, с чем будет десерт: Berries,Chocolate,Vanilla");
        String secondLine = scanner.nextLine();
        System.out.println("Выберите, что добавить в кофе: Milk, HotWater, Sugar");
        String thirdLine = scanner.nextLine();

        CafeFactory factory = startCafe.getFactoryByCafeCode(line);

        Cake cake = getCake(factory,secondLine);

        Coffee coffee = getCoffee(factory,thirdLine);


   }


    public static Cake getCake(CafeFactory factory, String secondLine)
    {
        Cake cake=factory.cookCake();
        if (secondLine.equals("Chocolate")) {
            cake.withChocolate();
        } else if (secondLine.equals("Berries")) {
            cake.withBerries();
        } else if (secondLine.equals("Vanilla")) {
            cake.withVanilla();
        } else
            throw new RuntimeException("ERROR" + secondLine);
        return factory.cookCake();
    }

    public static Coffee getCoffee(CafeFactory factory, String thirdLine)
    {
        Coffee coffee=factory.cookCoffee();
        if (thirdLine.equals("Sugar")) {
            coffee.addSugar();
        } else if (thirdLine.equals("Milk")) {
            coffee.addMilk();
        } else if (thirdLine.equals("HotWater")) {
            coffee.addHotWater();
        } else
            throw new RuntimeException("ERROR" + thirdLine);
        return factory.cookCoffee();
    }

}