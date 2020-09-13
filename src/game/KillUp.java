package game;

import java.util.concurrent.ThreadLocalRandom;

public class KillUp {
	int x, y;

	public KillUp() {
		this.x = ThreadLocalRandom.current().nextInt(0, 15);
		this.y = ThreadLocalRandom.current().nextInt(0, 15);
	}

	public void reset() {
		this.x = ThreadLocalRandom.current().nextInt(0, 15);
		this.y = ThreadLocalRandom.current().nextInt(0, 15);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
