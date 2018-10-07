package fisica;
import static java.lang.Math.*;
import static java.lang.System.out;

public class Blanco {
	private double radio;
	private double posX;
	private double posY;
	private double angulo;
	
	public Blanco(double r) {
		this.radio = r; //La varilla del blanco es 3 metros (su radio de movimiento)
	}
	
	public void oscilarBlanco() {
		long tiempo = 0, tIni, tFin;
		double a = 0;
		
		tIni = System.currentTimeMillis();
		
		while(tiempo < 10000) {
			
			this.angulo = 20 * sin(a); //Para que el angulo oscile entre 20 y -20
			
			//Es mas facil trabajar con
			//coordenadas polares
			
			this.posX = this.radio * sin(this.angulo);	
			this.posY = this.radio * (1 - cos(this.angulo));	//El centro del blanco esta a 1 metro del piso
			
			a += 0.1;
			tFin = System.currentTimeMillis();
			tiempo = tFin - tIni;

			out.println("Posicion X = " + this.posX);
			out.println("Posicion Y = " + this.posY);
		}
	}

	public double getPosX() {
		return posX;
	}
	
	public double getPosY() {
		return posY;
	}
}