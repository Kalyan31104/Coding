
import java.util.Scanner;

class Greatest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
//Checking if a value is greater than b and c
        if(a>b){
            if(a>c){
                System.out.println(a+" is the highest among three numbers");
            }
            
        }
// Checking if b is greater than c 
        else if(b>c){
            System.out.println(b+" is the highest among three numbers");
        }
        else{
            System.out.println(c+" is the highest among three numbers");
        }

    }
}
