import java.util.*;

public class Prime{

     public static void main(String []args){
        
        //Create the integer for the number
        int num;
        
        //Create and intitialize the string to tell the user if the number is prime.
        //It is initialized as Not Calculate before the number is calculated.
        String prime1 = "Not Calculated";
        
        //Create the Scanner    
        Scanner scan = new Scanner(System.in);
        
        //Tell the user to enter their number. And get the Input
        System.out.println("\nEnter the number.");
        num = scan.nextInt();
        
        /*Create a for loop that makes an int called i = to 2.  The loop will run 
        while i < num.  i will go up a value on every loop.*/
        for(int i = 2; i < num; i++){
            
            //This will check is the number is prime.  If the remainder of num and i 
            //is 0, the number is not prime.
            if(num % i == 0){
                prime1 = "Not Prime";
                break;
            }
            else{
                prime1 = "Prime";
            }
        }    
        //Output the answer.
        System.out.println("\n"+num+" is "+prime1);
    } 
}
