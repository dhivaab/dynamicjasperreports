package com.blueocean.business;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.blueocean.model.Employee;
import com.blueocean.reports.EmployeeReport;
import com.blueocean.utilities.Report;
import ar.com.fdvs.dj.domain.builders.ColumnBuilderException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;

public class EmployeeBusinessReports {
	EmployeeReport empreport = new EmployeeReport();

	public List<Employee> getDatafromSource() {
		List<Employee> employees = new ArrayList<>(2);
		employees.add(new Employee(1, "Balamurugan", 2, (float) 2));
		employees.add(new Employee(2, "Lalithambigai", 2, (float) 2));
		return employees;
	}

	public byte[] getPdfReports(List<Employee> employeedata, Report report)
			throws ColumnBuilderException, ClassNotFoundException, JRException {
		empreport.setList(employeedata);
		JasperPrint jasperreports = empreport.getReport();
		return report.getReportPdf(jasperreports);
	}

	public byte[] getExcelReports(List<Employee> employeedata, Report report)
			throws ColumnBuilderException, ClassNotFoundException, JRException, IOException {
		empreport.setList(employeedata);
		JasperPrint jasperreports = empreport.getReport();
		return report.getReportXlsx(jasperreports);
	}
}
