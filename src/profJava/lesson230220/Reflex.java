package profJava.lesson230220;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Reflex {
    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class pClass = Class.forName("profJava.lesson230220.P");
        //Class pClass = P.class;
        Field field = pClass.getField("id");
        System.out.println("Field type is: " + field.getType());

        Field[] fields =pClass.getFields();
        for (Field f : fields) {
            System.out.println("Field " + f + " has type --->" + f.getType());
        }
        System.out.println("-".repeat(15));

        Field[] fields1 = pClass.getDeclaredFields();
        for (Field f : fields1) {
            System.out.println("Field " + f + " has type --->" + f.getType());
        }
        System.out.println("-".repeat(15));

        Method method = pClass.getMethod("increaseSalary");
        System.out.println("Return type: " + method.getReturnType());
        System.out.println("Return type: " + Arrays.toString(method.getParameterTypes()));

        Method method1 = pClass.getMethod("setSalary", double.class);
        System.out.println();

        Method[] methods = pClass.getDeclaredMethods();
        for ( Method m: methods) {
            if(Modifier.isPublic(m.getModifiers())) {
                System.out.println();
            }
        }
        System.out.println("-".repeat(15));
        Constructor[] constructor = pClass.getConstructors();
        for (Constructor c: constructor) {
            System.out.println("Consturctor name: " + c.getName());
            System.out.println("Consturctor has: " + c.getParameterCount());
            System.out.println("Consturctor type: " + Arrays.toString(c.getParameterTypes()));
        }

    }
}
