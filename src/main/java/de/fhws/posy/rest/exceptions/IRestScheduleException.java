package de.fhws.posy.rest.exceptions;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(as = IRestScheduleException.class)
public interface IRestScheduleException extends IRestCompositeException {

	public String getCourse();

	public String getExamCatalogId();
}
