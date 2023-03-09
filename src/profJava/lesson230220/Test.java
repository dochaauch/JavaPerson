package profJava.lesson230220;

import lombok.ToString;

import java.lang.annotation.*;


public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class aClass = Class.forName("profJava.lesson230220.ANDROID");
        Annotation annotation = aClass.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone = (SmartPhone) annotation;
        System.out.println("Annotation OS:" + smartPhone.OS());
        System.out.println("Annotation year:" + smartPhone.year());

        Class iClass = Class.forName("profJava.lesson230220.IPHONE");
//        Annotation annotation1 = iClass.getAnnotation(SmartPhone.class);
//        SmartPhone smartPhone2 = (SmartPhone) annotation1;
        SmartPhone annotation1 = (SmartPhone) iClass.getAnnotation(SmartPhone.class);
        System.out.println("Annotation OS:" + annotation1.OS());
        System.out.println("Annotation year:" + annotation1.year());
    }
}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default "";
    int year() default 2020;
}


@SmartPhone(year = 2022)
class IPHONE {
    String model;
    double price;
}


@SmartPhone(year = 2023, OS="ANDROID")
@ToString
class ANDROID {
    String model;
    double price;
}