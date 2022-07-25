package com.bigkel.wizard;

import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class WizardDialog1 {

	public static void main(String[] args) {
		Display display = Display.getDefault();
        Shell shell = new Shell(display);

        WizardDialog dialog = new WizardDialog(shell, new NewWizard());
        dialog.setPageSize(-1, 60); // dialog��С,-1��ָ�ÿ���Զ�����
        dialog.open();

        display.dispose();
	}
}
