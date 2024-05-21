package java_8_interview_programme;
// TODO WRITE A PROGRAMME TO SORT LIST OF INTEGER USING THE STREAM API IN JAVA 8

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C_SortListOfInteger {

    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>();

        // TODO HERE WE HAVE CREATED LIST OBJECT AND WE WILL ADD ELEMENT TO IT ...

        number.add(1);
        number.add(4);
        number.add(6);
        number.add(7);
        number.add(8);
        number.add(0);
        number.add(9);

        List<Integer> sortedNumber = number.stream().sorted().collect(Collectors.toList());

        // TODO WE HAVE USED NUMBER.STREAM() TO CREATE STREAM FROM OUR LIST, AFTER THAT WE ARE USING SORTED METHOD,
        //  THIS METHOD WILL SORTING IN NATURAL ORDER IN LAST WE USING TERMINAL OPERATION.COLLECT() WHICH GIVE A FINAL RESULT FROM STREAM
        //  WE ARE COLLECTING RESULT AS A LIST HERE TO WE HAVE USE COLLECTOR.toLIST() METHOD...

        System.out.println("sorted list " + sortedNumber);



     }

}
