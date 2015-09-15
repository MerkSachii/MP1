
public class Bullet {
	
	private char[] bulletMap = new char[3]; 
	
	public static final char NORMAL = 'o', BLAST = 'O', POISON = '*';
	public int currBullet;
	public int[] damageMap = new int[3];
	public Bullet(){
		bulletMap[0] = NORMAL;
		bulletMap[1] = BLAST;
		bulletMap[2] = POISON;
		currBullet = 0;
		damageMap[0] = 1;
		damageMap[1] = 3;
		damageMap[2] = 1;
	}
	
	public void AssignBullet(int currBullet) {
		
		this.currBullet = currBullet;
	}

}
