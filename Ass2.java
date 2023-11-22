package a;
import java.lang.reflect.*;
import java.lang.reflect.Method;

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
public class Ass2 {
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
		
		System.out.println("Result of Method 1:");
		Method methodCall1 = c.getDeclaredMethod("Method1");
		methodCall1.invoke(t);
		
		Method methodCall2 = c.getDeclaredMethod("Method2", int.class);
		methodCall2.invoke(t, 15);
		
		Field field = c.getDeclaredField("s");
		System.out.println(field.get(t));
		
		field.setAccessible(true);
		System.out.println("Print the changed value of s");
		field.set(t, "JAVA");
		methodCall1.invoke(t);
		
	}
}

