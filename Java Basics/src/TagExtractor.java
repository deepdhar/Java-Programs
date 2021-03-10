import java.util.Scanner;
import java.util.regex.*;


public class TagExtractor {
public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int testCases = Integer.parseInt(scan.nextLine());
        
		while(testCases-- != 0){
			String line = scan.nextLine();
			
            boolean matchFounder = false;
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);
            
            while(m.find()) {
                System.out.println(m.group(2));
                matchFounder = true;
            }
            
            if(!matchFounder)
                System.out.println("None");
		}
	}

}
