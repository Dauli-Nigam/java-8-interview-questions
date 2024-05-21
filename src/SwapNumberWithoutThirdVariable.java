public class SwapNumberWithoutThirdVariable {

    public static void main(String[] args) {

        // TODO FIRST APPROACH : THE NUMBER CAN WE SWAPPED USING THE SUM AND SUBTRACTION FROM THE SUM.

        int x = 10; // TODO HERE WE HAVE USED FIRST VARIABLE
        int y = 5;  //  TODO HERE IS THE SECOND VARIABLE
        x = x + y;  //  TODO X=10+5=15 HERE WE ADDING BOTH NUMBER SO WE CAN GET THE TOTAL SUM (x) WHICH WE WILL USE FURTHER
        y = x - y;  //  TODO Y=15-5=10 IF WE SUBTRACT Y FROM THEN WE ARE GOING TO GET THE FIRST NUMBER AND IT REPLACED IN Y
        x = x - y;  //  TODO X=15-10=5 NOW WE HAVE SECOND NUMBER IN Y SO IF WE WILL SUBTRACT Y FROM X SO FINALLY WE WILL GET SECOND NUMBER AS WELL

        System.out.println("SWAPPING USING ADDITION AND SUBTRACTION AFTER SWAPPING: " + "x=" + x + ", y=" + y);

        // TODO SECOND APPROACH : USING MULTIPLICATION AND DIVIDE..

        int a = 10;
        int b = 5;
        // TODO CODE TO SWAP 'a' AND 'b'

        a = a * b; // TODO a NOW BECOME 50
        y = a / b; // TODO a BECOME 10
        a = a / b; // TODO a BECOME 5

        System.out.println("USING MULTIPLICATION AND DIVIDE AFTER SWAPPING : " + "x=" + x + ",y=" + y);
    }


}
