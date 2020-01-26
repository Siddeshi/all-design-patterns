package org.sid.designpatterns.creational.singleton;


/**
 * Initialization on demand approach, it suggests to use static inner class to initialize the object.
 *
 * @author siddesh
 * @since 26-Jan-2020
 */
public class BillPughSingleton {
    private BillPughSingleton() {

    }

    /**
     * Initializes instance on calling this method
     *
     * @return BillPughSingleton
     */
    public static BillPughSingleton getInstace() {
        return ObjectLoader.billPughInstance;
    }

    /**
     * @return String
     */
    public String display() {
        return "in display method of bill pugh singleton creation class";
    }

    //will not be executed unless called class
    private static class ObjectLoader {
        private static final BillPughSingleton billPughInstance = new BillPughSingleton();
    }
}
