public class loop_array {
    public static void main(String[] args) {
        int[] values = new int[5];
        // for (int i=0; i < values.length; i++) {
        //     values[i] = values.length - i;
        //     System.out.println("array[" + i +"]=" + values[i]);
        //     int y = values[i] * values[i];
        //     System.out.println("array[" + i + "]'s square=" + y);
        // }
        int i = 0;
        while (i < values.length) {
            values[i] = values.length - i;
            System.out.println("array[" + i +"]=" + values[i]);
            int y = values[i] * values[i];
            System.out.println("array[" + i + "]'s square=" + y);
            i++;
        }
    }
    
}
