package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Food extends Rectangle{
	private int posX, posY;
	
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public Food(int x, int y) {
		super(Main_UI.block_size,Main_UI.block_size);
		
		posX = x;
		posY = y;
		setTranslateX(posX*Main_UI.block_size);
		setTranslateY(posY*Main_UI.block_size);
		
		setFill(Color.LIGHTGREEN);
		setStroke(Color.GREEN);
	}
	
}
