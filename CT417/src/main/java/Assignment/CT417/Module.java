package Assignment.CT417;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		System.out.println("Student enrolled for Module: " + ModuleName);

		for (Student s : enrolledStudents) {

		System.out.println(s.getFirstName());

		}
		
	}

	public void rankStudents() {

		ArrayList<Student> enrolledStudentsCopy = new ArrayList<Student>(enrolledStudents);

		// sorting the copy of list by comparator on basis of marks in this module

		Collections.sort(enrolledStudentsCopy, new Comparator<Student>() {

		@Override

		public int compare(Student s1, Student s2) {

		int m1 = s1.getMarks(Module.this);

		int m2 = s2.getMarks(Module.this);

		return (m1 == m2 ? 0 : (m1 > m2 ? 1 : -1));

		}

		});

		System.out.println("Student in Order of their marks in module: " + ModuleName);

		for (Student s : enrolledStudentsCopy) {

		System.out.println(s.getFirstName() + "\t" + s.getMarks(this));

		}

		}

		public void print() {

		System.out.println("Moudle=> Name: " + ModuleName + ", Module Code: " + ModuleCode);

		}

	}

