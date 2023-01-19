package profJava.task230116;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Cat extends Animal implements Externalizable {
    private static final long serialVersionUID = -6897802837726851873L;
    private String name;
    private String color;
    private int age;
    public Cat() {
        super();
        System.out.println("Cat borns");
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(decrypt(name));
        out.writeObject(color);
        out.writeObject(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = (String) in.readObject();
        this.color = (String) in.readObject();
        this.age = (int) in.readObject();
    }

    private String decrypt(String value) {
        return new StringBuilder(value).reverse().toString();
    }
}
