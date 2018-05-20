// can you remember how to set up your main function?
import java.util.Arrays;
import java.util.*;

public class PrintArrays {
  public static void main(String[] args) {
  
   // declare an array of Strings and print it 
   String[] names = { "sarah", "dave", "paul" };
   System.out.println(Arrays.toString(names));

   // declare an array of integers and print it
   int[] numbers = { 1, 2, 3 };
   System.out.println(Arrays.toString(numbers));

   // declare an ArrayList of integers, add numbers to it, and then print it
   ArrayList moreNums = new ArrayList();
   moreNums.add(1);
   moreNums.add(2);
   moreNums.add(3);
   System.out.println(moreNums);
  }
}






