import java.util.Scanner;

 // By Aditya C Mahajan

 class Pattern_Star_08
 {
   public static void main(String args[])
   { 
     Scanner scr = new Scanner(System.in);
     
     System.out.println(" Enter The value ");
     int num = scr.nextInt();
     
      /*
       
      *
      * *
      *   *
      *     *
      * * * * *
             
       
       */
     
        
         System.out.println("* ");
   
     for(int i = 2; i <= num-1; i++){
   
      System.out.print("* ");
   
    for(int j = 1; j <= i-2; j++){
    
     System.out.print("   ");
     
     
   }
    System.out.print("* ");
   
     System.out.println();
   
     
     
    }
    for(int k = 1; k <= num; k++){
      
  System.out.print("* ");
      
    }
  
   }
 }