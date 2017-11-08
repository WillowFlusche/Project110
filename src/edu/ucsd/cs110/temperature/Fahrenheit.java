package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float ctemp = (float) ((this.getValue() - 32) / 1.8);
        Celsius temp = new Celsius(ctemp);
        return temp;
    }

    @Override
    public Temperature toFahrenheit() {
        Fahrenheit temp = new Fahrenheit(this.getValue());
        return temp;
    }

    public String toString()
    {
        // TODO: Complete this method
        return ""+this.getValue()+ " F";
    }
}
