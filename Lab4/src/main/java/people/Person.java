package people;

import lombok.Data;

public @Data
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
