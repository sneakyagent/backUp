import java.util.Random;

public class TileMap {
	private char[][] _tiles;
	private int _width;
	private int _height;
	
	public int getWidth() { return _width; }
	public int getHeight() { return _height; }
	
	public TileMap(int width, int height) {
		_width = width;
		_height = height;
		
		_tiles = new char[width][height];
		for (int i = 0; i < _width; i++) {
			for (int j = 0; j < _height; j++) {
				System.out.println(Integer.toString(i) + " " + Integer.toString(j));
				_tiles[i][j] = ' ';
			}
		}
	}
	
	public void setTile(int x, int y, char value) {
		_tiles[x][y] = value;
	}
	
	public char getTile(int x, int y) {
		return _tiles[x][y];
	}
	
	/**
	 * Randomly fills the map with fillPct of walls
	 * @param fillPct
	 */
	public void fillRandom(int fillPct) {
		Random rng = new Random();
		
		for(int i = 0; i < _width; i++) {
			for(int j = 0; j < _height; j++) {
				_tiles[i][j] = ( rng.nextInt(101) <= fillPct ? '*' : ' ' );
			}
		}
	}
}