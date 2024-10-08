import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

   @Test
   public void shouldReturnTheSound() {
       Cat cat = new Cat(feline);
       String actualSound = cat.getSound();
       Assert.assertEquals("Мяу", actualSound);
       }



   @Test
   public void getFoodCatWorkCorrectly() throws Exception {
       Cat cat = new Cat(feline);
       Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
       List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
       List<String> actualFood = cat.getFood();
       Assert.assertEquals("Должен вернуться список - Животные, Птицы, Рыба", expectedFood, actualFood);
   }
}
