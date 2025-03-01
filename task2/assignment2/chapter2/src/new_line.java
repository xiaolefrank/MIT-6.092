public class new_line {
    public static void newline(){
        System.out.println("");
    }
    public static void three_line(){
        newline();newline();newline();
    }
    public static void main(String[] args) {
        System.out.println("line1");
        three_line();
        System.out.println("line2");
    }
}
