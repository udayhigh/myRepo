package programs;

public class second_largest {
	static int[] a = {98,20,4,101,8,19,52,2,48,65};
	public static void main(String[]args) {
		int max_val = a[0];
		for(int i=1; i<a.length;i++) {
			
			if(max_val < a[i] ) {
				max_val = a[i];
			}
			
		}
		System.out.println(max_val);
	}

}
