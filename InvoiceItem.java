package Bai2;

import java.util.Scanner;

public class InvoiceItem {
	private String id;
	private String desc;
	private int qty;
	private float unitPrice;

	public InvoiceItem() {
	}
	public InvoiceItem(String id, String desc, int qty, float unitPrice) {
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	public void inputInfo() {
		Scanner input = new Scanner(System.in);
		id = input.nextLine();
		desc = input.nextLine();
		qty = Integer.parseInt(input.nextLine());
		unitPrice = Float.parseFloat(input.nextLine());
	}
	public void showInfo() {
		System.out.println(id + "\t" + desc + "\t" + qty + "\t" + unitPrice + "\t" + getPrice());
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getPrice() {
		return unitPrice * qty;
	}
	

}