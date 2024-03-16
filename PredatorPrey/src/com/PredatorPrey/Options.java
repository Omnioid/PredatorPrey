package com.PredatorPrey;

public class Options {
    

    private int windowWidth = 1000;
    private int windowHeight = 1000;
    private String windowTitle = "Current Settings: ";
    private int entityCount = 4;
    private double thrust = 1.0;
    private double friction = 0.01;
    private double maxSpeed = 100.0;
    private int drawStyle = 0;
    private int drawSize = 1;
    private int drawColor = 0;
    private boolean wallBounce = false;
    private boolean showCenter = false;
    private boolean traceCenter = false;

    public Options () {
        
    }
    
    public int getWindowWidth() {
        return windowWidth;
    }

    public void setWindowWidth(int windowWidth) {
        this.windowWidth = windowWidth;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public void setWindowHeight(int windowHeight) {
        this.windowHeight = windowHeight;
    }

    public String getWindowTitle() {
        return windowTitle;
    }

    public void setWindowTitle(String title) {
        this.windowTitle = title;
    }

    public int getEntityCount() {
        return entityCount;
    }

    public void setEntityCount(int count) {
        this.entityCount = count;
    }

    public double getThrust() {
        return thrust;
    }

    public void setThrust(double thrust) {
        this.thrust = thrust;
    }

    public double getFriction() {
        return friction;
    }

    public void setFriction(double friction) {
        this.friction = friction;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getDrawStyle() {
        return drawStyle;
    }

    public void setDrawStyle(int drawStyle) {
        this.drawStyle = drawStyle;
    }

    public int getDrawSize() {
        return drawSize;
    }

    public void setDrawSize(int drawSize) {
        this.drawSize = drawSize;
    }

    public int getDrawColor() {
        return drawColor;
    }

    public void setDrawColor(int drawColor) {
        this.drawColor = drawColor;
    }

    public boolean getWallBounce() {
        return wallBounce;
    }

    public void setWallBounce(boolean wallBounce) {
        this.wallBounce = wallBounce;
    }

    public boolean getShowCenter() {
        return showCenter;
    }

    public void setShowCenter(boolean showCenter) {
        this.showCenter = showCenter;
    }

    public boolean getTraceCenter() {
        return traceCenter;
    }

    public void setTraceCenter(boolean traceCenter) {
        this.traceCenter = traceCenter;
    }
    

}
