import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
//converting char to Lowecase for reducing checking of capital vowels
        char ch=Character.toLowerCase(c);
//checking whether given char is a vowel using switch case.
        switch(ch){
            case 'a':
                System.out.println("It is a vowel");
                break;
            case 'e':
                System.out.println("It is a vowel");
                break;
            case 'i':
                System.out.println("It is a vowel");
                break;
            case 'o':
                System.out.println("It is a vowel");
                break;
            case 'u':
                System.out.println("It is a vowel");
                break;
            default:
            System.out.println("It is not a vowel");
        }

    }
}
