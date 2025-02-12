package org.sochtech.ooppart2compositionencapsulationandpolymorphism.composition;

public class Monitor
{
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, Resolution nativeResolution, int size, String manufacturer)
    {
        this.model = model;
        this.nativeResolution = nativeResolution;
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public void drawPixel(int x, int y, String color)
    {
        System.out.println("Drawing pixel at " + x + "," + y + " in colour " + color);
    }

    public String getModel()
    {
        return model;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public int getSize()
    {
        return size;
    }

    public Resolution getNativeResolution()
    {
        return nativeResolution;
    }
}
