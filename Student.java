public class Student{

    private String name;
    private String matric;
    private String gender;
    private double cgpa;

    public Student(String name, String matric, String gender, double cgpa) {
        this.name = name;
        this.matric = matric;
        this.gender = gender;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }
  
    public String getMatric() {
        return matric;
    }
  
    public String getGender() {
        return gender;
    }
  
    public Double getCgpa() {
        return cgpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMatric(String matric) {
        this.matric = matric;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

}