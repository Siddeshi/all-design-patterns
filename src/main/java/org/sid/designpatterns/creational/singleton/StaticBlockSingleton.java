package org.sid.designpatterns.creational.singleton;

/**
 * We can use the fact that static blocks are executed during the loading of a class, even before the constructor is called.
 *
 * @author siddesh
 * @sicne 26-Jan-2020
 */
public class StaticBlockSingleton {
    private static volatile StaticBlockSingleton staticBlockSingleton = null;

    static {
        try {
            //executed while loading the class
            staticBlockSingleton = new StaticBlockSingleton();
        } catch (Exception ex) {
            throw new RuntimeException("exception occured during initializing an instance");
        }
    }

    private StaticBlockSingleton() {

    }

    /**
     * @return StaticBlockSingleton
     */
    public static StaticBlockSingleton getInstance() {
        return staticBlockSingleton;
    }


    /**
     * @return String
     */
    public String display() {
        return "in display method of static block singleton creation class";
    }

}
