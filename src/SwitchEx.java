/*
Write a program with a String variable: String light = "Red"; (test with Red, Yellow, Green).
Use a switch statement to print the appropriate action for each light colour.
Red → 'STOP — Do not proceed.'
Yellow → 'CAUTION — Prepare to stop.'
Green → 'GO — Proceed safely.'
Default → 'UNKNOWN signal — treat as Red.'
Also use a ternary to print: 'Safe to go: true/false' based on whether the light is Green.

Expected Output (sample):
Light: Red
Action: STOP — Do not proceed.
Safe to go: false
*/
class SwitchEx{
	public static void main(String args[]){
		
		String light = "Red";
		boolean isSafeToGo=false;	
		switch(light){
			case "Red":
				System.out.println("Light: Red");
				System.out.println("Action: STOP — Do not proceed.");	
				break;
		    case "Yellow":
		         System.out.println("Light: Yellow");
		         System.out.println("CAUTION — Prepare to stop.");
				break;
			case "Green":
				isSafeToGo=true;
			    System.out.println("Light: Green");
			    System.out.println("Safe to go: false");
				break;		
			default:
					
		}
		System.out.println("afe to go: "+isSafeToGo);


	}
}