package de.fhws.posy.rest.exceptions;

public interface IRestScheduleException extends IRestCompositeException {

	public String getCourse();

	public String getExamCatalogId();
}
