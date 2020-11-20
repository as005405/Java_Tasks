import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.StrictMath.ceil;

public class task2 {

    public static void printArray(double[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    //task 1.1
    /*
        public static void  main(String... args) {
         //   В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

            int K=3;
            int[] a={12, 45, 9, 12, 16, 21,14, 99,103,3,6};
            int sum =0;
            int i;
            for(i=0; i<a.length; i++){
                if (a[i]%K==0){
                    sum +=a[i];
                }
            }
            System.out.println(sum);
        }*/
    //task 1.2
    /*
    public static void main(String... args){
        //. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
        //числом. Подсчитать количество замен.
        int[] a={12, 45, 9, 12, 16, 21,14, 99,103,3,6};
        int n= 3;
        int count =0;
        int i;

        for(i=0;i<a.length; i++){
            if (a[i]>n){
                a[i]=n;
                count++;
            }
        }
        System.out.println(count);
    }*/
    //task 1.3
    /*
    public static void main(String... args){
        // Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
        //положительных и нулевых элементов.

        int[] a={3, -5, 4, 8,0, -63, 14,-54};

        int p=0;
        int m=0;
        int z=0;
        int i;

        for(i=0;i<a.length;i++){
            if(a[i]>0){
                p++;
            }else if(a[i]<0){
                m++;
            }else{
                z++;
            }
        }
        System.out.println("positive: ");
        System.out.println(p);
        System.out.println("negative: ");
        System.out.println(m);
        System.out.println("zero: ");
        System.out.println(z);


    }*/
    //task 1.4
    /*
    public static void main(String... args){
        //Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.


        double[] a = {6,4};
        int minI= 0;
        int maxI = 0;
        double min;
        double max;

        min = a[0];
        max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                minI = i;
            } else if (a[i] > max) {
                max = a[i];
                maxI = i;
            }

        }


        double z = a[minI];
        a[minI] = a[maxI];
        a[maxI] = z;

       printArray(a);

        System.out.println();
    }*/
    //task 1.5
    /*
    public static void main(String... arg){
        //Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i

        int[] a={1,5,8,14,32,6,12,98,46};
        int i;
        for(i=0;i<a.length;i++){
            if(a[i]>i){
                System.out.println(a[i]);
            }
        }
    }*/
    //task 1.6
    /*
    public static void main(String... arg){
        //Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
        //являются простыми числами.

        int a[]={2,3,4,5,6,8,9,10,13,23,24,28,29,40,41,65,79};
        int sum=0;
        int i;

        for(i=0;i<a.length;i++){
            if (a[i]%2==0 || a[i]%3==0 || a[i]%5==0) {


            }else{
                sum=sum+a[i];
            }
        }
        System.out.println(sum);

    }*/
    //task 1.7
    /*
    public static void main(String... arg) {

        int[] a = {1,5,4,87,8,12,62,25,46,57};
        int i;
        int max =a[0]+a[a.length-1];
        for(i=1;i<a.length/2;i++){
            if((a[i] + a[a.length - i - 1]) > max){
                max=a[i]+a[a.length-i-1];
                System.out.println(max);
            }

        }


    }*/
    //task 1.8
    //-----------------
    /*
    public static void main(String... arg){
        // Дана последовательность целых чисел. Образовать новую последовательность, выбросив из исходной те члены, которые равны

    }*/
    //task 1.9
    /*
    public static void main(String... arg){
        // В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
        //чисел несколько, то определить наименьшее из них.

        int conc=0;
        int[] a={1,1,3,1,5,3};
        int i;
        int[] zx=new int[a.length];

        for(i=0;i<a.length;i++){
            int z=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    z++;
                }
            }
            zx[i]=z;
            if (zx[i]==zx[conc])
                conc=a[conc]>a[i]?i:conc;
            else
                conc=z>zx[conc]?i:conc;
        }
        System.out.println(a[conc]);
    }*/
    //task 1.10
    /*
    public static void main (String... arg){
     //Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
    //элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать
        int[] a={1,2,3,4,5,6,7,8,9,15};
        //1 0 3 0 5 0 7 0 8 0 15 0

        for(int i=0;i<a.length;++i){

          if(a[i]%2==0 || a[i]%15==0 ){
              a[i]=0;
          }
            System.out.println(a[i]);
        }
    }*/

    //task 2.1
    /*
    public static void main(String... arg){
        //1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
        int[][] matrixA;
        Scanner scanner = new Scanner(System.in);
        System.out.println("кол-во столбиков: ");
        int m = scanner.nextInt();
        System.out.println("кол-во строк: ");
        int n = scanner.nextInt();
        matrixA = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println((i + 1) + "-я строка: ");
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("Столбцы: ");
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j += 2) {
                if (matrixA[0][j] > matrixA[m - 1][j]) {
                    System.out.print(matrixA[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }*/

    //task 2.2
    /*
    public static void main(String... arg){
        // Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

        int[][] a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("кол-во столбиков и строк: ");
        int m = scanner.nextInt();
        int n=scanner.nextInt();
        if(n!=m){
            System.out.println("invalid");
        }

        a = new int[m][n];

        for (int i = 0; i < m; i++) {
            System.out.println((i + 1) + "-я строка: ");
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++){
                if(i==j){
                    System.out.print(a[i][j]+" ");
                }
            }
        }
    }*/

    //task 2.3
    /*
    public static void main(String... arg){
        // Дана матрица. Вывести k-ю строку и p-й столбец матрицы

        int[][] a={{1, 2, 3, 4, 5, 8},
                   {2, 4, 5, 8, 8, 5}};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите k-ю строку: ");
        int k = scanner.nextInt();
        System.out.println("Введите p-й столбец: ");
        int p = scanner.nextInt();

        //строка
        System.out.println(Arrays.toString(a[k]));

        //столбик
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i][p]+" ");
        }

    }*/

    //task 2.4
    /*
    public static void main(String... arg){

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] a= new int [N][N];

        for(int i=0;i<N;i++){
            if(i%2==0){
                for (int j = 0; j < N; j++) {
                    a[i][j] = j+1;
                }
            }else{
                for (int j = 0, k = N; j < N; j++,k--) {
                    a[i][j] = k;
                }
            }
        }
        System.out.print(Arrays.deepToString(a));

    }*/

    //task 2.5
    /*
    public static void main(String... arg){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N%2!=0){
            System.out.println("invalid");
        }else{
           int[][] a=new int[N][N];
           for(int i=0;i<N;i++){
               for(int j=0;j<N-i;j++){
                   a[i][j]=i+1;

               }
           }
            System.out.print(Arrays.deepToString(a));
        }


    }*/

    //task 2.6
    /*
    public static void main(String... arg){
        Scanner scanner= new Scanner(System.in);
        int N= scanner.nextInt();
        if(N%2!=0){
            System.out.println("invalid");
        }else{

            int[][] a=new int[N][N];
            for (int i = 0,k = N-1; i < N/2; i++,k--) {
                for (int j = i; j <N-i; j++) {
                    a[i][j] = 1;
                    a[k][j] = 1;
                }
            }
            System.out.print(Arrays.deepToString(a));
        }
    }*/

    //task 2.7
    /*
    public static void main(String... arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N: ");
        int N=scanner.nextInt();
        int calc=0;

        double[][] a = new double[N][N];
        for(int i=0; i<N;i++){
            for(int j=0;j<N;j++){
                double Arr=  Math.sin((Math.pow(i,2)-Math.pow(j,2))/N);
                a[i][j]=Arr;

                if(Arr>0){
                    calc++;
                }
            }

        }
        System.out.println(calc);
        System.out.print(Arrays.deepToString(a));

    }*/

    //task 2.8
    /*
    public static void main(String... arg){
        // В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
        //на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
        //пользователь с клавиатуры.

        Scanner scanner=new Scanner(System.in);

        int[][] a = {{1,2,8,5,6},
                     {5,4,7,8,12},
                     {1,4,8,5,6}};

        System.out.println("Введите столбики: ");
        int n=scanner.nextInt();
        int m=scanner.nextInt();


        for(int i=0; i<a.length; i++){

            int calc=a[i][n];
            a[i][n]=a[i][m];
            a[i][m]=calc;
        }

        System.out.print(Arrays.deepToString(a));

    }
*/

    //task 2.9
    /*
    public static void main(String... arg){
        //Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
        //столбец содержит максимальную сумму.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите кол-во столбиков: ");
        int n=scanner.nextInt();
        System.out.println("Введите кол-во строк: ");
        int m=scanner.nextInt();


        int a[][]=new int[n][m];
        int sum[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = scanner.nextInt();
                if(a[i][j]<0){
                    System.out.println("invalid");
                }
            }
        }

        for(int e=0;e<a[0].length;e++)
        {
            for(int g=0;g<a.length;g++){
                sum[e]+=a[g][e];
            }
        }
        for (int u = 0; u < sum.length; u++) {
            System.out.println(sum[u]);
        }

        int max=0;
        for(int t=0;t<sum.length;t++){
            if (sum[t]>max){
                max = sum[t];
            }
        }
        System.out.println("Максимальное значение: ");
        System.out.println(max);

    }*/

    //task 2.10
    /*
    public static void main(String... arg){
        // Найти положительные элементы главной диагонали квадратной матрицы

        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите кол-во столбиков и строк: ");
        int n=scanner.nextInt();

        int a[][]= new int[n][n];

        System.out.println("Введите значения матрицы: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = scanner.nextInt();
            }
        }

        for(int e=0;e<a.length;e++){
            for(int g=0;g<a.length;g++){
                if(e==g && a[e][g]>0){
                    System.out.println(a[e][g]);
                }
            }
        }


    }*/

    //task 2.11
    /*
    public static void main(String... arg){
        // Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
        //которых число 5 встречается три и более раз.
        int a[][]=new int[10][20];
        int s=0;
        int c=15;
        int rand=0;
        int k=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<20;j++){
                rand=s+(int) (Math.random()*c);
                a[i][j]=rand;
                if(rand==5){
                    k++;
                }
            }
            if(k>=3){
                System.out.println("Row "+i);
                System.out.println(Arrays.toString(a[i]));
            }
            k=0;
        }

        System.out.print(Arrays.deepToString(a));
    }*/

    //task 2.12
    /*
    public static void main(String... arg){
        // Отсортировать строки матрицы по возрастанию и убыванию значений элементов

        Scanner scanner=new Scanner(System.in);
        System.out.println("Кол-во строк: ");
        int n=scanner.nextInt();
        System.out.println("Кол-во столбиков: ");
        int m=scanner.nextInt();

        int a[][]=new int[n][m];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Не отсортированный массив: ");
        System.out.println(Arrays.deepToString(a));

        for(int g=0;g<a.length; g++){
            Arrays.sort(a[g]);
        }
        System.out.println(Arrays.deepToString(a));

        int tmp;
        for (int e = 0; e < a.length; e++) {
            for (int h = 0; h < ceil(a[e].length/2.0); h++) {
                tmp = a[e][a[e].length-h-1];
                a[e][a[e].length-h-1] = a[e][h];
                a[e][h] = tmp;
            }
        }
        System.out.println(Arrays.deepToString(a));

    }*/

    //task 2.13
//------------------------
    /*
    public static void main(String... arg){
        //Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов

        Scanner scanner=new Scanner(System.in);
        System.out.println("Кол-во строк: ");
        int n=scanner.nextInt();
        System.out.println("Кол-во столбиков: ");
        int m=scanner.nextInt();

        int a[][]=new int[n][m];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Не отсортированный массив: ");
        System.out.println(Arrays.deepToString(a));

        for(int g=0;g<a.length; g++){
            for (int e = 0; e < a.length-1; e++) {
                for (int h = 0; h < a.length - e -1; h++) {
                    if (a[h][e]>a[h+1][e]){
                        int tmp = a[h+1][e];
                        a[h+1][e] = a[h][e];
                        a[h][e] = tmp;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(a));

    }*/


    //task 2.14
    /*
    public static void main(String... arg){
        //Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
        //единиц равно номеру столбца.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите кол-во строк: ");
        int n=scanner.nextInt();
        System.out.println("столбиков: ");
        int m = scanner.nextInt();


        int a[][]= new int[n][m];



       int[] number = new int[m];
       for(int i =0; i<number.length;i++){
           number[i]=i;
       }

       for(int i =0; i<n;i++){
           for(int j=0; j<m;j++){
               if(number[j]>0){
                   a[i][j]=1;
                   number[j]--;

               }
           }
       }
        System.out.println(Arrays.deepToString(a));

    }*/

    //task 2.15
    /*
    public static void main(String... arg){
      //  Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите кол-во строк: ");
        int n=scanner.nextInt();
        System.out.println("Введите кол-во столбиков: ");
        int m=scanner.nextInt();

        int a[][]= new int[n][m];

        System.out.println("Введите значения матрицы: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.print(Arrays.deepToString(a));
        System.out.println();
        System.out.print("max value: ");

        int max =Integer.MIN_VALUE;
        for(int e=0; e<a.length; e++){
            for(int g=0; g<a[e].length;g++){
                if(a[e][g]>max){
                    max=a[e][g];
                }
            }
        }
        System.out.println(max);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j%2==1){
                    a[i][j]=max;
                }
            }
        }

        System.out.print(Arrays.deepToString(a));
    }*/

    //task 2.16
    /*
    public static void main(String... arg){
        //Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
        //так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
        //собой. Построить такой квадрат. Пример магического квадрата порядка 3:

        Scanner scanner= new Scanner(System.in);

        int n=scanner.nextInt();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int row = (((n + 1) / 2 + i + j) % n);
                int col = (((n + 1) / 2 + i + n - j - 1) % n) + 1;
                System.out.print(((row * n) + col) + "\t");
            }
            System.out.println();
        }

    }*/


}