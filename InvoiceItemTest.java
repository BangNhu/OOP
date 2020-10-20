package Bai2;

import java.util.*;
public class InvoiceItemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<InvoiceItem> invoiceItemList = new ArrayList<InvoiceItem>();
		try (Scanner scan = new Scanner(System.in)) {
			int n;
			n = Integer.parseInt(scan.nextLine());
			for(int i = 0; i < n; i++) {
				InvoiceItem std = new InvoiceItem();
				std.inputInfo();
				invoiceItemList.add(std);
			}
		}
		java.util.Collections.sort(invoiceItemList, new Comparator<InvoiceItem>() {
			@Override
			public int compare(InvoiceItem o1, InvoiceItem o2) {
				return o1.getUnitPrice() >= o2.getUnitPrice()?-1:1;
			}
		});
		double total = 0;
		for(int i = 0; i < invoiceItemList.size(); i++) {
			invoiceItemList.get(i).showInfo();
			total = total + invoiceItemList.get(i).getPrice();
		}
		System.out.println(total);
	
	}

}
