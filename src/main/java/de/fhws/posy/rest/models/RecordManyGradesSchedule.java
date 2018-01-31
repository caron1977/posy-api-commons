package de.fhws.posy.rest.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import de.fhws.posy.commons.enums.ExamGradeEnum;
import de.fhws.posy.commons.interfaces.IExamGrade;

public class RecordManyGradesSchedule implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String course;

	private String examCatalogId;

	/*
	 * We could transfer the workflow info as well
	 */
	// private GradesWorkflow gradesWorkflow;

	private ExamGradeEnum examGradeType;

	private List<IExamGrade> grades = new ArrayList<>();

	public String getCourse() {

		return course;
	}

	public void setCourse(String course) {

		this.course = course;
	}

	public String getExamCatalogId() {

		return examCatalogId;
	}

	public void setExamCatalogId(String examCatalogId) {

		this.examCatalogId = examCatalogId;
	}

	public ExamGradeEnum getExamGradeType() {

		return examGradeType;
	}

	public void setExamGradeType(ExamGradeEnum examGradeType) {

		this.examGradeType = examGradeType;
	}

	public List<IExamGrade> getGrades() {

		return grades;
	}

	@Override
	public String toString() {

		return "RecordExamGrade [course=" + course + ", examCatalogId=" + examCatalogId + "]";
	}

}