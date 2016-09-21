package test;

/**
 * Created by manlili on 2016/9/21.
 */
public class Dog2{
    String name;
    int age;

    // 构造方法，没有返回值
    Dog2(String name1, int age1){
        name = name1;
        age = age1;
        System.out.println("感谢主人领养了我");
    }

    // 普通方法，必须有返回值
    void bark(){
        System.out.println("汪汪，不要过来");
    }

    void hungry(){
        System.out.println("主人，我饿了");
    }

    public static void main(String arg[]){
        // 创建对象时传递的参数要与构造方法参数列表对应
        Dog2 myDog = new Dog2("花花", 3);
        String name = myDog.name;
        int age = myDog.age;
        System.out.println("狗狗的名字是"+name+";狗狗年龄是"+age);

        myDog.bark();
        myDog.hungry();
    }
}
