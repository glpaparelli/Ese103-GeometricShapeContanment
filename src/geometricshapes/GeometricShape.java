package geometricshapes;

public abstract class GeometricShape {
	
	abstract double getXMin();
	abstract double getXMax();
	abstract double getYMin();
	abstract double getYMax();
	
	public boolean Contains(GeometricShape s){
		
		boolean contiene = false;
		
		if (this.getXMin() <= s.getXMin() && this.getXMax() >= s.getXMax()
		    && this.getYMin() <= s.getYMin() && this.getYMax() >= s.getYMax()){
				
				contiene = true;
		}	
		
		return contiene;
	}
}
