/*
A student has 5 subject marks (all hardcoded, test with different sets): Maths, Science, English, History, Java Programming.
Calculate total and percentage.
Assign grade using if-else: A+ (>=90), A (>=80), B (>=70), C (>=60), D (>=50), F (<50).

Check if the student passed: all subjects must be >= 40 to pass.

Identify: highest scoring subject, lowest scoring subject.

Check for scholarship: percentage >= 85 AND passed all subjects → 'Eligible for Merit Scholarship'.

Print a full report card: subject-wise marks, total, percentage, grade, pass/fail, scholarship status.
Use a ternary operator for at least 2 of the above checks.

Hint: Use separate int variables for each subject. Track max/min using if comparisons.
Expected Output (sample):
Maths: 88  Science: 76  English: 92  History: 68  Java: 95

Total: 419  Percentage: 83.8%
Grade: A  Status: PASS
Scholarship: Not Eligible (below 85%)
*/
class StudentResult{
	public static void main(String args[]){
		float maths=88, science=86, english=92, history=68, javaProgramming=95,total,percentage;
		String grade="",status,scholarship;

		total=maths+science+english+javaProgramming+history;
		percentage=total/5;

		if(percentage>=90){
			grade="A+";
		}
		else if(percentage>=80){
			grade="A";

		}
		else if(percentage>=70){
			grade="B";

		}
		else if(percentage>=60){
			grade="C";

		}
		else if(percentage>=50){
			grade="D";

		}
		else if(percentage<50){
			grade="F";

		}





		if(maths>=40 && science>=40 && english>=40 && history>=40 && javaProgramming>=40){
			status="PASS";
			scholarship=(percentage>=85)?"Eligible for Merit Scholarship":"Not Eligible (below 85%)";
	
		}
		else{
			status="FAIL";
			scholarship="Not Eligible ";
		}

		System.out.println("Maths: " + maths +"  Science: "+science+" English: "+english+"  History: "+history+"  Java: "+javaProgramming);
		System.out.println("Total: "+total+"  Percentage: "+percentage);
		System.out.println("Grade: "+grade+" Status: "+status);
		System.out.println("Scholarship: "+scholarship);
		
	}
}