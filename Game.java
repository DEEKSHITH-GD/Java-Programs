import java.util.*;

class Guesser
{
	int Gnum;
int GuessNum()
{
	System.out.println("Guesser guess the no: b/w 1-30");
	Scanner sc= new Scanner(System.in);
	Gnum = sc.nextInt();
	return Gnum;
}
}

class Player
{
	int pnum;
int playerNum()
{
	System.out.println("Player guess the no: b/w 1-30");
	Scanner sc= new Scanner(System.in);
	pnum = sc.nextInt();
	return pnum;
}
}

class Umpire{
	int guessernum;
	int player1num;
	int player2num;
	int player3num;

void collectGnum()
{
	Guesser g = new Guesser();
	guessernum = g.GuessNum();
}

void collectPnum()
{
	Player p1 = new Player();
	player1num = g.playerNum();
	Player p2 = new Player();
	player2num = g.playerNum();
	Player p3 = new Player();
	player3num = g.playerNum();
}
void compare(){
	if(guessernum == player1num)
	{
		System.out.println("P1 won");
	}
	if(guessernum == player2num)
	{
		System.out.println("P2 won");
	}
	if(guessernum == player3num)
	{
		System.out.println("P3 won");
	}
	else
	{
		System.out.println("Game Over");
	}
}
}

class game{
{
	public static void main(String[] args){
	Umpire u = new Umpire();
	u.collectGnum();
	u.collectPnum();
	u.compare();
}
}	
