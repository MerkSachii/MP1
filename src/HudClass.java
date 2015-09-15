
public class HudClass {

	public static final int MAXWIDTH = 17;
	public static final int MAXHEIGHT = 3;
	public char[] hudArr = new char[17 + 3 * 3];
	
	public HudClass() {
		for(int col = 0; col < MAXWIDTH; col++) 
			for(int row = 0; row < MAXHEIGHT; row++)
				if(col == 0 && row == 0) {
					hudArr[col+row * MAXWIDTH] = '[';}
				else if(col == MAXWIDTH && row == 0){
					hudArr[col+row * MAXWIDTH] = ']';}
				else hudArr[col+row * MAXWIDTH] = ' ';
				
		for(int col = 0; col < MAXWIDTH; col++)
			for(int row = 0; row < MAXHEIGHT; row++)
				for(int i = 0; i < 7; row++)
				if(row == 1 && col <= 1 && col >= 8)
					switch(i){
						case 0:
						hudArr[col+row * MAXWIDTH] = 'B';
						break;
						case 1:
						hudArr[col+row * MAXWIDTH] = 'U';
						break;
						case 2:
						hudArr[col+row * MAXWIDTH] = 'L';
						break;
						case 3:
						hudArr[col+row * MAXWIDTH] = 'L';
						break;
						case 4:
						hudArr[col+row * MAXWIDTH] = 'E';
						break;
						case 5:
						hudArr[col+row * MAXWIDTH] = 'T';
						break;
						case 6:
						hudArr[col+row * MAXWIDTH] = ':';
						break;
					}
		//TODO name
			
	}
}
