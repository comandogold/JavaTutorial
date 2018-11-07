/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamap;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CoPC
 */
public class JavaMap {
    
    
        public static void main(String[] args) {


        
   
        
    }
    
   
    
    public static void JavaMap(){
    
    		Scanner in = new Scanner(System.in);
                
                System.out.println("How many times, you wanna try?");
		int n=in.nextInt();
                in.nextLine();
                
		for(int i=0;i<n;i++)
		{
                     System.out.println("Tell me Your Name?");
			String name=in.nextLine();
			
                        System.out.println("Tell me Your Phone-Number?");
                        int phone=in.nextInt();
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
                        System.out.println(s);
		}
    }
    
    
    
    public static void OutputFormatting(){
    
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                
            // System.out.println("Como te llamas ?");
                String s1=sc.next();
                
               
                 
             // System.out.println("Cuantos años tienes ?");
                int x=sc.nextInt();
                //Complete this line
                
                  System.out.printf("%-15s", s1);
                System.out.printf("%03d", x);
                System.out.println("");
                
            }
            System.out.println("================================");

        
        
    
    }
    
    
    public static void Javaloops1(){
        
     Scanner scanner = new Scanner(System.in);
        
     System.out.println("Wich number you wanna multiply?");
     int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
            System.out.println("================================");
        for (int i = 1; i < 11; i++) {
            
  
              
              System.out.println(N+" x "+i+ " = "+N*i );
    

     
        }
           System.out.println("================================");
        System.out.println("");
        
        
    
    }
  

public static void aLoops2(){

 Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
       
        for(int i=0;i<t;i++){
            
            
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
         /// a equal a sum
         ///b * n multiply
         // 
         
         
         int valor1=0;
         int valor2=0;
        int valor3=0;
         Double valor4=null;
         Double valor5=null;
         Double valor6=null;
         Double valor7=null;
         Double valor8=null;
         Double valor9=null;
         Double valor10=null;
         Double valor11=null;
         String cristian=null;
         String name=null;
         int[] numeros1= new int[500];
         
         int k=2;
         int m=0;
         
         valor1 = (int) (a+Math.pow(k,m)*b);
 
          valor3=valor1;
            for (int j = 0; j < n; j++) { 
 
              
 
                
                if (j==0) {
                     valor2 = (int) ((a+Math.pow(k,j)*b));
           valor3=valor2;
                
                } else {
                    valor2 = (int) ((valor3+Math.pow(k,j)*b));
           valor3=valor2;
                    
                }
           
           
           
           System.out.printf("%s",valor2 + " ");
            ///System.out.printf("%s \n",valor2 + " ");
          // System.out.printf( "%s");
           //System.out.println("");
           // name = String.valueOf(numeros1 [valor2]);
                    
}
            System.out.println(" ");
//System.out.println(name);
            //String totalserie= valor1+" " +valor2+ " " +valor3+ " " +valor4+ " " +valor5+ " " +valor6+ " " +valor7+ " " +valor8+ " " +valor9+ " " +valor10+ " " +valor11;
            
            
            
   //String control1= totalserie.replace(".0", "");
         // System.out.println(control1.replace("null", ""));
          
          
         //System.out.println("-");
         
            
        }
        
        
        in.close();

}


public static void stdinstdout (){
 Scanner scan = new Scanner(System.in);
   System.out.println("Que edad tienes? " );
        int i = scan.nextInt();
          scan.nextLine();
          
        System.out.println("Cuanto cuesta tu handy? " );
        Double d = scan.nextDouble();
          scan.nextLine();
         System.out.println("Cual es tu nombre? " );
        String s = scan.nextLine();
      


        // Write your code here.

       
        
        
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

}


public static void javadatatypes(){

     Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)        {   
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                
                if(x>=-128 && x<=127){
                    
                System.out.println("* byte");
                
                }
                if(x>=-32768 && x<=32767){
                    
                System.out.println("* short");
                
                }
                if(x>=Math.pow(-2, 31) && x<=Math.pow(2, 31)){
                    
                System.out.println("* int");
                
                }
                if(x>=Math.pow(-2, 63) && x<=Math.pow(2, 63)){
                    
                System.out.println("* long");
                
                }
                    
                    
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
                                    }
}


public static void javaendlife(){
    
    Scanner sc=new Scanner(System.in);
        
        String s = "Hello World! 3 + 3.0 = 6";
int count =1;
        
while(sc.hasNext()) {
           
    String ns = sc.nextLine();
            
            System.out.println(count + " " + ns);  
            
            count++;
        }
        
    /*    
   for (int lineNum=1; sc.hasNext(); lineNum++) {
   ///System.out.println(" Line number " + lineNum + ": " + sc.next());
       if (sc.next()=="end-of-file") {
           break;
           
       } else {
            System.out.println(" Line number " + lineNum + ": " + sc.next());
           
       }
}
        
    
   
   /*   
      // create a new scanner with the specified String Object
      Scanner scanner = new Scanner(s);

      // check if the scanner has a token
      System.out.println("" + scanner.hasNext());

      // print the rest of the string
      System.out.println("" + scanner.nextLine());

      // check if the scanner has a token after printing the line
      System.out.println("" + scanner.hasNext());

      // close the scanner
      scanner.close();
        */
 
        

}

public static void datesfechas(){

    int n = 10;

        String s =Integer.toString(n); 
        
String mes = Integer.toString(12);
String dia = Integer.toString(29);
String ano=  Integer.toString(2018);
        
String fecha=dia+"/"+mes+"/"+ano;  


        Calendar calendar = Calendar.getInstance();
      calendar.set(Calendar.YEAR, 2015);
        calendar.set(Calendar.MONTH, 8-1);
        calendar.set(Calendar.DAY_OF_MONTH, 05);
        
        System.out.println(calendar.getTime());
         if (calendar.get(Calendar.DAY_OF_WEEK)==3) {
        System.out.println("SATURDAY");    
        }
          if (calendar.get(Calendar.DAY_OF_WEEK)==2) {
        System.out.println("FRIDAY");    
        }
            if (calendar.get(Calendar.DAY_OF_WEEK)==1) {
        System.out.println("THURSDAY");    
        }
              if (calendar.get(Calendar.DAY_OF_WEEK)==7) {
        System.out.println("WEDNESDAY");    
        }
                if (calendar.get(Calendar.DAY_OF_WEEK)==6) {
        System.out.println("TUESDAY");    
        }
                  if (calendar.get(Calendar.DAY_OF_WEEK)==5) {
        System.out.println("MONDAY");    
        }
                    if (calendar.get(Calendar.DAY_OF_WEEK)==4) {
        System.out.println("SUNDAY");    
        }
        
    
}


public static void fallidos(){

 
/*
public static Scanner sc = new Scanner(System.in);

public static int B = ValorRecibido1();

public static int H = ValorRecibido1(); 

public static boolean flag ;

private static int ValorRecibido1(){
       int M = sc.nextInt();
       if (M<0) {
           
           if (B<0 && M <0) {
           flag=false; 
           System.out.println("java.lang.Exception: Breadth and height must be positive");
           }else{
           System.out.println("java.lang.Exception: Breadth and height must be positive");
             flag=false;   
           }
           
           
           
       } else {
           
           if(B<0){
           
               flag=false;
               
           }else if(H<0){
               flag=false;

             
               
           }else{
                 flag=true;
           }
           
           
       }
       return M;
        };

*/

/*
 private static int ValorRecibido1(){
       int M = sc.nextInt();
       if (M<=0) {
           
           if (B<=0 && M <=0) {
           flag=false; 
           System.out.println("java.lang.Exception: Breadth and height must be positive");
           }else{
           System.out.println("java.lang.Exception: Breadth and height must be positive");
             flag=false;   
           }
           
           
           
       } else {
           if(B<=0){
           
               flag=false;
           }else if(H<=0){
               flag=false;

             
               
           }else{
                 flag=true;
           }
           
           
       }
       return M;
        };

*/

/*
  private static int ValorRecibido1(){
       int M = sc.nextInt();
       if (M<=0) {
           
           if (B<=0 && H<=0 && B!=1520) {
           flag=false; 
           System.out.println("java.lang.Exception: Breadth and height must be positive");
           B=1520;
           
           }else if (B<=0 && H<=0 && B==1520){
            flag=false; 
              H=1520;
           }
           
           
           
       } else {
           if(B<=0 && M<=0){
           
               flag=false;
           }else if(H<=0 && M<=0){
               flag=false;

             
               
           }else{
               flag=true;
      
                 
           }
           
           
       }
       return M;
        };
 */
    
    
    


   
    /*
public static void control1(){
	if(flag){
int area=B*H;
System.out.println(area);
	}
		
	}//end of main

*/

}

}
