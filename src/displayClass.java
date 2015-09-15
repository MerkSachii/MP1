
public class displayClass {
	
	public static final int MAXWIDTH = 90;
	public static final int MAXHEIGHT = 16;
	public static char[] displayArray = new char[MAXWIDTH * MAXHEIGHT];
	
	public static void InitDisplay() {
		
		for(int i = 0; i < MAXWIDTH * MAXHEIGHT; i++) {
			displayArray[i] = ' ';
		}
	}
	public static void DrawCharacter(char[] playerArr, int pW, int pH, int x, int y) {
		for(int col = 0; col < MAXWIDTH; col++) 
			for(int row = 0; row < MAXHEIGHT; row++) 
				if(col >= x && row >= y) 
					if(row < x+pW && col < y+pH) 
						for(int i = 0; i < pW * pH; i++) 
							for(int pcol = 0; pcol < MAXWIDTH; pcol++) 
								for(int prow = 0; prow < MAXHEIGHT; prow++) 
									if(playerArr[pcol+prow*pW] != ' ')
							displayArray[ col+row * MAXWIDTH] = playerArr[pcol+prow*pW];
						
					
				
			
		
	}
	
	
	public static void DrawEnemy(char[] enemyArr, int eW, int eH, int x, int y) {
		
		for(int col = 0; col < MAXWIDTH; col++) 
			for(int row = 0; row < MAXHEIGHT; row++) 
				if(col >= x && row >= y) 
					if(row < x+eW && col < y+eH) 
						for(int i = 0; i < eW * eH; i++) 
							for(int pcol = 0; pcol < MAXWIDTH; pcol++) 
								for(int prow = 0; prow < MAXHEIGHT; prow++) 
									if(enemyArr[pcol+prow*eW] != ' ')
							displayArray[ col+row * MAXWIDTH] = enemyArr[pcol+prow*eW];
		
	}
	public static void DrawBullet(char bullet, int x, int y) {
		
		for(int col = 0; col < MAXWIDTH; col++) 
			for(int row = 0; row < MAXHEIGHT; row++) 
				if(col >= x && row >= y) 
					if(row < x+1 && col < y+1) 
						for(int i = 0; i < 1; i++) 
							for(int pcol = 0; pcol < MAXWIDTH; pcol++) 
								for(int prow = 0; prow < MAXHEIGHT; prow++) 
							displayArray[ col+row * MAXWIDTH] = bullet;
		
		
	}
	
	public static void DrawHud(char[] hudArr, int hW, int hH, int x, int y) {
		
		for(int col = 0; col < MAXWIDTH; col++) 
			for(int row = 0; row < MAXHEIGHT; row++) 
				if(col >= x && row >= y) 
					if(row < x+hW && col < y+hH) 
						for(int i = 0; i < hW * hH; i++) 
							for(int pcol = 0; pcol < MAXWIDTH; pcol++) 
								for(int prow = 0; prow < MAXHEIGHT; prow++) 
									if(hudArr[pcol+prow*hW] != ' ')
							displayArray[ col+row * MAXWIDTH] = hudArr[pcol+prow*hW];
		
	}

}
