

// Given 2 integer a and b Swap the 2 given values using sum and difference method


class code2{

static void swap(int a, int b){
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a is :"+a +"b is :"+b);
}

public static void main(String[] args) {
	
	int a=3,b=5;
	swap(a,b);
	
}
}
