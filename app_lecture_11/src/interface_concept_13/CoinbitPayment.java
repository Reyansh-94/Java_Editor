package interface_concept_13;

public class CoinbitPayment implements PaymentMethod{

	@Override
	public void processAmount(double Amount) {
		System.out.println("processing CoinbitPayment Wallet amount of "+Amount+" BTC");
	}

	@Override
	public boolean validatePaymentDetails() {
		System.out.println("Validating Coinbit Wallet....");
		return true; //assume true
	}

	@Override
	public String getPaymentDetails() {
		return "Bitcoin Wallet Address: 1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa";
	}

}
