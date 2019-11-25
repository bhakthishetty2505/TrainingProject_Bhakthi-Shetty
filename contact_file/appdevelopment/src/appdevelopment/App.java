package appdevelopment;

import java.util.List;
import java.util.Scanner;

import com.tyss.appdevelopment.DAO.ContactIDAO;
import com.tyss.appdevelopment.DTO.ContactBean;
import com.tyss.appdevelopment.util.ContactManager;

public class App {

	public static void main(String[] args) throws ClassNotFoundException {

		System.out.println("Press 1 to show all contacts");
		System.out.println("Press 2 to search for a contact");
		System.out.println("Press 3 to operate on contacts");
		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();

		switch (ch) {

		case 1:
			ContactIDAO dao = ContactManager.getEmployeeDAO();
			List<ContactBean> result = dao.showAllContacts();
			for (ContactBean bean : result) {
				System.out.println("Name is " + bean.getName());
				System.out.println("Number is " + bean.getNumber());
				System.out.println("Contact Group is " + bean.getContactGroup());
			}
			break;

		case 2:
			ContactIDAO dao1 = ContactManager.getEmployeeDAO();
			System.out.println("Enter the name :");
			String name = scn.next();
			ContactBean bean1 = dao1.searchContact(name);
			if (bean1 != null) {
				System.out.println("Name is " + bean1.getName());
				System.out.println("Number is " + bean1.getNumber());
				System.out.println("Contact Group is " + bean1.getContactGroup());
				System.out.println("Press 1 to call");
				System.out.println("Press 2 to message");
				System.out.println("Press 3 to go back to the main menu");
				int number = scn.nextInt();
				switch(number) {
				case 1 : System.out.println("calling to  " +name);
							break;
							
				case 2 : System.out.println("Sending message to " +name);
							break;
							
				case 3 : 
					break;
				}
				
				
			} else {
				System.out.println("No data found");
			}
			break;
		
		case 3:
			
			System.out.println("Press 1 to edit contact");
			System.out.println("Press 2 to add contact");
			System.out.println("Press 3 to  delete contact");
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			switch(n) {
			case 1 : System.out.println("Enter a name ");
			String name1 = sc.next();
			
			System.out.println("Enter a number ");
			int number1 = sc.nextInt();
			
			System.out.println("Enter a group contact ");
			String group = sc.next();
			
			ContactBean bean =  new ContactBean();
			bean.setName(name1);
			bean.setNumber(number1);
			bean.setContactGroup(group);
			
			ContactIDAO impl = ContactManager.getEmployeeDAO();
			int i = impl.insertContact(bean);
			System.out.println(i + "Row inserted");
			break;
			
			case 2 :
				break;
				
			case 3 : System.out.println("Enter name to be deleted");
			
					Scanner sc1 = new Scanner(System.in);
					String delete = sc1.nextLine();
					ContactIDAO impl1 = ContactManager.getEmployeeDAO();
					int count = impl1.deleteContact(delete);
					
			}
			
			break;

		
		}
	}
}
