package hw3JavaVariables;

public class AboutMe {
	public int declareVariable; // variable declare
	public String name = "Motiur Rahman"; // rest of the variable initialize
	public char sex = 'M';
	public boolean married = true;
	public int marriedLife = 2;
	public float valueOfPi = 3.14159146162883f;
	public double valueOfPidouble = 3.14159146162883;
	public long billGatesMoney = 921211198387236244l;
	public short myMoney = 1234;

	public static void main(String[] args) {
		AboutMe Motiur = new AboutMe();
		System.out.println("Name:"+Motiur.name+"\nMarried:"+Motiur.myMoney);
		//System.out.println("My Name: " + Motiur.name +"\nMy Money:"+Motiur.myMoney +"\nI am married: "+Motiur.married);
	}

}
