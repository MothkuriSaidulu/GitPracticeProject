
public class Test05_Array {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0 ; i<num.length ; i++ )
		{
			if(num[i] % 2 == 0)
			{
				System.out.println(num[i]);
				//break; //it exit at 2 bcz 2 is multple of 2 
			}
			else 
			{
				
				System.out.println(num[i]+ "not divisable");				
			}
		}
		
//check if you want to 6 multiple of 2 the exit
		
		
		
		
		
		
	}		
}
