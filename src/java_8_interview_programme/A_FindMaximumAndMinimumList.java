package java_8_interview_programme;

import java.util.ArrayList;
import java.util.List;

// TODO WRITE A PROGRAMME TO FIND MAXIMUM AND MINIMUM ELEMENTS IN A LIST OF INTEGER USING THE STREAM API AND JAVA 8
public class A_FindMaximumAndMinimumList {

    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>(); // TODO WE ARE CREATED LIST OBJECT AND WE WILL ADD ELEMENT TO IT..

        number.add(7);
        number.add(5);
        number.add(3);
        number.add(6);
        number.add(2);
        number.add(4);
        number.add(8);
        number.add(9);

        int max = number.stream().max(Integer::compare).get();

        // TODO HERE WE ARE USING NUMBER. STREAM() TO CREATE FROM A NUMBERS LIST
        //  WE HAVE USED MAX FUNCTION TO FIND MAXIMUM ELEMENT FROM THE LIST
        //  THE GET() METHOD OF THE STREAM API IS USED TO RETRIEVE THE RESULT OF AN OPERATION PERFORMED ON A STREAM...

        int min = number.stream().min(Integer::compare).get();

        // TODO HERE WE ARE USING NUMBER. STREAM() TO CREATE FROM A NUMBERS LIST
        //  WE HAVE USED MIN FUNCTION TO FIND THE MINIMUM ELEMENT FROM THE LIST
        //  THE GET() METHOD OF THE STREAM API IS USED TO RETRIEVE THE RESULT OF AN OPERATION PERFORMED ON A STREAM...

        System.out.println("maximum number:" + max);
        System.out.println("minimum number:" + min);


    }


}
