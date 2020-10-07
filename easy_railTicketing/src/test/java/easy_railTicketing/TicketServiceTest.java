package easy_railTicketing;

import static org.junit.Assert.*;
import static easy_railTicketing.TestUtils.*;
import org.junit.Test;

public class TicketServiceTest {

	@Test
	public  void testCalculateFare() throws Exception {
		int value=(int)new TicketService().calculateFare(10,1000.00);
		yakshaAssert(currentTest(),(value==500?"true":"false"),businessTestFile);
		value=(int)new TicketService().calculateFare(16,1000.00);
		yakshaAssert(currentTest(),(value==1000?"true":"false"),businessTestFile);
		value=(int)new TicketService().calculateFare(66,1000.00);
		yakshaAssert(currentTest(),(value==650?"true":"false"),businessTestFile);
	}
	
	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }


}
