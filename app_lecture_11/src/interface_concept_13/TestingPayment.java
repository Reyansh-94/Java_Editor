package interface_concept_13;

public class TestingPayment {
public static void main(String[] args) {
	OnlineStore onlinestore = new OnlineStore();
	CreditCardPayment cr = new CreditCardPayment();
	onlinestore.checkout(cr, 100);
	PaypalPayment ppl = new PaypalPayment();
	onlinestore.checkout(ppl, 120);
	CoinbitPayment cnb = new CoinbitPayment();
	onlinestore.checkout(cnb, 150);
}
}
