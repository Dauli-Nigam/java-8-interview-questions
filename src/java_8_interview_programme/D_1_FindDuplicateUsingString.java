package java_8_interview_programme;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// TODO FIND DUPLICATE STRING USING STREAM  API
public class D_1_FindDuplicateUsingString {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("star", "jupiter", "jetbrains", "star", "jupiter");

        List<String> duplicateString = stringList.stream().filter(string -> Collections.frequency(stringList, string) > 1).distinct()
                .collect(Collectors.toList());

        // TODO we are using .asList method to create list , after that we have created stream using stringList.stream() method
        //  after that we have used intermediate operation filter and we are using lambda expression to get the duplicate string
        //  we are using Collectors.frequency method and we are paring list of string stringList and Particular string
        //  and also we are comparing is frequency is greater than 1 mean it is duplicate we will be using terminal operation collect
        //  and we are avoiding duplicate in results so we are using distinct method
        //  where we are collecting output as a List so we are using Collectors.ToList() inside collect

        System.out.println(duplicateString);


    }

    


}
