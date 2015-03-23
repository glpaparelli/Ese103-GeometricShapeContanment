
package geometricshapes;

public class Triangle extends GeometricShape {


	private double xv;
	private double yv;
	private double l;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(l);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xv);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yv);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(l) != Double.doubleToLongBits(other.l))
			return false;
		if (Double.doubleToLongBits(xv) != Double.doubleToLongBits(other.xv))
			return false;
		if (Double.doubleToLongBits(yv) != Double.doubleToLongBits(other.yv))
			return false;
		return true;
	}
	public Triangle(double xv, double yv, double l) {
		this.xv = xv;
		this.yv = yv;
		
		if (l<=0)
			throw new IllegalArgumentException();
		this.l = l;
	}
	
	@Override
	public String toString() {
		return "Triangle [xv=" + xv + ", yv=" + yv + ", l=" + l + "]";
	}
	public double getXV() {
		return xv;
	}
	public void setXV(double xv) {
		this.xv = xv;
	}
	public double getYV() {
		return yv;
	}
	public void setYV(double yv) {
		this.yv = yv;
	}
	public double getL() {
		
		return l;
	}
	public void setL(double l) {
		if (l<=0)
			throw new IllegalArgumentException();
		this.l = l;
	}
	
	@Override public double getXMax(){
		
		return this.xv + this.l;
	}
	
	@Override public double getYMax(){
		
		return this.yv + this.l * ((Math.sqrt(3)/2));
	}
	
	@Override public double getYMin(){
		
		return this.yv;
	}
	
	@Override public double getXMin(){
		
		return this.xv;
	}
	
}


