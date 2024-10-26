package day1;

import java.util.Scanner;
public class Q201 {
    public static void main(String[] args) {
System.out.println("请输入你的成绩");

Scanner scanner= new Scanner(System.in);
        int score = scanner.nextInt();
if(score>90){
    System.out.println("A");
}
else if(score>80){
    System.out.println("B");
}
else if(score>70){
    System.out.println("C");
}
else if(score>60){
    System.out.println("D");
}
else{
    System.out.println("E");
}
    }
}