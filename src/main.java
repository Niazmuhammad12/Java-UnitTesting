import java.util.Scanner;

public class main {
   float tempIncalsius;
   float tempInfahrenheit;
   float tempInKalven;
    int array[];
    int sum=0;
    Scanner s=new Scanner(System.in);
    // method to check the prime number
    Boolean checkPrimeNumber(){
        int number;
        System.out.println("Enter the number to check it's prime or not");
        number=s.nextInt();
        for(int i=0;i<(number/2);i++){
            if(number%i ==0){
                return false;
            }
        }

        return  true;
    }

   
   // method to check the numbr is even or odd
    Boolean CheckEvenOdd(){
        int number;
        System.out.println("Enter the number to check it's Even or Odd");
        number=s.nextInt();
        if(number%2==0){
            return true;
        }
        else
            return false;
    }
   
   // method to calculate everage of int array
    float CalculateAverage(){
         float average;

        int n;
         System.out.println("enter the size of array");
         n=s.nextInt();
          array=new int[n];
        System.out.println("Enter all the integer  elements want to add in  array");
        for(int i=0;i<n;i++){

            array[i]=s.nextInt();
            sum=sum+array[i];
        }

       average=sum/n;
        return average;

    }

   
   // method to check if two string is Plindrom string 
    Boolean CheckPalindromString(){
        String first,second="";
        System.out.println("Enter the String to chek it's Plindrom ");
        first=s.next();
         System.out.println("Enter the second String to chek it's Plindrom ");
        second=s.next();
        
        if(first.equalsIgnoreCase(second))
        {
            return true;
        }
        else
            return false;


    }

   
   //convert temp from calsius to fahrenheit and kalven
    float[] getTempIntoFAndK(){
        float temps[]=new float[2];
        System.out.println("Enter the temp in Celsius");
        tempIncalsius=s.nextFloat();
        tempInfahrenheit= (float) (tempIncalsius*1.8+32);
        tempInKalven= (float) (tempIncalsius+273.15);
        temps[0]=tempInfahrenheit;
        temps[1]=tempInKalven;
        return temps;


    }
}
