
public class condition {

  
    public static void main(String args[]) {
        int number=84;
        if(number>=90 && number<100){
            System.out.println("you Got : A+");
        }
        else if(number>=80 && number<90){
            System.out.println("you Got : A");
        }
        else if(number>=70 && number<80){
            System.out.println("you Got : A-");
        }
        else if(number>=60 && number<70){
            System.out.println("you Got : B+");
        }
        else if(number>=50 && number<60){
            System.out.println("you Got : B");
        }
        else if(number>=40 && number<50){
            System.out.println("you Got : B-");
        }
        else{
            System.out.println("Sorry!. you fall");
        }
    }
}
