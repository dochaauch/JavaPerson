package profJava.cons230120;

//public class Task1RegEx {
//    final static String BEGIN_VCARD = "BEGIN:VCARD";
//    final static String END_VCARD = "END:VCARD";
//
//    public static void main(String[] args) {
//        String path = "./src/profJava/cons230120/input_business_card.txt";
//        Task1RegEx cardParser = new Task1RegEx();
//        List<String> list = readFile(path);
//        for (String user : list) {
//            cardParser.parseContact(user);
//        }
//    }
//
//    public  BusinessCardContact parseContact(String contact) {
//        BusinessCardContact bc = new BusinessCardContact();
//        Tel tel = new Tel();
//        String regex = "^(FN|TEL|EMAIL|ADDRESS|WEB)[;:](TYPE=.*:|)(.+)$";
//        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
//        Matcher matcher = pattern.matcher(contact);
//        while(matcher.find()){
//
////            System.out.println(matcher.group(1));
////            System.out.println(matcher.group(2));
////            System.out.println(matcher.group(3));
//
//            if(matcher.group(1).startsWith("FN")){
//                bc.setFullName(matcher.group(3));
//            }
//            if(matcher.group(1).startsWith("TEL")) {
//                tel.setTel(matcher.group(3));
//            }
//
//
//            }
//        }
//        return null;
//    }
//
//
//    private static List<String > readFile(String path) {
//        List<String> stringArr;
//        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//            stringArr = new ArrayList<>();
//            String line;
//            boolean start = false;
//            StringBuilder strBl = new StringBuilder();
//            while ((line = br.readLine()) != null) {
//                if (line.startsWith(END_VCARD)) {
//                    start = false;
//                    stringArr.add(strBl.toString());
//                    strBl = new StringBuilder();
//                } else if (start == true) {
//                    strBl.append(line).append("\n");
//                } else if (line.startsWith(BEGIN_VCARD)) {
//                    start = true;
//                }
//            }
////            System.out.println(stringArr);
////            System.out.println(stringArr.size());
////            System.out.println(stringArr.get(0));
//
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return stringArr;
//    }
//}
