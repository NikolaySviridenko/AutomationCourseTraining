package com.company;

public class Main {

    public static void main(String[] args){
        String t = "Hello Class";
        String ts = ", and Student!";
        System.out.println(t+ts);
        System.out.println();
        String [] u = {"qqqq","qqqqq","Under key one but three","qqqqqqq","wwwwwww","Under key Five"};
        System.out.println(u[5]);
        System.out.println();
        System.out.println(u[3-1]);
        System.out.println();
        for (int x = 8;x<11;x++)
        {
            System.out.println(x);
        }
        System.out.println();
        String [] s = {"How","are","you"};
        for (int i = 0;i<3;i++)
        {
            System.out.println(s[i]);
        }
        System.out.println();

        int[] m = {10, 20, 25, 30};
        int i = 0;
        while (i < 4) {
            if (m[i] == 25) {
                break;
            }
            System.out.println(m[i]);
            i++;
        }
        System.out.println();
        int[] n = {10, 20, 25, 30};
        int j = 0;
        while (j < 4) {
            if (n[j] == 10) {
                j++;
                continue;
            }
            System.out.println(n[j]);
            j++;
        }
//part II
        int g = -2;
        int sec = 18;
        int sum = g*sec;
        System.out.println("Task 1: "+ sum);
        boolean oper = true;
        int a = 999;
        int b = 1;
        if (oper==true)
        {
            int res1 = a+b;
            System.out.println("Task2: "+ res1);
        }
        else
        {
            int res2 = a-b;
            System.out.println("Task2: " + res2);
        }
        boolean anti = false;
        if (anti == true)
        {
            anti=false;
            System.out.println("Task 3: "+anti);
        }
        else
        {
            anti = true;
            System.out.println("Task 3: "+anti);
        }
        String[] strings = {"Hello", "World", "Class", "Guys", "Girls", "Everyone", "Goodbye"};
        int w1 = 1;
        int w2 = 3;
        System.out.println("Task4: "+strings [w1-1]+ " "+strings [w2-1]);
        int[] notstrings = {1, 7, 1, 4, 1, 7, 9, 6, 13, 1, 7};
        int target = 7;
        if (target <= 2)
        {
            int result = target+ notstrings[3];
            System.out.println("Task5: "+ result);
        }
        else
        {
            int res3 = target - notstrings[3];
            System.out.println("Task5: "+ res3);
        }

        int[] input = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        int isAllLessThan = 7;
        int max = input [0];
        for (int e=0; e<=input.length-1; e++)
        {
            if (input[e]>max)
            {
                max  = input[e];
            }

        }
        if (isAllLessThan > max)
        {
            System.out.println("Task6: "+true);
        }
        else
        {
            System.out.println("Task6: "+false);
        }




    }
}
