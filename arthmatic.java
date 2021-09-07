package kiran.java;
import java.io.IOException;
import java.util.Scanner;
public class arthmatic {
     public static void main(String[] args) throws IOException {
        Scanner user_input= new Scanner(System.in);
        try{
    int num1,num2 ; 
    System.out.println("enter two numbers :");
    num1=user_input.nextInt();
    num2=user_input.nextInt();
    System.out.println("\nAddition :"+(num1+num2));
    System.out.println("\nsubstration :"+(num1-num2));
    System.out.println("\nmultplication:"+(num1*num2));
     } finally{
          user_input.close();
     
     }
}
    
     }



    

