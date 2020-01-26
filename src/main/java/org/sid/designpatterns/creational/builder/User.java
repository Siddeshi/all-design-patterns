package org.sid.designpatterns.creational.builder;

/**
 * The builder pattern, as name implies, is an alternative way to construct complex objects.
 * This should be used only when you want to build different immutable objects using same object building process.
 *
 * @author siddesh
 * @since 26-Jan-2020
 */
public class User {

    private String name;
    private int age;

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.age = userBuilder.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static class UserBuilder {
        private String name;
        private int age;

        public UserBuilder() {
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}