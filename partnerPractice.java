public class partnerPractice{

public static void main(String[] args)
{

partnerPractice player = new partnerPractice();
player.fillArray(3);


}

public int[][] fillArray(int num)
{
	int[][] arr2D = new int[num][num];
	for(int i = 0; i < num;i++)
	{
		for(int j = 0; j < num; j++)
		{

		arr2D[i][j] = (int)((Math.random()*10)+1);
		System.out.println(i + ":" + j + " " + arr2D[i][j]);

		}

	}

return arr2D;


}


}