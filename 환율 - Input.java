package standard;

import java.util.Scanner;

public class Input {

	public double inputWon = 0;
	public int currency = 0;
	
	public void inputData() {
	Scanner myInput = new Scanner(System.in);
	System.out.print("받은 원화를 입력를 입력하세요. : ");
	inputWon = myInput.nextDouble();
	System.out.print("\n환전할 화폐 종류를 선택하십시오. (1:USD 2:EUR 3:JPY or 0:종료) : ");
	currency = myInput.nextInt();
	myInput.close();
	}
}