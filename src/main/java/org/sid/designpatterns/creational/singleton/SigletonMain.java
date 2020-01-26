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

    /**
     * Fetches the value of a string but the drawback is
     * The instance is created irrespective of it is required in runtime or not.
     *
     * @return String
     */
    @GetMapping("/eagersingleton")
    public ResponseEntity<String> eagerDisplay() {
        return new ResponseEntity<>(eagerSingleton.display(), HttpStatus.OK);
    }

    /**
     * Demo for lazy singleton initialization
     *
     * @return String
     */
    @GetMapping("/lazysingleton")
    public ResponseEntity<String> lazyDisplay() {
        return new ResponseEntity<>(lazySingleton.display(), HttpStatus.OK);
    }
}
