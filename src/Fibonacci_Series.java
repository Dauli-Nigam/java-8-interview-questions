public class Fibonacci_Series {

    // TODO THE FIBONACCI SERIES IS A SERIES WHERE THE NEXT TERM IS THE SUM OF PREVIOUS TWO TERMS.
    //  THE FIRST TWO TERMS OF THE FIBONACCI SEQUENCE ARE 0 FOLLOWED BY 1.

    public static void main(String[] args) {

        int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
        //TODO HERE WE HAVE TAKEN 0 AND 1 AS FIRST TWO ELEMENT OF SERIES AND N 0 IS THE RANGE OF SERIES

        System.out.println("fibonacci series till" + n + "terms:");

        //TODO WE ARE GOING TO USE WHILE LOOP TO REPEAT THE BELOW LOGIC OF GENERATING NEXT TERM BY ADDING PREVIOUS TWO TERMS

        while (i <= n) {
            System.out.println(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;

            //TODO HERE WE ARE FINDING TERM BY ADDING PREVIOUS TWO TERMS

            firstTerm = secondTerm;
            //TODO HERE WE NEED TO MOVE FIRST TERM TO SECOND TERM SO WE CAN GENERATE NEXT TERM

            secondTerm = nextTerm;
            //TODO HERE WE NEED TO MOVE SECOND TERM TO NEXT TERM SO WE CAN MOVE FORWARD IN SERIES

            i++;


        }


    }


}
