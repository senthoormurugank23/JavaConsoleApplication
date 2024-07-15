package patternProgram;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter input: ");
int n =sc.nextInt();
String star="*";
for(int i =0;i<n;i++) {
	for(int j=0;j<=i;j++) {
	System.out.print(star);
}
	System.out.println();
}

System.out.println();
	
for(int i=1;i<=n;i++) {
	for(int j=1;j<=n-i;j++) {
		System.out.print(" ");
	}
	for(int k=1;k<=i;k++) {
		System.out.print(star);
	}
	System.out.println();
}

System.out.println();


for(int i = 0;i<=n;i++) {
	for(int j=0;j<n-i;j++) {
		System.out.print(star);
	}
	System.out.println();
}

System.out.println();

for(int i=1;i<=n;i++) 
{
	for(int j=i;j<=n;j++) {
		System.out.print(star);
	}
	System.out.println();
	for(int k=1;k<=i;k++) {
		System.out.print(" ");
	}
}

System.out.println();

int mid = n/2;
int m=mid;
int g=1;
//System.out.println(mid);
for(int i =0 ;i<=m;i++) {
	for(int j=mid;j>0;j--) {
		System.out.print(" ");
	}
	mid--;
	for(int k=1;k<=g;k++) {
		System.out.print(star);
	}
	System.out.println();
	g=g+2;
}
for(int i=0;i<=m;i++) {
	for(int j=n;j>=0;j--) {
		System.out.print(star);
	}
	n=n-2;
	System.out.println();
	for(int k=i+1;k>0;k--) {
		System.out.print(" ");
	}
	
}
	}

}
