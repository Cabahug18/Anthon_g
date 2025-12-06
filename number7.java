public class java7
{
    public static void main (String [] args){
   int[] arr = {-4, 7, -1, 0, -9};

    for (int i = 0; i < arr.length; i++) {
    if (arr[i] < 0) {          // check negative
        arr[i] = Math.abs(arr[i]);  // convert to positive
    }
   }
  }
}
