public class Session11 {
    public static void main(String[] args) {
        // 16 🔥 pattern
        // 12345 15
        // 4321 41
        // 123 13
        // 21 21
        // 1 11

        // for (int i = 5; i >=1 ; i--) // 5 4 3
        // {
        // if (i%2==0)
        // { //0==0
        // for(int j=i;j>=1;j--)//4>=1
        // System.out.print(j);//4321
        // }
        // else{
        // for (int j = 1; j<= i; j++)//
        // System.out.print(j);
        // }
        // System.out.println();

        // }

        // 17 🔥 pattern
        // 1234567 17
        // 12345 15
        // 123 13
        // 1 11

        // for (int i = 7; i >=1 ; i-=2) // 7 5
        // {
        // for(int j=1;j<=i;j++)//1<=5 i=7 j=1, i=i-2 72=5
        // System.out.print(j);

        // System.out.println();
        // }

        // 18
        // 1
        // 01
        // 101
        // 0101
        // 10101

        // for (int i = 7; i >= 1; i -= 2) // 7 5
        // {
        // for (int j = 1; j <= i; j++)// 1<=5 i=7 j=1, i=i-2 72=5
        // System.out.print(j);

        // System.out.println();
        // }

        // 17 🔥 pattern
        // 1234567 17
        // 12345 15
        // 123 13
        // 1 11

        // for (int i = 7; i >=1 ; i-=2) // 7 5
        // {
        // for(int j=1;j<=i;j++)//1<=5 i=7 j=1, i=i-2 72=5
        // System.out.print(j);

        // System.out.println();
        // }

        // 18
        // 1
        // 01
        // 101
        // 0101
        // 10101
        // even sathi 0 pasun start odd asthi 1pasun start

        // for (int i = 1; i <= 5; i++) {
        // // i=5
        // if (i % 2 == 0) {

        // for (int j = 1; j <= i; j++)// 1<=4
        // {
        // if (j % 2 == 0) // 1@2 1==0 ,2%2 0==0

        // System.out.print("1");// 1

        // else
        // System.out.print("0");//0
        // }
        // }
        // else{

        // for (int j = 1; j <= i; j++)// 1<=4
        // {
        // if (j % 2 == 0) // 1@2 1==0 ,2%2 0==0

        // System.out.print("0");// 1

        // else
        // System.out.print("1");//0
        // }
        // }
        // System.out.println();
        // }

        // 19
        // 1
        // 01
        // 101
        // 0101
        // 10101
        // even sathi 0 pasun start odd asthi 1pasun start

        // for(int i=1;i<=5;i++){
        // for(int j=1;j<=i;j++){
        // System.err.print((i+j+1)%2);
        // }
        // System.out.println();
        // }

        // 20]
        // 13579
        // 3579
        // 579
        // 79
        // 9

        // for(int i=1;i<=9;i+=2){
        // for(int j=i;j<=9;j+=2)
        // System.out.print(j);
        // System.out.println();

        // }

        // 21] evn odd logic
        // 1 11
        // 2 4 24
        // 1 3 5 13
        // 2 4 6 8 28
        // 1 3 5 7 9 19

        // 24]

        // 5 5555
        // 45 555
        // 345 55
        // 2345 5
        // 12345

        // for (int i = 5; i >= 1; i--) {
        // // i=4
        // for (int j = i; j <= 5; j++)// 4<=5 column
        // System.out.print(j);// 45
        // for (int j = 1; j < i; j++)// 1<4column
        // System.out.print("5");

        // System.out.println();
        // }

        // 25]
        // 1
        // 23
        // 456
        // 78910
        // int k=1;
        // for (int i = 1; i <= 4; i++) {
        // //i=3
        // for(int j=1;j<=i;j++)//

        // System.out.print(k++);
        // System.out.println();
        // }

        // 26
        // 1
        // 10
        // 101
        // 1010
        // 10101


        //  for (int i = 1; i <= 5; i++) {
        // //i=3
        // for(int j=1;j<=i;j++)//

        // System.out.print(j%2);
        // System.out.println();
        // }


        // 27]
        // 1
        // 2   6
        // 3   7   10
        // 4   8   10  13
        // 5   9   12  14  15
    }
}
