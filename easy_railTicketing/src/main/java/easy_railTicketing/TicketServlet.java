package easy_railTicketing;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TicketServlet
 */

public class TicketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TicketServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String errorMsg="Ticket number must be digital figure";	
		
		try
		{
		int ticketNumber=Integer.parseInt(request.getParameter("ticketNumber").trim());
		String trainName=request.getParameter("trainName");
	    String jdate=request.getParameter("jdate");
		String fromLocation=request.getParameter("fromLocation");
		String toLocation=request.getParameter("toLocation");
	    String trainClass=request.getParameter("trainClass");
	    double fare=Double.parseDouble(request.getParameter("fare"));
	    if(fare<500 || fare>5000)
	    {
	    	errorMsg="Fare must be between 500.00 and 5000.00";	
	    	throw new Exception();	
	    }
	    List<Passenger> passengerList=new ArrayList();
	    double tFare=0.0;
	    for(int i=1;i<=6;i++)
	    {
	    	String paraName="name"+i;
	    	String paraAge="age"+i;
	    	String name=request.getParameter(paraName);
	    	int age=Integer.parseInt(request.getParameter(paraAge));
	    	if(!name.equals("--"))
	    	{
	       		double passengerFare=new TicketService().calculateFare(age, fare);
	    	   tFare=tFare+passengerFare;
	       	  Passenger passenger=new Passenger(name,age,passengerFare);
	    	  passengerList.add(passenger);
	    	}
	    }
	   if(passengerList.size()==0)
	    {
	    	errorMsg="No Passenger detail is present";	
	    	throw new Exception();
	    }
	    double gstCal=tFare*0.125;
	    double tAmount=tFare+gstCal;
	    DecimalFormat df=new DecimalFormat("0.00");
	    String totalFare=df.format(tFare);
	    String gst=df.format(gstCal);
	    String totalAmount=df.format(tAmount);
	    Ticket ticket=new Ticket(ticketNumber, trainName, jdate, fromLocation, toLocation, totalAmount,trainClass, passengerList);
	    request.setAttribute("allPassengers",passengerList);
	    request.setAttribute("ticket", ticket);
	    request.setAttribute("gst",gst);
	    request.setAttribute("totalFare",totalFare);
	    RequestDispatcher rd=request.getRequestDispatcher("ShowTicket");
	   rd.forward(request,response);
		}
		catch(Exception exp)
		{
			request.setAttribute("errorMsg",errorMsg);
			 RequestDispatcher rd=request.getRequestDispatcher("errorShow");
			   rd.forward(request,response);	
		}
		

	}

}
