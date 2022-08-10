package example;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Lion lion;

    @Mock
    Feline feline;

    @Test
    public void testLionMale() throws Exception {
        lion = new Lion("Самец");
        boolean hasMane = lion.hasMane;
        assertEquals(true,hasMane);
    }

    @Test
    public void testLionFemale() throws Exception {
        lion = new Lion("Самка");
        boolean hasMane = lion.hasMane;
        assertEquals(false,hasMane);
    }

    @Test(expected = Exception.class)
    public void testLionWithoutGender() throws Exception {
        lion = new Lion("Нечто");
    }

    @Test
    public void getKittens() {
        assertEquals(0,lion.getKittens());
    }

    @Test
    public void doesHaveMane() throws Exception {
        lion = new Lion("Самец");
        assertEquals(true,lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeLionFemale() throws Exception {
        lion = new Lion("Самка");
        assertEquals(false,lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void doesHaveManeException() throws Exception {
        lion = new Lion("Нечто");
        lion.doesHaveMane();
    }

    @Test
    public void getFood() throws Exception {
        lion = new Lion(feline);
        System.out.println(lion.getFood());
    }
}