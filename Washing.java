import java.util.Scanner;
class WashingMachine{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int weight=sc.nextInt();
        char water=sc.next().charAt(0);
        char Level=Character.toLowerCase(water);
        int time;
// if weight is equal to zero then print 0
        if(weight==0)
        {
         time=0;
          System.out.println(time);
        }
// if weight is lesser than zero than print invalid input
        if(weight<0){
            System.out.println("Invalid Input");
        }
// if weight is greater than zero goes to nested conditions.
        if(weight>0){
// if weight is lesser than 2000 then level is checked based on that loops will run
            if(weight<=2000){
                if(Level=='l'){
                time=25;
                System.out.println(time);
                }
// 
                
                else if(Level=='m'||Level=='h')
                    {
                        System.out.println("OVERLOADED WATER LEVEL");
                    } 
                else{
                    System.out.println("Invalid water level");
                }
            }
// if weight is greater than 2000 and lesser than 4000 then level is checked based on that loops will run
            else if(weight>2000 && weight <=4000)
            {
                
                if(Level=='m'){  
                    time=35;
                    System.out.println(time);
                    }
                else if(Level=='l'){
                        System.out.println("UNDER WATER LEVEL");
                    }
                else if(Level=='h'){
                        System.out.println("OVERLOADED Level");
                    }
                    
                    else{
                        System.out.println("INVALID WATER LEVEL");
                    }

                    
            }
// if weight is greater than 4000 and lesser than or equal to 7000 then level is checked based on that loops will run
            else if(weight>4000 && weight <=7000 )
            {
                if(Level=='h')
                {  
                    time=45;
                   System.out.println(time);
                }
                    else if(Level=='m'||Level=='l')
                    {
                        System.out.println("UNDER WATER LEVEL");
                    } 
                    else{
                        System.out.println("INVALID WATER LEVEL");
                    }  
            }
// if weights are more than 7000 then it will print overloaded
            else{
                System.out.println("OVERLOADED ");
            }
        }
        
        


    }
}
