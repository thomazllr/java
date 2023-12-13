package nelio_alves.Aclasses.Exercise3.entities;

import java.util.Arrays;

public class Student {
        public String name;
        public double[] grades = new double[3];


    public double finalGrade() {
        return grades[0] + grades[1] + grades[2];
    }

    public int checkStatus() {
        if (finalGrade()> 60) {
            return 1;
        }
        else {
            return 2;
        }
    }

    @Override
    public String toString() {
        if(checkStatus() == 2) {
            System.out.println("FAILED");
            double miss = 60 - finalGrade();
            System.out.printf("MISSING %.2f POINTS\n", miss);
        }
        else{
            System.out.println("PASSED");
        }
        return "FINAL GRADE = " + finalGrade() + "\n";

    }
}
