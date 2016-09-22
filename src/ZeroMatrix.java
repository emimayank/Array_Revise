
public class ZeroMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]=new int[3][3];
		matrix[0][0]=1;
		matrix[0][1]=2;
		matrix[0][2]=3;
		matrix[1][0]=4;
		matrix[1][1]=0;
		matrix[1][2]=6;
		matrix[2][0]=7;
		matrix[2][1]=8;
		matrix[2][2]=9;
		int row=0;int col=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(matrix[i][j]==0){
					row=i;
					col=i;
				}
			}
		}
		for(int i=0;i<3;i++){
			matrix[i][col]=0;
		}
		for(int i=0;i<3;i++){
			matrix[row][i]=0;
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
