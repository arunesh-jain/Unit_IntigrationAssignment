//A palindrome number is a number that is same after reverse.

public class Palindrome {
    String palindromeNumber(int number)
    {
        int result,sum=0;
        int temp=number;//It is the number variable to be checked for palindrome


        while(temp>0){
            result=temp%10;  //getting remainder
            sum=(sum*10)+result;
            temp=temp/10;
        }
        if(number==sum)
            return "palindrome number ";
        else
            return "not palindrome";
    }

}
