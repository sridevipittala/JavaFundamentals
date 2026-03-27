/*
Nested Loops: Print a right-angled triangle pattern made of stars (*) with exactly han 1 whose square is strictly greater than 500.
*/
class NestedLoopsEx{
	public static void main(String args[]){
	for(int r=1;r<=5;r++){
		for(int c=1;c<=r;c++){
			System.out.print("* ");
		}
	System.out.println();	
	}
	}
}