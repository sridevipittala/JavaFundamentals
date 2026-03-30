/*
Fixed-Size Array: Quiz Score Analyzer
Create an int[] array containing 8 quiz scores (e.g., 85, 92, 78, 90, 88, 76, 95, 89).
Use a for loop to find and print the highest score in the array.
Use the same loop (or a new one) to find and print the lowest score.
Calculate and print the average score of the class.
*/
class QuizScoreAnalyzer{
	public static void main(String args[]){
	int[] scores={85, 92, 78, 90, 88, 76, 95, 89};
	int highScore,lowScore,sum=0;
	float avgScore;
	highScore=scores[0];
	lowScore=scores[0];
	for(int i=1;i<scores.length;i++){
		sum+=scores[i];
		if(highScore<scores[i])
		{
			highScore=scores[i];
		}
		if(lowScore>scores[i])
		{
			lowScore=scores[i];
		}

	}
	System.out.println("Highest Score:"+highScore);
	System.out.println("Lowest Score:"+lowScore);
	System.out.println("Average Score:"+(sum/scores.length));
	}
}