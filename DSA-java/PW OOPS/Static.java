
class Test1{

	static int o;
	int m,n;
	Test1(int a,int b){
		this.m=a;
		this.n=b;
		o++;
	}
}

public class Statics{
	public static void main(String[] args) {
		Test1.o=100;
		Test1 s = new Test1(10,20);
		System.out.println(Test1.o);
		Test1 s1 = new Test1(17,27);
		System.out.println(Test1.o);
	}
}