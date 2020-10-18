public class RollingDice {
	public static void main(String[] args) {
		int rolls = 10000;
		int count = 0;
		for (int i=0; i < 1000; i++) {
			int dice1 = (int) (Math.random() * 10) % 6;
			int dice2 = (int) (Math.random() * 10) % 6;
			
			if (dice1 == dice2*2 || dice1*2==dice2) {
				count += 1;
			}
		}
		
		System.out.println(count);
	}
}
