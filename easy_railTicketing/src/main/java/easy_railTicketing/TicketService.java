package easy_railTicketing;

public class TicketService {
	public double calculateFare (int age,double fare)
	{
		 if(age<=14)	
	    		fare=fare/2;
	    	  else if(age>=65)
	    	  {
	    		  fare=fare-fare*0.35;
	    	  }
		 return fare;
	}

}
