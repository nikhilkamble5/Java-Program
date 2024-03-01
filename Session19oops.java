//🔥🔥🔥 OOps Concept
/*
 * 1 object
 * 2 class
 * 3inheritance
 * 4 polymorphism
 * 
 * 
 * state /characteristick/propeerties/attributes
 * cpp -Data meber mhanta
 * java-> Instance variable
 * type noofWings price
 */

// public class Session19oops {
    
//   public static void main(String[] args) {
    
//     Fan f1= new Fan();
//     Fan f2=new Fan();
//     Fan f3 =new Fan();

// //f1 1002 type=satanding noOfWings=2 price=6000.66
// //f2 2002 type=wal noOfWings=2 price=3000.66
// //f 3002 type=celling noOfWings=2 price=10000.66

// f1.type="Standing";
// f1.noOfWings=4;
// f1.price=6000.25f;


// f2.type="wall";
// f2.noOfWings=3;
// f2.price=6000.10f;


// f3.type="celling";
// f3.noOfWings=5;
// f3.price=10000.10f;
// System.out.println("-------------------***************---------------------");
// System.out.println("Fan 1 info :");
//       System.out.println("Type"+f1.type);
//       System.out.println("number  of Wings Are :"+f1.noOfWings);
//       System.out.println(" ,Price :"+f1.price);

//       System.out.println("-------------------***************---------------------");
//       System.out.println("Fan 2 info :");
//       System.out.println("Type"+f2.type);
//       System.out.println("number  of Wings Are :"+f2.noOfWings);
//       System.out.println(" ,Price :"+f2.price);

//       System.out.println("-------------------***************---------------------");
//       System.out.println("Fan 3 info :");
//       System.out.println("Type"+f3.type);
//       System.out.println("number  of Wings Are :"+f3.noOfWings);
//       System.out.println(" ,Price :"+f3.price);

/*
 * -------------------***************---------------------
Fan 1 info :
TypeStanding
number  of Wings Are :4
 ,Price :6000.25
-------------------***************---------------------
Fan 2 info :
Typewall
number  of Wings Are :3
 ,Price :6000.1
Fan 3 info :
Typecelling
number  of Wings Are :5
 ,Price :10000.1
 */


// }  
// }

// /**
//  * Fan
//  */
//  class Fan {

//     String type;
//     int noOfWings;
//     float price;

// }


// public class Session19oops {
    
//   public static void main(String[] args) {
    
//     Fan f1= new Fan();
//     Fan f2=new Fan();
//     Fan f3 =new Fan();

// //f1 1002 type=satanding noOfWings=2 price=6000.66
// //f2 2002 type=wal noOfWings=2 price=3000.66
// //f 3002 type=celling noOfWings=2 price=10000.66

// f1.type="Standing";
// f1.noOfWings=4;
// f1.price=6000.25f;


// f2.type="wall";
// f2.noOfWings=3;
// f2.price=6000.10f;


// f3.type="celling";
// f3.noOfWings=5;
// f3.price=10000.10f;
// System.out.println("-------------------***************---------------------");
// System.out.println("Fan 1 info :");
//       System.out.println(" Type "+f1.type);
//       System.out.print("number  of Wings Are :"+f1.noOfWings);
//       System.out.println(" ,Price :"+f1.price);

//       System.out.println("-------------------***************---------------------");
//       System.out.println("Fan 2 info :");
//       System.out.print(" Type"+f2.type);
//       System.out.print(" number  of Wings Are :"+f2.noOfWings);
//       System.out.println(" ,Price :"+f2.price);

//       System.out.println("-------------------***************---------------------");
//       System.out.println("Fan 3 info :");
//       System.out.print("Type"+f3.type);
//       System.out.print("number  of Wings Are :"+f3.noOfWings);
//       System.out.println(" ,Price :"+f3.price);


//       /*
//        * -------------------***************---------------------
// Fan 1 info :
//  Type Standing
// number  of Wings Are :4 ,Price :6000.25
// -------------------***************---------------------
// Fan 2 info :
//  Typewall number  of Wings Are :3 ,Price :6000.1
// -------------------***************---------------------
// Fan 3 info :
// Typecellingnumber  of Wings Are :5 ,Price :10000.1
//        */

// }  
// }

// /**
//  * Fan
//  */
//  class Fan {

//     String type;
//     int noOfWings;
//     float price;

// }




// public class Session19oops {
    
//   public static void main(String[] args) {
    
//     Fan f1= new Fan();
//     Fan f2=new Fan();
//     Fan f3 =new Fan();

// //f1 1002 type=satanding noOfWings=2 price=6000.66
// //f2 2002 type=wal noOfWings=2 price=3000.66
// //f 3002 type=celling noOfWings=2 price=10000.66

// f1.type="Standing";
// f1.noOfWings=4;
// f1.price=6000.25f;


// f2.type="wall";
// f2.noOfWings=3;
// f2.price=6000.10f;


// f3.type="celling";
// f3.noOfWings=5;
// f3.price=10000.10f;
// System.out.println("-------------------***************---------------------");
// f1.setValues("Standing", 2, 6000.22f);
// f2.setValues("wall", 3, 8000.33f);
// f3.setValues("Celling", 5, 10000.00f);

// System.out.println("Fan 1 Info :");
// f1.display();
// System.out.println("Fan 2 Info :");
// f2.display();
// System.out.println("Fan 3 Info :");
// f3.display();


// }  
// }

// /**
//  * Fan
//  */
//  class Fan {

//     String type;
//     int noOfWings;
//     float price;

//     void setValues(String t,int now,float p){
//         type=t;
//         noOfWings=now;
//         price=p;
//     }
//     void display(){
//         System.out.print("Type "+type);
//         System.out.print(" , No of Wings Are :"+noOfWings);
//         System.out.println(" ,Price :"+price);
//         System.out.println("------*********---------");
//     }

// }

/*
-------------------***************---------------------
Fan 1 Info :
Type Standing , No of Wings Are :2 ,Price :6000.22
------*********---------
Fan 2 Info :
Type wall , No of Wings Are :3 ,Price :8000.33
------*********---------
Fan 3 Info :
Type Celling , No of Wings Are :5 ,Price :10000.0
------*********---------
 */


 public class Session19oops {
    
  public static void main(String[] args) {
    
   Student s1 = new Student();
      Student s2 = new Student();
         Student s3 = new Student();




//f1 1002 type=satanding noOfWings=2 price=6000.66
//f2 2002 type=wal noOfWings=2 price=3000.66
//f 3002 type=celling noOfWings=2 price=10000.66


System.out.println("-------------------***************---------------------");
s1.setValues("rahul", 1, 55.22f);
s2.setValues("john", 3, 66.33f);
s3.setValues("HHH", 5, 30.00f);

System.out.println("Student 1 Info :");
s1.display();
System.out.println("Student 2 Info :");
s2.display();
System.out.println("Student 3 Info :");
s3.display();


}  
}

/**
 * Fan
 */
 class Student {

    String name;
    int roll;
    float percentage;

    void setValues(String n,int rl,float p){
        name=n;
        roll=rl;
        percentage=p;
    }
    void display(){
        System.out.print("name "+name);
        System.out.print(" , roll :"+roll);
        System.out.println(" ,percentage :"+percentage);
        System.out.println("------*********---------");
    }

}

/*Output 
------------------***************---------------------
Student 1 Info :
name rahul , roll :1 ,percentage :55.22
------*********---------
Student 2 Info :
name john , roll :3 ,percentage :66.33
------*********---------
Student 3 Info :
name HHH , roll :5 ,percentage :30.0
------*********---------
 * 
 */