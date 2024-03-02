// public class Session21MethodOverloading {
//     public static void main(String[] args) {

// Circle c1= new Circle();
//         //c1 1002 instance variable banto  radius area
//         c1.setValues(3);
//         c1.calculateArea();
//         c1.displayInfo();

//         // 👇🔥 Quetion  create Multiple Objects One Type only

//         Rectangle r1 = new Rectangle(),r2=new Rectangle();
//         //r1 Lenth :10 ,Breadth :20 ,Area :200
//         r1.setValues(10, 20);
//         r2.setValues(5, 8);

//         r1.calculateArea();
//         r2.calculateArea();

//         r1.displayInfo();
//         r2.displayInfo();
//     }
// }


// class Rectangle{
//     int lenth ,breadth,area;

//     void setValues(int l,int b){
//        lenth =l;
//        breadth=b;
//     }

//     void calculateArea(){
//         area=lenth*breadth;
//     }

//     void displayInfo(){

//         System.out.println("________________________________________");
//         System.out.print("Lenth :"+ lenth);
//         System.out.print(" ,Breadth :"+ breadth);
//             System.out.println(" ,Area :"+ area);

//         System.out.println("________________________________________");

//     }
// }


/**
 * Annonymous Object 🔥🔥🔥👇👇👇
 */
//  class Calculation {
// void findFact(int n){
//     int fact=1;

//     for(int i=1;i<=n;i++)
//         //1 2 3 4<=3
//         fact=fact*i;//fact=6
//         System.out.println(n+" Factorial is "+fact);
    
// }
    
// }
// public class Session21MethodOverloading {
//     public static void main(String[] args) {

//         new Calculation().findFact(3);

//     }
// }
// Method/Function/Module/Activity/block/ Overloading in Java

// Multiple methods having same name but diffrent parameter 
// function name same same but parameter arw diffrent  !!
// whys user

// Function Overloading -Within class
//Use - code Readability !! code quick understand

//👇🔥 Diffrent ways to overload method

// 1] By changing number of argument
//2]  By changing the data types

// 1 By changing number of argument
// class Calculation {

//     //Sucess -method /function signature
//     void sum(int number1,int number2){
// System.err.println(number1+" + "+number2+" = "+(number1+number2));
//     }

//         void sum(int number1,int number2,int number3){
// System.err.println(number1+" + "+number2+" + "+number3+" = "+(number1+number2));
//     }
    
// }
    

// public class Session21MethodOverloading {
//     public static void main(String[] args) {

// Calculation c1= new Calculation();
// c1.sum(10, 20);
// c1.sum(22, 5, 6);
//     }
// }


// 2]  By changing the data types

// class Calculation {

//     //Sucess -method /function signature
//     void sum(int number1,int number2){
//         System.out.println("II");
// System.err.println(number1+" + "+number2+" = "+(number1+number2));
//     }

//         void sum(int number1,float number2 ){
//             System.out.println("IF");
// System.err.println(number1+" + "+number2+" = "+(number1+number2));
// ;
//     }
    
// }
    

// public class Session21MethodOverloading {
//     public static void main(String[] args) {

// Calculation c1= new Calculation();
// c1.sum(10, 20);
// c1.sum(22, 55.22f);
//     }
// }

//In java method overloading is not posssible by
// changing tje return type of the method

class Calculation {

    //Sucess -method /function signature
    int sum(int a,int b){
       System.out.println(a+b);
              System.out.println("int");

       return a+b;
    }

        double sum(int a,float b ){
            System.out.println(a+b);
                        System.out.println("double");

            return a+b;
    }
    
}
    

public class Session21MethodOverloading {
    public static void main(String[] args) {

Calculation c1= new Calculation();
c1.sum(10, 20);

c1.sum(22, 55.22f);
    }
}