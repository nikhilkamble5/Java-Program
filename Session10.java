public class Session10 {
    public static void main(String[] args) {

//        3]
//        *
//        **
//        ***
//        ****
//        *****

        // for (int i=1;i<=5;i++){
        //     //i=1
        //     for(int j=1;j<=i;j++)//1<=2 column
        //         System.out.print("*");
        //     System.out.println();
        // }


 //        4]
//        
//        1         11
//        12        12
//        123       13
//        1234      14
//        12345     15 condition ahej chya

// trick -> Each Row value Change J
//trick Ecah row value same same I

// for(int i=1;i<=5;i++){
//     // i=1

//     for(int j=1;j<=i;j++)
//         // 1 <=1 ,1 2<=1 F ,1 
//         System.out.print(j); 
//         System.out.println();
    
// }


//5

// 1
// 22
// 333
// 4444
// 55555

// trick -> Each Row value Change J
//trick Ecah row value same same I

// for(int i=1;i<=5;i++){
//     // i=1

//     for(int j=1;j<=i;j++)
//         // 1 <=1 ,1 2<=1 F ,1 
//         System.out.print(i); 
//         //row same aslya wr i change karaycha
//         System.out.println();
    
// }


//6

// 12345 15
// 2345  25
// 345   35
// 45    45
// 5

// trick -> Each Row value Change J
//trick Ecah row value same same I

// for(int i=5;i>=1;i--)//5 4>1
// {
//     // i=4

//     for(int j=1;j<=i;j++)
//         // 1 <=1 ,1 2<=1 F ,1 
//         System.out.print(i); 
//         //row same aslya wr i change karaycha
//         System.out.println();
    
// }



//7

// 54321 5>1
// 4321  4>1
// 321   3>1
// 21    2>1
// 1     1>=1



// for(int i=5;i>=1;i--)
// {
//     // i=  5 ,4 ,3 2 1

//     for(int j=i;j>=1;j--)
//     //5 4 3 2 1>=1 column
//     //4 >=1
//         System.out.print(j); //54321 
//         // column change hoto  mhanun j ghetla
//         //row same aslya wr i change karaycha
//         System.out.println();
    
// }

//7

// 54321 5>1
// 5432  5>1
// 543   5>1
// 54    5>1
// 1     5>=1



for(int i=1;i<=5;i++)
{
    // i=  1 2 3 4 5

    for(int j=5;j>=i;j--)//5>=1 t 4>=1 t 3>=1 2>=1t 1>=1t 0>=1F
    //5 4 3 2 1>=1 column
    //4 >=1
        System.out.print(j); //54321 
        // column change hoto  mhanun j ghetla
        //row same aslya wr i change karaycha
        System.out.println();
    

    }
}
