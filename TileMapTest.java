public class TileMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TileMap map = new TileMap(32, 32);
		map.fillRandom(50);
		
		for(int i = 0; i < map.getWidth(); i++) {
			for (int j = 0; j < map.getHeight(); j++) {
				System.out.print(map.getTile(i, j));
			}
			System.out.print('\n');
		}
	}

}