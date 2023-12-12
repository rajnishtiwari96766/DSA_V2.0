//using bitwise operators...
//package com.company;
//
//public class bitwise_operator {
//    public static void main(String[] args) {
//        int a=4,b=6;
//        System.out.println(a&b); //convert to binary then and operation
//        System.out.println(a|b); //convert to binary then or operation
//        System.out.println(~a);  //convert to binary then 2's compliment
//        System.out.println(a^b); //exclusive or
//    }
//}

//------------------------------------------------------//
//package com.company;
//public class bitwise_operator {
//    public static void main(String[] args) {
//        int a=1;
//
//        int b=a++;
//        int c=++a;
//        System.out.println(b);
//        System.out.println(c);
//    }
//}

//------------------------------------------------------//
//package com.company;
//
//import java.util.Scanner;
//
//public class bitwise_operator {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the value of n:");
//        int n= sc.nextInt();
//
//        int sum=0;
//        for (int i=0;i<=n;i++){
//            sum+=i;
//        }
//        System.out.println(sum);
//    }
//}

//-----------------------------------------------------------//
//package com.company;
//
//import java.util.Scanner;
//
//public class bitwise_operator {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter n:");
//        int n= sc.nextInt();
//
//        int a=0,b=1;
//        System.out.println(a);
//        System.out.println(b);
//        for (int i=1;i<=n;i++){
//            int c=i-a+i-b;
//            System.out.println(c);
//            a=b;
//            b=c;
//        }
//    }
//}

//-----------------------------------------------------------------------//
//check for the prime number using for loop...
//package com.company;
//
//import java.util.Scanner;
//
//public class bitwise_operator {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        for (int i=2;i<=n-1;i++){
//            if (n%i==0){
//                System.out.println("number isn't prime");
//                break;
//            }
//            else{
//                System.out.println("number is prime");
//                break;
//            }
//        }
//    }
//}

//-----------------------------------------------------------------------//
//continue example...
