package standard;

public class PrintOut {

	public void print(String selectedTextType, double exchangeRate, int currency, int returnMoney, int returnWon) {
		System.out.printf("\n%s을(를) 선택하셨습니다.\n", selectedTextType);
		System.out.printf("\n현재 환율은 1 %s에 %.1f원입니다.\n", selectedTextType, exchangeRate);
	}
}