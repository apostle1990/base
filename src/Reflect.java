import java.lang.reflect.Constructor;

public class Reflect {
    public static void main(String[] args) {
        TestC testC = new TestC();
        Class c4 = testC.getClass();
        Constructor[] constructors;
        constructors = c4.getDeclaredConstructors();
    }
}
