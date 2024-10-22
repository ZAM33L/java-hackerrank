import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        String[] tokens = scanner.nextLine().split(" ");
        
        int[] A = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
        
        int negative_arrays = 0;
        for (int i = 0; i < A.length; i++)
        {
            int sum = 0;
            for (int j = i; j < A.length; j++)
            {
               sum += A[j];
                if (sum < 0)
                {
                    negative_arrays++;
                }
                
            }
        }
        
        System.out.println(negative_arrays);
        
        
    }
}