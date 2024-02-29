import java.util.ArrayList;

public class ClassSection {
    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students;
    public ClassSection(String subject, int capacity, int yearLevel) {
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
        students = new ArrayList<>();
    }
    public String getSubject() {return subject;}
    public void setSubject(String x) {subject = x;}
    public int getCapacity() {return capacity;}
    public void setCapacity(int x) {capacity = x;}
    public int getYearLevel() {return yearLevel;}
    public void setYearLevel(int x) {yearLevel = x;}
    public ArrayList<Student> getStudents() {return students;}
    public void addStudent(Student s) {
        if (!students.contains(s) && s.getYearLevel() == yearLevel) students.add(s);
    }
    public void removeStudent(Student s) {students.remove(s);}
    public boolean isStudentEnrolled(Student s) {return students.contains(s);}
    public String toString() {
        return "ClassSection{subject='" + subject + "', capacity=" + capacity + ", yearLevel=" + yearLevel + ", students=" + students + "}";
    }
}
