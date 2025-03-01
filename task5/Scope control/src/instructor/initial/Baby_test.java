package instructor.initial;

import baby.Baby;

public class Baby_test {
    int test_servings;
    Baby_test(){
        this(20);
    } 
    Baby_test(int servings){
        this.test_servings = servings;
    }
    void happy(){
        System.out.println("I'm happy!");
    }
    public void test() {
        Baby baby2 = new Baby();
        baby2.poops();
        this.happy();
    }
    public static void main(String[] args) {
        Baby_test baby_test = new Baby_test();
        baby_test.test();
    }
}
