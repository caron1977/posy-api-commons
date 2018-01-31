package de.fhws.posy.commons.interfaces;

import java.io.Serializable;

public interface IStudent extends Serializable {

	public String getMatnr();

	public void setMatnr(String matnr);

	public String getVorname();

	public void setVorname(String vorname);

	public String getNachname();

	public void setNachname(String nachname);

	public Integer getLpSem();

	public void setLpSem(Integer lpSem);

	public String getStg();

	public void setStg(String stg);
}
