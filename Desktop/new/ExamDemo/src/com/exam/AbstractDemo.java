package com.exam;
abstract class AbstractDemo1{
	public void Ministmt(){
		System.out.println("MS");
	}
	public void Cashwithdraw(){
		System.out.println("CWD");
	}
	public void CashDeposit(){
		System.out.println("CD");
	}
	abstract public void AccountCreation();
	abstract public void SharingAccount1();
}
abstract class AbstractDemo2 extends AbstractDemo1{
    @Override
	public void AccountCreation() {
		
		System.out.println("ACCOUNT CREATION");
	}
    public void PracticeJob() {
		
		System.out.println("JOB");
	}
}
class AbstractDemo3 extends AbstractDemo2{
	@Override
	public void SharingAccount1() {
		
		System.out.println("SHARING ACCOUNT");
	}
public void hello() {
		
		System.out.println("JOB IS MANDATORY");
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		AbstractDemo3 abstractDemo3=new AbstractDemo3();
		abstractDemo3.AccountCreation();
		abstractDemo3.CashDeposit();
		abstractDemo3.Cashwithdraw();
		abstractDemo3.hello();
		abstractDemo3.Ministmt();
		abstractDemo3.PracticeJob();
		abstractDemo3.SharingAccount1();
	}
}
