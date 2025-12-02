public class java6
{ 
     public static void main (String [] args){
    int[] arr = {3, 10, 5, 8, 7};

    int sum = 0;
    int count = 0;

   for (int num : arr) {
     if (num % 2 != 0) {   // check if odd
        sum += num;
        count++;
     }
    }

     if (count > 0) {
    double average = (double) sum / count;
    System.out.println("Average of odd numbers: " + average);
    } else {
    System.out.println("No odd numbers found.");
   }
}
}
