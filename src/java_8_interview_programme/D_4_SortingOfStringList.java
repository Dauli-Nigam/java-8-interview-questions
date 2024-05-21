package java_8_interview_programme;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// todo sort string in natural in reverse order ..
public class D_4_SortingOfStringList {

    public static void main(String[] args) {

        //TODO WRITE A PROGRAMME TO SORT STRING IN NATURAL ORDER ...

        List<String> stringList = Arrays.asList("Further", "instead", "Vowel", "Further", "instead", "Vowel");

        List<String> sortedList = stringList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());


        // TODO we are using .asList method t create list , after that we have created stream using stringList.stream() method
        //  we are using sorted method to do the sorting and also we are using comparator to specify order of sorting as natural order
        //  we are collecting output as a List so we are using Collectors.ToList() inside collect

        System.out.println("Sorted List In Natural Order" + sortedList);

        // todo write a programme sort string in reverse order...

        List<String> reverseSortedList = sortedList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        //TODO we are using .asList method to create list , after that we have created stream using stringList.stream() method
        // we are using sorted method to do the sorting and also we are using Comparator.reverseOrder() to specify
        // order of sorting as reverse order
        // we are collecting output as a List so we are using Collectors.ToList() inside collect

        System.out.println("Sorted list In Reverse Order " + reverseSortedList);

    }


}
