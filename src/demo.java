public class demo {
    public static void main(String[] args) {
        Context context= new Context(new DebitCard());
        context.paymentmethod();

        Context context1= new Context(new CashOnDevlivery());
        context1.paymentmethod();

        Context context2= new Context(new CraditCard());
        context2.paymentmethod();
    }
}
