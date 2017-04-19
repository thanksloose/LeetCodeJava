package com.hmm.test;

public class AddTwoNumbers {
	public ListNodeMy addTwoNumbersHmm(ListNodeMy l1, ListNodeMy l2) {
		ListNodeMy listNodeMyHead = new ListNodeMy(0);
		ListNodeMy listNodeMy = new ListNodeMy(0);
		listNodeMyHead = listNodeMy;
		int temp = 0;
		while (l1 != null && l2 != null) {
			temp = l1.val + l2.val + temp;
			ListNodeMy listNodeMyTemp = new ListNodeMy(temp % 10);
			listNodeMy.next = listNodeMyTemp;
			listNodeMy = listNodeMyTemp;
			temp = temp / 10;
			l1 = l1.next;
			l2 = l2.next;
		}
		while (l1 != null) {
			ListNodeMy listNodeMyTemp = new ListNodeMy((temp + l1.val) % 10);
			listNodeMy.next = listNodeMyTemp;
			listNodeMy = listNodeMyTemp;
			temp = (temp + l1.val) / 10;
			l1 = l1.next;
		}
		while (l2 != null) {
			ListNodeMy listNodeMyTemp = new ListNodeMy((temp + l2.val) % 10);
			listNodeMy.next = listNodeMyTemp;
			listNodeMy = listNodeMyTemp;
			temp = (temp + l2.val) / 10;
			l2 = l2.next;
		}
		if (temp != 0) {
			ListNodeMy listNodeMyTemp = new ListNodeMy(1);
			listNodeMy.next = listNodeMyTemp;
			listNodeMy = listNodeMyTemp;
		}
		listNodeMyHead = listNodeMyHead.next;
		return listNodeMyHead;
	}

	public ListNodeMy addTwoNumbers(ListNodeMy l1, ListNodeMy l2) {
		ListNodeMy listNodeMyHead = new ListNodeMy(0);
		ListNodeMy listNodeMy = listNodeMyHead;
		int temp = 0;
		while (l1 != null || l2 != null) {
			temp = temp / 10;
			if (l1 != null) {
				temp += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				temp += l2.val;
				l2 = l2.next;
			}
			listNodeMy.next = new ListNodeMy(temp % 10);
			listNodeMy = listNodeMy.next;
		}
		if (temp / 10 == 1) {
			listNodeMy.next = new ListNodeMy(1);
		}
		listNodeMyHead = listNodeMyHead.next;
		return listNodeMyHead;
	}

	public static void main(String[] args) {
		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
		// ListNodeMy l1 = new ListNodeMy(2);
		// ListNodeMy l1Temp = new ListNodeMy(3);
		// l1Temp.next = l1.next;
		// l1.next = l1Temp;
		// l1Temp = new ListNodeMy(4);
		// l1Temp.next = l1.next;
		// l1.next = l1Temp;
		ListNodeMy l1 = new ListNodeMy(1);
		ListNodeMy l2 = new ListNodeMy(9);
		ListNodeMy l2Temp = new ListNodeMy(9);
		l2Temp.next = l2.next;
		l2.next = l2Temp;
		// ListNodeMy l2 = new ListNodeMy(5);
		// ListNodeMy l2Temp = new ListNodeMy(4);
		// l2Temp.next = l2.next;
		// l2.next = l2Temp;

		ListNodeMy listNodeMy = addTwoNumbers.addTwoNumbers(l1, l2);
		while (listNodeMy != null) {
			System.out.println(listNodeMy.val);
			listNodeMy = listNodeMy.next;
		}
	}
}
