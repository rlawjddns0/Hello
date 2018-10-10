package sdfwfsdfag;

public class Rectangle {
   
	int x1,y1,x2,y2;
	
	Rectangle(){
		
	}
	Rectangle(int x1, int y1, int x2, int y2){
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	
	void set(int x1, int y1, int x2, int y2)
	{
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	int square() {
		return (x2-x1)*(y2-y1);
	}
	void show()
	{
		System.out.println("(x1,y1):"+x1+","+y1);
		System.out.println("(x2,y2):"+x2+","+y2);
		double S=square();
		System.out.println("≥–¿Ã:"+S);
		
	}
	boolean equals(Rectangle r) {
		if(r.square()==this.square())
			return true;
		else 
			return false;
	}
	
	
	
}
