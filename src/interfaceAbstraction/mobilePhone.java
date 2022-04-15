package interfaceAbstraction;

public class mobilePhone implements ITelephone {

	@Override
	public void dialing() {
		System.out.println("mobilePhone is dialing");
		
	}

	@Override
	public void ringing() {
	    System.out.println("mobilePhone is ringing");
		
	}

	@Override
	public boolean isPowerOn() {
		return true;
	}
	
	public void check() {
		System.out.println("printing smthng");
	}

}
