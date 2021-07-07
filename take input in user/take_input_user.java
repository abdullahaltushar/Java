import java.util.*;  
public class take_input_user {
    

    
    public static void main(String args[]) {
        
        Scanner input= new Scanner(System.in);
        System.out.print("Enter first number- ");  
        int firstNumber=input.nextInt();  
        System.out.print("Enter second number- ");  
        int secondNumber= input.nextInt();  
        System.out.print("Enter third number- ");  
        int thirdNumber= input.nextInt();  
        int total=firstNumber+secondNumber+thirdNumber;  
        System.out.println("Total= " +total);  
    }
}
