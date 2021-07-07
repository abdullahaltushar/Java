
public class variable {
     static int Static_variable=100;
     
     void method()  
    {    
        int Local_variable=90;
        System.out.println("Local variable :"+ Local_variable);
    }


    public static void main(String args[]) {
         int instance_variable=50;//instance variable   
         
         
         System.out.println("instance_variable :"+ instance_variable);
         System.out.println("Static_variable : "+variable.Static_variable);
         variable call =new variable();
         call.method();
          
   
    }       
        
    }

