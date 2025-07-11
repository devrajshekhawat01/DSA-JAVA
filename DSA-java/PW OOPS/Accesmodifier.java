
// Public -- all package
// Private -- accessiable in same class
// Default -- accesiable in same package

class A{

int x = 23;

}

public class AccesModifier{

	public static void main(String[] args) {
		A a = new A();
	System.out.println(a.x);

		
	}
}