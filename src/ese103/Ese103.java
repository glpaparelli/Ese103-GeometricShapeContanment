package ese103;

import geometricshapes.*;

public class Ese103 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		testTriangle();
		testRectangle();
		testCircle();
		testSquare();
//################### Verifica Contains ####################################		
		
		System.out.println("Verifica dei metodi Contains");
		
		GeometricShape shapeArray[] = new GeometricShape[4];
		shapeArray[0] = new Circle (0,0,1);
		shapeArray[1] = new Rectangle (0,0,3,2);
		shapeArray[2] = new Square  (0,0,1);
		shapeArray[3] = new Triangle (1,0,2);
		
		
		GeometricShape a,b;
		
		for(int i=0;i<shapeArray.length;i++){
			a = shapeArray[i];
			for (int j=0;j<shapeArray.length;j++){
				b=shapeArray[j];
				if(a!=b){
					if(a.Contains(b)){
						System.out.println(a+"contiene"+b);
					}
					else{
						System.out.println(a+"NON contiene"+b);
					}
				}
			}
		}
	}
//###################  Termine Verifica Contains ###############################	
	
//####################### Test Metodi Triangle #################################		
	
			
	private static void testTriangle() throws Exception {
	
		
		System.out.println("VERIFICA METODI TRIANGLE");
		Triangle t;
		
		try{
			t = new Triangle(0,0,0);
			throw new Exception("errore costruttore");
		}
		catch(IllegalArgumentException e){
		}
		
		
		
		t = new Triangle(3,4,5);
		if(t.getXV() != 3){
			throw new Exception("costruttore o metodo get sbagliato");
		}
		if(t.getYV() != 4){
			throw new Exception("costruttore o metodo get sbagliato");
		}
		if(t.getL() != 5){
			throw new Exception("costruttore o metodo get sbagliato");
		}
		
		t.setXV(5);
		t.setYV(7);
		t.setL(9);
		
		if(t.getXV() != 5){
			throw new Exception("metodo set errato");
		}
		if(t.getYV() != 7){
			throw new Exception("metodo set errato");
		}
		if(t.getL() != 9){
			throw new Exception("metodo set errato");
		}
		try{
			t.setL(-2);
			throw new Exception("lato negativo, errore");
		}
		catch(IllegalArgumentException e){
			
		}
		
		System.out.println("Verifica triangle superata");
	}

//##############Termine Verifica Triangle#################################

	
//#############Verifica Rectangle#########################################	
	private static void testRectangle() throws Exception {
		System.out.println("VERIFICA METODI Rectangle");
		Rectangle t;
		
		try{
			t = new Rectangle(0,0,0,0);
			throw new Exception("errore costruttore");
		}
		catch(IllegalArgumentException e){
		}
		
		
		
		t = new Rectangle(3,4,5,6);
		if(t.getXV() != 3){
			throw new Exception("costruttore o metodo get sbagliato");
		}
		if(t.getYV() != 4){
			throw new Exception("costruttore o metodo get sbagliato");
		}
		if(t.getxSideLength() != 5){
			throw new Exception("costruttore o metodo get sbagliato");
		}
		if(t.getySideLength() != 6){
			throw new Exception("costruttore o metodo get sbagliato");
		}
		
		t.setXV(5);
		t.setYV(7);
		t.setxSideLength(9);
		t.setySideLength(7);
		
		if(t.getXV() != 5){
			throw new Exception("metodo set errato");
		}
		if(t.getYV() != 7){
			throw new Exception("metodo set errato");
		}
		if(t.getxSideLength() != 9){
			throw new Exception("metodo set errato");
		}
		if(t.getySideLength() != 7){
			throw new Exception("metodo set errato");
		}
		try{
			t.setxSideLength(-2);
			throw new Exception("lato negativo, errore");
		}
		catch(IllegalArgumentException e){
			
		}
		
		System.out.println("Verifica Rectangle superata");
	}

//#####################Verfica CIRCLE#################################	
	
	static public void testCircle() throws Exception{
		
		System.out.println("VERIFICA METODI CIRCLE");
		Circle t;
		
		try{
			t = new Circle(0,0,0);
			throw new Exception("errore costruttore");
		}
		catch(IllegalArgumentException e){
		}
		
		
		
		t = new Circle(3,4,5);
		if(t.getXC() != 3){
			throw new Exception("costruttore o metodo get sbagliato");
		}
		if(t.getYC() != 4){
			throw new Exception("costruttore o metodo get sbagliato");
		}
		if(t.getR() != 5){
			throw new Exception("costruttore o metodo get sbagliato");
		}
		
		t.setXC(5);
		t.setYC(7);
		t.setR(9);
		
		if(t.getXC() != 5){
			throw new Exception("metodo set errato");
		}
		if(t.getYC() != 7){
			throw new Exception("metodo set errato");
		}
		if(t.getR() != 9){
			throw new Exception("metodo set errato");
		}
		try{
			t.setR(-2);
			throw new Exception("lato negativo, errore");
		}
		catch(IllegalArgumentException e){
			
		}
		
		System.out.println("Verifica Cricle superata");
	
	
	}

	
//######################Termine verifica Rectangle################	
	
//######################Verifica Quadrato#########################
	
	static public void testSquare() throws Exception{
		System.out.println("VERIFICA METODI SQUARE");
		Square t;
		
		try{
			t = new Square(0,0,0);
			throw new Exception("errore costruttore");
		}
		catch(IllegalArgumentException e){
		}
		
		t = new Square(3,4,5);
		if(t.getXV() != 3){
			throw new Exception("costruttore o metodo get sbagliato");
		}
		if(t.getYV() != 4){
			throw new Exception("costruttore o metodo get sbagliato");
		}
		if(t.getL() != 5){
			throw new Exception("costruttore o metodo get sbagliato");
		}
		
		t.setXV(5);
		t.setYV(7);
		t.setL(9);
		
		if(t.getXV() != 5){
			throw new Exception("metodo set errato");
		}
		if(t.getYV() != 7){
			throw new Exception("metodo set errato");
		}
		if(t.getL() != 9){
			throw new Exception("metodo set errato");
		}
		try{
			t.setL(-2);
			throw new Exception("lato negativo, errore");
		}
		catch(IllegalArgumentException e){
			
		}
		
		System.out.println("Verifica Square superata");

	}
	
	
	
}