public class Marathon {
    public static int find_min(int[] times) {
        int min = times[0],mini = 0;
        for (int i=1; i < times.length; i++ ) { 
            if ( times[i] < min) {
                min = times[i];
                mini = i;
            }
        }
        return mini;
    }
    public static void main(String[] args) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };
        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };
        // for (int i = 0; i < names.length; i++) {
        //     System.out.println(names[i] + ":" + times[i]);
        // }
        int fastest = find_min(times);
        System.out.println("The fastest runner is " + names[fastest] + ",with a time of " + times[fastest] + " minutes." );
        times[fastest] = Integer.MAX_VALUE;
        fastest = find_min(times);
        System.out.println("The second fastest runner is " + names[fastest] + ",with a time of " + times[fastest] + " minutes." );
    }
}