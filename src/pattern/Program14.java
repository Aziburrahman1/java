package pattern;

public class Program14 {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=0;i<n;i++)  //row
		{
			int k=1;
			for(int j=0;j<n;j++) //column
			{
				if(i>=j)
				System.out.print(k++ +" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}


	}

}
