package test;

/**
 * Created by manlili on 2016/9/22.
 */
public class instantiateVar {
    public int age; //对该类以及其他类都可见
    private String name;  //仅对该类可见

    public  instantiateVar (int myAge) {  //该类的构造方法
        age = myAge;
    }
    public void  lili (String myName ) {
        name = myName;
    }
    public void  ptintmeg () {
        System.out.println("姓名是"+name);
        System.out.println("年龄是"+age);
    }
    public static void main(String[] args) {
        instantiateVar test = new instantiateVar(25);
        test.lili("利利");
        test.ptintmeg();
    }
}
