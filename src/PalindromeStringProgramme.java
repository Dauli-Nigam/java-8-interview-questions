public class PalindromeStringProgramme {

    public static void main(String[] args) {

        // TODO A STRING IS CALLED PALINDROME STRING IS IF THE REVERSE OF THAT STRING IS THE SAME AS ORIGINAL STRING
        //  FOR EXAMPLE  RADAR, LEVEL, ETC.

        String str = "Dauli", reverseStr = ""; // TODO HERE WE HAVE TAKEN TWO VARIABLES, REVERSE-TER WILL HAVE REVERSED STRING OF INPUT STRING

        int strLength = str.length(); // TODO HERE WE ARE TAKING LENGTH WHICH WE WILL WILL USE INTO FOR LOOP TO ITERATE EVERY CHARACTER OF STRING

        for (int i = (strLength - 1); i >= 0; --i) { // TODO HERE WE ARE ITERATING EVERY CHARACTER OF STRING STARTING FROM LAST TWO FIRST CHARACTER

            reverseStr = reverseStr + str.charAt(i);

            // TODO HERE WE ARE CONCATENATING CHARACTER IN REVERSE ORDER SO THAT WE CAN GET REVERSED STRING..

        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) // TODO HERE WE ARE COMPARING STRING MAKING IN LOWER CASE SO WE CAN COMPARE PROPERLY AND
        //   IF ACTUAL STRING AND  REVERSE STRING ARE SAME THAN STRING IS PALINDROME STRING..


        {
            System.out.println(str + " is a palindrome string ");


        } else // TODO IF ACTUAL STRING AND REVERSE STRING ARE "NOT" SAME THEN STRING IS "NOT" PALINDROME STRING...
        {
            System.out.println(str + " is not a palindrome string ");


        }


    }
}
