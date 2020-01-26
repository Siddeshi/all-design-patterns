package org.sid.designpatterns.creational.singleton;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Testing each type of singleton design pattern
 *
 * @author siddesh
 * @since 26-Jan-2020
 */
@RestController
public class SigletonMain {

    EagerSingleton eagerSingleton = EagerSingleton.getInstance();

    LazySingleton lazySingleton = LazySingleton.getInstance();

    StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();

    BillPughSingleton billPughSingleton = BillPughSingleton.getInstace();

    /**
     * Fetches the value of a string but the drawback is
     * The instance is created irrespective of it is required in runtime or not.
     *
     * @return String
     */
    @GetMapping("/eagersingleton")
    public ResponseEntity<String> eagerSingletonCreation() {
        return new ResponseEntity<>(eagerSingleton.display(), HttpStatus.OK);
    }

    /**
     * Demo for lazy singleton initialization
     *
     * @return String
     */
    @GetMapping("/lazysingleton")
    public ResponseEntity<String> lazySingletonCreation() {
        return new ResponseEntity<>(lazySingleton.display(), HttpStatus.OK);
    }

    /**
     * Demo for static block singleton initialization
     *
     * @return String
     */
    @GetMapping("/staticblocksingleton")
    public ResponseEntity<String> staticBlockSingletonCreation() {
        return new ResponseEntity<>(staticBlockSingleton.display(), HttpStatus.OK);
    }

    /**
     * Demo for how to create a singleton instance using bill pugh approach
     *
     * @return String
     */
    @GetMapping("/billpughsingleton")
    public ResponseEntity<String> billPughSingletonCreation() {
        return new ResponseEntity<>(billPughSingleton.display(), HttpStatus.OK);
    }
}
