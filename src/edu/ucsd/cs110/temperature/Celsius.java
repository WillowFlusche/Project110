package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Celsius temp = new Celsius(this.getValue());
        return temp;
    }

    @Override
    public Temperature toFahrenheit() {
        float ftemp = (float) (this.getValue()*1.8 + 32);
        Fahrenheit temp = new Fahrenheit(ftemp);
        return temp;
    }

    public String toString()
    {
        // TODO: Complete this method
        return ""+this.getValue()+ " C";
    }
}