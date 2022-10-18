package youtubeDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CreditManager creditManager= new CreditManager();
		creditManager.Calculate();
		creditManager.Save();
		
		Customer customer = new Customer(); //instance creation
		customer.Id=1;
		customer.City="Ankara";

		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.GiveCredit();
		customerManager.Save();
		customerManager.Delete();
	
		Company company = new Company();
		company.TaxNumber = "25125"; 
		company.CompanyName= "Arçelik";
		company.Id = 100;
		
		Person person = new Person();
		person.FirstName="Engin";
		person.LastName="Demiroğ";
		person.NationalIdentitiy="15231156";
		
		CustomerManager customerManager2 = new CustomerManager(new Company(), null);
				
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();

				
		
		
	}
}
