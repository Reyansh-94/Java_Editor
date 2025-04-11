package interface_concept_13;

public class CreditCardPayment implements PaymentMethod{

	@Override
	public void processAmount(double Amount) {
		System.out.println("processing credit card payment of "+Amount);
		
	}

	@Override
	public boolean validatePaymentDetails() {
		System.out.println("validate credit card details....");
		return true; //assume
	}

	@Override
	public String getPaymentDetails() {
		return "Credit card details ****_*****_*****_*****_1234";
	}

}
