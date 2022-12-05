import java.util.Scanner;

public class StartCafe {


    public static CafeFactory getFactoryByCafeCode(String lang) {

        switch (lang) {
            case "Women":
                return new LunchForWomen();
            case "Men":
                return new LunchForMen();
            default:
                throw new RuntimeException("ERROR" + lang);

        }
    }



}
