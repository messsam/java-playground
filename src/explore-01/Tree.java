import java.util.Scanner;

public class Tree {
	public static void DrawTree(int x) {
		for (int c =1; c <=x; c++) {
			int n = 1;
			for(int i=1; i<=c; i++) {
				for(int j=i; j<=x; j++)
					System.out.print(" ");
			    if(c==1) { System.out.println("+"); break; }
			    for(int k=1; k<=n;k++) {
			    	if(k==1 || k==n)
			    		System.out.print("*");
			    	else
			    		System.out.print("#"); }
			    System.out.println(); n+=2;
			}
	    }
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	DrawTree(n);
    }
}