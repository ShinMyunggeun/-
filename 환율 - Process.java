package standard;

public class Process {

	public final double EXCHANGE_RATE_USD = 1150.50;
	public final double EXCHANGE_RATE_EUR = 1345.35;
	public final double EXCHANGE_RATE_JPY = 10.4;
	public double exchangeRate = 0, exchange = 0;
	public int returnMoney = 0, returnWon = 0;
	public String selectedTextType = null;
	
	public void process(double inputWon, int currency) {
		if(currency == 1) {
		selectedTextType = "USD";
		exchangeRate = EXCHANGE_RATE_USD;
		} else if(currency == 2) {
		selectedTextType = "EUR";
		exchangeRate = EXCHANGE_RATE_EUR;
		} else {
		selectedTextType = "JPY";
		exchangeRate = EXCHANGE_RATE_JPY;
		}
		exchange = inputWon / exchangeRate;
		returnMoney = (int)exchange;
		exchange = exchange - returnMoney;
		returnWon = (int)(exchange*exchangeRate);
		returnWon = returnWon / 10 * 10;
	}
}