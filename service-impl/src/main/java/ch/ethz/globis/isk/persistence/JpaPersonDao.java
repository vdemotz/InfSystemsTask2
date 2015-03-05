package ch.ethz.globis.isk.persistence;

import java.util.HashMap;
import java.util.Map;

import ch.ethz.globis.isk.domain.Person;
import ch.ethz.globis.isk.domain.jpa.JpaPerson;
import ch.ethz.globis.isk.util.Filter;
import ch.ethz.globis.isk.util.Operator;

public class JpaPersonDao extends JpaDao<String, Person> implements PersonDao  {

    @Override
    protected Class<JpaPerson> getStoredClass() {
        return JpaPerson.class;
    }

    @Override
    public Person createEntity() {
        return new JpaPerson();
    }

    @Override
    public Person findOneByName(String name) {
        Map<String, Filter> filterMap = new HashMap<>();
        filterMap.put("name", new Filter(Operator.EQUAL, name));
        //TODO it would be simpler to create constants, right?
        return findOneByFilter(filterMap);
    }

}
