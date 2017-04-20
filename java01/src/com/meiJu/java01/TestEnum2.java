package com.meiJu.java01;

import javax.swing.tree.DefaultTreeCellEditor.EditorContainer;
import javax.xml.transform.Templates;

public class TestEnum2 {

	public static void main(String[] args) {
		for (EnumDay e : EnumDay.values()) {
			System.out.println(e.toString());
		}
		for (EnumDay1 ed : EnumDay1.values()) {
			String mtp = ed.name() + ed.ordinal() + ed.getInfo();
			System.out.println(mtp);
		}
		EnumDay1 e = EnumDay1.SUN;

		if (e.compareTo(EnumDay1.MON) < 0) {
			System.out.println("TUR 在 MON 之前" + e.compareTo(EnumDay1.MON));
		} else if (e.compareTo(EnumDay1.MON) > 0) {
			System.out.println("TUR 在 MON 之前" + e.compareTo(EnumDay1.MON));
		} else
			System.out.println("TUR 与 MON 在同一位置");

	}
}
