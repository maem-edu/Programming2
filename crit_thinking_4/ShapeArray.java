package crit_thinking_4;

public class ShapeArray {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[] {
	            new Sphere(8.2),
	            new Cylinder(4.5, 3.0),
	            new Cone(6.8, 2.2)
	        };

	        for (Shape shape : shapes) {
	            System.out.println(shape);
	        }
	    }
	}
