public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount;
    public Student(String firstName, String lastName, int age, int yearLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
    }
    public String getFirstName() {return firstName;}
    public void setFirstName(String x) {firstName = x;}
    public String getLastName() {return lastName;}
    public void setLastName(String x) {this.lastName = x;}
    public int getAge() {return age;}
    public void setAge(int x) {age = x;}
    public int getYearLevel() {return yearLevel;}
    public void setYearLevel(int x) {yearLevel = x;}
    public int getStudentCount() {return studentCount;}
    public boolean equals(Student student) {
        Student x = new Student(firstName, lastName, age, yearLevel);
        if (x.equals(student)) return true;
        return false;
    }
    public String toString() {
        return "Student{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "', age=" + age + ", yearLevel=" + yearLevel + "}";
    }
}
