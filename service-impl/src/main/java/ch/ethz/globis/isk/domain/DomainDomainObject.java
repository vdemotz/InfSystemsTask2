package ch.ethz.globis.isk.domain;

import ch.ethz.globis.isk.domain.DomainObject;

public class DomainDomainObject implements DomainObject {

	protected String id;
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

}
