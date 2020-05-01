import java.util.*;

public class Text{
 
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        
        boolean on = true;
        boolean off = false;
        boolean[] light = new boolean[n+1];
         
        for(int i=0; i<=n; i++) {
            light[i] = on;
        }
         
        for(int j=2; j<=k; j++) {
            for(int i=j; i<=n;) {
               //if(i%j==0) {
                    if(light[i]!=off) {
                        light[i] = off;
                    }else {
                        light[i] = on;
                      }
                    i = i*i;
               //} 
            }
        }
         
        for(int i=1; i<=n; i++) {
            if(light[i]!=off) {
                System.out.print(i + " ");
            }
        }
         
    }
}
