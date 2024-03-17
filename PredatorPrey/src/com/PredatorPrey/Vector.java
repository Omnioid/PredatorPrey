package com.PredatorPrey;

public class Vector {
    double x, y;
    
    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
   public Vector add(Vector other) {
       return new Vector(this.x + other.x, this.y + other.y);
   }
   
    public Vector subtract(Vector other) {
         return new Vector(this.x - other.x, this.y - other.y);
    }
    
    public Vector scale(double factor) {
        return new Vector(this.x * factor, this.y * factor);
    }
    
    public Vector normalize() {
        double magnitude = Math.sqrt(x * x + y * y);
        return new Vector(x / magnitude, y / magnitude);
    }
    
    
}
