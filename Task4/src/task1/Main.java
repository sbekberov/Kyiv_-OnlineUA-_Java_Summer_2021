package task1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> array = initList();


        Collections.sort(array);

        System.out.println(array);
        countEntries(array);
    }

    public static ArrayList<Integer> initList() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(4);
        array.add(5);
        array.add(-6);
        array.add(4);
        array.add(5);
        array.add(3);
        array.add(4);
        array.add(2);
        array.add(4);
        array.add(5);
        array.add(7);
        return array;
    }

    public static void countEntries(ArrayList<Integer> array) {
        int i = 0;
        int count = 0;
        int value = 0;
        while(i < array.size()) {
            if(i == 0)
                value = array.get(0);
            else {
                if(array.get(i).equals(array.get(i - 1)))
                    ++count;
                else {
                    System.out.println(value + " " + ++count);
                    count = 0;
                    value = array.get(i);
                }
            }
            if(i == array.size() - 1)
                System.out.println(value + " " + ++count);
            i++;
        }
    }
}
