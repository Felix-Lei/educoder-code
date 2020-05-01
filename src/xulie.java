
import java.util.*;

 
public  class xulie{
   public static void main(String[] arge){
	   
	// TODO Auto-generated method stub
	   Scanner cin =new Scanner(System.in);
	   int n = cin.nextInt();
	   int[] a = new int[n];
	   for(int i = 0; i < n; i++) {
		   a[i] = cin.nextInt();
	   }
	   int b = cin.nextInt();	//带查找的数
	   boolean flag = false;
	   for(int i = 0; i < n;i++) {
		   if(b == a[i]) {
			   System.out.println(i+1);
			   flag = true;
			   break;
		   }
	   }
	   if(flag == false) {
		   System.out.println(-1);
	   }
    }
 
}
