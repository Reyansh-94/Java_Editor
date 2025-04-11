package interface_concept_13;

public class PaypalPayment implements PaymentMethod{

	@Override
	public void processAmount(double Amount) {
	   System.out.println("processing paypalPayment Online of "+Amount);
	}

	@Override
	public boolean validatePaymentDetails() {
		System.out.println("validations details of paypal payment Online...");
		return true;
	}

	@Override
	public String getPaymentDetails() {
		return "PayPal Account: user@example.com";
	}

}
