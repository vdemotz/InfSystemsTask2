package ch.ethz.globis.isk.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ch.ethz.globis.isk.config.PersistenceConfig;

import com.db4o.ObjectContainer;

@Component
public class Db4oTransactionManager extends CacheAwareTransactionManager {

    @Autowired
    @Qualifier(PersistenceConfig.OC_QUALIFIER)
    private ObjectContainer oc;
	
	@Override
    public void rollback() {
		oc.rollback();
    }

    @Override
    public void begin() {
        //no need for explicit begin
    }

    @Override
    public void commit() {
    	oc.commit();
    }
}