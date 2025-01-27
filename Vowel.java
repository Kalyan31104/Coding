import java.util.Scanner;

class Vowels{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
//Converting char to lowercase
        char ch=Character.toLowerCase(c);
// checking if it a vowel
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("It is a vowel");
        }
        else{
            System.out.println("It is not a vowel");
        }

    }
}
