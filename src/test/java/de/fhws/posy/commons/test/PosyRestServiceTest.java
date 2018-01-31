package de.fhws.posy.commons.test;

import static org.junit.Assert.assertEquals;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.io.IOUtils;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import de.fhws.posy.commons.enums.ExamGradeEnum;
import de.fhws.posy.commons.interfaces.IExamGrade;
import de.fhws.posy.commons.interfaces.IExamPeriod;
import de.fhws.posy.rest.models.ExamGradeJson;
import de.fhws.posy.rest.models.ExamPeriodJson;
import de.fhws.posy.rest.models.RecordManyGradesRequest;
import de.fhws.posy.rest.models.RecordManyGradesSchedule;

public class PosyRestServiceTest {

	private static JsonObject credentials;

	@BeforeClass
	public static void beforeClass() throws Exception {

		String credentialsStr = IOUtils.toString(PosyRestServiceTest.class.getResourceAsStream("/credentials.json"), "UTF-8");
		credentials = Json.createReader(new StringReader(credentialsStr)).readObject();
	}

	@Test
	public void testRecordManyGrades() throws Exception {

		RecordManyGradesRequest request = new RecordManyGradesRequest();

		IExamPeriod examPeriod = new ExamPeriodJson();
		examPeriod.setSemestercode(172);
		request.setExamPeriod(examPeriod);

		// 1. schedule
		{
			RecordManyGradesSchedule schedule = new RecordManyGradesSchedule();
			request.getExamSchedules().add(schedule);

			schedule.setCourse("BEC");
			schedule.setExamCatalogId("6100200");
			schedule.setExamGradeType(ExamGradeEnum.DN);

			IExamGrade examGrade = new ExamGradeJson();
			examGrade.setMatnr("3716014");
			examGrade.setGrade("5,0");
			examGrade.setExamGradeType(ExamGradeEnum.DN.name());
			schedule.getGrades().add(examGrade);
		}

		Client client = ClientBuilder.newClient().register(JacksonJsonProvider.class);

		// authenticate if necessary
		if (credentials.get("username") != null && credentials.get("password") != null) {
			HttpAuthenticationFeature feature = HttpAuthenticationFeature.basicBuilder().nonPreemptive()
					.credentials(credentials.getString("username"), credentials.getString("password")).build();
			client.register(feature);
		}

		WebTarget webTarget = client.target(credentials.getString("resturl")).path("record-many-grades");

		Response response = webTarget.request().post(Entity.entity(request, MediaType.APPLICATION_JSON));

		assertEquals("expected HTTP Status OK - 200.", Response.Status.OK.getStatusCode(), response.getStatus());

	}

}
