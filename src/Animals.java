public class Animals {
    String name;
    int age;


    public Animals(){
        System.out.println("构造成功");
    }

    public Animals(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("这是一条"+age+"岁的"+name);
    }

    public void use(){
        System.out.println("this is:"+ this.name);
    }
}
