package baby;

public class Baby {
    int servings = 20;

    void feed(int servings) {
        System.out.println("parameter servings: " + servings);
        this.servings = this.servings + servings;
        System.out.println("inner servings: " + servings);
    }

    public void poops() {
        System.out.println("All better!");
        servings = 0;
    }
    /* 
    public static void main(String[] args) {
        Baby baby1 = new Baby();
        System.out.println(baby1.servings);
        baby1.feed(100);
        System.out.println(baby1.servings);
        baby1.poops();
        System.out.println(baby1.servings);
    }
*/
}
