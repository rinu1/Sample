package learning;

public class Overridingchild extends Overriding{
      void run()
        {
		System.out.println("Bike is running safely");
	    }
		  
				  public static void main(String args[])
				  {
					  Overridingchild obj = new Overridingchild();
					  Overriding ob1= new Overridingchild();
					  ob1.run();
				  obj.run();
			
				  }
				}

		

	
