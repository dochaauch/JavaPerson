package profJava.cons230120;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1RegEx {
    final static String BEGIN_VCARD = "BEGIN:VCARD";
    final static String END_VCARD = "END:VCARD";

    public static void main(String[] args) {
        String path = "./src/profJava/cons230120/input_business_card.txt";
        Task1RegEx cardParser = new Task1RegEx();
        List<String> list = readFile(path);
        for (String user : list) {
            cardParser.parseContact(user);
        }
    }

    public BusinessCardContact parseContact(String contact) {
        BusinessCardContact bc = new BusinessCardContact();
        Tel tel = new Tel();
        Email email = new Email();
        Address address = new Address();
        Web web = new Web();
        String regex = "^(FN|TEL|EMAIL|ADDRESS|WEB)[;:](TYPE=.*:|)(.+)$";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(contact);
        while(matcher.find()){
            switch(matcher.group(1)) {
                case "FN":
                    bc.setFullName(matcher.group(3));
                    break;
                case "TEL":
                    tel.setTel(matcher.group(3));
                    tel.setType(findType(matcher));
                    bc.setPhone(tel);
                    break;
                case "EMAIL":
                    email.setInternet(matcher.group(3));
                    email.setType(findType(matcher));
                    bc.setEmail(email);
                    break;
                case "ADDRESS":
                    if(matcher.group(2).contains("STREET")) {
                        address.setStreet(matcher.group(3));
                    }
                    if(matcher.group(2).contains("CITY")) {
                        address.setCity(matcher.group(3));
                    }
                    if(matcher.group(2).contains("COUNTRY")) {
                        address.setCountry(matcher.group(3));
                    }
                    address.setType(findType(matcher));
                    bc.setAddress(address);
                    break;
                case "WEB":
                    web.setInternet(matcher.group(3));
                    web.setType(findType(matcher));
                    bc.setWeb(web);
                    break;
            }
        }
        System.out.println(bc);
        return bc;
    }

    private static Type findType(Matcher matcher) {
        Type type = null;
        for (Type t : Type.values()) {
            if (matcher.group(2).contains(t.name())) {
                type = t;
            }
        }
        return type;
    }

    private static List<String> readFile(String path) {
        List<String> stringArr;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            stringArr = new ArrayList<>();
            String line;
            boolean start = false;
            StringBuilder strBl = new StringBuilder();
            while ((line = br.readLine()) != null) {
                if (line.startsWith(END_VCARD)) {
                    start = false;
                    stringArr.add(strBl.toString());
                    strBl = new StringBuilder();
                } else if (start == true) {
                    strBl.append(line).append("\n");
                } else if (line.startsWith(BEGIN_VCARD)) {
                    start = true;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringArr;
    }
}
