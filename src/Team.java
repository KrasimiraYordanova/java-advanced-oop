import Person.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {

    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name) {
        setName(name);
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  addPlayer(Person person) {
        if(person.getAge() < 40) {
            firstTeam.add(person);
        } else {
            reserveTeam.add(person);
        }
    }

    public List<Person> getFirstTeam() {

        // this way we are returning the copy of the List, but a copy that does not allow us to call
        // methods that would modify it, such as clear() method;
        // if we have team.getFirstTeam().clear() - that won't modify/empty our list
        return Collections.unmodifiableList(firstTeam);
    }

    public List<Person> getReserveTeam() {

        return Collections.unmodifiableList(reserveTeam);
    }
}
