public class Session5 {
    public static void main(String[] args) {

        // int i=10;
        // System.out.println(i++);//10
        // System.out.println(i);//11
        // System.out.println(i);//11

        // int i=10;
        // System.out.println(++i);//10
        // System.out.println(i);//11
        // System.out.println(i);//11

        // int i=1;
        // while (i<=10) {
        // System.out.println(i);
        // i=i+1;// i11

        // }
        // System.out.println("Remaning :"+i);

        // int i=1;
        // while (i<=10)
        // System.out.println(i);
        // i=i+1;// i11

        // System.out.println("Remaning :"+i);

        // int i=1;
        // while (true) {
        // System.out.println(i);
        // i=i+1;// i11
        // }
        // // System.out.println("Remaning :"+i);

        // int i=1;
        // while (i<=10) {
        // System.out.println(i);
        // i++;// i11

        // }
        // System.out.println("Remaning :"+i);

        // int i=1;
        // while (i<=10) {
        // System.out.println(i);
        // ++i;// i11

        // }
        // System.out.println("Remaning :"+i);

        // int i=1;
        // while (i<=10) {
        // System.out.println(i);
        // i+=1;// i11

        // }
        // System.out.println("Remaning :"+i);

        // int i=1;
        // while (i<=10)
        // System.out.println(i++);//1,2,...9,10

        // System.out.println("Remaning :" +i);//11

        // int i=0;
        // while (i<10)
        // System.out.println(++i);//1,2,...9,10

        // System.out.println("Remaning :"+i);//11

        // int i=0;
        // while (i++<=10)
        // System.out.println(i);//2..9 10 11

        // System.out.println("Remaning :"+i);//12

        // int i=0;
        // while (i++<10)
        // System.out.println(i);//2..9 10 11

        // System.out.println("Remaning :"+i);//12

        // int i=0;
        // while (++i<=10)
        // System.out.println(i);//1 2 .10

        // System.out.println("Remaning :"+i);//11
        // 🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥
        // ❤️ For Loop
        // for(int i=1;i<=10;i++)
        // System.out.println(i);//1...10

        // System.out.println("R:"+i); //Error
        // int i;
        // for( i=1;i<=10;i++)
        // System.out.println(i);//1...10

        // System.out.println("R:"+i); //Error

        // int i;
        // i=1;
        // for( ;i<=10;i++)
        // System.out.println(i);//1...10

        // System.out.println("R:"+i); //Error

        // int i;
        // i=1;
        // for( ;i<=10;)
        // System.out.println(i++);//1...10

        // System.out.println("R:"+i); //Error

        // int i;
        // i=1;
        // for( ;;)
        // System.out.println(i++);//1...10

        // System.out.println("R:"+zi); //Error

        // int i;
        // i = 1;
        // for (i=1; i <= 10;)
        // {
        // System.out.println(i);// 1...10
        // i++;
        // }
        // System.out.println("R:" + i); //

        // int i;
        // i = 1;
        // for (i=1; i <= 10;++i)

        // System.out.println(i);// 1...10

        // System.out.println("R:" + i); //

        // int i;
        // i = 1;
        // for (i=1; i <= 10;i+=1)

        // System.out.println(i);// 1...10

        // System.out.println("R:" + i); //

        // int i;
        // i = 1;
        // for (i=1; i <= 10;i=i+1)

        // System.out.println(i);// 1...10

        // System.out.println("R:" + i); //

        // int i;

        // for (i = 0; i++ < 10;)

        // System.out.println(i);// 1...10

        // System.out.println("R:" + i); //

        // int i;

        // for (i = 0; ++i<=10;)

        // System.out.println(i);// 1...10

        // System.out.println("R:" + i); //

        // 🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥
        // ✅❤️ Do while

        // int i=0;
        // do
        // System.out.println(i++);
        // while (i>=10) ;
        // System.out.println("R "+i);//1

        // int i = 0;
        // do {
        // System.out.println(i);
        // i++;

        // } while (i >= 10);
        // System.out.println("R " + i);// 1

        // 🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥
        // ✅❤️ For Each Loop

        // int arr[] = { 10, 20, 30, 40, 50 };

        // for(int i=0;i<5;i++){ //tradiation way
        // System.out.println(arr[i]);
        // }

        // for(int value:arr){
        // System.err.println(value);
        // }

        // // 🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥
        // ✅❤️ Pattern


//        for(int i=1;i<=3;i++){

//            for(int j=1;j<=4;j++)
//                System.out.print(i+""+j+"\t");
//                System.out.println();

//        }
//    }
// }

////          1]
//           11   12  13  14
//           21   12  13  14
//           31    32   33  34

for(int i=1;i<=3;i++)//1 2 <=3 rows
{ //i=1 , 2 ,3 
    for(int j=1;j<=4;j++){
        System.out.print(i+""+j+"\t"); //1 2 3 4 5<=4 column

        //11 12 13 14
        //21 22 23 24
        //31 32 33 34}
    }
        System.out.println();
    }


    }}


