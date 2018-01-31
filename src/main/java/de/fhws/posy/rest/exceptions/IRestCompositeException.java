package de.fhws.posy.rest.exceptions;

import java.util.List;

public interface IRestCompositeException extends IRestException {

	public List<IRestException> getExceptions();

}
