package ch.ethz.globis.isk.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ch.ethz.globis.isk.domain.InProceedings;
import ch.ethz.globis.isk.domain.jpa.JpaInProceedings;
import ch.ethz.globis.isk.util.Filter;
import ch.ethz.globis.isk.util.Operator;

@Repository
public class JpaInProceedingsDao extends JpaDao<String, InProceedings> implements InProceedingsDao {

    @Override
    public InProceedings findOneByTitle(String title) {
        Map<String, Filter> filterMap = new HashMap<>();
        filterMap.put("title", new Filter(Operator.EQUAL, title));
        //TODO spotted!
        return findOneByFilter(filterMap);
    }

    @Override
    public List<InProceedings> findByProceedingsIdOrderByYear(String proceedingsId) {
        return queryByReferenceIdOrderByYear("InProceedings", "proceedings", proceedingsId);
        //TODO There... Again
    }

    @Override
    protected Class<JpaInProceedings> getStoredClass() {
        return JpaInProceedings.class;
    }

    @Override
    public InProceedings createEntity() {
        return new JpaInProceedings();
    }

}
