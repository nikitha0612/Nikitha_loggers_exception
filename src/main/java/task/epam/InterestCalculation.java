package task.epam;
import java.lang.*;
public class InterestCalculation {
	double simple_interest(double principal,float time,double rateOfInterest) {
		return (time * principal * rateOfInterest)/100;
	}
	double compound_interest(double principal,float time,double rateOfInterest,int numberOfTimes) {
		 double amount = principal * Math.pow(1+ ( rateOfInterest/numberOfTimes), numberOfTimes*time);
		 double compound_amount = amount - principal;
		 return compound_amount;
	}

}
