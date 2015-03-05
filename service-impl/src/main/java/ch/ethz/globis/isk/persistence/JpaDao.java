package ch.ethz.globis.isk.persistence;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;
import com.db4o.query.Query;

import ch.ethz.globis.isk.config.PersistenceConfig;
import ch.ethz.globis.isk.domain.DomainObject;
import ch.ethz.globis.isk.util.Filter;
import ch.ethz.globis.isk.util.OrderFilter;

@Repository
public abstract class JpaDao<K extends Serializable, T extends DomainObject> implements Dao<K, T> {
	
    @Autowired
    @Qualifier(PersistenceConfig.OC_QUALIFIER)
    ObjectContainer oc;

    @Override
    public long countAllByFilter(Map<String, Filter> filterMap) {
    	
//    	//actually, should be recursiv
//    	Query query = oc.query();
//    	query.constrain(this.getClass());
//    	String[] set = (String[]) filterMap.keySet().toArray();
//    	for (int i = 0; i < set.length; i++) {
//    		query.descend(set[i]).constrain(filterMap.get(set[i]));
//    		
//    	}
//    	
//    	return query.execute().size();
    	return -1;
    }

    @Override
    public long count() {
    	return -1;
    }

    @Override
    public Iterable<T> findAll() {
        return null;
    }

    @Override
    public T findOne(K id) {
    	return null;
    }

    @Override
    public T findOneByFilter(Map<String, Filter> filterMap) {
    	return null;
    }

    @Override
    public Iterable<T> findAllByFilter(Map<String, Filter> filterMap) {
    	return null;
    }

    @Override
    public Iterable<T> findAllByFilter(Map<String, Filter> filterMap, int start, int size) {
    	return null;
    }

    @Override
    public Iterable<T> findAllByFilter(Map<String, Filter> filterMap,
                                       List<OrderFilter> orderList,
                                       int start, int size) {
    	return null;
    }

    @Override
    public Iterable<T> findAllByFilter(Map<String, Filter> filterMap,
                                       List<OrderFilter> orderList) {
    	return null;
    }

    @Override
    public <S extends T> Iterable<S> insert(Iterable<S> entities) {
    	return null;
    }

    @Override
    public <S extends T> S insert(S entity) {
    	return null;
    }

    protected abstract <S extends T> Class<S> getStoredClass();

    protected List<T> queryByReferenceIdOrderByYear(String entity, String referenceName, String referenceId) {
    	return null;
    }
    
    ////
    //Private methods
    ////
   
}
