package com.itwill.shop.domain;

public class Cart {
	
/*
 * 이름         널?       유형         
---------- -------- ---------- 
CART_NO    NOT NULL NUMBER(10) 
CART_QTY            NUMBER(10) 
MEMBERS_NO          NUMBER(10) 
MENU_NO             NUMBER(10) 
 */
	private int cart_no;
	private int cart_qty;
	private int members_no;
	private int menu_no;
	public Cart() {
	}
	public Cart(int cart_no, int cart_qty, int members_no, int menu_no) {
		super();
		this.cart_no = cart_no;
		this.cart_qty = cart_qty;
		this.members_no = members_no;
		this.menu_no = menu_no;
	}
	public int getCart_no() {
		return cart_no;
	}
	public void setCart_no(int cart_no) {
		this.cart_no = cart_no;
	}
	public int getCart_qty() {
		return cart_qty;
	}
	public void setCart_qty(int cart_qty) {
		this.cart_qty = cart_qty;
	}
	public int getMembers_no() {
		return members_no;
	}
	public void setMembers_no(int members_no) {
		this.members_no = members_no;
	}
	public int getMenu_no() {
		return menu_no;
	}
	public void setMenu_no(int menu_no) {
		this.menu_no = menu_no;
	}
	@Override
	public String toString() {
		return "Cart [cart_no=" + cart_no + ", cart_qty=" + cart_qty + ", members_no=" + members_no + ", menu_no="
				+ menu_no + "]";
	}
	


}
