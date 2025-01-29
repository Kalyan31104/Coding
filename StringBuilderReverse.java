import java.util.Scanner;
class Sreverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        SBReverse(str);
    }
    static void SBReverse(String str){
//convert given string into a stringbuilder to use reverse method which is available only in stringbuilder.
        StringBuilder s=new StringBuilder(str);
        s.reverse();
        System.out.println(s);

    }
}
