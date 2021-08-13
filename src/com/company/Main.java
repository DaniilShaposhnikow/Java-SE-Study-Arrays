package com.company;

import java.util.Scanner;

public class Main
{
    public  static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] num1 = new int [5];
         for (int i = 0; i<num1.length; i++)
         {
             num1[i] = in.nextInt();
         }
         for (int i = 0; i < num1.length; i++)
         {
             if (num1[i] % 2 ==0)
             {
                 System.out.println(num1[i]);
             }
             else
             {
                 System.out.println("Их нет");
             }
         }
         System.out.println(" ");
    }
}
