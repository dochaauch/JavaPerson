package basicJava.taskHome221110;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class homework221110Test {
    homework221110.UserValidationService userValidationService = new homework221110.UserValidationService();
    String[] countryForList = {"", "Germany", "Estonia", "France"};
    String[] cityForList = { "Frankfurt", "", "Hamburg", "Kiel"};
    String[] streetForList = {"Kelsterbacher", "Sole", "", "Dorf str."};
    String[] houseForList = {"88", "1", "15553", ""};
    List<String> AddressWrong = new ArrayList<>();


    homework221110.Address addressFull  = new homework221110.Address("Germany", "Frankfurt", "Kelsterbacher", 88);
    homework221110.Address addressNoCountry  = new homework221110.Address("", "Frankfurt", "Kelsterbacher", 88);
    homework221110.Address addressNoCity  = new homework221110.Address("Germany", "", "Kelsterbacher", 88);
    homework221110.Address addressWrongCountry  = new homework221110.Address("Estonia", "Hamburg", "Kelsterbacher", 88);

    homework221110.User userFull = new homework221110.User("Andrei", "Ridley", addressFull, "andy@hot.ee", "543332");
    homework221110.User userWrongEmail1 = new homework221110.User("Andrei", "Ridley", addressFull, "andy_hot.ee", "543332");
    homework221110.User userWrongEmail2 = new homework221110.User("Andrei", "Ridley", addressFull, "andyhotee", "543332");
    homework221110.User userWrongEmail3 = new homework221110.User("Andrei", "Ridley", addressFull, "andy@hotee", "543332");
    homework221110.User userNoName = new homework221110.User("", "Ridley", addressFull, "andy@hot.ee", "543332");
    homework221110.User userNoSurname = new homework221110.User("Ivan", "", addressFull, "andy@hot.ee", "543332");
    homework221110.User userNoCountry = new homework221110.User("Ivan", "", addressNoCountry, "andy@hot.ee", "543332");
    homework221110.User userNoCity = new homework221110.User("Ivan", "", addressNoCity, "andy@hot.ee", "543332");
    homework221110.User userWrongCountry = new homework221110.User("Ivan", "II", addressWrongCountry, "andy@hot.ee", "543332");


    @Test
    void areAllFieldsNotEmpty() {
        assertEquals(true, userValidationService.areAllFieldsNotEmpty(userFull));
        assertEquals(false, userValidationService.areAllFieldsNotEmpty(userNoName));
        assertEquals(false, userValidationService.areAllFieldsNotEmpty(userNoSurname));
        assertEquals(false, userValidationService.areAllFieldsNotEmpty(userNoCountry));
        assertEquals(false, userValidationService.areAllFieldsNotEmpty(userNoCity));
    }

    @Test
    void hasEmailAtSign() {
        assertEquals(true, userValidationService.hasEmailAtSign(userFull));
        assertEquals(false, userValidationService.hasEmailAtSign(userWrongEmail1));
        assertEquals(false, userValidationService.hasEmailAtSign(userWrongEmail2));
    }

    @Test
    void isCountryInList(){
        assertEquals(true, userValidationService.isCountryInList(userFull));
        assertEquals(false, userValidationService.isCountryInList(userNoCountry));
        assertEquals(false, userValidationService.isCountryInList(userWrongCountry));

    }

    @Test
    void hasEmailDotAfterAt(){
        assertEquals(true, userValidationService.hasEmailDotAfterAt(userFull));
        assertEquals(false, userValidationService.hasEmailDotAfterAt(userWrongEmail1));
        assertEquals(false, userValidationService.hasEmailDotAfterAt(userWrongEmail2));
        assertEquals(false, userValidationService.hasEmailDotAfterAt(userWrongEmail3));
    }

    @Test
    void isCorrectUsers(){
        assertEquals(true,userValidationService.isCorrectUsers(userFull));
        assertEquals(false,userValidationService.isCorrectUsers(userWrongEmail3));
        assertEquals(false,userValidationService.isCorrectUsers(userNoCity));
        assertEquals(false,userValidationService.isCorrectUsers(userWrongCountry));
    }

    @Test
    void getIncorrectUsers(){
        homework221110.User[] users = {userFull, userWrongEmail1, userWrongEmail2, userWrongEmail3, userNoName, userNoSurname, userNoCountry, userNoCity, userWrongCountry};
        homework221110.User[] incorUsers = {null, userWrongEmail1, userWrongEmail2, userWrongEmail3, userNoName, userNoSurname, userNoCountry, userNoCity, userWrongCountry};
        assertArrayEquals(incorUsers, userValidationService.getIncorrectUsers(users));
    }
}