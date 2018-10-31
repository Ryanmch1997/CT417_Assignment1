package Assignment.CT417;
import java.util.HashSet;

public class Module {
String ModuleName;
String ModuleCode;
private HashSet<Student> enrolledStudents;

	public Module(String string, String string2) {
		string = ModuleName;
		string2= ModuleCode;
		enrolledStudents = new HashSet<>();
	}
	public String getTitle() {
		return ModuleName;
		}

		public void setTitle(String title) {
		this.ModuleName = title;
		}

		public String getCode() {
		return ModuleCode;
		}

		public void setCode(String code) {
		this.ModuleCode = code;
		}
		
	public void enrollStudent(Student s){
		if (enrolledStudents.add(s)) {

		s.registerForModule(this);

		}
	}
	public void list() {
		System.out.println("Students enrolled for Module: ");
		for (Student s : enrolledStudents) {

		System.out.println(s.getFirstName());

		}
		
	}

	
		public void print() {

		System.out.println("Module Name: " + getTitle() + ", Module Code: " + getCode());

		}

	}

