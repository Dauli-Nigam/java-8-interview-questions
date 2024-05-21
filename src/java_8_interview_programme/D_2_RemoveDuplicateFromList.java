package java_8_interview_programme;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// TODO REMOVE DUPLICATE FROM STRING USING  STREAM API...
public class D_2_RemoveDuplicateFromList {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Pluto", "Saturn", "Uranus", "Sun", "Pluto", "Saturn", "Uranus");

        List<String> distinctString = stringList.stream().distinct().collect(Collectors.toList());

        // TODO we are using .asList method to create list , after that we have created stream using stringList.stream() method
        //  and we are avoiding duplicate in results so we are using distinct method
        //  where we are collecting output as a List so we are using Collectors.ToList() inside collect

        System.out.println(distinctString);


    }


}
