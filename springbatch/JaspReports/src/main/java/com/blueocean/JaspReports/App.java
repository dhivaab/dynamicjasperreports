package com.blueocean.JaspReports;

import java.util.List;
import com.blueocean.business.EmployeeBusinessReports;
import com.blueocean.model.Employee;
import com.blueocean.utilities.Report;

public class App {
	public static void main(String[] args) {
		try {
			Report report = new Report();
			EmployeeBusinessReports empbusinessreport = new EmployeeBusinessReports();
			List<Employee> employeedata = empbusinessreport.getDatafromSource();
			byte[] pdfdata = empbusinessreport.getPdfReports(employeedata, report);
			byte[] pdfexcel = empbusinessreport.getExcelReports(employeedata, report);
			report.writetoFile(pdfdata, "employee.pdf");
			report.writetoFile(pdfexcel, "employee.xlsx");
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}
}
