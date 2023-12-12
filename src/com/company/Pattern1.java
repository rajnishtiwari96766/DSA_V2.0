////printing patterns
//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("enter the rows and columns:");
//        int n= sc.nextInt();
//
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while (j<=n){
//                System.out.print(i+" ");
//                j++;
//            }
//            System.out.print("\n");
//            i++;
//        }
//    }
//}

//-------------------------------------------------------------------------------

//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern2 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("enter the rows and columns:");
//        int n=sc.nextInt();
//
//        int i=1,a=1;
//        while (i<=n){
//            int j=1;
//            while (j<=n){
//                System.out.print(n-j+1+" ");
//                a++;
//                j++;
//            }
//            System.out.println("\n");
//            i++;
//        }
//    }
//}


//------------------------------------------------------------------------

//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//        int n=sc.nextInt();
//
//        int a=1;
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=n){
//                System.out.print(a+" ");
//                a++;
//                j++;
//            }
//            System.out.print("\n");
//            i++;
//        }
//    }
//}

//-------------------------------------------------------------------------

//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number of rows and columns:");
//        int n= sc.nextInt();
//
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while (j<=i){
//                System.out.print("* ");
//                j++;
//            }
//            System.out.println("");
//            i++;
//        }
//    }
//}

//--------------------------------------------------------------------//

//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number of rows and columns:");
//        int n= sc.nextInt();
//
//        int i=1;
//        while (i<=n){
//            int j=1;
//            while (j<=i){
//                System.out.print(i+" ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}

//----------------------------------------------------------------------//
//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        int i=1,a=1;
//        while (i<=n){
//            int j=1;
//            while (j<=i){
//                System.out.print(a+" ");
//                a++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}

//-------------------------------------------------------------------//
//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        int i=1;
//        while(i<=n){
//            int j=i;
//            while (j<2*i){
//                System.out.print(j+" ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}

//----------------------------------------------------------------//
//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//        int n= sc.nextInt();
//
//        int i=1;
//        while(i<=n){
//            int j=i;
//            while(j>=1){
//                System.out.print(j+ " ");
//                j--;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}

//---------------------------------------------------------------------//
//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        int i=1;
//        while (i<=n){
//            int j=1;
//            while (j<=n){
//                char ch=(char)('A'+i-1);
//                System.out.print(ch+ " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}

//--------------------------------------------------------------------------//
//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        int i=1;
//        while (i<=n){
//            int j=1;
//            while(j<=n){
//                char ch=(char)('A'+j-1);
//                System.out.print(ch+" ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}

//-------------------------------------------------------------------//
//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//        int n= sc.nextInt();
//
//        int i=1;
//        char ch='A';
//        while(i<=n){
//            int j=1;
//
//            while(j<=n){
//
//                System.out.print(ch+" ");
//                ch++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}

//-------------------------------------------------------//

//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        int i=1;
//        while (i<=n){
//            int j=1;
//            while(j<=n){
//                char ch=(char)('A'+i+j-2);
//                System.out.print(ch+ " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}

//-----------------------------------------------------------------------//
//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        int i=1;char ch='A';
//        while(i<=n){
//            int j=1;
//
//            while (j<=i){
//
//                System.out.print(ch);
//                j++;
//            }
//            System.out.println();
//            ch++;
//            i++;
//        }
//    }
//}

//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while (j<=i){
//                char ch=(char)('A'+i-1);
//                System.out.print(ch+" ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}

//--------------------------------------------------------------------//
//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        int i=1 ;char ch='A';
//        while(i<=n){
//            int j=1;
//            while (j<=i){
//                System.out.print(ch+" ");
//                j++;
//                ch++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}

//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=i){
//                char ch=(char)('A'+i+j-2);
//                System.out.print(ch+" ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}

//--------------------------------------------------------------------------------------------//

//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        int i=1;
//        while(i<=n){
//            int j=1;
//            char ch=(char)('A'+n-i);
//            while (j<=i){
//                System.out.print(ch+" ");
//                ch++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}

//--------------------------------------------------//

//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        int i=1;
//        while(i<=n){
//            int space=n-i;
//            int j=1;
//
//                while(space >0){
//                    System.out.print("  ");
//                    space--;
//                }
//
//                while(j<=i){
//                    System.out.print("* ");
//                    j++;
//                }
//
//            System.out.println();
//            i++;
//        }
//    }
//
//}

//--------------------------------------------------------------//
//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        int i=1;
//        while(i<=n){
//            int val=n-i+1;
//            int j=1;
//            while (j<=i){
//                while (val>0){
//                    System.out.print("* ");
//                    val--;
//                }
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}

//-----------------------------------------------------------//
//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        int i=1;
//        while(i<=n){
//            int j=1;
//            int space=i-1;
//
//            while(space>0){
//                System.out.print(" ");
//                space--;
//            }
//
//            while(j<=n-i+1){
//                System.out.print("* ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}

//-------------------------------------------------------//
//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        int i=1;
//        while (i<=n){
//            int j=1;
//            int space=i-1;
//
//            while (space>0){
//                System.out.print("  ");
//                space--;
//            }
//
//            while(j<=n-i+1){
//                System.out.print(i+" ");
//                j++;
//            }
//            i++;
//            System.out.println();
//        }
//    }
//}


//--------------------------------------------------------//
//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        int i=1;
//        while (i<=n){
//            int j=1;
//            int space=n-i;
//
//            while (space>0){
//                System.out.print("  ");
//                space--;
//            }
//
//            while (j<=i){
//                System.out.print(i+" ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}

//---------------------------------------------------------//
//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        int i=1;
//        while (i<=n){
//            int j=1;
//            int val=i;
//            int space=i-1;
//
//            while(space>0){
//                System.out.print("s ");
//                space--;
//            }
//
//            while (j<=n-i+1){
//                System.out.print(val+" ");
//                val++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}

//----------------------------------------------------------------------//
//package com.company;
//
//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        int i=1;
//        while (i<=n){
//            int j=1,k=1;
//            int space=n-i;
//
//                while(space>0){
//                    System.out.print("  ");
//                    space--;
//                }
//
//                while(j<=i){
//                    System.out.print(j+" ");
//                    j++;
//                }
//
//                int a=i-1;
//                while (k<=i-1){
//                    System.out.print(a+" ");
//                    a--;
//                    k++;
//                }
//            System.out.println();
//            i++;
//        }
//    }
//}

//------------------------------------------------------------------//
package com.company;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int i=1;
        while (i <= n) {
            int j=1;
            int star=i-1;

            while (j<=i){
                System.out.print(j+" ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}