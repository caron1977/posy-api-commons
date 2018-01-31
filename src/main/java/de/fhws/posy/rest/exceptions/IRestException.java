package de.fhws.posy.rest.exceptions;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * wraps java exception classes for json parser
 * see also https://stackoverflow.com/questions/18654293/jackson-serialize-only-interface-methods
 * 
 * serialize = from java to json
 * de-serialize = from json to java
 * 
 * @author grimmer
 *
 */
@JsonSerialize(as = IRestException.class)
public interface IRestException {

	public String getMessage();

}
