package ese103;

import geometricshape.*; 

public class Ese103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c = new Circle(2.0,3.0,4.0);
		System.out.println("c: "+c);
		
		if(c.getXC()!=2){
			System.out.println("xc wrong");
		}
		if(c.getYC()!=3){
			System.out.println("yc wrong");
		}
		if(c.getR()!=4){
			System.out.println("r wrong");
		}
		
		c.setXC(9);
		c.setYC(7);
		c.setR(5);
		
		if(c.getXC()!=9){
			System.out.println("xc wrong");
		}
		if(c.getYC()!=7){
			System.out.println("yc wrong");
		}
		if(c.getR()!=5){
			System.out.println("r wrong");
		}
		
		
		Circle c1 = new Circle(2.0,3.0,4.0);
		System.out.println("c1: "+c1);
		
		
		System.out.println("C è uguale a C1?: "+ c.equals(c1));
		System.out.println("C contiene C1?:   "+ c.Contains(c1));
		System.out.println("C1 contiene C?:   "+ c1.Contains(c));
			
		
	/*	
		Triangle t = new Triangle(2.0,3.0,2.0);
		Triangle t1 = new Triangle (2.0,1.0,1.0);		
		System.out.println(""+t.Contains(t1));
	
		
		System.out.println(""+c.Contains(t));
	*/	
	}
}
