package ch.ethz.globis.isk.domain.jpa;

import ch.ethz.globis.isk.domain.Journal;
import ch.ethz.globis.isk.domain.JournalEdition;
import java.util.HashSet;
import java.util.Set;

public class JpaJournal implements Journal {

    private String id;
    private String name;

    private Set<JournalEdition> editions;

    public JpaJournal() {
        this.editions = new HashSet<>();
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

    public Set<JournalEdition> getEditions() {
        return editions;
    }

    public void addEdition(JournalEdition edition) {
        editions.add(edition);
    }
    public void setEditions(Set<JournalEdition> editions) {
        this.editions = editions;
    }
}