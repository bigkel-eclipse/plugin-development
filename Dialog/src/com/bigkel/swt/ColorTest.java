package com.bigkel.swt;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ColorTest {
	public static void main(String[] args) {
		Display display = Display.getCurrent();
		Shell shell = new Shell(display);
		shell.setSize(1000,1000);
		
		ColorDialog colorDialog = new ColorDialog(shell);
		RGB rgb = colorDialog.open();
		colorDialog.setRGB(rgb);
		
		
	}
}
