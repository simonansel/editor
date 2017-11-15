package org.ulco;

abstract public class GraphicsObject {
    public GraphicsObject() {
        m_ID = ++ID.ID;
    }

    abstract public GraphicsObject copy();

    public int getID() {
        return m_ID;
    }

    abstract boolean isClosed(Point pt, double distance);

    abstract void move(Point delta);

    public int size() { return 1; }

    public boolean isGroup(){return false;}

    abstract public String toJson();

    abstract public String toString();

    protected int m_ID;
}
