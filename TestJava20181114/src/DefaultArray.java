import java.util.Random;
public class DefaultArray {
	/**public static void main(String[] args)
	{
		int[] score = new int[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("a["+i+"]�������Ĭ�ϳ�ʼֵ��"+score[i]);
		}
		
	}*/
	public static void main(String[] args)
	{
		Random rand = new Random();
		int[] a = new int[rand.nextInt(10)];
		System.out.println("����ĳ�����"+a.length);
		
		for(int i=0;i<a.length;i++)
		{ 
			a[i] = rand.nextInt(100);
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}
