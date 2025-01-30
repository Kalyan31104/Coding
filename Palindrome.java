import java.util.Scanner;
class Sreverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        SBReverse(str);
    }
    static void SBReverse(String str){
        StringBuilder s=new StringBuilder(str);
//reverse a stringbuilder using reverse function.
        s.reverse();
// convert the reversed stringbuilder to string for using equals method that can be used for only strings.
        String a=s.toString();
        if(str.equals(a)){
            System.err.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }

    }
}
