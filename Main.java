import java.util.Scanner;
import java.lang.Math;

public class Main {

      //1.1 task
    /*  public static void main(String... args) {

            Scanner in =new Scanner(System.in);
            System.out.println("Input a number: ");
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();

            float z=((a-3)*(b/2))+c;

            System.out.printf("z=((a-3)/(b/2)+c)= %f", z);
            in.close();
        }*/

      //1.2 task
    /* public static void main(String... args){

        int a = 45;
        int b= 12;
        int c=4;

        double z=((b+(Math.sqrt(Math.pow(b,2))+4*a*c))/2*a)-Math.pow(a,3)*c+Math.pow(b,(-2));
        System.out.println(z);
    }*/

   //1.3 task
    /* public static void main(String... args){
       int a=90;
       int y=45;

       double z=((Math.sin(a)+Math.cos(y))/(Math.cos(a)-Math.sin(y)))*Math.tan(a*y);
       System.out.println(z);
   }*/

  //1.4 task
    /*
  public static void main(String... args){

      double x = 137.642;
      double y = (x * 1000) % 1000 + (int)x / 1000.0;
      System.out.println(y);
  }
*/

  //1.5 task
    /*
  public static void main(String... args){

      Scanner in =new Scanner(System.in);
      System.out.println("Input a number: ");
      int T = in.nextInt();

      int hours = (T / 3600);

      int t = T - (hours * 3600);
      int minutes = t / 60;

      int seconds = t - (minutes * 60);

      System.out.println("first variable: " + T);
      System.out.println(hours + " h " + minutes + " m " + seconds + " s ");
  }

     */

    //1.6 task
    /*
    public static void main(String... args){

        Scanner in =new Scanner(System.in);
        System.out.println("Input a number: ");

        int x = in.nextInt();
        int y = in.nextInt();

        if (y + Math.abs(x) <= 4 && y >= 0)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


        if ((y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y >= -3 && y <= 0 && x >= -4 && x <= 4))
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


        if (((x * x + y * y <= 16) && y >= 0 && x >= 0) || ((x * x + y * y <= 25) && y <= 0 && x >= 0))
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


    }*/

//task 2.1
    /*
    public static void main(String... args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");

        int x = in.nextInt();
        int y = in.nextInt();

        if((x+y)<180){

            System.out.println("triangle");

            if( x==90 || y==90 || 180-(x+y)==90){
                System.out.println("right triangle");
            }
            else{
                System.out.println("it's not right triangle");

            }

        }
        else{

            System.out.println("it's not triangle");

        }


    }*/

//task 2.2
    /*
    public static void main(String... args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");


        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int min_1=a<b?a:b;
        System.out.println("minimal value in the first step: ");
        System.out.println(min_1);

        int min_2=c<d?c:d;
        System.out.println("minimal value in the next step: ");
        System.out.println(min_2);

        int max=min_1>min_2?min_1:min_2;
        System.out.println("maximal value in this step: ");
        System.out.println(max);
    }
*/

    //task 2.3
    /*
    public static void main(String... args){

        Scanner in = new Scanner(System.in);

        System.out.println("Input x1 and y1: ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("Input x2 and y2: ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        System.out.println("Input x3 and y3: ");
        int x3 = in.nextInt();
        int y3 = in.nextInt();


        if(x1==x2){
            if(x2==x3){
                System.out.println("x1,x2,x3 on the same plane");
                if(y1==y2){
                    if(y2==y3){
                        System.out.println("y1,y2,y3 on the same plane");
                    }else{
                        System.out.println("y1,y2,y3 not on the same plane");
                    }
                }
                else{
                    System.out.println("y1,y2 not on the same plane");
                }
            }else{
                System.out.println("x1,x2,x3 not on the same plane");
            }
        }else{
            System.out.println("x1,x2 not on the same plane");
        }
    }
*/

//task 2.4
    /*
    public static void main(String... args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input A: ");
        int A = in.nextInt();
        System.out.println("Input B: ");
        int B = in.nextInt();
        System.out.println("Input x and y and z: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        if(x<=A){
            System.out.println("x consist A");
            if(y<=B){
                System.out.println("y consist B");
                System.out.println("correct");
            }else if(z<=B){
                System.out.println("z consist A");
                System.out.println("correct");
            }else{
                System.out.println("it's not a brick");
            }
        }else if(x<=B){
            System.out.println("x consist B");
            if(y<=A){
                System.out.println("y consist A");
                System.out.println("correct");
            }else if(z<=A){
                System.out.println("z consist A");
                System.out.println("correct");
            }else{
                System.out.println("it's not a brick");
            }
        }else if(y<=A){
            System.out.println("y consist A");
            if(z<=B){
                System.out.println("y consist A");
                System.out.println("correct");
            }
            else{
                System.out.println("it's not a brick");
            }
        }
        else if(z<=A){
            System.out.println("z consist A");
            if(y<=B){
                System.out.println("y consist B");
                System.out.println("correct");
            }
            else{
                System.out.println("it's not a brick");
            }
        }else{
            System.out.println("replay please");
        }

    }*/

    //task 2.5
    /*
    public static void main(String... args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input x: ");
        float x = in.nextInt();
        if(x<=3){

           float Fx=x*x-3*x+9;
            System.out.println(Fx);
        }
        else{
           float Fx= 1/(x*x*x+6);
            System.out.println(Fx);
        }

    }*/

//task 3.1
    /*
    public static void main(String... args){
        Scanner in= new Scanner(System.in);

        System.out.println("Input x: ");
        int x =in.nextInt();
        int sum=0;

        for(int y=1;y<=x;y++){
            sum=sum+y;
        }
        System.out.println(sum);

    }*/

//task 3.2
    /*
    public static void main(String... args){
        Scanner in= new Scanner(System.in);

        System.out.print("Input a: ");
            int a = in.nextInt();
        System.out.print("Input b: ");
            int b = in.nextInt();
        System.out.print("Input c: ");
            int c = in.nextInt();
            int y;

                for (int i = a; i <= b; i += c) {
                if (i > 2) {
                    y = i;
                    System.out.println( y);
                } else {
                    y = i * (-1);
                    System.out.println( y);
                }
              //  System.out.println( i );
               // System.out.println( y);
            }
                System.out.println();
    }*/

    //task 3.3
    /*
    public static void main(String... args){

        int sum = 0;
        int i;
        for(i=0;i<=100;i++){
            sum+=Math.pow(i,2);
        }
        System.out.println(sum);

    }
    */


//task 3.4
    /*
    public static void main(String... args){

        double pr=1;
        double i;
        double c=1;

        for(i=0; i<=200;i++){
            pr*=c*c;
            c=c+1;
        }
        System.out.println(pr);
    }

*/

    //task 3.5
    /*
     public static void main(String... args){

         double sum=0.0;
         double e=2.0;
         double a=0.0;
         double n=15.0;
         int i;

         for(i=0;i<=n;i++){
             a=(1/Math.pow(2,i))+(1/Math.pow(3,i));
             if(Math.abs(a)>=e){
                 sum+=a;
             }
         }
         System.out.println(sum);

     }*/
    //task 3.6
    /*
    public static void main(String... args){
        int i;
        for(i=52;i<=100; i++){
            System.out.println(i+"  "+(char) i);
        }
        System.out.println();
    }

*/


//task 3.7
    /*
    public static void main(String... args){
        Scanner in=new Scanner(System.in);

        System.out.println("Input m: ");
        int m=in.nextInt();
        System.out.println("Input n: ");
        int n=in.nextInt();

        int a=in.nextInt();
        int b=in.nextInt();

        int i;

        while(m<=n){
            a=0;
            for(i=1;i<=m;i++){
                if(m%i==0){
                    a+=1;
                }
             if(a>=b){
                 System.out.print(m);
                 System.out.print(": ");
                 System.out.println(a);
                // System.out.println("  ");
                 for(i=1;i<=m;i++){
                     if(m%i==0);{
                       // System.out.println(" ");
                         System.out.println(i);
                     }
                 }
             }
            }
            m+=1;
        }
    }
*/

    //task 3.8
    /*
    public static void main(String... args){

        Scanner in = new Scanner(System.in);

        System.out.println("Input а: ");
        int a = in.nextInt();
        System.out.println("Input b: ");
        int b = in.nextInt();

        int[] arr = new int[10];
        while(a != 0){
            arr[a % 10]++;
            a /=10;
        }
        while(b != 0){
            if(arr[b % 10] != 0)
                System.out.println(b % 10);
            b /=10;
        }
    }
*/
}
