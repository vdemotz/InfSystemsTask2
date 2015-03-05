package ch.ethz.globis.isk.persistence;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.db4o.ObjectContainer;

import ch.ethz.globis.isk.config.PersistenceConfig;
import ch.ethz.globis.isk.domain.DomainObject;
import ch.ethz.globis.isk.util.Filter;
import ch.ethz.globis.isk.util.OrderFilter;

public abstract class JpaDao<K extends Serializable, T extends DomainObject> implements Dao<K, T> {
	
    @Autowired
    @Qualifier(PersistenceConfig.OC_QUALIFIER)
    ObjectContainer oc;

    @Override
    public long countAllByFilter(Map<String, Filter> filterMap) {
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
        for(S entity : entities) {
            insert(entity);
        }
        return entities;
    }

    @Override
    public <S extends T> S insert(S entity) {
    	return null;
    }

}
