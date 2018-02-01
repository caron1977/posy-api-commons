package de.fhws.posy.commons.interfaces;

import java.io.Serializable;
import java.util.List;


public interface IExamSchedule extends Serializable {

	public String getCourseId();
	
	public String getExamCatalogId();
	
	public List<IExamRegistration> getExamRegistrations();

}
