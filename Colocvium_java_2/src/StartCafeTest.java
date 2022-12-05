import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StartCafeTest {

    StartCafe startCafe=new StartCafe();
    @Test
    public void out() {
        Assert.assertEquals("Chocolate","Chocolate");
    }


}