package Assignment.CT417;
import java.util.HashMap;
import java.util.HashSet;
//test
public class Student {
String FirstName;
String LastName;
int IDnumber;
int Age;
Module ModuleName;
int ModuleGrade;
Course CourseName;

private HashSet<Course> enrolledInCourse;
private HashSet<Module> enrolledInModules;
private HashMap<Module, Integer> grades;
	
	public Student(String string, String string2, int i,int age) {
		this.FirstName = string;
		this.LastName = string2;
		this.IDnumber = i;
		this.Age=age;
		enrolledInModules = new HashSet<>();
		enrolledInCourse = new HashSet<>();
		grades = new HashMap<>();
	}
	public int getId() {

		return IDnumber;

		}

		public void setId(int id) {

		this.IDnumber = id;

		}

		public String getFirstName() {

		return FirstName;

		}

		public void setFirstName(String first) {

		this.FirstName = first;

		}

		public String getLastName() {

		return LastName;

		}
		public String GetUserName()
		{
			String SN=FirstName;
			int SID= IDnumber;
			String UN = SN+Integer.toString(SID);
			return UN; 
		}

		public void setLastname(String last) {

		this.LastName = last;

		}
	public void registerForModule(Module oop) {
		if(enrolledInModules.add(oop)) {

			oop.enrollStudent(this);

			}
	}
	public void registerForCourse(Course BCT) {
		if(enrolledInCourse.add(BCT)) {
			BCT.enrollStudent(this);
		}
	}
	

}
	