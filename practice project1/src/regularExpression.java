import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression {

	public static void main(String[] args) {
		String regex="[a-z]+";
		String input="sanjeet";
		
		Pattern pattern= Pattern.compile(regex);
		
		Matcher match= pattern.matcher(input);
		
		if (match.matches()) {
			System.out.println(" @corona defeat");
		}
		else {
			System.out.println(" Input");
		}
		
	}

	}


