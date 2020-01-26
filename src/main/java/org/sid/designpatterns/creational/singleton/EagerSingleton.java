package org.sid.designpatterns.creational.singleton;


/**
 * This is a design pattern where an instance of a class is created much before it is actually required.
 * Mostly it is done on system startup.
 * In an eager initialization singleton pattern, the singleton instance is created irrespective of
 * whether any other class actually asked for its instance or not.
 *
 * @author siddesh
 * @since 26-jan-2020
 */
public class EagerSingleton {
    private static volatile EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return eagerSingleton;
    }

    public String display() {
        return "in display method of eager singleton class";
    }
}
