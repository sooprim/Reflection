package a;
import java.lang.reflect.*;

class Test
{
	String s;
	public Test()
	{
		s = "Programming languages";
	}


public void method() {
	System.out.println(s);
}

public void method2(int n)
{
	System.out.println("int n: " + n);
}

private void method3()
{
	System.out.println("Private method is invoked");
}
}
public class Ass1 {
	public static void main(String[] args) {
		Test t = new Test();
		Class c = t.getClass();
		System.out.println("Class name: " + c.getName());
		
		
		Constructor constructor = null;
		try {
			constructor = c.getConstructor();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Name of constructor: " + constructor.getName());
	}
}

