
package Assignment.CT417;
import java.util.HashSet;

import org.joda.time.DateTime;

public class Course {
String CourseName;
DateTime BCTStartDate = new DateTime(2019, 9, 01, 12, 0, 0, 0);
DateTime BCTEndDate = new DateTime(2023, 06, 7, 12, 0, 0, 0);
private HashSet<Student> enrolledStudents;


	public Course(String string) {
		string = CourseName;
		enrolledStudents = new HashSet<>();
		BCTStartDate= new DateTime();
		BCTEndDate= new DateTime();
	}
	public String getTitle() {
		return CourseName;
		}

		public void setStartDate(DateTime start) {
		this.BCTStartDate = start;
		}
		public DateTime getStartDate() {
			return BCTStartDate;
			}

			public void setTitle(String title) {
			this.CourseName = title;
			}
			
			public void setEndDate(DateTime end) {
				this.BCTEndDate = end;
				}
				public DateTime getEndDate() {
					return BCTEndDate;
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
		System.out.println("Course Name:" + getTitle());

	}
	
	}
