package example;

import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    private final static String TEST_GET_FAMILY_STRING =
            "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

    @Test
    public void testGetFamily() {
        Animal animal = new Animal();
        String message = animal.getFamily();
        assertEquals(TEST_GET_FAMILY_STRING, message);
    }

    @Test(expected = Exception.class)
    public void testGetFoodException() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Нечто");
    }
}