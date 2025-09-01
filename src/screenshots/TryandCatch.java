package screenshots;

public class TryandCatch {
public static void main(String[] args) {
	/*int num[]= {1,2,3,4,5,6,7,8,9};
	System.out.println(num[4]);*/
	try
	{
		int num[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(num[50]);
	}
	catch (Exception e) {
		System.out.println("Wrong index you are accessing");
		System.out.println("error due to the reason "+e);
		
	}
}
}
