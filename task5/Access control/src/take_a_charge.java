public class take_a_charge {
    public static void main(String[] args) {
        Creditcard card = new Creditcard();
        card.charge(100);
        card.withdraw(50,"1234",card);
    }
    
}
