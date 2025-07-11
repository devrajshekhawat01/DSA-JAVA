
//Q.1  Given 2 integer a and b. Swap the 2 given value using temproary variables.


class code1{


	public static void main(String[] arg) {

		int a=9;
		int b=3;
		// int [] arr = {1,2,3,4,5};
		swap(a,b);


				
	}


	static void swap(int a, int b){
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a is :"+a +"b is :"+b);
	}
}


