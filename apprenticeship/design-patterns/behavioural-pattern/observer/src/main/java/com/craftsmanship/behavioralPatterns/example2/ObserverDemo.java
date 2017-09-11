package com.craftsmanship.behavioralPatterns.example2;

/**
 * Observer design pattern, class inheritance vs type inheritance
 * <p>
 * SensorSystem is the "subject".  Lighting, Gates, and Surveillance are the "views". The subject is only coupled to the "abstraction" of AlarmListener.
 * <p>
 * An object's class defines how the object is implemented. In contrast, an object's type only refers to its interface. Class inheritance defines an object's implementation in terms of another object's
 * implementation. Type inheritance describes when an object can be used in place of another.
 */
public class ObserverDemo {

    public static void main(String[] args) {
        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.register(new Gates());
        sensorSystem.register(new Lighting());
        sensorSystem.register(new Surveillance());
        sensorSystem.soundTheAlarm();
    }
}