/**
* @Title: java_2.java
* @Package 
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @date 2017��9��23�� ����7:18:31
* @author:��1502��1508010221��ͬ��
*/

/**
* @ClassName: java_2
* @Description: TODO(������һ�仰��������������)
* @date 2017��9��23�� ����7:18:31
* @author:��1502��1508010221��ͬ��
* @question:������ת����
*/
import java.util.*;
public class java_2 {
	 static int a[][]=new int[20][20];//Ĭ��ֵΪ0  
	  
	    static void t(int a[][],int b,int s,int d){
	    	//a�Ǵ洢����Ԫ�ص�����,bΪÿ���������ʼλ�ã�d��Ϊa���鸳ֵ��������s�Ƿ���Ľ���  
	        int j,h=b,v=b;  
	        if(s==0) return;          // �ݹ����
	        if(s==1)   
	        { a[b][b]=d;return;} 
	        
	        for(j=1;j<s;j++)          // һȦ�����д������ҵ���    	
	        { a[h][v]=d;v++;d++;}  
	        
	        for(j=1;j<s;j++)          // һȦ�����д������µ�������   	
	        { a[v][h]=d;h++;d++;}  
	        
	        for(j=1;j<s;j++)          // һȦ�����д��������������   
	        { a[v][h]=d;v--;d++;}  
	        
	        for(j=1;j<s;j++)          // һȦ�����д������ϵ�������    
	        { a[v][h]=d;h--;d++;}  
	        
	        t(a,b+1,s-2,d);           // ������һȦ�ݹ麯��    
	  
	    }  
	    public static void main(String[] args) {  
	        int h,v,b,p,s,d,n; 
	        System.out.println("�����뷽�����:");
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
