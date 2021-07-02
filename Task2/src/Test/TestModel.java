package Test;

import game.GlobalConstants;
import game.Model;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class TestModel {
    private static Model model;
    private static Field number;
    private static Field lowerBound;
    private static Field upperBound;
    private static Field enteredValue;

    @BeforeClass
    public static void initTest() throws NoSuchFieldException {
        model = new Model();
        number = Model.class.getDeclaredField("number");
        upperBound = Model.class.getDeclaredField("upperBound");
        lowerBound = Model.class.getDeclaredField("lowerBound");
        enteredValue = Model.class.getDeclaredField("enteredValue");
        number.setAccessible(true);
        upperBound.setAccessible(true);
        lowerBound.setAccessible(true);
        enteredValue.setAccessible(true);
    }

    @Test
    public void randInt() throws IllegalAccessException {
        for (int i = 0; i < 100000; i++) {
            model.randInt();
            int number = TestModel.number.getInt(model);
            int lowerBound = TestModel.lowerBound.getInt(model);
            int upperBound = TestModel.upperBound.getInt(model);
            Assert.assertEquals(lowerBound, GlobalConstants.PRIMARY_lOWER_BOUND);
            Assert.assertEquals(upperBound, GlobalConstants.PRIMARY_UPPER_BOUND);
            Assert.assertTrue(number >= GlobalConstants.PRIMARY_lOWER_BOUND && number <= GlobalConstants.PRIMARY_UPPER_BOUND);
        }
    }

    @Test
    public void addNumber() throws IllegalAccessException {
        enteredValue.set(model, new ArrayList<>());
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int rand = (int) Math.round(Math.random() * GlobalConstants.PRIMARY_UPPER_BOUND - 2) + 1;
            ints.add(rand);
            model.addNumber(rand);
        }
        ArrayList<Integer> origin = (ArrayList<Integer>) enteredValue.get(model);
        for (int i = 0 ; i < origin.size(); i++){
            Assert.assertEquals(origin.get(i), ints.get(i));
        }
    }

    @Test
    public void numberGuessed() throws IllegalAccessException {
        int number = 82;
        TestModel.number.set(model, number);
        ArrayList<Integer> list = (ArrayList<Integer>) enteredValue.get(model);
        list.add(number);
        Assert.assertTrue(model.numberGuessed());
    }

    @Test
    public void numberIsGreater() throws IllegalAccessException {
        int number = 82;
        TestModel.number.set(model, number);
        ArrayList<Integer> list = (ArrayList<Integer>) enteredValue.get(model);
        list.add(number + 12);
        Assert.assertTrue(model.numberIsGreater());
    }

    @Test
    public void getLowerBound() throws IllegalAccessException {
        lowerBound.set(model, 40);
        Assert.assertEquals(model.getLowerBound(), 40);
    }

    @Test
    public void getUpperBound() throws IllegalAccessException {
        upperBound.set(model, 60);
        Assert.assertEquals(model.getUpperBound(), 60);
    }

    @Test
    public void getEnteredValue() throws IllegalAccessException {
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(7, 69, 15, 74, 52, 99, 4, 45));
        enteredValue.set(model, new ArrayList<>(ints));
        Assert.assertEquals(ints, model.getEnteredValue());
    }
}

