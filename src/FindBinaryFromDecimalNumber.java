import java.util.Scanner;

public class FindBinaryFromDecimalNumber {
	
	public static void main(String[] args) {
		int input, rem, quot, i=1,j;
		int bin_num[] = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a decimal no: ");
		input=sc.nextInt();
		quot = input;
		while (quot !=0) {
			int k=i++;
			bin_num[k]=quot%2;
			System.out.println("bin_num["+i+"]"+" = "+bin_num[k]);
			quot=quot/2;
		}
		System.out.print("Binary no of '"+input+"' is : ");
		for (j = i-1; j > 0; j--) {
			System.out.print(bin_num[j]);
		}
	}

}
