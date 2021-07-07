
public class Array {

   
    public static void main(String args[]) {
        
        String[] name= new String[5];
        name[0]="abdullah";
        name[1]="tushar";
        name[2]="unknown";
        name[3]="unknown2";
        String[] place={"Dhaka","chattogram"};
        
      for(String i: name){
          System.out.println(i);
      }
      for(String i: place){
          System.out.println(i);
      }
        
      
    }
}
