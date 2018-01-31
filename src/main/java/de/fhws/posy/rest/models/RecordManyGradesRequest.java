package de.fhws.posy.rest.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import de.fhws.posy.commons.interfaces.IExamPeriod;

public class RecordManyGradesRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IExamPeriod examPeriod;

	private List<RecordManyGradesSchedule> examSchedules = new ArrayList<>();

	public IExamPeriod getExamPeriod() {

		return examPeriod;
	}

	public void setExamPeriod(IExamPeriod examPeriod) {

		this.examPeriod = examPeriod;
	}

	/**
	 * TODO grimmer: call this class recorded schedules
	 * 
	 * @return
	 */
	public List<RecordManyGradesSchedule> getExamSchedules() {

		return examSchedules;
	}

	@Override
	public String toString() {

		return "RecordGradesManyRequest [examPeriod=" + examPeriod + "]";
	}

}
