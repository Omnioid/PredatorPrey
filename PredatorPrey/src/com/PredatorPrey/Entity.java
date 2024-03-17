package com.PredatorPrey;

public class Entity {
    int id;
    int target;
    int flee;
    int guard;
    int fear;
    Vector currentPosition;
    Vector currentVelocity;
    Vector previousPosition;
    Vector futureGuess = new Vector(2 * currentPosition.x - previousPosition.x, 2*currentPosition.y - previousPosition.y);
    Vector nextPosition;
    int red;
    int green;
    int blue;
    
}
