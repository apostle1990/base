package MVC;

class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void show(){
        System.out.println("Singleton Pattern");
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.show();
    }
}