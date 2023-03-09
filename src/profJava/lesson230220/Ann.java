package profJava.lesson230220;

import lombok.ToString;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@ToString
@Inter
public class Ann {
    private String name;
    public static void main(String[] args) {

    }


}


@Target({ElementType.TYPE, ElementType.FIELD})
@interface Inter {

}
