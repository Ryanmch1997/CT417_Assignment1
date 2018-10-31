
package Assignment.CT417;
import java.util.HashSet;

public class Course {
String CourseName;
String StartDate;
String EndDate;
private HashSet<Student> enrolledStudents;


	public Course(String string) {
		string = CourseName;
		enrolledStudents = new HashSet<>();
	}
	public String getTitle() {
		return CourseName;
		}

		public void setTitle(String title) {
		this.CourseName = title;
		}
		
	public void enrollStudent(Student s1){
		if (enrolledStudents.add(s1)) {

		s1.registerForCourse(this);

		}
	}
	public void list() {
		System.out.println("Student enrolled for Course: " + getTitle());

		for (Student s : enrolledStudents) {

		System.out.println(s.getFirstName());

		}
		
	}
	public void print() {
		System.out.println("Course=> Name: " + getTitle());

	}
		
	}
