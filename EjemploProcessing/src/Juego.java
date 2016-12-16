import processing.core.PApplet;

public class Juego extends PApplet {
	//variables circulo
	private int rad = 25;
	private float xPos,yPos;
	private float xVelocidad=(float)10;
	private float yVelocidad=10;
	private int xDireccion=1;
	private int yDireccion=1;
	
	// variables rectangulos
	//rectangulo 1
	private int xPosRect=0;
	private int yPosRect;
	//rectangulo 2
	private int xPosRect2;
	private int yPosRect2;
	private int a;
	private int z;
	
	public static void main(String[] args) {
		
		PApplet.main("Juego");
		

	}
	
	public void settings(){
		
		
		size(500,400);
		
		yPosRect=height/2-50;
		
		
		yPosRect2=height/2-50;
		xPosRect2=width-20;
	}
	
	public void setup(){
		
		
		frameRate(30);
		fill(120,50,240);
		ellipseMode(RADIUS);
		//punto de inicio:
		xPos=width/2;
		yPos=height/2;
		
	}
	
	public void draw(){
		background(245);
		noStroke();
		
		xPos=xPos + (xDireccion * xVelocidad);
		yPos=yPos + (yDireccion * yVelocidad);
		
		if(xPos > width - rad || xPos < rad || xPos < xPosRect ) {xDireccion*=-1;}
		
		if(yPos > height - rad || yPos < rad) {yDireccion*=-1;}
		
		ellipse(xPos,yPos,rad,rad);
		rect(xPosRect,yPosRect,20,100);
		
		rect(xPosRect2,yPosRect2,20,100);
	
	}
	
	public void keyPressed(){
		
		if(keyCode==UP){
			yPosRect=yPosRect-30;
		}else if(keyCode==DOWN){
			yPosRect=yPosRect+30;
		}
		if(key=='a' || key=='A'){
			yPosRect=yPosRect-30;
		}else if(key=='z' || key=='Z'){
			yPosRect=yPosRect+30;
		}
	
	
	}
	
	
	public void move(){
		
		

		
	}

}
