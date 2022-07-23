package com.bigkel.swt;

import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FontDialog;
import org.eclipse.swt.widgets.Shell;

public class FontTest {
	public static void main(String[] args) {
		
		Display display = Display.getCurrent();
		Shell shell = new Shell(display);
		shell.setSize(500,500);
		
		FontDialog dialog = new FontDialog(shell);
		FontData fontData = dialog.open();
		
		System.out.println(dialog.getRGB().toString());
		System.out.println(fontData.getHeight());
		System.out.println(fontData.getLocale());
		System.out.println(fontData.getName());
		System.out.println(fontData.getStyle());
	}
}
