package Oop;

/**
 *
 * @author arafat
 */
public class Animal {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        
        int i=0;
        
        while(i<test ){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            
            if(Math.abs(x - z) < Math.abs(y-z)){
            System.out.println("Cat A");
            }
            else if (Math.abs(x - z) > Math.abs(y-z)){
            System.out.println("Cat B");
            }
            else{
            System.out.println("Mouse C");
           
            }
          ++i;   
    }
  }
    
}
