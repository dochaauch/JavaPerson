package profJava.cons230120;

import lombok.*;

@Getter
@Setter

@ToString
public class BusinessCardContact {
    private String fullName;
    private Tel phone;
    private Email email;
    private Address address;
    private Web web;

    public BusinessCardContact() {
    }
}


@Getter
@Setter
@ToString
class Tel{
    private String tel;
    private Type type;
}


@Getter
@Setter
@ToString
class Email{
    private String internet;
    private Type type;
}



@Getter
@Setter
@ToString
class Web{
    private String internet;
    private Type type;
}


@Getter
@Setter
@Builder
@ToString
class Address{
    private Type type;
    private String street;
    private String city;
    private String country;
}

