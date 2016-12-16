import processing.core.PApplet;

public class PingPong extends PApplet {
	//Variables
		int x;
		int y;
		int vx;
		int vy;
		int yb1;
		int yb2;
		//control de teclas pulsadas
		boolean keyS,keyW,keyUP,keyDOWN;
		
	//Metodos
	public void settings(){
		size(690,600);
		x=100;
		y=100;
		vx=5;
		vy=5;
	}
	public void draw(){
		background(0,0,0);
		noStroke();
		fill(0,255,0);
		ellipse(x,y,45,45);
		fill(0,0,255);
		
		//calcular posicion palas
		calcPosPalas();
		
		rect(10,yb1,30,180);
		rect(width-40,yb2,30,180);
		x=x+vx;
		y=y+vy;
		if(x-22<40 && y+22>yb1 && y-22<yb1+180){
			vx=vx*-1;
		}
		if(x+22>650 && y+22>yb2 && y-22<yb2+180){
			vx=vx*-1;
		}
		if(x>width || x<0){
			x=width/2;
		}
		if(y>height || y<0){
			vy=vy*-1;
		}	
		
	}
	public void keyPressed(){
		if(key=='s'){
			keyS=true;
		}
		if(key=='w'){
			keyW=true;
		}
		if(keyCode==DOWN){
			keyDOWN=true;
		}
		if(keyCode==UP){
			keyUP=true;
		}
	}
	public void keyReleased(){
		if(key=='s'){
			keyS=false;

		}
		if(key=='w'){
			keyW=false;
		}
		if(keyCode==DOWN){
			keyDOWN=false;
		}
		if(keyCode==UP){
			keyUP=false;
		}
	}
	
private void calcPosPalas(){
	if(keyS){
		yb1=yb1+10;
	}
	if(keyW){
		yb1=yb1-10;
	}
	if(keyDOWN){
		yb2=yb2+10;
	}
	if(keyUP){
		yb2=yb2-10;
	}
}
public static void main(String[] args) {
		
		PApplet.main("PingPong");
}
}
