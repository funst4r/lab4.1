import java.util.ArrayList;

public class Breakfast {

    private int size = 0;

    private Food[] breakfast = new Food[20];

    public void add(Food food) {
        if (size != 20) breakfast[size++] = food;
    }

    private int count(String s) {
        int amount = 0;
        for (int i = 0; i < size;i++)
            if (breakfast[i].equals(s)) amount++;
        return amount;
    }

    public void logCount(String s) {
        System.out.println(count(s));
    }

}