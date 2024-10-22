import  static java.lang.System.*;
class Prime
{
    void checkPrime(int ... numbers)
    { // use the biginteger probable prime function?
        for (int number: numbers)
        {
            if (BigInteger.valueOf(number).isProbablePrime(1))
            {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}