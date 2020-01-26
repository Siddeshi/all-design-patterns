package org.sid.designpatterns.creational.singleton;


/**
 * In a singleton pattern, it restricts the creation of the instance until it is requested for first time.
 *
 * @author siddesh
 * @since 26-Jan-2020
 */
public class LazySingleton {

    private static volatile LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    /**
     * On the first invocation, the below method will check if the instance is already created using the instance variable.
     * If there is no instance i.e. the instance is null, it will create an instance and will return its reference.
     * If the instance is already created, it will simply return the reference of the instance.
     *
     * @return LazySingleton instance of this class itself;
     */
    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                //recheck the instance variable again in a synchronized block
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

    public String display() {
        return "in display method of lazy singleton class";
    }
}
