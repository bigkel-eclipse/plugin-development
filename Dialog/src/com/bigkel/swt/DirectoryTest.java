package com.bigkel.swt;

import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class DirectoryTest {
	public static void main(String[] args) {
		Display display = Display.getCurrent();
		Shell shell = new Shell(display);
		shell.setSize(500,500);
		
		DirectoryDialog dialog = new DirectoryDialog(shell);
		dialog.setMessage("Choose a save directory");
		String filePath = dialog.open();
		System.out.println(filePath);
		
		shell.open();
		shell.layout();
		while(!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
