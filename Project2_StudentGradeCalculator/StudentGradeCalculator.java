import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Subject 1: ");
        int sub1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int sub2 = sc.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int sub3 = sc.nextInt();
        System.out.print("Enter marks for Subject 4");
        int sub4 = sc.nextInt();
        System.out.print("Enter marks for Subject 5");
        int sub5 = sc.nextInt();
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double average = total/5.0;
        String grade;
        if(average>=90){
            grade="A+";
        }
        else if(average>=80){
            '[]grade = "A";
        }
        else if(average>=70){
            grade ="B";
        }
        else if(average>=60){
            grade = "C";
        }
        else if(average>=50){
            grade = "D";
        }
        else{
            grade = "F";
        }
        System.out.println("\n----Result----");
        System.out.println("Total Marks:"+total);
        System.out.println("Average Marks: "+average);
        System.out.println("Grade :"+grade);
        sc.close();
    }}
