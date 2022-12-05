import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() throws Exception {
        Main main=new Main();
        String line="Men";
        StartCafe startCafe=new StartCafe();
        CafeFactory factory = startCafe.getFactoryByCafeCode(line);
        String secondLine="Vanilla";
        Cake cake = main.getCake(factory,secondLine);
        Assert.assertEquals("Ваниль добавлена в десерт", "Ваниль добавлена в десерт");
    }
}