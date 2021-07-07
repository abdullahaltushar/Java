import java.util.*;  
public class ArrayList1 {

    public static void main(String args[]) {
        ArrayList <String> list = new ArrayList<String>();
        
        list.add("MI");//Adding object in arraylist    
        list.add("Apple");    
        list.add("Sumsang");    
        list.add("ViVO");    
        //Traversing list through for-each loop  
        for(String phone:list)  
            
              System.out.println(phone);    
  
 }  
}  
