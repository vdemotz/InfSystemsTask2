package ch.ethz.globis.isk.domain;

import ch.ethz.globis.isk.domain.Publication;
import ch.ethz.globis.isk.domain.Publisher;

import java.util.HashSet;
import java.util.Set;

public class DomainPublisher extends DomainDomainObject implements Publisher {

    private String name;

    private Set<Publication> publications;

    public DomainPublisher() {
        publications = new HashSet<>();
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
        final StringBuffer sb = new StringBuffer("Publisher{");
        sb.append("id=").append(getId());
        sb.append(", name='").append(getName()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}