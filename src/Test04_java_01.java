import java.lang.reflect.Array;
import java.util.Iterator;

public class Test04_java_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Variables in Java
		int num = 5;
		String name = "saidachary";
		Character c = 's';
		double des = 5.45;  // float
		boolean statment = true;
		
		System.out.println(num + "  -- > num is numeric value");
		System.out.println(name);
//Array concept		
		int[] arr = new int[5];
		int[] arr1 = {10,20,30,40,50,60};
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		//arr[5] = 60;
		
		System.out.println(arr[4] + arr[1]);
//For Loop concept
		for( int i = 0; i<arr.length; i++ )
		{
			System.out.println(arr[i]);
		}
		
		for(int i = 0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		
		String[] str = {"chary","saida","ram"};
		for(int i = 0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
//Enhanced for loop
		for(String s : str)
		{
			System.out.println(s);
		}
	}

}
