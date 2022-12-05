package programs;

public class Arrays {
	
	public static void main(String[] args) {
		
		int[] a = new int[4];
		
		a[0]=5;
		a[1]= 2;
		a[2]= 5;
		
		a[3] = 10;
		
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	System.out.println("-------------------------------------------------------");	
		
		String[] str = new String[3];
		str[0] = "Apple";
		str[1]= "Mango";
		str[2] = "Grapes";
		
		for(String temp:str) {
			System.out.println(temp);
		}
		
		
	}

}
