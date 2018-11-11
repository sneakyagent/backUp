import java.util.ArrayList;

public class GameState
{
	private TileMap map;
	private Entity entity; 
	private ArrayList<Entity> objectsArray = new ArrayList<Entity> ();
	private PlayerController playerController;

	/**
	 * @return the map
	 */
	public TileMap getMap( )
	{
		return map;
	}
	/**
	 * @param map the map to set
	 */
	public void setMap( TileMap map )
	{
		this.map = map;
	}
	/**
	 * @return the entity
	 */
	public Entity getEntity( )
	{
		return entity;
	}
	/**
	 * @param entity the entity to set
	 */
	public void setEntity( Entity entity )
	{
		this.entity = entity;
	}
	/**
	 * @return the objects
	 */
	public ArrayList<Entity> getObjects( )
	{
		return objectsArray;
	}
	/**
	 * @param objects the objects to set
	 */
	public void setObjects( ArrayList<Entity> objects )
	{
		this.objectsArray = objects;
	}
	public GameState()
	{
		super ( );
		this.map = null;
		this.entity = null;
		this.objectsArray = null;
	playerController=	new PlayerController ( );
	}
	public void addEntity( Entity entity )
	{
		objectsArray.add (  entity);
	}
	
	public void update(char input)
	{
		
	}
	
	
/*	
	public void think(char input )
	{
		char vaild;
		if(entity.getClass ( ).isInstance ( "Player" ))
		{
			vaild= pollInput(input);
		}
			else 
			{
				System.out.println ( "No go" );
			}
			
		}
		else {
			vaild= collision(input);	
		}
		
	}
	*/
	public char pollInput(char ch)
	{
		char returnChar = 'n';
		switch (ch)
		{
			case 'w':
				playerAction(entity.getX ( ),entity.getY ( )-1);
				break;
			case 'a':
				playerAction(entity.getX ( ),entity.getY ( )-1);
				break;
			case 's':
				playerAction(entity.getX ( ),entity.getY ( )-1);
				break;
			case 'd':
				playerAction(entity.getX ( ),entity.getY ( )-1);
				break;
		}
		
		return returnChar;
		
	}
	
	
	public void playerAction(int x , int y)
	{
		int moveX;
		int moveY;
		boolean attack = false;
		for (Entity e: objectsArray) 
		{
			if(e.getX ( ) == entity.getX ( )  && e.getY( ) == entity.getY ( ))
			{
				//attack
				attack = true;
			}	
		}

	
		
		
		if( attack == false &&  map.getTile ( x, y ) == ' ' )
		{
			entity.setX ( x );
			entity.setY ( y );
		}
	}

}
