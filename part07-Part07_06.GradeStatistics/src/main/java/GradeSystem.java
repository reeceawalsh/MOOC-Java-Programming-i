import java.util.ArrayList;

public class GradeSystem {
    private PointsSystem pointsSystem;
    private ArrayList<Integer> gradeSystem;

    public GradeSystem(PointsSystem pointsSystem) {
        this.pointsSystem = pointsSystem;
        this.gradeSystem = new ArrayList();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.gradeSystem.add(grade);
        }
    }

    public int sortGrades(int grade) {
        int gradeFiveCount = 0;
        int gradeFourCount = 0;
        int gradeThreeCount = 0;
        int gradeTwoCount = 0;
        int gradeOneCount = 0;
        int gradeZeroCount = 0;

        for (Integer grades : this.gradeSystem) {
            if (grades >= 90) {
                gradeFiveCount ++;
            } else if (grades >= 80 && grades < 90) {
                gradeFourCount ++;
            } else if (grades >= 70 && grades < 80) {
                gradeThreeCount ++;
            } else if (grades >= 60 && grades < 70) {
                gradeTwoCount ++;
            } else if (grades >= 50 & grades < 60) {
                gradeOneCount ++;
            } else {
                gradeZeroCount ++;
            }
        }

        switch(grade) {
            case 5:
                return gradeFiveCount;
            case 4:
                return gradeFourCount;
            case 3:
                return gradeThreeCount;
            case 2:
                return gradeTwoCount;
            case 1:
                return  gradeOneCount;
            case 0:
                return gradeZeroCount;
        }
        return -1;
    }

    public String printGrade(int count) {
        String output = "";
        String star = "*";
        for (int i = 0; i < count; i++) {
            output += star;
        }
        return output;
    }
}
