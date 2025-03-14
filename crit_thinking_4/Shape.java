package crit_thinking_4;

public abstract class Shape {
	abstract double surface_area();
    abstract double volume();

    @Override
    public abstract String toString();
}

class Sphere extends Shape {
    double sphereRadius;

    public Sphere (double radius) {
        this.sphereRadius = radius;
    } 

    @Override
    public double surface_area() {
        double area = Math.pow(sphereRadius, 2) * 4 * Math.PI;
        return area;
    }

    @Override
    public double volume () {
        double vol = Math.pow(sphereRadius, 3) * (4.0 / 3.0) * Math.PI;
        return vol;
    }

    @Override
    public String toString() {
        return String.format("Sphere\n"
        		+ "Radius: %.2f\n"
        		+ "Surface Area: %.2f\n"
        		+ "Volume: %.2f\n", sphereRadius, surface_area(), volume());
    }
}

class Cylinder extends Shape {
    double cylRadius;
    double cylHeight;

    public Cylinder (double radius, double height) {
        this.cylRadius = radius;
        this.cylHeight = height;
    }

    @Override
    public double surface_area () {
        double area = (( 2.0 * cylRadius * cylHeight * Math.PI) + ( 2.0 * Math.PI * Math.pow(cylRadius, 2)));
        return area;
    }

    @Override
    public double volume () {
        double vol = Math.pow(cylRadius, 2) * cylHeight * Math.PI;
        return vol;
    }

    @Override
    public String toString() {
        return String.format("Cylinder\n"
        		+ "Radius: %.2f\n"
        		+ "Height: %.2f\n"
        		+ "Surface Area: %.2f\n"
        		+ "Volume: %.2f\n", cylRadius, cylHeight, surface_area(), volume());
    }
}

class Cone extends Shape {
    double coneRadius;
    double coneHeight;

    public Cone (double radius, double height) {
        this.coneRadius = radius;
        this.coneHeight = height;
    }

    @Override
    public double surface_area () {
        double area = (Math.PI * coneRadius * (coneRadius + (Math.sqrt (Math.pow(coneHeight, 2) + Math.pow(coneRadius, 2)))));
        return area;
    }

    @Override
    public double volume () {
        double vol = (Math.PI * Math.pow(coneRadius, 2) * (coneHeight / 3.0));
        return vol;
    }
    
    @Override
    public String toString() {
        return String.format("Cone\n"
        		+ "Radius: %.2f\n"
        		+ "Height: %.2f\n"
        		+ "Surface Area: %.2f\n"
        		+ "Volume: %.2f\n", coneRadius, coneHeight, surface_area(), volume());
    }
}
