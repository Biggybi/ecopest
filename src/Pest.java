public class Pest
{
	private int speed;
	private int zombie;
	private int x;
	private int y;

	public Pest(Grid grid)
	{
		zombie = 0;
		x = (int)(Math.random() * (grid.getX() - 1));
		y = (int)(Math.random() * (grid.getY() - 1));
	}

	public void moveTop(Grid grid)
	{
		if (x > 0 && grid.cellIsFree(x + 1, y))
			x -= 1;
	}
	public void moveBott(Grid grid)
	{
		if (x < grid.getX() && grid.cellIsFree(x + 1, y))
			x += 1;
	}
	public void moveLeft(Grid grid)
	{
		if (y > 0 && grid.cellIsFree(x, y - 1))
			y -= 1;
	}
	public void moveRight(Grid grid)
	{
		if (y < grid.getY() && grid.cellIsFree(x, y + 1))
			y += 1;
	}

	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	public void setZombie(int zombie)
	{
		this.zombie = zombie;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public int getSpeed()
	{
		return speed;
	}
	public int getZombie()
	{
		return zombie;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}

}
