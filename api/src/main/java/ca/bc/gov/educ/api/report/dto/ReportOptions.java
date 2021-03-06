package ca.bc.gov.educ.api.report.dto;

import lombok.Data;

@Data
public class ReportOptions {

	private boolean cacheReport;
	private String convertTo;
	private boolean overwrite;
	private String reportName;
	
	public ReportOptions (String reportName) {
		if(reportName.equalsIgnoreCase("achievement")) {
			this.cacheReport = false;
			this.convertTo = "pdf";
			this.overwrite = true;
			this.reportName = "studentachievementreport.pdf";
		}else if(reportName.equalsIgnoreCase("transcript")) {
			this.cacheReport = false;
			this.convertTo = "pdf";
			this.overwrite = true;
			this.reportName = "studenttranscriptreport.pdf";
		}else {
			this.cacheReport = false;
			this.convertTo = "pdf";
			this.overwrite = true;
			this.reportName = "studentcertificate.pdf";
		}
	}
}
