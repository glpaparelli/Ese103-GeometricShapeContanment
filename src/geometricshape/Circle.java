package geometricshape;

//import triangle.Triangle;
//import circle.Circle;

public class Circle {



	private double xc;
	private double yc;
	private double r;
	
	/**
	 * questo metodo ritorna la coordinata x 
	 * del centro del cerchio
	 * @return
	 */
	public double getXC() {
		return xc;
	}
	public void setXC(double xc) {
		this.xc = xc;
	
	}
	
	/**
	 * questo metodo ritorna la coordinata y
	 * del centro del cerchio
	 */
	public double getYC() {
		return yc;
	}
	
	public void setYC(double yc) {
		this.yc = yc;
	}
	
	/**
	 * questo metodo ritorna il raggio 
	 * del cerchio
	 * @return
	 */
	public double getR() {
		
		return r;
	}
	public void setR(double r) {
		if (r<=0)
			throw new IllegalArgumentException();
		this.r = r;
	}
	
	/**
	 * questo metodo restituisce la coordinata
	 * x del vertice in basso a sinistra 
	 * della BB
	 * @return
	 */
	public double getXMin() {
		
		return this.xc - this.r;
	}
	
	/**
	 * questo metodo restituisce la coordinata
	 * y del vertice in basso a sinistra 
	 * della BB
	 * @return
	 */
	public double getYMin() {
		
		return this.yc - this.r;
	}
	
	/**
	 * questo metodo restituisce la coordinata x in alto 
	 * a destra della BB
	 * @return
	 */
	public double getXMax() {
		
		return this.xc + this.r;
	}
	
	/**
	 * questo metodo restituisce la coordinata y
	 * in alto a destra della BB
	 * @return
	 */
	public double getYMax() {
		
		return this.yc + this.r;
	}
	
	/**
	 * questo metodo confronta le bounding box 
	 * di due cerchi e confrontandole determina 
	 * se una � centenuta nell'altra.
	 * @param c
	 * @return
	 */
	public boolean Contains (Circle c) {
		
		boolean contiene;
		contiene = false;
		
		if (this.getXMin() <= c.getXMin() && this.getXMax() >= c.getXMax()
		    && this.getYMin() <= c.getYMin() && this.getYMax() >= c.getYMax()){
			
			contiene = true;
		}
		
		
		return contiene;
	}
	

	public boolean Contains (Triangle t1) {
		
		boolean contiene;
		contiene = false;
		
		if (this.getXMin() <= t1.getXMin() && this.getXMax() >= t1.getXMax()
		    && this.getYMin() <= t1.getYMin() && this.getYMax() >= t1.getYMax()){
			
			contiene = true;
		}
		
		
		return contiene;
}
	/**
	 * metodo costruttuore
	 * @param xc
	 * @param yc
	 * @param r
	 */
	
	public Circle(double xc, double yc, double r) {
		super();
		this.xc = xc;
		this.yc = yc;
		if (r<=0)
			throw new IllegalArgumentException();	
		this.r = r;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(r);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xc);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yc);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	/**
	 * metodo che compara istanze per verificare 
	 * se sono uguali
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		if (Double.doubleToLongBits(xc) != Double.doubleToLongBits(other.xc))
			return false;
		if (Double.doubleToLongBits(yc) != Double.doubleToLongBits(other.yc))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Circle [xc=" + xc + ", yc=" + yc + ", r=" + r + "]";
	}
}
