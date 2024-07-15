package towerOfHonoi;
import java.util.*;
public class TowerOfHonoi {
public static void towerOfHonoi(int n,char from,char to,char aux) {
	if(n == 1) {
		System.out.println("Move disk 1 from rod "+ from +" to rod " +to);
	return;
	}
	towerOfHonoi(n-1,from,aux,to);
	System.out.println("Move disk "+ n +" from rod "+ from +" to rod "+to);
	towerOfHonoi(n-1,aux,to,from);
	
}
	public static void main(String[] args) {
		System.out.println("Enter the no : ");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		towerOfHonoi(n,'A','B','C');
	}
}
