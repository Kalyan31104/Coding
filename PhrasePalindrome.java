import java.util.Scanner;
class Sreverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        SBReverse(str);
    }
    static void SBReverse(String str){
// sing replaceall function to remove extra spaces and special characters
        String sk=str.replaceAll(("[^a-zA-Z0-9]"), "").toLowerCase();
        System.out.println(sk);
// converting string to stringbuilder to use reverse function 
        StringBuilder s=new StringBuilder(sk);
        s.reverse();
// convert stringbuilder again to string to use equals method
        String a=s.toString();
        if(sk.equals(a)){
            System.err.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }

    }
}
