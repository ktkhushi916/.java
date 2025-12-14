import java.util.Scanner;

import CIE.Student;

class Subject {
    int subjectMarks;
    int credits;
    int grade;
}

class Student {
    String name, usn;
    double sgpa;
    Scanner s ;
    Subject subject[];

    Student() {
        s=new Scanner(System.in);
        subject = new Subject[8];
        for (int i = 0; i < 8; i++) {
            subject[i] = new Subject();
        }
    }

    void getStudentDetails() {
        System.out.print("Enter student name: ");
        name = s.nextLine();
        System.out.print("Enter student USN: ");
        usn = s.nextLine();
    }

    void getMarks() {
        for (int i = 0; i < 8; i++) { 
            
            System.out.print("Enter marks (0-100) subject "+(i+1)+":");
            subject[i].subjectMarks = s.nextInt();
            System.out.print("Enter credits for subject :"+(i+1)+"+");
            subject[i].credits = s.nextInt();
            subject[i].grade = (subject[i].subjectMarks / 10) + 1;

            if (subject[i].grade > 10) {
                subject[i].grade = 10;
            }
            if (subject[i].grade <= 4) {
                subject[i].grade = 0;
            }
        }
    }

    void computeSGPA() {
        int totalCredits = 0;
        int effectiveScore = 0;

        for (int i = 0; i < 8; i++) { 
            effectiveScore += (subject[i].grade * subject[i].credits);
            totalCredits += subject[i].credits;
        }

        sgpa = (double)(effectiveScore) / (double)(totalCredits);
    }

    void display() {
        System.out.println("NAME: " + name);
        System.out.println("USN: " + usn);
        System.out.printf("SGPA : %.2f\n", sgpa);
    }
}

public class StudentMain1 {
    public static void main(String[] args) {
        Student st = new Student();
        st.getStudentDetails();
        st.getMarks();
        st.computeSGPA();
        st.display();
    }
}
