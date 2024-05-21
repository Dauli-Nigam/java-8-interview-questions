public class PalindromeNumberProgramme {

    // TODO A NUMBER THAT IS EQUAL TO THE REVERSE OF THAT SAME NUMBER IS CALLED PALINDROME NUMBER
    //  FOR EXAMPLE 3553,12321, ETC.
    public static void main(String[] args) {
        int num = 3553, reverseNum = 0, reminder;

        // TODO STORE THE NUMBER TO ORIGINAL NUMBER,WE WILL USE ORIGINAL NUM TO EXTRACT EVERY DIGIT FROM IT

        int originalNum = num;

        // TODO HERE WE ARE GOING TO WRITE LOGIC TO REVERSE OF ORIGINAL NUMBER

        while (num != 0) // TODO HERE WE ARE GOING TO RUN THIS LOGIC UNTIL IT REACH TO 0 DIGIT
        {
            reminder = num % 10;
            // TODO HERE WE ARE TRYING TO GET LAST DIGIT OF NUMBER

            reverseNum = reverseNum * 10 + reminder;

            // TODO HERE WE ARE TRYING TO SHIFT THE DIGIT TO PREVIOUS DIGIT SO THAT WE CAN  HAVE ENTIRE REVERSED NUMBER

            num /= 10; // TODO HERE WE ARE TRYING TO PICK ANOTHER DIGIT BY MOVING TO NEXT DIGIT AFTER DIVIDE

        }

        // TODO HERE WE ARE CHECKING IF REVERSE NUM AND ORIGINAL NUM ARE EQUAL IT MEANS IT IS PALINDROME..

        if (originalNum == reverseNum) {

            System.out.println(originalNum + " is palindrome");

        }
        // TODO IT IS NOT THAN IT IS NOT PALINDROME NUMBER ..
        else {
            System.out.println(originalNum + " is not palindrome");

        }

    }

}
