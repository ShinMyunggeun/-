package standard;


public class Main {
		
	public static void main(String[] args) {
		Input exchangeInput = new Input();
		Process exchangeProcess = new Process();
		PrintOut exchangePrint = new PrintOut();
		ReturnMoney exchangeReturnMoney = new ReturnMoney();
		Change exchangeChange = new Change();
					
		while(true){
		exchangeInput.inputData();
		if(exchangeInput.currency == 0){
		break;}
		exchangeProcess.process(exchangeInput.inputWon, exchangeInput.currency);
		exchangePrint.print(exchangeProcess.selectedTextType, exchangeProcess.exchangeRate, exchangeInput.currency, exchangeProcess.returnMoney, exchangeProcess.returnWon);
		exchangeReturnMoney.returnMoney(exchangeInput.currency, exchangeProcess.returnMoney, exchangeProcess.selectedTextType);
		exchangeChange.change(exchangeProcess.returnWon);
		break;
		}			
	} 
}