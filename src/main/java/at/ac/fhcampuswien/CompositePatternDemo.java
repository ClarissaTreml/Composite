package at.ac.fhcampuswien;

public class CompositePatternDemo {
	
	public static void main(String args[])
	
	{
		
		 Employee emp1=new Cashier(101,"Alexander Pruka", 20000.0);
		 
		 Employee emp2=new Cashier(102,"Jasmine Yilmaz", 25000.0);
		 
		 Employee emp3=new Accountant(103,"Sahani Peiris", 30000.0);

		 Employee manager1=new BankManager(100,"Clarissa Treml",100000.0);
		  
		  manager1.add(emp1);
		  manager1.add(emp2);
		  manager1.add(emp3);
		 
		  manager1.print();
                                      
             
                    }

}
