package com.bigkel.swt;

import org.eclipse.swt.printing.PrintDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class PrintTest {
	public static void main(String[] args) {
		
		Display display = Display.getCurrent();
		Shell shell = new Shell(display);
		shell.setSize(500,500);
		
		PrintDialog dialog = new PrintDialog(shell);
		dialog.setPrintToFile(true);
		dialog.setStartPage(1);
		dialog.setEndPage(10);
		dialog.open();
	}
}
