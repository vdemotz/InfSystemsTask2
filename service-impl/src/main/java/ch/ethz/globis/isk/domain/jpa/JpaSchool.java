package ch.ethz.globis.isk.domain.jpa;

import ch.ethz.globis.isk.domain.Publication;
import ch.ethz.globis.isk.domain.School;
import java.util.HashSet;
import java.util.Set;

public class JpaSchool implements School {

    private String id;
    private String name;

    private Set<Publication> publications;

    public JpaSchool() {
        publications = new HashSet<>();
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

    @Override
    public Set<Publication> getPublications() {
        return publications;
    }

    @Override
    public void setPublications(Set<Publication> publications) {
        this.publications = publications;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("School{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}