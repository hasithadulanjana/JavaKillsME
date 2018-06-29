import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo {

	private static Scanner word;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfElement = 0;
		String phase;
		String pattern;
		word = new Scanner(System.in);
		System.out.println("Enter the String");
		phase = word.nextLine();
		
		System.out.println("Enter the Pattern");
		pattern = word.nextLine();
		//"aaBaBbaabaabeeeaab";
		Matcher matchingPattern = Pattern.compile(pattern).matcher(phase);
		
		List<Integer> position = new ArrayList<Integer>();
		while (matchingPattern.find())
		{
			position.add(matchingPattern.start());
			
		}
		noOfElement = position.size();
		
		if(noOfElement == 0) {
			System.out.print("No pattern Found!");
			
		}else {
			System.out.println("Pattern found!");	
			System.out.println("No of time pattern repeats "+noOfElement);
			System.out.println("Location wise where the pattern exists "+position);
			
		}
		
	}

}
