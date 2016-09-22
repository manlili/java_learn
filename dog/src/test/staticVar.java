package test;

/**
 * Created by manlili on 2016/9/22.
 */
public class staticVar {
    public static String name;   //静态变量带static
    public static final int age = 25;

    public static void main(String[] args) {
        staticVar test = new staticVar();
        name = "利利";
        System.out.println("名字是"+name);
        System.out.println("年龄是"+age);
    }
}
