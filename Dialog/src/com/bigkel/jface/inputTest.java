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

		InputDialog dialog = new InputDialog(shell, "输入框", "请输入0-15内的数字", "10", new MyValidator());
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
				return "请输入符合条件的数字";
			}
		} catch (Exception e) {
			return "请输入符合条件的数字";
		}
		return null; // 返回空表示输入合法，OK按钮可点击
	}
}
