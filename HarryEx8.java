import java.util.Scanner;

// Question 1. Write a Java method to print the multiplication table of a number n.
public class HarryEx8 {
    
    static void multiplication(int n)
    {

        for(int i =0; i<=10; i++)
        {
            System.out.format("%d X %d = %d\n", n, i, n*i);
        }
        

    }
    
    
    // public static void main(String[] args)
    // {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Multiplication of table of a number n : ");
    //     int n = sc.nextInt();

    //     multiplication(n);



    // }
// Question 2. Write a program using functions to print the following pattern:
//       *

//      **

//     ***

//    ****    
static void star(int n)
{
    for(int i=0; i<n; i++)
    {
        for(int j = 0; j<i+1; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}


// public static void main(String[] args) {
//     star(4);
    
// }
// Question 8. Repeat problem 2 using Recursion.

static int rec1(int n)
{
    if(n == 0)
    return 0;
    else{
        
        for(int i=0; i<n; i++)
        {
            for(int j = 0; j<i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    return 0;
    }

}

// public static void main(String[] args) {
//     rec1(10);
// }






// Question 4. Write a function to print the following pattern:
//     ****

//     ***

//     **

//     *


static void pattern(int n)
{
    for(int i=n; i>0; i--)
    {
        for(int j = 0; j<i; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}


// Question 7. Repeat problem 4 using Recursion.

static int rec(int n)
{
    if(n == 0)
    return 0;
    else{
        
    for(int i=n; i>0; i--)
    {
        for(int j = 0; j<i; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    return 0;
    }

}

// public static void main(String[] args) {
//     rec(10);
// }


// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Hey tell how many stars do you need? ");
//     int x = sc.nextInt();
    

    
//     pattern(x);
    
// }

// Question 3. Write a recursive function to calculate the sum of first n natural numbers.

static int sum(int s){

    if(s == 1)
    {
        return 1;
    }
        
        return s + sum(s-1);
    
    }


// public static void main(String[] args) {
//     int x = sum(10);
//     System.out.print(x);
    
// }

// Question 10. Repeat problem 3 using an iterative approach.

static int iterative(int s){

    if(s == 0)
    {
        return 0;
    }
    else
    {
        for(int i =0; i<s; i++)
        {
            int add;
            add = sum() + sum(s);
            System.out.print(add);
        }
        return 0;
    }
    

    }

    // public static void main(String[] args)
    // {
    //     iterative(10);
    // }


    // Question 9. Write a function to convert Celsius temperature into Fahrenheit.


    static double faharneit(double c){
        return (c*9/5)+32;
    }
    public static void main(String[] args) {
        double a,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celcius");
        c=sc.nextDouble();
        System.out.println("Faharneit temperature is: "+faharneit(c));
    }


// Question 5. Write a function to print the nth term of the Fibonacci series using recursion.

static int fib(int n)
{
//     if(n==1)
//     {
//         return 0;
//     }
//     else if(n==2)
//     {
//         return 1;
//     }
if(n==1 || n==2)
{
    return n-1;
}
    else{
        return fib(n-1)+fib(n-2);
    }
}
// public static void main(String[] args)
// {
    
// int result = fib(10);
// System.out.print(result);

// }

// Question 6. Write a function to find the average of a set of numbers passed as arguments.


    static int Avg(int ...arr){
    float result=0;
    
    for(float a: arr){
    result += a;
    }
    float R = result/arr.length;
    System.out.println("The result of the average is " +R);
    return 0;
    }
    
    // public static void main(String[] args){
       
    // Avg(25,55,17,87,100);
    // }

}
