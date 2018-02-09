package HomeWork1;

/**
 * Написать программу решающую следующие уравнения.
 * Переменные x,y,z,n инициализируется перед решением уравнения.
 * Каждое решение оформить в отдельном статическом методе.
 x + (y - 100) * z / n          => считаем в long
 (x - (50 + y * z) * n) + x     => считаем в int
 x * (y / (z-1) + 555) - n     => считаем в float
 -x / y + z * (n+1)         => считаем в double
 */
public class HomeWork1 {

    public static long ur1() {
        long  x=10, y = 200, z = 2, n = 50;
        long k = x + (y - 100) * z / n;
        //если printf, то не нужно использовать конкатенацию
        //System.out.printf("1) x + (y-100) * z / n = %f %n", k);
        System.out.printf("1) x + (y-100) * z / n= " + k +"%n");
        return 0;
    }
    public static int ur2() {
        int x=100, y=-20, z=2, n=5;
        int k=(x-(50+y*z)*n)+x;
        //если printf, то не нужно использовать конкатенацию
        System.out.printf("2) (x - (50+y*z) *n) +x= "+k+"%n");
        return 0;
    }
       public static double ur3() {
        float x=10, y=27, z=2, n=6001;
        float k=x* (y / (z-1) +555) -n;
        //если printf, то не нужно использовать конкатенацию
        System.out.printf("3) x* (y / (z-1) +555) -n= "+k+"%n");
        return 0;
    }
       public static double ur4() {
        float x=100, y=27, z=2, n=5;
        float k=-x/y+z*(n+1);
        //если printf, то не нужно использовать конкатенацию
        System.out.printf("4) -x/y +z * (n+1)= "+k+"%n");
        return 0;
    }
    /*
    Составить программу, которая будет разлаживать 5-ти значное число на отдельные цифры данного числа,
    справа-налево. Число задается в параметре статического метода.
    Каждую цифру вывести в отдельной строке.
    45685
    5
    8
    6
    5
    4
    */
    public static int Task2() {
        int x=12345;
        int t5=x%10;
        int t4=(x/10)%10;
        int t3=x/100%10;
        int t2=x/1000%10;
        int t1=x/10000%10;
        //если printf, то не нужно использовать конкатенацию
        System.out.printf(t5+"%n"+t4+"%n"+t3+"%n"+t2+"%n"+t1);
        return 0;
    }
    /*
Напишите программу, которая для 3-х координат вектора x, y, и z,
с основанием у начала координат вычисляет длину этого вектора и выведите её на консоль.
Вывод программы у вас должен быть похож на этот:
Длина вектора (X, Y, Z) = 8.66025
Вместо X, Y, Z должны быть подставлены координаты.
Math.sqrt(a);
     */
    public static void Task3() {
        double X=3, Y=1, Z=-1;

    double sqrt=Math.sqrt((X*X)+(Y*Y)+(Z*Z));
    //если printf, то не нужно использовать конкатенацию
    System.out.printf("Длина вектора (X, Y, Z) = "+sqrt);

    }
    public static void main(String[] args) {
        System.out.printf("Task #1:%n");
        ur1();
        ur2();
        ur3();
        ur4();
        System.out.printf("%nTask #2:"+"%n");
        Task2();
        System.out.printf("%nTask #3:"+"%n");
        Task3();
    }


}
