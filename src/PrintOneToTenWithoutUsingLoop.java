public class PrintOneToTenWithoutUsingLoop {

    // TODO THIS PROBLEM CAN BE SOLVED USING A RECURSIVE FUNCTION,RECURSION IS SOMETHING WHEN A FUNCTION CALLS IT SELF IT IS CALL RECURSION

    // TODO SO WE HAVE CREATED A STATIC FUNCTION WHICH WE CAN CALL WITHOUT CREATING OBJECT AND IT IS TAKING INPUT AS NUMBER..

    public static void recursivefun(int n) {

        // TODO HERE WE WANT TO PRINT NUMBER 1 TO 10 SO WE HAVE ADDED A CHECK IF NUMBER IS LESS THEN OR EQUAL THEN ONLY

        // TODO WE ARE GOING TO PRINT IT OTHERWISE IT WILL EXIT IS NUMBER IF GREATER THEN 10...

        if (n <= 1000) {

            System.out.println(n);
            recursivefun(n + 1); // TODO HERE WE ARE CALLING SAME FUNCTION AGAIN WITH NUMBER + ONE SO EVERY NUMBER WILL INCREASED

        }

    }

    public static void main(String[] args) {

        recursivefun(1); // TODO THIS IS OUR FIRST CALL FROM MAIN METHOD AND IT WILL CALL OUR RECURSIVE FUNCTION UNTIL IT'S REACHES  TO 0
    }


}
