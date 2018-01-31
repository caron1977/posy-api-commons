package de.fhws.posy.commons.interfaces;

import java.io.Serializable;

import de.fhws.posy.commons.models.StudentPosy;

public interface IStudentRef extends Serializable {

	public String getMatnr();

	public void setMatnr(String matnr);

	public StudentPosy getStudent();

	public void setStudent(StudentPosy student);
}
