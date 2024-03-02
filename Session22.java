

// class Calculation {

//     //Sucess -method /function signature
//     int sum(int a,int b){
//        System.out.println(a+b);
//               System.out.println("int");

//        return a+b;
//     }

//         double sum(int a,double b ){
//             System.out.println(a+b);
//                         System.out.println("double");

//             return a+b;
//     }
    
// }
// public class Session22 {
//     public static void main(String[] args) {
        
//         Calculation obj =new Calculation();
//         int result1= obj.sum(20, 30);
//         System.err.println(result1);
//         double result2= obj.sum(20, 55.66);
//         System.out.println(result2);

//     }
// }



//😊🔥👇Cam We overload main method


// public class Session22 {
//     public static void main(String[] args) {
        
//     System.out.println("Main Call");
//         Session22.main(10);
//         main(20);
//     }
//     public static void main(int i){
//         System.out.println("called Yes Main method :"+i);
//     }
    
// }


// 👇🔥Method overloading Type pramotion type casting

// class Calculation {

//     //Sucess -method /function signature
//     void sum(int number1,int number2,int number3){
//         System.out.println("II");
// System.err.println(number1+" + "+number2+" = "+(number1+number2+number3));
//     }

//         void sum(int number1,long number2 ){
//             System.out.println("IF");
//             System.out.println(number1+number2);
// ;
//     }

//        void sum(int number1,int number2 ){
//             System.out.println("IF");
//             System.out.println(number1+number2);
// ;
//     }
    
// }
    

// public class Session22 {
//     public static void main(String[] args) {
        
// Calculation c1= new Calculation();
// c1.sum(10, 20);
// c1.sum(10, 20, 30);
    
// }}


// class Calculation {

//     //Sucess -method /function signature
//     void sum(int number1,int number2,int number3){
//         System.out.println("II");
// System.err.println(number1+" + "+number2+" = "+(number1+number2+number3));
//     }

//         void sum(long number1,int number2 ){
//             System.out.println("LI");
//             System.out.println(number1+number2);
// ;
//     }

//        void sum(int number1,int number2 ){
//             System.out.println("IF");
//             System.out.println(number1+number2);
// ;
//     }
    
// }
    

// public class Session22 {
//     public static void main(String[] args) {
        
// Calculation c1= new Calculation();
// c1.sum(10L, 20);
// c1.sum(10, 20, 30);
    
// }}


// ************ 🔥CONSTRUCTER🔥++++++++

/*  Constructor
 *  Class Name Same as COnstructor Namme
 * Initialize the object
 * Special Functionl
 * When Object is Created at that time Constructor will Called! !
 * Do not reaturn type & return value
 * 
 *  Type👇
 * 1]Default COnstuctor
2] Parameterized Constructor
3] Copy Constructod
        Constructor Overloading
 */
 
//   class Student {

//     String name;
//     int roll;
//     float percentage;

//      Student(String n,int rl,float p){
//         name=n;
//         roll=rl;
//         percentage=p;
//     }

//        Student(Student s){
//         System.out.println("Copy COnstructor");
//         name=s.name;
//         roll=s.roll;
//         percentage=s.percentage;
//     }

//     Student(){
//         System.out.println("Default constructor");
//     }
//     void display(){
//         System.out.print("name "+name);
//         System.out.print(" , roll :"+roll);
//         System.out.println(" ,percentage :"+percentage);
//         System.out.println("------*********---------");
//     }

// }

// public class Session22 {
//     public static void main(String[] args) {
        
// Student s1 = new Student("rahul", 1, 55.22f);
// Student s2 = new Student("john", 3, 66.33f);
//  Student s3 = new Student("HHH", 5, 30.00f);
// Student s4= new Student();
   
// // Copy Style 

// Student s5= new Student();
// s5.name=s1.name;
// s5.roll=s1.roll;
// s5.percentage=s1.percentage;

// // Copy Style 

// Student s6=s1;

// Student s7 = new Student(s1);

// System.out.println("-------------------***************---------------------");
// System.out.println("Student 1 Info :");
// s1.display();
// System.out.println("Student 2 Info :");
// s2.display();
// System.out.println("Student 3 Info :");
// s3.display();

// System.out.println("Student 4 Info :");
// s4.display();
// System.out.println("Student 5  Info :");
// s5.display();
// System.out.println("Student 6  Info :");
// s6.display();
// System.out.println("Student 7   Info :");
// s7.display();
// }}


class Bike{
    Bike(){
        System.out.println("Bike is Created");
    }
}
public class Session22 {
    public static void main(String[] args) {
        
        Bike b1 = new Bike();
                Bike b2 = new Bike();

}}