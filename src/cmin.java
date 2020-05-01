/*求n（2<=n<=10）个整数中倒数第二小的数。每一个整数都独立看成一个数，比如，有三个数分别是1，1，3，那么，第二小的数就是1。（每个数均小于100）

说明：首先输入一个整数n，然后输入n个数。请输出第2小的数。

例如输入：

5

-5 -10 10 50 80

程序输出第2小的数：-5

要求：使用循环实现。
*/
import java.util.Scanner;
public class cmin {
	public static void main(String[] args) {
		int min;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		for(int i = 1;i<= a;i++) {
			b[i] = sc.nextInt();
		}
		for(int i =0 ;i<=a-1;i++) {
			min = i;
		}
		for(int j = i+1;j<=a;j++) {
			
		}
		
			
		
	}
	
}