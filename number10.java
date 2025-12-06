public class ten
{
    public static void main (String [] args){
        int[] numbers = {5, 9, 7, 4, 8, 10};

      int index = -1; // default value if no even number is found

        for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] % 2 == 0) {   // check if even
        index = i;              // store the index
        break;                  // stop the loop (first even found)
       }
      }

        System.out.println("First even number index: " + index);

    }
}
