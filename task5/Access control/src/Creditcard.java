public class Creditcard{
    private String cardnumber;
    private double expense;
    public void charge(double amount){
        expense += amount;
    }
    private String getcardnumber(String password){
        if(password.equals("SECRET!3*!")){
            return cardnumber;
        }
        return "jerkface!";
    }
    public void withdraw(double amount,String passwordString,Creditcard card){
        System.out.println("Put your card's password to confirm your card number.");
        String ID=getcardnumber(passwordString);
        if(ID.equals("jerkface!")) {
            System.out.println("jerk!");
            return;
        }else{
            System.out.println("card number: "+ID);
        }
        if(amount<card.expense){
            System.out.println("You don't have enough money to withdraw.");
        }else if(amount>=card.expense){
            card.expense -= amount;
            System.out.println("You have successfully withdrawn "+amount+" from your card.");
        }
    }
}