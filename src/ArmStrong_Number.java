public class ArmStrong_Number {

    /*TODO n case of armstrong number of three digits,the sum of cubes of each digits is equal to the number itself.
       for example 153=1*1*1+5*5*5+3*3*3 //153 is an armstrong number*/

    public static void main(String[] args) {

        int number = 371, originalNumber, reminder, result = 0;

        // TODO HERE WE TAKEN THESE VARIABLE TO STORE OUR RESULT,REMINDER AND ORIGINAL NUMBER WHICH WE WILL USE FURTHER
        originalNumber = number;
        //TODO HERE WE ARE GOING TO USE ORIGINAL NUMBER TO EXTRACT EVERY DIGITS FROM IT
        while (originalNumber != 0)//TODO WE ARE GOING TO RUN THIS LOGIC UNTIL WE REACH TO ZERO
        {
            reminder = originalNumber % 10; //TODO HERE WE ARE TRYING TO EXTRACT LAST DIGIT FROM ORIGINAL NUMBER USING OPERATOR

            result += Math.pow(reminder, 3);

            /*TODO HERE WE ARE DOING CUBE OF LAST DIGIT AND STORING TO RESULT,EVERYTIME WE WILL
             *  ALSO STORE PREVIOUS SUM OF THAT WE CAN COMPARE WITH FINAL SUM WITH ACTUAL NUMBER */

            originalNumber /= 10;//TODO HERE WE TRYING TO GET THE SECOND DIGIT FROM GIVEN NUMBER SO WE CAN EXTRACT NEXT DIGIT
        }

        //TODO AFTER THIS ALL CALCULATION WE HAVE CUBE OF EVERY DIGIT AND SUMMING IN RESULT VARIABLE

        if (result == number)// TODO HERE WE ARE CHECKING IF RESULT SUM IS EQUAL TO THE ACTUAL NUMBER THEN IT IS ARMSTRONG NUMBER

            System.out.println(number + "is an armstrong number");

        else //TODO IF IT IS NOT EQUAL THEN DEFINITELY IT IS NOT ARMSTRONG NUMBER
            System.out.println(number + "is not an armstrong number");


    }
}
