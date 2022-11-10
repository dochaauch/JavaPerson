package taskHome221110;
/*Необязательное домашнее задание.

В нашей системе регистрируется много пользователей, мы обнаружили, что часто они вводят
неправильные данные. Нужно реализовать сервис валидации (UserValidatoinService),
который реализует методы

public boolean isCorrectUsers(User users); // возвращает правильный ли это пользователь

public User[] getIncorrectUsers(User[] users); // здесь можно вызывать метод isCorrectUsers в цикле
массив неправильных пользователей

Модель данных пользователей.

User {
  String name;
  String surname;
  Address address;
  String email;
  String phone;
}

Address {
   String country;
   String city;
   String street;
   Integer houseNymber;
}

Сервис валидации может проверять (не обязательно делать все условия, можно только несколько).
  1. То что все поля всех классов заполненны (смотреть != null и isEmpty методы),
  2. Email содержит символ @ (смотреть метод String contains() метод
  - https://www.w3schools.com/java/ref_string_contains.asp),
  3. country содержит значения из заданного массива стран
  (например, Germany, Poland, France, Luxembourg),
  4. Email содержит как минимум один символ точки (.) и он находится после первого @
  (смотреть indexOf - https://www.w3schools.com/java/ref_string_indexof.asp и
  lastIndexOf методы - https://www.w3schools.com/java/ref_string_lastindexof.asp),

Нужно сделать тестовый класс, где создать несколько разных User (правильных и нет) и проверить,
что все методы возвращают правильные результаты.

P.S. Бонусное задание посмотреть статьи про Unit тесты и реализовать хотя бы простейший Unit test.*/

import java.util.*;

public class homework221110 {

    public static class UserValidationService {


        public boolean isCorrectUsers(User users) {
            if (areAllFieldsNotEmpty(users) && hasEmailAtSign(users) &&
                    isCountryInList(users) && hasEmailDotAfterAt(users)) {
                return true;
            } else {
                return false;
            }
        }

        boolean hasEmailDotAfterAt(User users) {
            int atPos = users.email.indexOf("@");
            if (atPos != -1) {
                int dotPos = users.email.indexOf(".", atPos);
                if (dotPos != -1) {
                    return true;
                }
            } else {
                return false;
            }
            return false;
        }

        boolean isCountryInList(User users) {
            String[] countryArr = {"Germany", "Poland", "France", "Luxembourg"};
            boolean flagIn = false;
            for (String country : countryArr) {
                if (country.equals(users.address.allFields().get("country"))) {
                    flagIn = true;
                }
            }
            if (flagIn == true) {
                return true;
            } else {
                return false;
            }
        }

        boolean hasEmailAtSign(User users) {
            if (!users.allFields().get("email").toString().contains("@")) {
                return false;
            } else {
                return true;
            }
        }

        boolean areAllFieldsNotEmpty(User users) {
            ArrayList<String> addressFields = new ArrayList<>(users.address.allFields().values());
            for (String af : addressFields) {
                if (af.isEmpty()) {
                    return false;
                }
            }
            ArrayList<String> usersFields = new ArrayList<>(users.allFields().values());
            for (String uf : usersFields) {
                if (uf.isEmpty()) {
                    return false;
                }
            }
            return true;
        }


        public User[] getIncorrectUsers(User[] users) {
            User[] incorrectUsers = new User[users.length];
            for (int i = 0; i < incorrectUsers.length; i++) {
                if (!isCorrectUsers(users[i])) {
                    incorrectUsers[i] = users[i];
                }
            }
            return incorrectUsers;
        }
    }

    public static class User {
        String name;
        String surname;
        Address address;
        String email;
        String phone;

        public User(String name, String surname, Address address, String email, String phone) {
            this.name = name;
            this.surname = surname;
            this.address = address;
            this.email = email;
            this.phone = phone;
        }

        public Map allFields() {
            Map<String, String> mapFieldsUser = new HashMap<>();
            mapFieldsUser.put("name", name);
            mapFieldsUser.put("surname", surname);
            mapFieldsUser.put("address", address.toString());
            mapFieldsUser.put("email", email);
            mapFieldsUser.put("phone", phone);
            return mapFieldsUser;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", address=" + address +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }

    public static class Address {
        String country;
        String city;
        String street;
        Integer houseNumber;

        public Address(String country, String city, String street, Integer houseNumber) {
            this.country = country;
            this.city = city;
            this.street = street;
            this.houseNumber = houseNumber;
        }

        public Map allFields() {
            Map<String, String> mapFieldsAddress = new HashMap<>();
            mapFieldsAddress.put("country", country);
            mapFieldsAddress.put("city", city);
            mapFieldsAddress.put("street", street);
            mapFieldsAddress.put("houseNumber", String.valueOf(houseNumber));
            return mapFieldsAddress;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "country='" + country + '\'' +
                    ", city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", houseNumber=" + houseNumber +
                    '}';
        }
    }

    static class Main {
        public static void main(String[] args) {
            Address address = new Address("Germany", "Frankfurt", "Kelsterbacher", 88);
            User user = new User("Andrei", "Ridley", address, "andy@hot.ee", "543332");

            UserValidationService userValidationService = new UserValidationService();

            Address addressFull = new Address("Germany", "Frankfurt", "Kelsterbacher", 88);
            Address addressNoCountry = new Address("", "Frankfurt", "Kelsterbacher", 88);
            Address addressNoCity = new Address("Germany", "", "Kelsterbacher", 88);
            Address addressWrongCountry = new Address("Estonia", "Hamburg", "Kelsterbacher", 88);

            User userFull = new User("Andrei", "Ridley", addressFull, "andy@hot.ee", "543332");
            User userWrongEmail1 = new User("Andrei", "Ridley", addressFull, "andy_hot.ee", "543332");
            User userWrongEmail2 = new User("Andrei", "Ridley", addressFull, "andyhotee", "543332");
            User userWrongEmail3 = new User("Andrei", "Ridley", addressFull, "andy@hotee", "543332");
            User userNoName = new User("", "Ridley", addressFull, "andy@hot.ee", "543332");
            User userNoSurname = new User("Ivan", "", addressFull, "andy@hot.ee", "543332");
            User userNoCountry = new User("Ivan", "", addressNoCountry, "andy@hot.ee", "543332");
            User userNoCity = new User("Ivan", "", addressNoCity, "andy@hot.ee", "543332");
            User userWrongCountry = new User("Ivan", "II", addressWrongCountry, "andy@hot.ee", "543332");

            User[] users = {userFull, userWrongEmail1, userWrongEmail2, userWrongEmail3, userNoName, userNoSurname, userNoCountry, userNoCity, userWrongCountry};
            User[] incorrectUsers = userValidationService.getIncorrectUsers(users);
            for (User incUser : incorrectUsers) {
                if (incUser != null) {
                    System.out.println(incUser);
                }
            }

        }
    }
}

