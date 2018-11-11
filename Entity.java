
public abstract class Entity
{
private int health;
private int actionPoints;
private int x;
private int y; 
private String name;
/**
 * @return the health
 */
public int getHealth( )
{
	return health;
}
/**
 * @param health the health to set
 */
public void setHealth( int health )
{
	this.health = health;
}
/**
 * @return the actionPotins
 */
public int getActionPotins( )
{
	return actionPoints;
}
/**
 * @param actionPotins the actionPotins to set
 */
public void setActionPotins( int actionPotins )
{
	this.actionPoints = actionPotins;
}
/**
 * @return the x
 */
public int getX( )
{
	return x;
}
/**
 * @param x the x to set
 */
public void setX( int x )
{
	this.x = x;
}
/**
 * @return the y
 */
public int getY( )
{
	return y;
}
/**
 * @param y the y to set
 */
public void setY( int y )
{
	this.y = y;
}
/**
 * @return the name
 */
public String getName( )
{
	return name;
}
/**
 * @param name the name to set
 */
public void setName( String name )
{
	this.name = name;
}
public Entity()
{
	super ( );
	 int health= -1;
	 int actionPotins=-1;
	 int x=-1;
	 int y=-1; 
	 String name= null;
	
	
}
public Entity(int health, int actionPotins, int x, int y, String name)
{
	super ( );
	this.health = health;
	this.actionPoints = actionPotins;
	this.x = x;
	this.y = y;
	this.name = name;
}






}
