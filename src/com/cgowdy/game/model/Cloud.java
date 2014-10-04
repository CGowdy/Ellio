package com.cgowdy.game.model;

import com.cgowdy.framework.util.RandomNumberGenerator;

public class Cloud {
	private float x, y;
	private int velX = RandomNumberGenerator.getRandIntBetween(-15, -8);

	public Cloud(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void update(float delta) {
		x += velX * delta;
		if (x <= -200) {
			x += 1000;
			y = RandomNumberGenerator.getRandIntBetween(20, 100);
			velX = RandomNumberGenerator.getRandIntBetween(-15, -8);
		}
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}
}
