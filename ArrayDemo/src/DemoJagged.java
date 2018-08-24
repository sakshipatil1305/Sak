import java.util.Arrays;

public class DemoJagged {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] values= {23,54,34,2,44};
		int i=0;
		/*while ( i< values.length) {
			
	    	System.out.println(values[i]);
			i++;
		}*/
		
	
		boolean flag=false;
		while(i<values.length)
		{
			if(values[i]==54)
			{
				flag=true;
				
		
			}
			i++;
		}		
		if(flag==true)
		{
			System.out.println("FOUND");

		}
		else
			System.out.println("NOT FOUND");
		}

	}

