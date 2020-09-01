package exercises.school;

public class Student {
    private String name;
    private int studentId;
    private double GPA = 0.0;
    private int numberOfCredits = 0;

    public String getName() {
        return this.name;
    }
    public void setName(String aName) {
        this.name = aName;
    }

    public int getStudentId() {
        return this.studentId;
    }
    public void setStudentId(int aStudentId) {
        this.studentId = aStudentId;
    }

    public double getGPA() {
        return this.GPA;
    }
    public void setGPA(double aGPA) {
        this.GPA = aGPA;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }
    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public Student(String name, int studentId, double GPA, int numberOfCredits) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.GPA = GPA;
    }

    public String getGradeLevel() {
        String gradeLevel;
        if(this.numberOfCredits >= 0 && this.numberOfCredits <= 29) {
            gradeLevel = "Freshman";
        }
        else if (this.numberOfCredits >= 29 && this.numberOfCredits <= 59) {
            gradeLevel = "Sophomore";
        }
        else if (this.numberOfCredits >= 60 && this.numberOfCredits <= 89) {
            gradeLevel = "Junior";
        }
        else {
            gradeLevel = "Senior";
        }
        return gradeLevel;
    }

    public void addGrade(int credits, double grade) {
        double qualityScore = this.GPA * (double) this.numberOfCredits;
        double newQualityScore = (double) grade * (double) credits;
        double finalQualityScore = (qualityScore + newQualityScore);
        this.numberOfCredits += credits;
        double newGPA = finalQualityScore / numberOfCredits;
        this.GPA = newGPA;
    }

    public boolean equals(Student myStudent) {
        if(this.name.equals(myStudent.name)) {
            return true;
        }
        else {
            return false;
        }
    }


}
