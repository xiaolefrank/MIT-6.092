class FooCorporation {
    public static void salary(double base_pay,int worked_hour){
        if(base_pay<8.0 ){
            System.out.println("You should pay at least $8.0 per hour.");
        }else if(worked_hour>60){
            System.out.println("This employee worked more than 60 hours.");

        }else{
            if(worked_hour<=40){
                System.out.println("Pay this employee $"+base_pay*worked_hour+" dollars.");
            }else{
                System.out.println("Pay this employee $"+(base_pay*40+(worked_hour-40)*1.5*base_pay)+" dollars.");
            }
        }
    }
    public static void main(String[] args) {
        salary(7.5,35);
        salary(8.2,47);
        salary(10.0,73);
    }
}