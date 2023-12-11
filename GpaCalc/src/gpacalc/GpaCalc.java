/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gpacalc;
import java.util.Scanner;

/**
 *
 * @author obinna
 */
public class GpaCalc {

  
    public String getGrade(int score) {
        String grade = "";
        if (score >= 70 && score <= 100) {
            grade = "A";
        } else if (score >= 60 && score <= 69) {
            grade = "B";
        } else if (score >= 50 && score <= 59) {
            grade = "C";
        } else if (score >= 45 && score <= 49) {
            grade = "D";
        } else if (score >= 40 && score <= 44) {
            grade = "E";
        } else if (score >= 0 && score <= 39) {
            grade = "F";
        }
        return grade;
    }

    public int getPoint(String grade) {
        int point = 0;
        switch (grade) {
            case "A":
                point = 5;
                break;
            case "B":
                point = 4;
                break;
            case "C":
                point = 3;
                break;
            case "D":
                point = 2;
                break;
            case "E":
                point = 1;
                break;
            case "F":
                point = 5;
                break;

        }
        return point;
    }

    public void displayRecord(String courseCode, int courseUnit, String grade, int gradeUnit) {

        System.out.printf("|%-15s|%-15s|%-12s|%-10s|\n", courseCode, courseUnit, grade, gradeUnit);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("GPA CALCCULATOR");

        Scanner i = new Scanner(System.in);

        //course1
        System.out.print("Enter Course 1: ");
        String course1 = i.nextLine();

                System.out.print("Enter credit1: ");
        int credit1 = i.nextInt();
        
        System.out.print("Enter course1 score: ");
        int score1 = i.nextInt();



        i.nextLine();

        //course2
        System.out.print("Enter Course 2: ");
        String course2 = i.nextLine();

        System.out.print("Enter credit2: ");
        int credit2 = i.nextInt();
        
        
        System.out.print("Enter course2 score: ");
        int score2 = i.nextInt();

        
    

        i.nextLine();

        //course3
        System.out.print("Enter Course 3: ");
        String course3 = i.nextLine();

             System.out.print("Enter credit3: ");
        int credit3 = i.nextInt();
        
        System.out.print("Enter course3 score: ");
        int score3 = i.nextInt();
        i.nextLine();

        //course4
        System.out.print("Enter Course 4: ");
        String course4 = i.nextLine();
        
     System.out.print("Enter credit4: ");
        int credit4 = i.nextInt();
        
        System.out.print("Enter course4 score: ");
        int score4 = i.nextInt();
        i.nextLine();

        
        System.out.print("Enter Course 5: ");
        String course5 = i.nextLine();

    System.out.print("Enter credit5: ");
        int credit5 = i.nextInt();

        System.out.print("Enter course5 score: ");
        int score5 = i.nextInt();

    


        //       GpaCalculator st = new GpaCalculator();
        GpaCalc st = new GpaCalc();
        String grade1 = st.getGrade(score1);
        String grade2 = st.getGrade(score2);
        String grade3 = st.getGrade(score3);
        String grade4 = st.getGrade(score4);
        String grade5 = st.getGrade(score5);

        int point1 = st.getPoint(grade1);
        int point2 = st.getPoint(grade2);
        int point3 = st.getPoint(grade3);
        int point4 = st.getPoint(grade4);
        int point5 = st.getPoint(grade5);

        int TotalQualitypoint = credit1*point1 + credit2*point2  + credit3*point3  + credit4*point4 +credit5*point5 ;
        int TotalCredits = credit1 + credit2 + credit3 + credit4+credit5;
        double gpa = (double)  TotalQualitypoint / TotalCredits;

        System.out.println("|---------------|---------------|------------|----------|");
        System.out.printf("|%-15s|%-15s|%-12s|%-10s|\n", "COURSE & CODE", "COURSE UNIT", "GRADE", "GRADE UNIT");
        System.out.println("|---------------|---------------|------------|----------|");
        
        st.displayRecord(course1, credit1, grade1, point1);
        st.displayRecord(course2, credit2, grade2, point1);
        st.displayRecord(course3, credit3, grade3, point1);
        st.displayRecord(course4, credit4, grade4, point1);
        st.displayRecord(course5, credit5, grade5, point1);
        
             System.out.printf("\nYour GPA is: %.2f%n", gpa);

    }
    
}

