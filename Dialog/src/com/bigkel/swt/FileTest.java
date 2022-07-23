package com.bigkel.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class FileTest {
	public static void main(String[] args) {
		Display display = Display.getCurrent();
		Shell shell = new Shell(display);
		shell.setSize(500, 500);

		FileDialog dialog = new FileDialog(shell, SWT.MULTI);
		dialog.setFilterExtensions(new String[] { "*.txt" });
		dialog.open();
	}
}
