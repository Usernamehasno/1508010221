import java.util.Scanner;

/**
* @Title: java_2.java
* @Package 
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @date 2017��9��23�� ����5:25:10
* @author:��1502��1508010221��ͬ��
*/

/**
* @ClassName: java_2
* @Description: TODO(������һ�仰��������������)
* @date 2017��9��23�� ����5:25:10
* @author:��1502��1508010221��ͬ��
* @question:1.һ������������0������ѭ���ͱ��ر���������n��2n��4n��8n��˳���������ֵ����5000ʱ����ֵ����ָ����˳���������
*/

public class java_1 {
	public static void main(String[] args) {
		System.out.println("������һ��������:");
		int n;
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		if(n<=5000){	
			System.out.println("������:");
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