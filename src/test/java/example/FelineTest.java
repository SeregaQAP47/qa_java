package example;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    private Feline feline;


    @Test
    public void eatMeat() throws Exception {
        feline = new Feline();
        List<String> expectList = List.of("Животные", "Птицы", "Рыба");
        System.out.println(feline.eatMeat());
        assertEquals(expectList,feline.eatMeat());
    }

    @Test
    public void getFamily() {
        feline = new Feline();
        System.out.println(feline.getFamily());
    }

    @Test
    public void getKittens() {
        feline = new Feline();
        System.out.println(feline.getKittens());
    }

    @Test
    public void testGetKittens() {
        feline.getKittens(5);
        Mockito.verify(feline).getKittens(5);
    }
}