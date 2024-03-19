package com.PredatorPrey;

public class Entity {
    int id;
    int target;
    int flee;
    int client;
    int assassin;
    double maxForce = 1.0; //This represents the maximum thrust that an entity can exert upon itself
    int size = 1; //Will be represented as a radius when drawn
    double mass = 3.14 * (size * size); //naive mass calculation, based on volume
    private double maxSpeed = 100.0;
    Vector currentPosition;
    Vector currentVelocity;
    Vector previousPosition;
    Vector futureGuess = new Vector(2 * currentPosition.x - previousPosition.x, 2*currentPosition.y - previousPosition.y);
    Vector nextPosition;
    int red;
    int green;
    int blue;
    
}
