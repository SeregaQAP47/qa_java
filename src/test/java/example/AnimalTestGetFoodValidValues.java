package example;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalTestGetFoodValidValues {
    private final String animalKind;
    private static final String VEGAN = "Травоядное";
    private static final String PREDATOR = "Хищник";

    public AnimalTestGetFoodValidValues(String animalKind) {
        this.animalKind = animalKind;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getSumData() {
        return new Object[][]{
                {VEGAN},
                {PREDATOR},
        };
    }

    @Test
    public void testGetFoodWithValidValues() throws Exception {
        Animal animal = new Animal();
        List<String> eats = animal.getFood(animalKind);
        if (animalKind == VEGAN) {
            List<String> test1 = new ArrayList<>();
            test1.add("Трава");
            test1.add("Различные растения");
            assertEquals(test1.toString(), eats.toString());
        } else if (animalKind == PREDATOR) {
            List<String> test2 = new ArrayList<>();
            test2.add("Животные");
            test2.add("Птицы");
            test2.add("Рыба");
            assertEquals(test2.toString(), eats.toString());
        }
    }
}