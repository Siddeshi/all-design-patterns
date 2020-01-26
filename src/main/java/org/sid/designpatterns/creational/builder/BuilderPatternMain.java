package org.sid.designpatterns.creational.builder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuilderPatternMain {

    @GetMapping("/builderpattern/{name}/{age}")
    public User getUserDetails(@PathVariable String name, @PathVariable int age) {
        return new User.UserBuilder().name(name).age(age).build();
    }
}
