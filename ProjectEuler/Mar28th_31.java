
public class Mar28th_31{
	private static void p31(){
		int[] coinv = {0,1,2,5,10,20,50,100,200};
		int[][] d = new int[9][201];
		int sum = 200;

		for(int i = 0; i < 9; i++){
			d[i][0] = 1;
		}
		for(int i = 1; i <= sum; i++){
			d[0][i] = 0;
		}

		for(int i = 1; i < 9; i++){
			for(int j = 1; j < 201; j++){
				d[i][j] = 0;
				for(int k = 0; k <= j / coinv[i]; k++){
					d[i][j] += d[i - 1][j - k * coinv[i]];
				}
			}
		}
		System.out.println(d[8][sum]);
	}
	public static void main(String[] args){
		p31();
	}
}