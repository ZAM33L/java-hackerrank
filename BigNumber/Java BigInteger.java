import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        BigInteger biA = scan.nextBigInteger();
        
        BigInteger biB = scan.nextBigInteger();
        
        BigInteger sum = biA.add(biB);
        
        BigInteger prod = biA.multiply(biB);
        System.out.println(sum);
        System.out.println(prod);
    }
}