import java.util.Scanner;

/**
* @Title: java_2.java
* @Package 
* @Description: TODO(用一句话描述该文件做什么)
* @date 2017年9月23日 下午5:25:10
* @author:软工1502班1508010221苟同飞
*/

/**
* @ClassName: java_2
* @Description: TODO(这里用一句话描述这个类的作用)
* @date 2017年9月23日 下午5:25:10
* @author:软工1502班1508010221苟同飞
* @question:1.一个整数，大于0，不用循环和本地变量，按照n，2n，4n，8n的顺序递增，当值大于5000时，把值按照指定的顺序输出来。
*/

public class java_1 {
	public static void main(String[] args) {
		System.out.println("请输入一个正整数:");
		int n;
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		if(n<=5000){	
			System.out.println("输出结果:");
			added(n);
			}
		}
	public static void added(int n){
		System.out.println(n);
		if(n<=5000){
			added(n*2);
		}
		System.out.println(n);
	}
}