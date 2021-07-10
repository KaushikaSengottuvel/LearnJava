package learn_InnerOuterClass;

import java.util.ArrayList;
import java.util.List;

public class Motherboard_NestedClass {

	private String model;
	private String brand;

	public static void main(String[] args) {
		Motherboard_NestedClass outer = new Motherboard_NestedClass();
		USB_InnerClass inner1 = outer.new USB_InnerClass(2, true, true);
		USB_InnerClass inner2 = outer.new USB_InnerClass(3, false, true);
		List<USB_InnerClass> usbObj = new ArrayList<USB_InnerClass>();
		usbObj.add(inner1);
		usbObj.add(inner2);
		int i = 1;
		for (USB_InnerClass usb_InnerClass : usbObj) {
			System.out.println(i++ + ". Port Count :" + usb_InnerClass.portCount + "\tUsb2 :" + usb_InnerClass.usb2
					+ "\tUsb3 :" + usb_InnerClass.usb3);
		}

	}

	public class USB_InnerClass {

		private int portCount;
		private boolean usb2;
		private boolean usb3;

		public USB_InnerClass(int portCount, boolean usb2, boolean usb3) {
			this.portCount = portCount;
			this.usb2 = usb2;
			this.usb3 = usb3;
		}

	}

}
