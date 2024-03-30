
public class Test08_class_methods {
	
	
	public static void main(String[] args) 
	{
		Test08_class_methods obj = new Test08_class_methods();
	   String nameprint = obj.name();
	   System.out.println(nameprint);
	   
	   test09_method ob = new test09_method();
	    String st = ob.data();
	    System.out.println(st);
	    
	    String s = getdata();
	    System.out.println(s);
	    
		
		
	}
	
//void means it will not return any thing
	public String name()
	{
		System.out.println("hello world");
		return "Rahul";
		
	}
	
//with void that means it will return something
	public static String getdata()
	{
		return "hiii";
		
	}
	
	
	


	

}
