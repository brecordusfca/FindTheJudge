public class Judge
{
	public int findJudge(int N, int[][] trust)
	{
		if (trust.length == 0)
		{
			return N;
		}

		int [] initialCount = new int[N + 1];
		int [] finalCount = new int[N + 1];
		
		for(int i=0; i < trust.length; i++)
		{
			initialCount[trust[i][1]]++;
			finalCount[trust[i][0]]++;
		}

		for(int i = 1; i <= N; i++)
		{
			if(initialCount[i] == N - 1 && finalCount[i] == 0)
			{
				return i;
			}

		}

		return -1;
	}

	public static void main(String [] args)
	{
		System.out.println("\nFind The Judge Test");

		int [][] trustTest1 = {{1,2}};
		System.out.println(new Judge().findJudge(2, trustTest1));

		int [][] trustTest2 = {{1,3}, {2,3}};
		System.out.println(new Judge().findJudge(3, trustTest2));

		int [][] trustTest3 = {{1,3}, {2,3}, {3,1}};
		System.out.println(new Judge().findJudge(3, trustTest3));

		int [][] trustTest4 = {{1,2},{2,3}};
		System.out.println(new Judge().findJudge(3, trustTest4));

		//int [][] trustTest5 = {{1,3}, {1,4}, {2,3}, {2,4}, {4,5}};
		//System.out.println(new FindTheJudge().findJudge(4, trustTest5));
		System.out.println("Test Done");
	}
}