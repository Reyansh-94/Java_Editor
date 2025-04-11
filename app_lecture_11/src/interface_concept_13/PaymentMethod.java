package interface_concept_13;

public interface PaymentMethod {
   //abstruct method
	void processAmount(double Amount);
	boolean validatePaymentDetails();
	String getPaymentDetails();
}
