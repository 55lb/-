/**import java.util.Random;
public class DefaultArray1 {
	public static void main(String[] args)
	{
		Random rand = new Random();
		int[]b = null;
		int[] a = null;
			a =	new int[rand.nextInt(10)];
			b=a;
		System.out.println("����Ĵ�С������"+a.length);
		System.out.println("����B�ĳ�����"+b.length+"\n");
		for(int i =0;i< a.length;i++)
		{
			a[i] = rand.nextInt(100);
	
		System.out.print("a["+i+"]="+a[i]+"\t");
		System.out.println("b["+i+"]="+b[i]);
		
		}
	}
}
*/

	public class DefaultArray1
	{
		public static void main(String[] args)
		{
			int sum=0;
			int[][] a={
					{1,2,3,4},
					{6,7,8,9}
			};
			
			System.out.println("��Ҫ��ѯ���˵ĳɼ���");
			for(int i=0;i<a.length;i++)
			{
				System.out.print("��"+i+"���˵ĳɼ��ǣ�");
				for(int j=0;j<a[i].length;j++)
				{
					sum = sum+a[i][j];
					System.out.print(a[i][j]+" ");
				}
				System.out.println("��"+i+"���˵��ܳɼ��ǣ�"+sum);
			}
		
			
		}
	}