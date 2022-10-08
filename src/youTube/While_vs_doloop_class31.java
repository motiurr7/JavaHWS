package youTube;

public class While_vs_doloop_class31 {
	public static void main(String[] args) {
		int x=1;
		while (x<=5) {//while loop doesn't executed it condition is false.
			System.out.println("TV");
			x++;
		}
		//the do while executed at lest one times even if the condition false.
		int y=1;
		do {
			System.out.println("BAngladesh");
			y++;
		}while (y<=10);
	}

}
