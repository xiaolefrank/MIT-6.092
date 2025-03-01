public class parameters {
    public static void printSquare(int x){
        System.out.println("print the original variable="+x);
        x*=x;
        System.out.println("print the square of the variable="+x);
    }
    public static void main(String[] args) {
        int a=5;
        System.out.println("the main variable a is "+a);
        printSquare(a);
        System.out.println("the main variable a is "+a);
    }
    
}
