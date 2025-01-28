
import java.util.Scanner;

class Substring
{
    static void sub(String str){
// i is used to iterate till length of the array
     for (int i = 0; i < str.length(); i++) {
//At each iteration from i to j the substrings will be printed
// for substring calculation upto j will be printed
         for(int j=i+1;j<=str.length();j++){
            System.out.println(str.substring(i,j));
         }
         
         
     }
    }
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      sub(str);

  }
}
