
public class loop {

    
    public static void main(String args[]) {
        int n=5;
        loop ob= new loop();
        ob.Whilelopp(n);
        ob.forloop(n);
        ob.doWhileloop(n);
        
    }
    
    void forloop(int n){
        for(int i=1; i<n; i++){
            System.out.println("value in for loop:" +i);
        }
    }
    
    void Whilelopp(int n){
        int i = 0;
        while (i < n) {
        System.out.println("value in while loop:" +i);
        i++;
}
    }
    void doWhileloop(int n){
    int i=1;  
    do{  
        System.out.println("value in do while loop"+ i);  
    i++;  
    }while(i<=n);  
    }
}
