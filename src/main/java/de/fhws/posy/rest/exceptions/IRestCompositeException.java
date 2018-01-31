package de.fhws.posy.rest.exceptions;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(as = IRestCompositeException.class)
public interface IRestCompositeException extends IRestException {
	
	public List<IRestException> getExceptions();

}
