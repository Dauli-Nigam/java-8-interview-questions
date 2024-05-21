package java_8_interview_programme;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// TODO FIND STRING WITH LENGTH HIGHER THAN FIVE ...
public class D_3_FindStringWithLengthHigherThanFive {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("Hello");
        strings.add("System");
        strings.add("Android");
        strings.add("Iphone");
        strings.add("Version");
        strings.add("Penal");

        List<String> filteredString = strings.stream().filter(s -> s.length() > 5).collect(Collectors.toList());

        // TODO here we have created stream from list of string using strings.stream()
        //  after that we are using intermediate operation filter and passing lambda expression
        //  in this lambda s is a String input and after arrow we are checking length of String grater than 5
        //  if any string matches this condition then it will be filtered and we will be using terminal operation collect
        //  where we are Collecting output as a List so we are using Collectors.ToList() inside collect

        System.out.println("strings with length greater than five " + filteredString);

    }


}
