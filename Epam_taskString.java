import com.epam.maven.oops;
import java.util.*;
public class Epam_taskString
{
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	 
		System.out.println("Enter a string");
		String s=sc.nextLine();
		String s1=s.substring(0,2);
		String s2=s.substring(2);
	    String result=s1.replace("a","").replace("A","")+s2;
		System.out.println("result is "+result);
			
	}
}