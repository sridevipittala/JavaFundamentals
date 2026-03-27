/*
String Manipulation
Create a class with the following methods and test them in your main method:
int countVowels(String s): Count the vowels in the string manually using a charAt loop.

String reverseString(String s): Reverse the given string using a for loop and string concatenation.

boolean isPalindrome(String s): Check if the string reads the same forwards and backwards. Requirement: You must ignore case and ignore spaces.
int countOccurrences(String text, String word): Count and return how many times the word appears within text.
*/
class StringManipulations{
	
	int countOccurrences(String text, String searchWord){
		String words[]=text.split(" ");
		int repeatedCount=0;
		for(String word:words){
			System.out.println(word  + " "+ searchWord);
			if(word.equalsIgnoreCase(searchWord)){
				//System.out.println(word);
				++repeatedCount;
			}
			
		}
		return repeatedCount;

	}


	boolean isPalindrome(String s){
		return s.equals(revStr(s));
	}
	String revStr(String s){
		StringBuilder revStr=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--){
			revStr=revStr.append(s.charAt(i));
		}
		return revStr.toString();
	}
	int countVowels(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			switch (s.charAt(i)){
			case 'a':
			case 'A':
					count++;
					break;
		    case 'e':
		    case 'E':	
		    		count++;
		    		break;
		    case 'i':
			case 'I':
					count++;
					break;
		    case 'o':
		    case 'O':	
		    		count++;
		    		break;
		    case 'u':
			case 'U':
					count++;
					break;
		    						

			}
			System.out.println(s.charAt(i));
		}
		return count;
	}
	
}
class StringOpTest{
	public static void main(String args[]){
		StringManipulations strMan=new StringManipulations();
		String str="liril";
		System.out.println("Vowels count:" + strMan.countVowels(str));
		System.out.println("Reverse String:" + strMan.revStr(str));
		System.out.println("Is "+ str +" is palindrome: " + strMan.isPalindrome(str));
		System.out.println("Word Count:"+strMan.countOccurrences("Sai is a bad boy , Sai is a lazy boy","boy"));
	}

}