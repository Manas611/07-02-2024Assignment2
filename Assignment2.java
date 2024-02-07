import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2 {

    public static boolean Solve(String word,ArrayList<String> arr)
    {
        int size = word.length();
         
        if (size == 0)
        return true;
         
        // Iterate over all letter in word
        for (int i = 1; i <= size; i++)
        {
            // Call the left out part for Recursion
            if (arr.contains(word.substring(0,i)) && Solve(word.substring(i,size),arr))
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Entering the input String
        System.out.println("Enter the String");
        String inputString = sc.next();

        //Taking how many numbers are to be taken for input array
        System.out.println("Enter the size of word List");
        int n = sc.nextInt();

        //Entering array elements
        System.out.println("Enter array list Elements");
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr.add(sc.next());
        }

        boolean ans = Solve(inputString,arr);
        System.out.println(ans);

        sc.close();
    }
}
