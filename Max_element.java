public class Max_element {

	public static void main(String[] args) {
		
		int array[]= {12,45,67,3,-1,56};
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<array.length ;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		
		System.out.println(max);

	}
}
