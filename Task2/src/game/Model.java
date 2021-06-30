package game;

import java.util.ArrayList;

public class Model {
    private int number;
    private int lowerBound;
    private int upperBound;
    private ArrayList<Integer> enteredValue;


    public Model() {
        enteredValue = new ArrayList<>();
    }

    public void randInt() {
        lowerBound = GlobalConstants.PRIMARY_lOWER_BOUND;
        upperBound = GlobalConstants.PRIMARY_UPPER_BOUND;
        number = (int) Math.ceil(Math.random() * (upperBound - lowerBound - 1) + lowerBound);

    }

    public void addNumber(int number) {
        enteredValue.add(number);
    }

    public boolean numberGuessed() {
        return number == enteredValue.get(enteredValue.size() - 1);
    }

    public boolean numberIsGreater() {
        return number < enteredValue.get(enteredValue.size() - 1);
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public void setLowerBound(int lowerBound) {
        if ((number - lowerBound) < (number - this.lowerBound))
            this.lowerBound = lowerBound;
    }

    public void setUpperBound(int upperBound) {
        if ((upperBound - number) < (this.upperBound - number))
            this.upperBound = upperBound;
    }

    public ArrayList<Integer> getEnteredValue() {
        return enteredValue;
    }
}