package com.bigkel.jface;

import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class inputTest {
	public static void main(String[] args) {
		Display display = Display.getCurrent();
		Shell shell = new Shell(display);
		shell.setSize(500, 500);

		InputDialog dialog = new InputDialog(shell, "�����", "������0-15�ڵ�����", "10", new MyValidator());
		if (dialog.open() == InputDialog.OK) {
			System.out.println(dialog.getValue());
		}
	}
}

class MyValidator implements IInputValidator {
	Display display = Display.getCurrent();
	Shell shell = new Shell(display);

	@Override
	public String isValid(String newText) {
		try {
			Float input = Float.valueOf(newText);
			if (input > 15 || input < 0) {
				return "�������������������";
			}
		} catch (Exception e) {
			return "�������������������";
		}
		return null; // ���ؿձ�ʾ����Ϸ���OK��ť�ɵ��
	}
}
