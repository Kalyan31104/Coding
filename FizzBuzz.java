import java.util.Scanner;
class Fizzbuzz{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
//Checking whether the number is divisible by both 3 and 5
        if(number%3==0 && number%5==0){
            System.out.println("Fizz Buzz");
        }
//Checking whether the number is divisible 3
        else if(number%3==0){
            System.out.println("Fizz");
//Checking whether the number is divisible 5
        }
        else if(number%5==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println("Number is not divisible by both 3 and 5");
        }
    }
}
