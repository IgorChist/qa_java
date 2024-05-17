import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensWorkCorrectly() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedKittenCount = 1;
        int kittensCount = lion.getKittens();
        Assert.assertEquals("Должно вернуться значение - " + expectedKittenCount, expectedKittenCount, kittensCount);
    }

    @Test
    public void getFoodLionWorkCorrectly() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = lion.getFood();
        Assert.assertEquals("Должен вернуться список - Животные, Птицы, Рыба", expectedFood, actualFood);
    }

    @Test(expected = Exception.class)
    public void doesHaveMane() throws Exception {
        new Lion("Заяц", feline);
    }
}