public class Session10 {
    public static void main(String[] args) {

        // 3]
        // *
        // **
        // ***
        // ****
        // *****

        // for (int i=1;i<=5;i++){
        // //i=1
        // for(int j=1;j<=i;j++)//1<=2 column
        // System.out.print("*");
        // System.out.println();
        // }

        // 4]
        //
        // 1 11
        // 12 12
        // 123 13
        // 1234 14
        // 12345 15 condition ahej chya

        // trick -> Each Row value Change J
        // trick Ecah row value same same I

        // for(int i=1;i<=5;i++){
        // // i=1

        // for(int j=1;j<=i;j++)
        // // 1 <=1 ,1 2<=1 F ,1
        // System.out.print(j);
        // System.out.println();

        // }

        // 5

        // 1
        // 22
        // 333
        // 4444
        // 55555

        // trick -> Each Row value Change J
        // trick Ecah row value same same I

        // for(int i=1;i<=5;i++){
        // // i=1

        // for(int j=1;j<=i;j++)
        // // 1 <=1 ,1 2<=1 F ,1
        // System.out.print(i);
        // //row same aslya wr i change karaycha
        // System.out.println();

        // }

        // 6

        // 12345 15
        // 2345 25
        // 345 35
        // 45 45
        // 5

        // trick -> Each Row value Change J
        // trick Ecah row value same same I

        // for(int i=5;i>=1;i--)//5 4>1
        // {
        // // i=4

        // for(int j=1;j<=i;j++)
        // // 1 <=1 ,1 2<=1 F ,1
        // System.out.print(i);
        // //row same aslya wr i change karaycha
        // System.out.println();

        // }

        // 7

        // 54321 5>1
        // 4321 4>1
        // 321 3>1
        // 21 2>1
        // 1 1>=1

        // for(int i=5;i>=1;i--)
        // {
        // // i= 5 ,4 ,3 2 1

        // for(int j=i;j>=1;j--)
        // //5 4 3 2 1>=1 column
        // //4 >=1
        // System.out.print(j); //54321
        // // column change hoto mhanun j ghetla
        // //row same aslya wr i change karaycha
        // System.out.println();

        // }

        // 8

        // 54321 5>1
        // 5432 5>1
        // 543 5>1
        // 54 5>1
        // 1 5>=1

        // for(int i=1;i<=5;i++)
        // {
        // // i= 1 2 3 4 5

        // for(int j=5;j>=i;j--)//5>=1 t 4>=1 t 3>=1 2>=1t 1>=1t 0>=1F
        // //5 4 3 2 1>=1 column
        // //4 >=1
        // System.out.print(j); //54321
        // // column change hoto mhanun j ghetla
        // //row same aslya wr i change karaycha
        // System.out.println();

        // }

        // 9

        // 5 5<=5
        // 45 4<=5
        // 345 3<=5
        // 2345 2<=5
        // 12345 1<=5

        // for(int i=5;i>=1;i--) //5 4 3 1 1
        // {

        // // i=5
        // for(int j=i;j<=5;j++)//5<=5 t 4 5<=5 3 4 5<=5 2 3 4 5<=5 1 234 5<=5
        // //5 4 3 2 1>=1 column
        // //4 >=1
        // System.out.print(j); //5 45 345 2345 1245
        // // column change hoto mhanun j ghetla
        // //row same aslya wr i change karaycha
        // System.out.println();

        // }

        // 10 🔥
        // 1 1>=1
        // 21 2>=1
        // 321
        // 4321
        // 54321

        // for (int i = 1; i <= 5; i++) // 5 4 3 1 1
        // {

        // // i=5
        // for (int j = i; j >=1; j--)//
        // System.out.print(j);
        // System.out.println();

        // }

        // 11 🔥
        // 5 5>=
        // 54
        // 543
        // 54321
        // 54321

        // for (int i = 5; i >=1; i--) // 5 4 3 1 1
        // {

        // // i=5
        // for (int j = 5; j >=i; j--)//
        // System.out.print(j);
        // System.out.println();

        // }

        // 12 🔥
        // 1 11
        // 22 12
        // 333 13
        // 4444
        // 55555

        // for (int i = 1; i <= 5; i++) // 1 2 3 45
        // {

        // // i=1
        // for (int j = 1; j <= i; j++)//
        // System.out.print(i);
        // System.out.println();

        // }

        // for (int i = 1; i <= 5; i++) // 1 2345
        // {

        // // i=4
        // for (int j = i; j >= 1; j--)//
        // System.out.print(i);
        // System.out.println();

        // }

        // 13 🔥
        // 5 5<=5 55
        // 44 4<=5 54
        // 333 3<=5
        // 2222 2<=5
        // 11111 1<5

        // for (int i = 5; i >= 1; i--) // 1 2 3 45
        // {

        // // i=5
        // for (int j = i; j<= 5; j++)//
        // System.out.print(i);
        // System.out.println();

        // }

        // for (int i = 5; i >= 1; i--) // 1 2 3 45
        // {

        // // i=5
        // for (int j = 5; j>= i; j--)//
        // System.out.print(i);
        // System.out.println();

        // }

        // 14 🔥
        // 5 5<=5 55
        // 44 4<=5 54
        // 333 3<=5
        // 2222 2<=5
        // 11111 1<5

        // for (int i = 5; i >= 1; i--) // 1 2 3 45
        // {

        // // i=5
        // for (int j = i; j<= 5; j++)//
        // System.out.print(i);
        // System.out.println();

        // }

        // for (int i = 5; i >= 1; i--) // 1 2 3 45
        // {

        //     // i=5
        //     for (int j = i; j >= 1; j++)//
        //         System.out.print(i);
        //     System.out.println();

        // }


        // 15 🔥
    //    11111
    //    2222
    //    333
    //    44
    //    5

        // for (int i = 1; i <= 5; i++) // 1 2 3 45
        // {

        // // i=5
        // for (int j = i; j<= 5; j++)//
        // System.out.print(i);
        // System.out.println();

        // }

        for (int i = 1; i <= 5; i++) // 1 2 3 45
        {

        // i=5
        for (int j = 5; j>=i; j--)//
        System.out.print(i);
        System.out.println();

        }
    }
}