import java.util.*;
public class FindUniqueDig {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num of input count:");
		int n=sc.nextInt(),i=0,j;
		int[] num=new int[n];
		if((n%2) != 0&& n != 0)
		{
		for(i=0;i<n;i++)
			num[i]=sc.nextInt();
		Arrays.sort(num);
		for(i=0;i<n-1;)
		{
			j=i+1;
			if(num[i]!=num[j])
			{
				System.out.println(num[i]);
				break;
			}
			i=j+1;
		}
		}
		else
			System.out.println("Incorrect input range!");
		sc.close();
	}	
}
		
