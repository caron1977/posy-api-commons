package de.fhws.posy.commons.interfaces;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import de.fhws.posy.commons.enums.ExamGradeEnum;

/**
 * TODO grimmer: check the possibility to use {@link JsonDeserialize}<br>
 * annotation instead of defining a custom de-serialization feature like CustomExamGradeDeserializer
 * 
 * @author grimmer
 *
 */
public interface IExamGrade extends Serializable {

	public String getMatnr();

	public void setMatnr(String matnr);

	public String getExamGradeType();

	public void setExamGradeType(String type);

	public String getGrade();

	public void setGrade(String grade);

}
