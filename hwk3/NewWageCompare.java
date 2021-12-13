public class NewWageCompare {
	public static void main(String[] args) {
	    double tenCents = 0.10;
	    float tenDollars = 10.00f; 
	    double centsWage = 0.0f;
	    float dollarsWage = 0.0f;
	    int hours = 1;

	    while(dollarsWage >= centsWage){
            dollarsWage = tenDollars * hours;
            tenCents = (2 * tenCents) + 0.10; //2n + 1
            centsWage =+ tenCents;
            hours++;
	    }
	    System.out.println(hours);       
	}
}
