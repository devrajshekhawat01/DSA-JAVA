//formal parameter

//pass by value and pass by reference

class code_3{

	static void change(int a){


		a*=10;
		System.out.println("inside function"+a);
		


	}

	public static void main(String[] args) {
		int a=4;
		System.out.println(a);

		code_3.change(a);
		System.out.println(a);

	}



}