package algorithm;

public class Lotto {
	public static void main(String[] args) {
		int[] balls = new int[45];

		for(int i=0; i<balls.length; i++) {
			int randomnum = (int)(Math.random() * 43) + 1; //Math.random() * 10 + n : 0 부터 n-1 까지 랜덤 숫
			balls[i] = randomnum; //1 ~ 43숫자가 랜덤으로 생성
			
			//중복 없는
			for (int j = 0; j < i; j++) {
				if (balls[i] == balls[j]) {
					i--;
					break;
				}
			}
			System.out.println(balls[i]);

		}
	}

}
