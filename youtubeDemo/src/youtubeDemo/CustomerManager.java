package youtubeDemo;

public class CustomerManager {

	
	
	private Customer _customer;
	private ICreditManager _creditManager;
	
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer =customer;
		_creditManager = creditManager;
		
	}
	
	public void Save () {
		System.out.println("kaydedildi: " + _customer);
	}
	
	public void Delete () {
		System.out.println("silindi: " + _customer);
	}
	
	public void GiveCredit() {
		_creditManager.Calculate();
		System.out.println("kredi verildi ");
		
	}
}
