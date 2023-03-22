package algorithm.lesson230316;

import java.util.*;

/*Сгруппируйте слова с одинаковым набором символов

Дан список слов со строчными буквами. Реализуйте функцию поиска всех слов с одинаковым
уникальным набором символов.

Input: String words[] = {"student", "students", "abbac", "dog", "god", "cat", "act", "flow", "wolf",
        "row", "abc", "cacbbbbac"};
Output :
student, students,
cat, act,
dog, god,
flow, wolf,
row,
abbac, abc, cacbbbbac*/

public class GroupingWords {

//    public static void main(String[] args) {
//        List<String> words =
//                List.of("student", "students", "roar",
//                        "dog", "abcaca", "god", "cat",
//                        "act", "flow", "wolf", "abc", "ababaaccbaabcba");
//        List<List<String>> groups = groupWordsByUniqueCharSetGPT6622(words);
//        for (List<String> group : groups) {
//            System.out.println(group);
//        }
//    }

//    Сгруппируйте слова с одинаковым набором символов

//    Дан список слов со строчными буквами.
//    Реализуйте функцию поиска всех слов с одинаковым уникальным набором символов.
//
//    Input: String words[] =
//    {"student", "students", "roar", "dog", "abcaca", "god", "cat", "act", "flow", "wolf", "abc","ababaaccbaabcba"};
//    Output :
//    student, students,
//    cat, act,
//    dog, god,
//    flow, wolf
//    abc,ababaaccbaabcba, abcaca
//    roar

    // idea1: use hash map for character
    // idea2: use linked hash set to remove duplicates

    // create empty map
    // for each word
    //  create key - unique character set, value - all words
    //  store the  key in map with word as value (a collection)
    // return result

    public static List<List<String>> groupWordsByUniqueCharSetGPT(List<String> words) {
        Map<Set<Character>, List<String>> groups = new HashMap<>();

        for (String word : words) {
            Set<Character> uniqueChars = new LinkedHashSet<>();
            for (char c : word.toCharArray()) {
                uniqueChars.add(c);
            }

            if (groups.containsKey(uniqueChars)) {
                groups.get(uniqueChars).add(word);
            } else {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(word);
                groups.put(uniqueChars, newGroup);
            }
        }

        return new ArrayList<>(groups.values());
    }

    public static List<List<String>> groupWordsByUniqueCharSet(List<String> words) {
//        return words.stream()
//                .collect(Collectors.groupingBy(GroupingWords::getKey))
//                .values().stream().toList();

        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            String key = getKey(word);
            List<String> group = map.getOrDefault(key, new ArrayList<>());
            group.add(word);
            map.put(key, group);
//            map.computeIfAbsent(key, k -> new ArrayList<>());
        }

        return new ArrayList<>(map.values());
    }

    private static String getKey(String str) {
//        return Arrays.stream(str.split("")).distinct().sorted().collect(Collectors.joining());
        char[] chars = str.toCharArray();

        // uniquness
        Set<Character> set = new TreeSet<>();
        for (int i = 0; i < chars.length; i++) {
            set.add(chars[i]);
        }

        // convert to String
        StringBuilder sb = new StringBuilder();
        for (Character c: set) {
            sb.append(c);
        }

        return sb.toString();
    }
}
