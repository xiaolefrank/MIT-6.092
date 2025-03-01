public class Baby {
    String name;
    boolean isMale;
    double weight;
    static int numBabiesMade = 0;

    Baby(String myname, boolean Malebaby) {
        name = myname;
        isMale = Malebaby;
        numBabiesMade++;
        //numBabiesMade = 0;
    }

    void sayhi() {
        System.out.println("Hi,I'm " + name);
    }

    void eat(double foodweight) {
        weight += foodweight;
    }

    void poop() {
        weight -= 0.1;
    }
}
