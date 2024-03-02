
class Circle{
    int radius;
    double area;

    void setValues(int r){
        radius =r;
    }

    void calculateArea(){
        area=Math.PI *radius*radius;
    }

    void displayInfo(){

        System.out.println("________________________________________");
        System.out.print("Radius :"+ radius);
        // System.out.println(" ,Area :"+area);
        System.out.printf(" ,Area : %.2f",+area);

        System.out.println("________________________________________");

    }
}


class Rectangle{
    int lenth ,breadth,area;

    void setValues(int l,int b){
       lenth =l;
       breadth=b;
    }

    void calculateArea(){
        area=lenth*breadth;
    }

    void displayInfo(){

        System.out.println("________________________________________");
        System.out.print("Lenth :"+ lenth);
        System.out.print(" ,Breadth :"+ breadth);
            System.out.println(" ,Area :"+ area);

        System.out.println("________________________________________");

    }
}
public class Session20 {
    public static void main(String[] args) {
        Circle c1= new Circle();
        //c1 1002 instance variable banto  radius area
        c1.setValues(3);
        c1.calculateArea();
        c1.displayInfo();

        Rectangle r1 = new Rectangle();
        //r1 Lenth :10 ,Breadth :20 ,Area :200
r1.setValues(10, 20);
r1.calculateArea();
r1.displayInfo();
    }
}

//2 ajva naming convention
//Fl ==>A-z a-z _$      f letter
//Sl=>A -z a-z _$ 0- 9 secod letter
/*
 * Standerd Rule convertion
 * variable  collegName
 * Function setValues
 * Interface CollegeName
 * Constant PI
 * package com
*/