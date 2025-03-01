public class scope {
    public static void main(String[] args) {
        int x=5;
        if(x==5){
            x=6;
            int y=32;
            System.out.println("x="+x+" y="+y);
        }
        System.out.println("x="+x);
    }
    
}
