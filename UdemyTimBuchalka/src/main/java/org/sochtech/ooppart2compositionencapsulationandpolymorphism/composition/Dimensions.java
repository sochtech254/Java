package org.sochtech.ooppart2compositionencapsulationandpolymorphism.composition;

public class Dimensions
{
    private int width;
    private int height;
    private int depth;

    public Dimensions(int width, int depth, int height)
    {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public int getDepth()
    {
        return depth;
    }
}
