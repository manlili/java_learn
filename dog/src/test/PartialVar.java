package test;

/**
 * Created by manlili on 2016/9/22.
 */
public class PartialVar {
    public void lili () { //age定义后需要初始化,定义在lili()方法中，它的作用域就限制在这个方法中
        int age = 25;
        System.out.println("年龄是"+age);
    }
    public static void main(String[] args) {
        PartialVar myAge = new PartialVar();
        myAge.lili();
    }
}
