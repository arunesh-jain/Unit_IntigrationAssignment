

public class Factorial {

    String factorialReturn(int number)
    {
        int factorialNumber=number;//It is the number to calculate factorial
        for(int i=1;i<number;i++){
            factorialNumber=factorialNumber*i;
        }
        return "Factorial of " + number + " is: " + factorialNumber;
    }
}
