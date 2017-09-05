/**
 * 
 * @author Tuanvantien
 *Example of Comprehensive timer using the measurements of Milliseconds, Seconds,minutes,hours,days
 *Can be used in any other independent methods as long as both startTimer() & stopTimer() is called by enclosing.
 */

public class ComprehensiveTime {

		//Variables
	 	private static long startTime = 0;
	    private static long stopTime = 0;
	    
	public static void main(String[] args) {
		
		
		int TestLoop = 1000000; 	//Change variable to determine how long loop to go for - Testing purposes
		
		//Test code to use the 2 methods startTimer() & stopTimer()
		//Runs a loop with a starttimer() and stop timer)_ method enclosing
		//Results are : Hours0 Minutes5seconds3
		
		startTimer();
		for (int i = 0; i < TestLoop ; i++)
		{
			System.out.println("Test 1");;
		}
		stopTimer();
		
	}

	
	public static void startTimer() {
			
		startTime = System.currentTimeMillis();	//Starts Timer
	}
	
	public static void stopTimer() {
		
		stopTime = System.currentTimeMillis();	//Stops timer
		
		//Converts milliseconds to each respective measurement
		long millisecond = stopTime - startTime;
        int seconds = (int) (millisecond / 1000) % 60;
        int minutes = (int) ((millisecond / (1000*60)) % 60);
        int hours   = (int) ((millisecond / (1000*60*60)) % 24);
        int Days =  (int) (millisecond / (1000*60*60*24));
        int weeks = (int) (millisecond / (1000*60*60*24*7));
        
        //Prints out the results in measurements.
        System.out.println("Weeks " + weeks + " " + "Days " + Days + " " + "Hours " + hours + " " + "Minutes " + minutes + " " + "seconds " + seconds + " " 
        + "Milliseconds " + millisecond);
	}

}
