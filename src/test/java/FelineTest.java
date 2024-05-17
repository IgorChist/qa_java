import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;
 public class FelineTest {

    @Test
    public void eatMeatFelineWorkCorrectly() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        Assert.assertEquals("Должен вернуться список - Животные, Птицы, Рыба", expectedFood, actualFood);
    }

    @Test
    public void shouldReturnFamily() {
        Feline feline = new Feline();
        String actualFamily = feline.getFamily();
        Assert.assertEquals("Должно вернуться значение - Кошачьи","Кошачьи", actualFamily);
    }
@Test
    public void getKittensWithoutArgument() {
    Feline feline = new Feline();
        int actualKittensCount = feline.getKittens();
        Assert.assertEquals("Должно вернуться значение - 1", 1, actualKittensCount);
    }

    @Test
    public void getKittensWithArgument() {
        Feline feline = new Feline();
        int expectedKittensCount = 4;
        int actualKittensCount = feline.getKittens(expectedKittensCount);
        Assert.assertEquals("Должно вернуться значение - " + expectedKittensCount, expectedKittensCount, actualKittensCount);
    }
}
