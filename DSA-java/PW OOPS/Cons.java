
class Test{

	int a;
	int b;
	int c;

	Test(int a , int b, int c){  // constructor 
		this.a=a;
		this.b=b;
		this.c=c;
	}

	Test(){  // default constructor

	}

}

class cons{

	public static void main(String[] args) {
		Test t = new Test(22,33,44);

		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);

		Test t2 = new Test(12,13,23);

		System.out.println(t2.a);
		System.out.println(t2.b);
		System.out.println(t2.c);

		Test t3 = new Test();

	}
}