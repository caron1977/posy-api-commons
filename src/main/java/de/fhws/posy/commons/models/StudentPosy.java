package de.fhws.posy.commons.models;

import java.util.Date;

import de.fhws.posy.commons.interfaces.IStudent;

public class StudentPosy implements IStudent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String matnr;

	private String nachname;

	private String vorname;

	private String stg;

	private String sr;

	private Integer lpSem;

	// private StudStatusEnum studStatus;
	private String studStatus;

	private Date dateOfBirth;

	// private StudartEnum studArt;
	private String studArt;

	private Date edat;

	private Date exdat;

	private Integer po;

	public String getStudStatus() {

		return studStatus;
	}

	public void setStudStatus(String studStatus) {

		this.studStatus = studStatus;
	}

	public String getStudArt() {

		return studArt;
	}

	public void setStudArt(String studArt) {

		this.studArt = studArt;
	}

	public String getMatnr() {

		return matnr;
	}

	public void setMatnr(String matnr) {

		this.matnr = matnr;
	}

	public String getNachname() {

		return nachname;
	}

	public void setNachname(String nachname) {

		this.nachname = nachname;
	}

	public String getVorname() {

		return vorname;
	}

	public void setVorname(String vorname) {

		this.vorname = vorname;
	}

	public String getStg() {

		return stg;
	}

	public void setStg(String stg) {

		this.stg = stg;
	}

	public String getSr() {

		return sr;
	}

	public void setSr(String sr) {

		this.sr = sr;
	}

	public Integer getLpSem() {

		return lpSem;
	}

	public void setLpSem(Integer lpSem) {

		this.lpSem = lpSem;
	}

	public Date getDateOfBirth() {

		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {

		this.dateOfBirth = dateOfBirth;
	}

	public Date getEdat() {

		return edat;
	}

	public void setEdat(Date edat) {

		this.edat = edat;
	}

	public Date getExdat() {

		return exdat;
	}

	public void setExdat(Date exdat) {

		this.exdat = exdat;
	}

	public Integer getPo() {

		return po;
	}

	public void setPo(Integer po) {

		this.po = po;
	}

	public boolean equals(Object obj) {

		boolean ret = super.equals(obj);

		if (!ret) {

			if (obj instanceof StudentPosy && this.getClass().isInstance(obj)) {
				StudentPosy student = (StudentPosy) obj;
				ret = student.getMatnr() == null ? false : student.getMatnr().equals(this.getMatnr());
			}
		}

		return ret;
	}

	@Override
	public String toString() {

		return "StudentPosy [matnr=" + matnr + "]";
	}

}
