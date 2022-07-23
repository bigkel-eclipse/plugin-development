package com.bigkel.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

public class MessageTest {
	public static void main(String[] args) {

		Display display = Display.getCurrent();
		Shell shell = new Shell(display);
		shell.setSize(500, 500);
		MessageBox messageBox = new MessageBox(shell, SWT.OK);
		messageBox.setMessage("消息对话框！");
		messageBox.setText("对话框");
		messageBox.open();
	}
}
