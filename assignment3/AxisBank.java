package week3.day1.assignments.assignment3;

public class AxisBank extends BankInfo {
    @Override
	public void deposit() {
		System.out.println("Deposit from Axis bank!!");
	}
    public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.deposit();
	}
    
}
