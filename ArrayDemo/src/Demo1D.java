
public class Demo1D 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int[] numbers;
		numbers=new int[3];
		numbers[0]=1221;
		numbers[1]=323;
		numbers[2]=323;
		int count=0;
		for(int i=0;i<numbers.length;i++)
		{
			count=count+numbers[i];
		}
		System.out.println(+count);
		
		
		for(int x:numbers)
		{
			System.out.println(x);
			
		}
	}
	
}

