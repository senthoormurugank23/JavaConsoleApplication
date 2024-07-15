package StudentApplication;
import java.util.*;
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Student Management And System");
		
		Scanner sc = new Scanner(System.in);
		
		StudentFunctionalities Obj = new StudentFunctionalities();
		int n;
		do {
			System.out.println(" 1. Add Student\n 2. Set Student Name\n 3. GetName \n 4. Student details \n 5. View All \n 6. Exit");
			System.out.println("Enter the Choice : ");
			 n = sc.nextInt();

			switch(n) {
			case 1:
			{
				Obj.addStudent();
				break;
			}
			case 2:{
				Obj.setName();
				break;
			}
			case 3:
			{
				Obj.getName();
				break;
			}
			case 4:
			{
				Obj.studentDetail();
				break;
			}
			case 5:
			{
				Obj.viewAll();
				break;
			}
			case 6:{
				return;
			}
			default:
			{
				System.out.println("Enered Wrong choice");
				break;
			}
			}
		}while(n != 6);
		
	}

}
