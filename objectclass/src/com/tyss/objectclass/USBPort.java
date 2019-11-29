package com.tyss.objectclass;

public class USBPort {

	public static void connect(Object obj) {

		if(obj instanceof Pendrive)
		{
			Pendrive p = (Pendrive) obj;
			p.read();
			p.write();
		}

		else if(obj instanceof Mouse)
		{
			Mouse m = (Mouse) obj;
			m.scroll();
			m.click();
		}

		else {
			System.out.println("Invalid device");
		}
	}
}
