package lecture12;

import org.apache.commons.lang3.time.StopWatch;

public class Driver {
	
	public static void main(String[] args) {
		
		System.out.println("Running...");
		
		StopWatch myStopWatch = new StopWatch();
		
		myStopWatch.start();
		
		performLengthyProcess();
		
		myStopWatch.stop();
		
		System.out.println("Time is: " + myStopWatch.getTime() + " milliseconds.");
		System.out.println("Finished...");
	}
	
	private static void performLengthyProcess() {
		try {
			Thread.sleep(3000); // 3 second delay
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
