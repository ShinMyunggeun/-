package standard;

public class ReturnMoney {

	public void returnMoney(int currency, int returnMoney, String selectedTextType) {
		System.out.printf("\n환전 금액은 : %d %s입니다.\n", returnMoney, selectedTextType);
		switch(currency) {
		case 1:
		System.out.println("\n$100 지폐 " + (int) returnMoney / 100 + " 장");
		System.out.println("$50 지폐 " + (int) returnMoney % 100 / 50 + " 장");
		System.out.println("$20 지폐 " + (int) returnMoney % 100 % 50 / 20 + " 장");
		System.out.println("$10 지폐 " + (int) returnMoney % 100 % 50 % 20 / 10 + " 장");
		System.out.println("$5 지폐 " + (int) returnMoney % 100 % 50 % 20 % 10 / 5 + " 장");
		System.out.println("$1 지폐 " + (int) returnMoney % 100 % 50 % 20 % 10 % 5 / 1 + " 장");
		break;
		case 2:
		System.out.println("\n200유로권 " + (int) returnMoney / 200 + " 장");
		System.out.println("100유로권 " + (int) returnMoney % 200 / 100 + " 장");
		System.out.println("50유로권 " + (int) returnMoney % 200 % 100 / 50 + " 장");
		System.out.println("20유로권 " + (int) returnMoney % 200 % 100 % 50 / 20 + " 장");
		System.out.println("10유로권 " + (int) returnMoney % 200 % 100 % 50 % 20 / 10 + " 장");
		System.out.println("5유로권 " + (int) returnMoney % 200 % 100 % 50 % 20 % 10 / 5 + " 장");
		System.out.println("2유로동전 " + (int) returnMoney % 200 % 100 % 50 % 20 % 10 % 5 / 2 + " 개");
		System.out.println("1유로동전 " + (int) returnMoney % 200 % 100 % 50 % 20 % 10 % 5 % 2 / 1 + " 개");
		break;
		default:
		System.out.println("\n10000엔권 " + (int) returnMoney / 10000 + " 장");
		System.out.println("5000엔권 " + (int) returnMoney % 10000 / 5000 + " 장");
		System.out.println("2000엔권 " + (int) returnMoney % 10000 % 5000 / 2000 + " 장");
		System.out.println("1000엔권 " + (int) returnMoney % 10000 % 5000 % 2000 / 1000 + " 장");
		System.out.println("500엔동전 " + (int) returnMoney % 10000 % 5000 % 2000 % 1000 / 500 + " 개");
		System.out.println("100엔동전 " + (int) returnMoney % 10000 % 5000 % 2000 % 500 / 100 + " 개");
		System.out.println("50엔동전 " + (int) returnMoney % 10000 % 5000 % 2000 % 500 % 100 / 50 + " 개");
		System.out.println("10엔동전 " + (int) returnMoney % 10000 % 5000 % 2000 % 500 % 100 % 50 / 10 + " 개");
		System.out.println("1엔동전 " + (int) returnMoney % 10000 % 5000 % 2000 % 500 % 100 % 50 % 10 / 1 + " 개");
		}
	}
}