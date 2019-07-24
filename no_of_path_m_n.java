/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int z=sc.nextInt();
		for(int x=0;x<z;x++){
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    System.out.println(path(m,n));
		    
		}
		
	}
	static int path(int m,int n){
		    if(m==1 || n==1){
		        return 1;
		    }
		    return path(m,(n-1))+path((m-1),n);
		}
}
