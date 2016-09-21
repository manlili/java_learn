package test;

/**
 * Created by manlili on 2016/9/21.
 */
public class Dog{
    String name;
    int age;

    public Dog () {   //构造方法
        System.out.println("我是构造方法");
    }
    void bark(){  // 汪汪叫
        System.out.println("汪汪，不要过来");
    }

    void hungry(){  // 饥饿
        System.out.println("主人，我饿了");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
    }
}
