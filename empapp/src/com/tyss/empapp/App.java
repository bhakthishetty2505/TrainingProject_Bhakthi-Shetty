package com.tyss.empapp;

import java.util.List;
import java.util.Scanner;

import com.tyss.empapp.DAO.EmployeeDAO;
import com.tyss.empapp.DAO.EmployeeDAOImpl;
import com.tyss.empapp.dto.EmployeeBean;
import com.tyss.empapp.util.EmployeeManager;

public class App {

	public static void main(String[] args) {

		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert employee data");
		System.out.println("Press 3 to update employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search single employee data");

		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();

		switch (ch) {

		case 1:
			EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = dao.getAllEmployeeDAOImpl();
			for (EmployeeBean bean : result) {
				System.out.println("ID is " + bean.getId());
				System.out.println("Name is " + bean.getName());
				System.out.println("Salary is " + bean.getSalary());
				System.out.println("Gender is " + bean.getGender());
			}
			break;

		case 2:
			EmployeeDAO impl2 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean = new EmployeeBean();
			int id1 = scn.nextInt();
			String name1 = scn.next();
			int sal1 = scn.nextInt();
			String gender1 = scn.next();
			System.out.println("Enter id ");
			bean.setId(id1);
			System.out.println("Enter name ");
			bean.setName(name1);
			System.out.println("Enter salary ");
			bean.setSalary(sal1);
			System.out.println("Enter gender ");
			bean.setGender(gender1);
			int count1 = impl2.insertEmployeeData(bean);
			System.out.println(count1 + " Row(s) inserted");

			break;

		case 3:
			EmployeeDAO impl3 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean2 = new EmployeeBean();
			System.out.println("Enter id for updated");
			int id2 = scn.nextInt();
			System.out.println("Enter name ");
			String name2 = scn.next();
			bean2.setId(id2);
			bean2.setName(name2);
			int count2 = impl3.updateEmployeeData(bean2);
			System.out.println(count2 + " Row(s) updated");
			break;

		case 4:
			EmployeeDAO impl4 = EmployeeManager.getEmployeeDAO();
			System.out.println("Enter id for delete ");
			int id3 = scn.nextInt();
			int count3 = impl4.deleteEmployeeData(id3);
			System.out.println(count3 + " Row(s) deleted");
			break;

		case 5:
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			int id = scn.nextInt();
			EmployeeBean bean1 = dao5.searchEmployeeData(id);
			if (bean1 != null) {
				System.out.println("ID is " + bean1.getId());
				System.out.println("Name is " + bean1.getName());
				System.out.println("Salary is " + bean1.getSalary());
				System.out.println("Gender is " + bean1.getGender());
			} else {
				System.out.println("No data found");
			}
			break;
		}

	}
}
