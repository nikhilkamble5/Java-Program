import java.util.Scanner;

public class Session3 {
    public static void main(String[] args) {
        // &&||!
        // float f=10*3;
        // System.out.println(f);

        // f=10/3;
        // f=3; 
        // System.out.println(f);

        // 😉🔥🔥🔥🔥 Temp
//         int a=10,b=20;
// System.out.println(a+" -"+b);
//         int temp=a;
//         a=b;
//         b=temp;
                
// System.out.println(a+" -"+b);

//         int a=10,b=20;
//         System.out.println(a+" -"+b);
// a=a+b;
// b=a-b;
// a=a-b;
//         System.out.println(a+" -"+b);


//         int a=10,b=20;
//         System.out.println(a+" -"+b);
// a=a*b;
// b=a/b;
// a=a/b;
//         System.out.println(a+" -"+b);

//         int a=10,b=20;
//         System.out.println(a+" -"+b);
// a=a^b;
// b=a^b; //swaping using ^ ex or
// a=a^b;
//         System.out.println(a+" -"+b);

// int a=100<<3;
// System.out.println(a);
/**
 * 100<<3
 * p<<q
 * p*(2^q)
 * 100*2^3
 * 100 * 8
 * 800
 */

//  a=3<<1;
//  System.out.println(a);
 // 011
 // 01120 =>6

//  int a=100>>3;
// System.out.println(a);
/**
 * 100>>3
 * p>>q
 * p/(2^q)
 * 100/2^3
 * 100 / 8
 * 800
 */

//  a=3>>1;
//  System.out.println(a);
//  // 011
//  // 01120 =>6

// int p=5,q=5,r=4;
// r=r+q;//9
// r=(r+p)+p;//19
// p=(p&12)&p;
//0101 =>5
//1100 =>12
//0101 =>5 
// ------
//0100 p=4

// 🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥
        // Logical op && || !
        // 1st to all statement
//    if (true) {
// System.out.println("yes");

// System.out.println("R");    
//    }     

//   if (false)  
// {System.out.println("yes1");
// System.out.println("yes2");
// }

// System.out.println("R1");  
// System.out.println("R2");    

// System.out.println("R3");


//   if (true)  
// {System.out.println("yes1");
// }
// else
// System.out.println("yes2");


// System.out.println("R1");  
// System.out.println("R2");    

// System.out.println("R3");


//   if (false)  
// {System.out.println("yes1");
// }
// else
// System.out.println("NO");


// System.out.println("R1");  
// System.out.println("R2");    

// System.out.println("R3");



//   if (true)  
// {System.out.println("yes1");
// System.out.println("yes2");
// }
// else
// System.out.println("NO1");


// System.out.println("R1");  
// System.out.println("R2");    

// System.out.println("R3");

//   if (false)  
// {System.out.println("yes1");
// System.out.println("yes2");
// }
// else
// System.out.println("NO1");


// System.out.println("R1");  
// System.out.println("R2");    

// System.out.println("R3");

  // 🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥

    //nested if else
//     int i=1;
//     if(i==1){
//         System.out.println("yes1");
//     }
//     else{
//         if(i==2)
//             System.out.println("yes2");
//         else
//             System.out.println("no2");
//             System.out.println("r1");
//     }
// System.out.println("R2");


//  int i=1;
//     if(i==1){
//          if(i==2)
//             System.out.println("yes2");
//         else
//             System.out.println("no2");
//             System.out.println("r1");
//     }
//     else
       
//                 System.out.println("yes1")
// System.out.println("R2");



//  int i=1;
//     if(i==1){
//          if(i==2)
//             System.out.println("yes2");
//         else
//             System.out.println("no2");
//             System.out.println("r1");
//     }
//     else
//        {
//         if(i==2)
//             System.out.println("yes2");
//         else
//             System.out.println("no2");
//             System.out.println("r1");
//        }
                
// System.out.println("R2");

//  int i=2;
//     if(i==1){
//          if(i==2)
//             System.out.println("yes2");
//         else
//             System.out.println("no2");
//             System.out.println("r1");
//     }
//     else
//        {
//         if(i==2)
//             System.out.println("yes2");
//         else
//             System.out.println("no2");
//             System.out.println("r1");
//        }
                
// System.out.println("R2");
    // 🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥

// Scanner sc=new Scanner(System.in);
// System.out.println("enter number :");
// int num=sc.nextInt();
// syso

  // 🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥
        //✅ nested if else

        // 1]Draw back  if else 
// Scanner sc= new Scanner(System.in);
// System.out.println("enter perentage");
//     int per=sc.nextInt();
//     if (per>=60) 
//         System.out.println("Fc");
        
    
//     else{
//         if (per>=45) 
//             System.out.println("sc");

//            else 
//           {     if (per>=40) 
//             System.out.println("pc");
//             else
//              System.out.println("fail"); 
//            System.out.println("R1");
//           }
          
//     }System.out.println("r2");
   

// Scanner sc= new Scanner(System.in);
// System.out.println("enter perentage");
//     int per=sc.nextInt();

//     if(per>=60)
//     System.out.println("fc");
//     if(per>=50 && per<60)
//     System.out.println("sc");
//     if(per>=40 && per<50)
//     System.out.println("pc");
//     if(per>=35 && per<40)
//     System.out.println("D");
//     if(per<35)
//     System.out.println("fail");

    // best code 😍
// Scanner sc= new Scanner(System.in);
// System.out.println("enter perentage");
//     int per=sc.nextInt();

//     if(per>=60)
//     System.out.println("fc");
//    else if(per>=50 && per<60)
//     System.out.println("sc");
//   else  if(per>=40 && per<50)
//     System.out.println("pc");
//    else if(per>=35 && per<40)
//     System.out.println("D");
//    else if(per<35)
//     System.out.println("fail");
    
//     System.out.println("you got"+per+"%");

	// Drawback
// Scanner sc= new Scanner(System.in);
// System.out.println("enter perentage");
//     int per=sc.nextInt();

//     if(per>=60)
//     System.out.println("fc");
   
//   else  if(per>=40)
//     System.out.println("pc");
//     else if(per>=50)
//     System.out.println("sc");
//    else if(per>=35)
//     System.out.println("D");
//    else if(per<35)
//     System.out.println("fail");
    
//     System.out.println("you got"+per+"%");

//-----------------------------------------
// Insurance  privde ms-martial status
//MS-M
//MS-U GEN -M AGE>30=>IP INSURANCE PROVIDE
//MS-U GEN -F AGE>0=>IP IP
//OW INP

// Scanner sc =new Scanner(System.in);
// System.out.println("Enter Martial Status[M/U] :");
// String ms=sc.next();

// System.out.println("Enter Gender [M/F]");
// String gen=sc.next();

// System.out.println("Enter Age");
// int age= sc.nextInt();

// if(ms.equals("M"))
// System.out.println("IP");
// else{
//     if (gen.equals("M")) {
//          if(gen>30)
//         System.out.println("Male insurance provide");
//     else
//         System.out.println("male insurance not provide"); 
        
//         System.out.println("R1");
//     }
//     else{
//          if(age>25)
//         System.out.println("FMale insurance provide");
//     else
//         System.out.println("Fmale insurance not provide");  
//                 System.out.println("R2");

//     }
//             System.out.println("R3");

// }
//         System.out.println("R4");

// Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Martial Status[M/U] :");
//         String ms = sc.next();

//         System.out.println("Enter Gender [M/F]");
//         String gen = sc.next();

//         System.out.println("Enter Age");
//         int age = sc.nextInt();

//         if (ms.equals("M"))
//             System.out.println("IP");
//         else {
//             if (gen.equals("M")) {
//                 if (age > 30)
//                     System.out.println("Male insurance provide");
//                 else
//                     System.out.println("Male insurance not provide");

//                 System.out.println("R1");
//             } else {
//                 if (age > 25)
//                     System.out.println("Female insurance provide");
//                 else
//                     System.out.println("Female insurance not provide");

//                 System.out.println("R2");
//             }
//             System.out.println("R3");
//         }
//         System.out.println("R4");

// --------------------------------------------

// Scanner sc = new Scanner(System.in);

// System.out.println("Enter Martial Status[M/U] :");
// String ms = sc.next();

// System.out.println("Enter Gender [M/F]");
// String gen = sc.next();

// System.out.println("Enter Age");
// int age = sc.nextInt();

// if ((ms.equals("M") || ms.equals("U")) && (gen.equals("M") && age > 30) || (gen.equals("F") && age > 55)) {
//     System.out.println("IP");
// } else {
//     System.out.println("inp not provide");
// }
// System.out.println("r1");

// --------------------------------------------
// Scanner sc = new Scanner(System.in);
//  System.out.println("Enter Gender Status[M/F] :");
//  String gen=sc.next();

//   System.out.println("Enter Year of service :");
//  int yos=sc.nextInt();

//  System.out.println("Enter qualification [P/G]: ");
//  String qual=sc.next();

//  int salary =0;

//  if (gen.equals("M") && yos >= 10 && qual.equals("P")) 
//      salary = 15000;
//   else if (gen.equals("F") && yos >= 10 && qual.equals("P")) 
//      salary = 12000;
// else if(gen.equals("F") && yos >=10 && qual.equals("G") || (yos<10 && qual.equals("P") ))
// salary =1000;
// else if(gen.equals("M") && yos>=10)
// salary=9000;
// else if(gen.equals("M") && yos<10 && qual.equals("G"))
// salary=7000;
// else if(gen.equals("M") && yos<10 && qual.equals("G"))
 
//  salary=15000;

// System.out.println("Salary: " + salary);


 Scanner sc = new Scanner(System.in);
 System.out.println("Enter Math Marks :");
    int Math=sc.nextInt();

     System.out.println("Enter Biology Marks :");
    int Biology=sc.nextInt();
    
   System.out.println("Enter English Marks :");
    int English=sc.nextInt();
      
    
 System.out.println("Enter Hindi Marks :");
    int Hindi=sc.nextInt();

     System.out.println("Enter Social studies Marks :");
    int Social_studies=sc.nextInt();

    float total_marks=500;
    float per=((Math+Biology+English+Hindi+Social_studies)/total_marks)*100;
    
    System.out.printf("%.1f",per);

if(Math<30 || Biology<30|| English<30|| Hindi<30|| Social_studies<30)
System.out.print("\nFail");

    else if((Math>=90 && Biology>=70 && per>80) && (Math>=90 && Biology>=70 && per>80) )
    System.out.print("\nJee ,Medical");

   else if(Math>=90 && Biology>=70 && per>80)
    System.out.print("\nJee");
    else if(Biology>=90 && per>60)
    System.out.print("\nMedical");
    else
    System.out.print("\nfail");

    //10.42
}
    
}
