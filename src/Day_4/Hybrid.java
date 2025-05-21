package Day_4;
class Movies{
	void genre()
	{
		System.out.println("Crime and murder");
	}
}
class hit extends Movies{
	void action()
	{
		System.out.println("investigation");
	}
}
class Hero extends hit{
	void name()
	{
		System.out.println("nani");
	}
}
class Heroine extends Hero{
	void acting()
	{
		System.out.println("Excellent");      //hybrid inheritance
	}
}
public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Hero h1=new Hero();
        Heroine h2=new Heroine();
        h1.action();
        h1.genre();
        h1.name();
        h2.acting();
	}
}
