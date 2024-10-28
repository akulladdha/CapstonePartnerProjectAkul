public class partTwo
{
	public static void main(String[] args)
	{

		 int[][] array = {
		            {11, 7, 9, 15, 11},
		            {3, 8, 14, 10, 5},
		            {11, 1, 0, 4, 13},
		            {19, 2, 18, 17, 16},
		            {20, 21, 22, 23, 24}
        };

		partTwo player = new partTwo();
		System.out.println(player.firstEven(array));

	}


	public int firstEven(int[][] arr)
	{

		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[0].length;j++)
			{
				if(arr[i][j] % 2 == 0)
				{

					return arr[i][j];
				}
			}
		}
		return -1;
	}


}