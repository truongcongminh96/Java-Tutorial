package com.cybersoft.quanlynhansu.object;

import com.cybersoft.quanlynhansu.quanly.ManageDepartmentManager;
import com.cybersoft.quanlynhansu.quanly.ManageDirector;
import com.cybersoft.quanlynhansu.quanly.ManageStaff;

/**
 *
 * @author minhtruong
 *
 */

public class Company {
	// Properties
	String nameCompany;
	String invoiceCode;
	double turnoverPerMonth;

	ManageStaff manageStaff;
	ManageDepartmentManager manageDepartmentManager;
	ManageDirector manageDirector;

	// getters and setters
	public String getNameCompany() {
		return nameCompany;
	}

	public String getInvoiceCode() {
		return invoiceCode;
	}

	public double getTurnoverPerMonth() {
		return turnoverPerMonth;
	}

	// Methods
	public static void changNameCompany() {
		System.out.println("Success: ");
	}
}
