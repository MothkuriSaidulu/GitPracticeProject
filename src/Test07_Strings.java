import java.util.Iterator;

public class Test07_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
//String is an object which contains collection of charectors
	/*//String defined type 1
		String s = "rahul shetty acodamy";
		String s1 = "rahul shetty acodamy";
		
		System.out.println(s + s1);
	//String defined type 2	
		String str = new String("Chary");
		String str1 = new String("Saidachary");
		
		System.out.println(str +" "
				+ "" +  str1);
		
//String splitting
		String a = "Rahul Shetty Acodamy";
		//a.split(" ");
		String[] splitted = a.split(" ");
		
		for(int i = 0 ; i<splitted.length ; i++)
		{
			System.out.println(splitted[i]);
		}
//printing characters in string
		//1st to last
		/*String b = "Rahul Shetty Acodamy";
		
		for(int i = 0 ; i<b.length() ; i++)
		{
			System.out.println(b.charAt(i));
		}
		*/
//Printing character reverse
		String c = "Rahul Shetty Acodamy";
		
		for(int i = c.length()-1 ; i>=0 ; i--)
		{
			System.out.println(c.charAt(i));
		}
			
	}

}
