package einzmann_sales;

import java.util.ArrayList;

public class Customers
{
	private ArrayList<Customer> customers;
	
	public Customers()
	{
		customers = new ArrayList<>();
	}
	
	public void addCustomers(Customer customer)
	{
		customers.add(customer);
}
}
