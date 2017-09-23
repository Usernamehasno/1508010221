/**
* @Title: java_2.java
* @Package 
* @Description: TODO(用一句话描述该文件做什么)
* @date 2017年9月23日 下午7:18:31
* @author:软工1502班1508010221苟同飞
*/

/**
* @ClassName: java_2
* @Description: TODO(这里用一句话描述这个类的作用)
* @date 2017年9月23日 下午7:18:31
* @author:软工1502班1508010221苟同飞
* @question:数字旋转矩阵
*/
import java.util.*;
public class java_2 {
	 static int a[][]=new int[20][20];//默认值为0  
	  
	    static void t(int a[][],int b,int s,int d){
	    	//a是存储方阵元素的数组,b为每个方阵的起始位置；d是为a数组赋值的整数；s是方阵的阶数  
	        int j,h=b,v=b;  
	        if(s==0) return;          // 递归出口
	        if(s==1)   
	        { a[b][b]=d;return;} 
	        
	        for(j=1;j<s;j++)          // 一圈的上行从左至右递增    	
	        { a[h][v]=d;v++;d++;}  
	        
	        for(j=1;j<s;j++)          // 一圈的右列从上至下递增，减   	
	        { a[v][h]=d;h++;d++;}  
	        
	        for(j=1;j<s;j++)          // 一圈的下行从右至左递增，减   
	        { a[v][h]=d;v--;d++;}  
	        
	        for(j=1;j<s;j++)          // 一圈的左行从下至上递增，减    
	        { a[v][h]=d;h--;d++;}  
	        
	        t(a,b+1,s-2,d);           // 调用内一圈递归函数    
	  
	    }  
	    public static void main(String[] args) {  
	        int h,v,b,p,s,d,n; 
	        System.out.println("请输入方阵阶数:");
	        Scanner in=new Scanner(System.in);  
	        n=in.nextInt();  
	        b=1;s=n;d=1;  
	        t(a,b,s,d);  
	          
	        for(h=1;h<=n;h++)   
	          { for(v=1;v<=n;v++)   
	            System.out.print(a[h][v]+" ");  
	          System.out.println();  
	                    
	          }  
	    }  
}
