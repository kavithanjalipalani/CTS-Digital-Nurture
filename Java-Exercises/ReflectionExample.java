import java.lang.reflect.Method;

class Sample {

    public void show() {

        System.out.println("Reflection");
    }
}

public class ReflectionExample {

    public static void main(String[] args)
            throws Exception {

        Class<?> c =
                Class.forName("Sample");

        Object obj =
                c.getDeclaredConstructor()
                        .newInstance();

        Method m =
                c.getMethod("show");

        m.invoke(obj);
    }
}