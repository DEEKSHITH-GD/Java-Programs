import java.util.*;

class Guesser
{
	int Gnum;
int GuessNum()
{
	System.out.print("Guesser guess the no: b/w 1-30: ");
	Scanner sc = new Scanner(System.in);
	Gnum = sc.nextInt();
	return Gnum;
}
}

class Player
{
	int pnum;
int playerNum()
{
	System.out.print("Player guess the no: b/w 1-30: ");
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
	player1num = p1.playerNum();
	Player p2 = new Player();
	player2num = p2.playerNum();
	Player p3 = new Player();
	player3num = p3.playerNum();
}

void compare(){
	if(guessernum == player1num)
	{
		System.out.println("Player 1 won");
	}
	else if(guessernum == player2num)
	{
		System.out.println("Player 2 won");
	}
	else if(guessernum == player3num)
	{
		System.out.println("Player 3 won");
	}
	else
	{
		System.out.println("Game Over!!!");
	}
}
}

public class Game{
	public static void main(String[] args){
	Umpire u = new Umpire();
	u.collectGnum();
	u.collectPnum();
	u.compare();
}
}
