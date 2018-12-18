import java.util.Scanner;

public class AddEven {

	public static void main(String[] args) {
		int i,n, add=0,count=0;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the num");
		n=s.nextInt();
		for( i=0;i<=n;i+=2){
			
			
			System.out.println(i);
			add=add+i;
			
			if(i%2==0){
				count++;	
			}
		}
 System.out.println(add);
 System.out.println(count);
	}

}