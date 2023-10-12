
package ht1;


public class MCalculate {
    public static void main(String[] args) {
        // Diameter of the Earth in miles
        double diaEarth = 7600.0;

        // Diameter of the Sun in miles
        double diaSun = 865000.0;

        // Calculate the volume of the Earth in cubic miles
        double radEarth = diaEarth / 2.0;
        double volumeEarth = (4.0 / 3.0) * Math.PI * Math.pow(radEarth, 3);

        // Calculate the volume of the Sun in cubic miles
        double radSun = diaSun / 2.0;
        double volumeSun = (4.0 / 3.0) * Math.PI * Math.pow(radSun, 3);

        // Calculate the ratio of the volume of the Sun to the volume of the Earth
        double ratio = volumeSun / volumeEarth;

    
        System.out.println("The Volume of the Earth: " + volumeEarth + " cubic miles");
        System.out.println("The Volume of the Sun: " + volumeSun + " cubic miles");
        System.out.println("The Ratio of Sun's volume to Earth's volume: " + ratio);
    }
}

