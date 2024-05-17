import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParamTest {
    private boolean expectedResult;
    private String sex;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
                };
    }
    public LionParamTest(String sex, boolean expectedResult) {
        this.sex = sex;
        this.expectedResult = expectedResult;
    }

    @Test
    public void doesHaveMane() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(expectedResult, lion.doesHaveMane());
        }

   }
