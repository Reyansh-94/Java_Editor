package interface_concept_13;

public class OnlineStore {
	public void checkout(PaymentMethod paymentMethod,  double amount) {
		if(paymentMethod.validatePaymentDetails()) {
			paymentMethod.processAmount(amount);
			System.out.println("Payment processing successfully...");
		}else {
			System.out.println("Payment validation failed Transformation....");
		}
	}
}
