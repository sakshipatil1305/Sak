
public class Demo2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arrays;
		arrays= new int[3][4];
		
		arrays[0][0]=10;
		arrays[0][1]=20;
		arrays[0][2]=30;
		
		arrays[1][0]=11;
		arrays[1][1]=21;
		arrays[1][2]=31;
		
		arrays[2][0]=13;
		arrays[2][1]=23;
		arrays[2][2]=33;
		
		for(int i=0;i<arrays.length;i++)
		{
			for(int j=0;j<arrays[i].length;j++)
			{
				System.out.println(arrays[i][j]+"\t");
			}
			
			System.out.println();
		}
	}

}
