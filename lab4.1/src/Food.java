public class Food {

    public  boolean equals(String s) {
        return this.getClass().getSimpleName().equals(s);
    }
}

class Apple extends Food {

}
class Cheese extends Food {

}
class Milk extends Food {

    private Fatness fat = null;

    public Fatness getFat() {
        return fat;
    }

    public void setFat(Fatness fat) {
        this.fat = fat;
    }
}
enum Fatness {
    ONE_AND_A_HALF,
    TWO_AND_A_HALF,
    FIVE
}