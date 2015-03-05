package ch.ethz.globis.isk.domain.jpa;

import ch.ethz.globis.isk.domain.Conference;
import ch.ethz.globis.isk.domain.ConferenceEdition;

import java.util.HashSet;
import java.util.Set;

public class JpaConference implements Conference {

    private String id;
    private String name;

    Set<ConferenceEdition> editions;

    public JpaConference() {
        editions = new HashSet<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ConferenceEdition> getEditions() {
        return editions;
    }

    public void setEditions(Set<ConferenceEdition> editions) {
        this.editions = editions;
    }
}