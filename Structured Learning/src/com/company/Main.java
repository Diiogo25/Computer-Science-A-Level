package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        while(loop){
            System.out.println("Please input ur name");
            String userName = input.next();
            System.out.println("Please input the number of hours you have worked in the last week");
            int hoursWeek = input.nextInt();
            System.out.println("Please input your hourly wage");
            int hourlyWage = input.nextInt();
            double tax = 0.8;
            if(hoursWeek > 45){
                int overtimehours = hoursWeek - 45;
                double overtimeTotal = overtimehours * 1.5;
                double overtimeTotal2 = 45 * hourlyWage;
                double overtimeTotal3 = overtimeTotal + overtimeTotal2;
                System.out.println("Hello, " + userName + ", your weekly wage before paying tax should be: £" + overtimeTotal3 + " ");
                System.out.println("Hello, " + userName + ", your weekly wage after paying tax should be: £" +  overtimeTotal3 * tax + " ");
            }else {
                int total = hoursWeek * hourlyWage;
                System.out.println("Hello, " + userName + ", your weekly wage before paying tax should be: £" + total + " ");
                System.out.println("Hello, " + userName + ", your weekly wage after paying tax should be: £" + total * tax + " ");
            }
            System.out.println("Do you want to do this for another worker? ");
            String check = input.next();
            if(check.equals("yes") || check.equals("Yes") || check.equals("YES")){
                loop = true;
            }
            else if(check.equals("no") || check.equals("No") || check.equals("NO")) {
                loop = false;
            }
            else{
                System.out.println("please type in yes or no");
            }
        }
    }
}
