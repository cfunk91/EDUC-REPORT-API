package ca.bc.gov.educ.grad.dto;

import ca.bc.gov.educ.isd.cert.Certificate;
import ca.bc.gov.educ.isd.grad.GradProgram;
import ca.bc.gov.educ.isd.grad.NonGradReason;
import ca.bc.gov.educ.isd.grad.impl.CertificateImpl;
import ca.bc.gov.educ.isd.grad.impl.GradProgramImpl;
import ca.bc.gov.educ.isd.grad.impl.NonGradReasonImpl;
import ca.bc.gov.educ.isd.school.School;
import ca.bc.gov.educ.isd.student.Student;
import ca.bc.gov.educ.isd.student.impl.SchoolImpl;
import ca.bc.gov.educ.isd.student.impl.StudentImpl;
import ca.bc.gov.educ.isd.transcript.Transcript;
import ca.bc.gov.educ.isd.transcript.impl.TranscriptImpl;
import lombok.Data;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.map.annotate.JsonRootName;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Component
@XmlType(name = "")
@XmlRootElement(name = "generateReport")
@XmlSeeAlso({
		StudentImpl.class,
		SchoolImpl.class,
		TranscriptImpl.class,
		GradProgramImpl.class,
		NonGradReasonImpl.class,
		CertificateImpl.class
})
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
//@JsonPropertyOrder(alphabetic = true)
//@JsonRootName("generateReport")
@JsonSubTypes({
		@JsonSubTypes.Type(value = StudentImpl.class, name = "student"),
		@JsonSubTypes.Type(value = SchoolImpl.class, name = "school"),
		@JsonSubTypes.Type(value = TranscriptImpl.class, name = "transcript"),
		@JsonSubTypes.Type(value = GradProgramImpl.class, name = "gradProgram"),
		@JsonSubTypes.Type(value = NonGradReasonImpl.class, name = "nonGradReasons"),
		@JsonSubTypes.Type(value = CertificateImpl.class, name = "certificate")
})
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class ReportData implements Serializable {

	private Student student;
	private School school;
	private String logo;
	private Transcript transcript;
	private GradProgram gradProgram;
	private List<NonGradReason> nonGradReasons;
	private String gradMessage;
	private Date updateDate;
	private Map<String, String> parameters;
	private Certificate certificate;
	
}
