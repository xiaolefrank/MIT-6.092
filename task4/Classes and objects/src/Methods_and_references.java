public class Methods_and_references {
    static void doSomething(int x, int[] ys, Baby b) {
        x = 1;
        ys[0] = 1;
        b.name = "test";
    }

    public static void main(String[] args) {
        //int i = 0;
        //int[] j = { 15, 0, 2, 3 };
        Baby a = new Baby("Peter", true);
        Baby b = new Baby("David", true);
        a = b;
        a.sayhi();
        b.sayhi();
        // doSomething(i,j,b);
        // System.out.println(i);
        // System.out.println(j[0]);
        // b.sayhi();
    }

}