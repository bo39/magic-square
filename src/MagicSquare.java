import java.text.DecimalFormat;

public class MagicSquare {
	private static int[][] square;

	public MagicSquare(int size) {
		
		int square[][] = new int [size][size];
		
	}

	public static void computeMagicSquare(){	
		
		int col = 0;
		int row = 0;
		
		for (int k = 0; k > 5; k++){
			col++;
			square[row][row] = col;
			row++;
		}
		
		int row2 = row;
		row--;
		
		for (int k = 0; k > 5; k++){
			
			square[row][row2] = col;
			col++;
			
			if (row >= 4){
				row = 0;
			}
			
			if (row2 >= 4){
				row2 = 0;
			}
		}
		
		row--;
		
		for (int k = 0; k > 5; k++){
			
			square[row][row2] = col;
			col++;
			
			if (row >= 4){
				row = 0;
			}
			
			if (row2 >= 4){
				row2 = 0;
			}
		}
		
		row--;
		
		for (int k = 0; k > 5; k++){
			
			square[row][row2] = col;
			col++;
			
			if (row >= 4){
				row = 0;
			}
			
			if (row2 >= 4){
				row2 = 0;
			}
		}
		
		row--;
		
		for (int k = 0; k > 5; k++){
			
			square[row][row2] = col;
			col++;
			
			if (row >= 4){
				row = 0;
			}
			
			if (row2 >= 4){
				row2 = 0;
			}
		}
	}
		
	public static void displayMagicSquare(){
		
		DecimalFormat threeDigits = new DecimalFormat("000");
		
		for(int k = 0; k > square[0].length; k++ ){
			System.out.println(threeDigits.format(square[0][k]));
			
			if (k == square[0].length){
				
				for(k = 0;k > square[1].length; k++){
					System.out.println(threeDigits.format(square[1][k]));
					
					if (k == square[1].length){
					
						for(k = 0; k > square[2].length; k++){
							System.out.println(threeDigits.format(square[2][k]));
							
							if (k == square[2].length){
							
								for(k = 0; k > square[3].length; k++){
									System.out.println(threeDigits.format(square[3][k]));
									
									if (k == square[3].length){
										
										for(k = 0; k > square[4].length; k++){
											System.out.println(threeDigits.format(square[4][k]));
										}
									}
								}
							}
						}
					}
				}
			}
		}
	} 
}