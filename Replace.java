
import java.util.Scanner;
class replace{
    static void replace(String str){
//replacing all other character than alphabets with empty space
// if we donot space just remove space 
       System.out.println(str.replaceAll("^[a-zA-Z]"," "));

    }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine(); 
    replace(str);
 }
}
