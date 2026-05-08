package practice3;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        BreakProblems.method4();
    }
}
class IfElseProblems{
    static void method1(){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if(i>0){
            System.out.println("The number is positive");
        }
        else if(i==0){
            System.out.println("The number is zero");
        }
        else {
            System.out.println("The number is negative");
        }
    }
    static void method2(){
        Scanner scan = new Scanner(System.in);
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        System.out.println(Math.max(i1,i2));
    }
    static void method3(){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        switch (i){
            case 5:
                System.out.println("Great");
            break;
            case 4:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Ok");
                break;
            case 2:
            case 1:
                System.out.println("Very bad");
                break;
            default:
                System.out.println("Illegal number");
        }
    }
    static void method4(){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if(i>0){
        if(i%2==0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
        }
        else
            System.out.println("Weird number");
    }
    static void method5(){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age<18){
            System.out.println("The discount is 25%");
        }
        else if(age>=65){
            System.out.println("The discount is 30%");
        }
        else{
            System.out.println("No discount");
        }
    }
    static void method6(){
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();
        if(grade>89){
            System.out.println("Great");
        }
        else if(grade>74){
            System.out.println("Good");
        }
        else if(grade>59){
            System.out.println("Ok");
        }
        else if(grade>=0){
            System.out.println("Very bad");
        }
        else
            System.out.println("Negative number");
    }
}
class SwitchProblems{
    static void method1(){
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Illegal number");
        }
    }
    static void method2(){
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("300 rub");
                break;
            case 6:
            case 7:
                System.out.println("450 rub");
                break;
            default:
                System.out.println("Illegal number");
        }
    }
    static void method3(){
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();
        if(grade>89){
            System.out.println("A");
        }
        else if(grade>79){
            System.out.println("B");
        }
        else if(grade>69){
            System.out.println("C");
        }
        else if(grade>59){
            System.out.println("D");
        }
        else if(grade>=0){
            System.out.println("F");
        }
        else
            System.out.println("Negative number");
    }
    static void method4(){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        switch (s){
            case "stop":
                System.out.println("Stopped");
                break;
            case "start":
                System.out.println("Starting");
                break;
            case "restart":
                System.out.println("Restarting");
                break;
            case "status":
                System.out.println("All is great");
                break;
            default:
                System.out.println("Brrr");
        }
    }
    static void method5(){
        Scanner scan = new Scanner(System.in);
        int i1 = scan.nextInt();
        String s = scan.next();
        int i2 = scan.nextInt();
        switch (s){
            case "+":
                System.out.println(i1+i2);
                break;
            case "-":
                System.out.println(i1-i2);
                break;
            case "*":
                System.out.println(i1*i2);
                break;
            case "/":
                if(i1==0||i2==0){
                    System.out.println("Cannot divide with zero");
                    break;
                }
                else {
                    System.out.println(i1/i2);
                break;}
            default:
                System.out.println("Wrong operator");
        }
    }
    }
    class ForProblems{
    static void method1(){
        for(int i = 1; i<101; i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
    static void method2(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = n;
        for(int i = 1; i<n; i++){
            sum+=i;
        }
        System.out.println("Sum:" + sum);
    }
    static void method3(){
        Scanner scan = new Scanner(System.in);
        int digit = scan.nextInt();
        for(int i = 1; i<11; i++){
            System.out.println(digit + " * " + i + " = " + digit*i);
        }
    }
    static void method4(){
        Scanner scan = new Scanner(System.in);
        int digit = scan.nextInt();
        boolean isPrime=false;
        for(int i = 2; i<digit; i++){
            if(digit%i==0){
                isPrime = false;
                break;
            }
            else
                isPrime = true;
        }
        System.out.println(isPrime);
    }
    static void method5(){
        for(int i = 1; i<11; i++){
            System.out.println(i);
        }
    }
    }
    class WhileProblems{
    static void method1(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int f = n;
        int i = 1;
        while(i<n){
            f*=i;
            i++;
        }
        System.out.println(f);
    }
    static void method2(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int i = 1;
        System.out.println(i);
        while(i<n){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println(n);
    }
    static void method3(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = n;
        while(i>0){
            System.out.println(i);
            i--;
        }
    }
    }
    class DoWhileProblems{
    static void method1(){
        Scanner scan = new Scanner(System.in);
        int digit;
        do{
            digit = scan.nextInt();
        }
        while(digit<=0);
    }
    static void method2(){
        Scanner scan = new Scanner(System.in);
        String login = "admin";
        String password = "123";
        String login2, password2;
        do{
            login2 = scan.next();
            password2 = scan.next();
        }
        while(!login.equals(login2)||!password.equals(password2));
        System.out.println("Logged in successfully");
    }
    static void method3(){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<11);
    }
    static void method4(){
        Scanner scan = new Scanner(System.in);
        String s;
        do{
            s = scan.next();
            System.out.println("Going");
        }
        while(!s.equals("exit"));
    }
    static void method5(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int n2 = n;
        int result = 0;
        if(n>0){
            do{
                if(n%10!=0){
                    result++;
                    n2 = n2/10;
                }
            }
            while (n2>0);
        }
        System.out.println(result);
    }
    }
    class BreakProblems{
    static void method1(){
        Scanner scan = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        while(true){
            input = scan.nextInt();
            if(input<0){
                break;
            }
            sum+=input;
            System.out.println(sum);
        }
    }
    static void method2(){
        for(int i = 1; i<21; i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }
    }
    static void method3(){
        Scanner scan = new Scanner(System.in);
        int [] array = new int [4];
        int i = 0;
        int f;
        while(i< array.length){
            f = scan.nextInt();
            if(f>=0){
            array[i] = f;
            }
            i++;
        }
        for (int a: array){
            if(a!=0) {
                System.out.println(a);
            }
        }
    }
    static void method4(){
        Scanner scan = new Scanner(System.in);
        String s;
        while(true){
            s = scan.next();
            if(s.equals("stop")){
                System.out.println("Stopped");
                break;
            }
        }
    }
    }

