package StudentApplication;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


class StudentBase{
	private int id;
	private String name;
	private int[] mark;
	private int total;
	private int average;
	private String grade;
	
	public StudentBase(int id, String name, int[] mark) {
		this.id = id;
		this.name=name;
		this.mark = mark;
		this.total = calculateTotal();
		this.average = calculateAvg();
		this.grade=calcGrade();
	}
	
	
	private String calcGrade() {
		String grade="";
		if(average>=90) {
			grade = "A+";
		}
		else if(average >=80 && average < 90) {
			grade ="A";
		}
		else if(average >=70 && average <80) {
			grade="B";
		}
		else if(average >=60 && average <70) {
			grade = "C";
		}
		else if(average>=50 && average<60) {
			grade = "D";
		}
		else
			grade = "RA";
		
		return grade;
	}
	
	private int calculateTotal() {
		int sum = 0;
		for(int mark:mark) {
			sum += mark;
		}
		return sum;
	}
	private int calculateAvg() {
		return total/mark.length;
	}
	public String getName() {
		return name;
	}
	public String getGrade() {
		return grade;
	}
	public int[] getmark() {
		return mark;
	}
	public int average() {
		return average;
	}
	public int total() {
		return total;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
    public String toString() {
        return "ID: " +id+ "  Name: " +name+ "  Total: " +total+ "  Average: " +average+"Grade:" +grade;
    }
	
}

public class StudentFunctionalities {
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<StudentBase> studentListt = new ArrayList<>();
	
	
	public void addStudent() {
		System.out.println("Enter the Student ID: ");
		int id = sc.nextInt();
		System.out.println("Enter the Student Name: ");
		String name=sc.next();
		System.out.println();
		System.out.println("Enter the Number of Subjects: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
		System.out.println("mark in subject "+(i+1)+": ");
			arr[i] = sc.nextInt();
	}
		StudentBase Student = new StudentBase(id,name,arr);
		studentListt.add(Student);
		System.out.println("student added successfully");

	}
	public void setName() {
		System.out.println("Enter the student id tp to set the name: ");
		int id = sc.nextInt();
		for(StudentBase student: studentListt) {
			if(student.getId() == id) {
			System.out.println("Enter the new name: ");
			String Name1 =sc.next();
			student.setName(Name1);
			 System.out.println("Student name updated successfully");
				return;
			}
	}
		System.out.println(id+" Id Not Found");
	}
	public void getName() {
	System.out.println("Enter the student id tp to set the name: ");
	int id=sc.nextInt();
	for(StudentBase stu:studentListt) {
		if(stu.getId() == id) {
			System.out.println("Student Name: "+stu.getName());
			return;
		}
	}
	System.out.println("Student id not found");
	}
	public void viewAll() {
		if(studentListt.isEmpty()) {
			System.out.println("No student is added");
		}
		else {
			for(StudentBase stu : studentListt) {
				System.out.println(stu);
			}
		}
	}
	public void studentDetail() {
		// TODO Auto-generated method stub
		if(studentListt.isEmpty()) {
			System.out.println("No student is added");
		}
		else {
			System.out.println("Enter the student id to see complete detail: ");
			int id=sc.nextInt();
			for(StudentBase stu:studentListt) {
				if(stu.getId() == id) {
					System.out.println("Student Id: "+stu.getId()+"\nStudent Name: "+stu.getName()+"\n Student Mark :"+Arrays.toString(stu.getmark())+"\n Total: "+stu.total()+"\n Average : "+stu.average()+"\n  Grade: "+stu.getGrade());
					return;
				}
			}
			System.out.println("Student id is not found");
	}
	
	}
}
