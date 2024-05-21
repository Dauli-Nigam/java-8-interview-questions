import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfNumberInArray {

    static void countFreq(int arr[], int n) {

        Map<Integer, Integer> mp = new HashMap<>();
        //TODO HERE WE WILL BE USING HASHMAP TO STORE NUMBER AND ITS OCCURRENCE,WE ARE USING USING
        // KEY AS NUMBER AND VALUE AS OCCURRENCE.

        for (int i = 0; i < n; i++)//TODO HERE WE ARE TRAVERSING ALL THE ELEMENTS OF ARRAY USING LOOP

        {
            if (mp.containsKey(arr[i])) // TODO HERE WE ARE CHECKING IF KEY IS ALREADY PRESENT IT
                                        //  MEAN TO CHANGE THE OCCURRENCE

            {
                mp.put(arr[i], mp.get(arr[i]) + 1);//TODO SO WE ARE GETTING THR OCCURRENCE OF
                                                   // NUMBER AND ADDING + 1 AS THIS ALREADY AVAILABLE
            } else { // TODO IF KEY IS NOT PRESENT IT MEANS IT'S NEW NUMBER SO WE WILL SIMPLY PUT INTO MAP WITH 1 OCCURRENCE

                mp.put(arr[i], 1);
            }
        }
        System.out.println(mp);
        // TODO PRINTING MAP WITH NUMBER AND OCCURRENCE

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 4, 4, 5, 1, 7, 4, 8, 6, 7, 9, 9, 8};
        int n = arr.length;
        countFreq(arr, n);
    }
}
