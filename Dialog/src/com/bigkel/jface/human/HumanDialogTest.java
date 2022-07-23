package com.bigkel.jface.human;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class HumanDialogTest {
	public static void main(String[] args) {
		Display display = Display.getCurrent();
		Shell shell = new Shell(display);
		
		new HumanDialog(shell).open();
	}
}

class HumanDialog extends Dialog {
    private Human human;
    private Text nameText;
    private Text oldText;
    private Button ggButton, mmButton;

    public HumanDialog(Shell parentShell) {
        super(parentShell);
    }
    
    public Human getInput() {
        return this.human;
    }

    public void setInput(Human human) {
        this.human = human;
    }

    protected Control createDialogArea(Composite parent) {
        Composite topComp = new Composite(parent, SWT.NONE);
        topComp.setLayout(new GridLayout(2, false));
        new Label(topComp, SWT.NONE).setText("姓名：");
        nameText = new Text(topComp, SWT.BORDER);
        nameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        new Label(topComp, SWT.NONE).setText("年龄：");
        oldText = new Text(topComp, SWT.BORDER);//省略了只能输入数值的限制
        oldText.setLayoutData(new GridData(20,-1));
        new Label(topComp, SWT.NONE).setText("性别：");
        Composite c = new Composite(topComp, SWT.None);
        c.setLayout(new RowLayout());
        ggButton = new Button(c, SWT.RADIO);
        ggButton.setText("男");
        mmButton = new Button(c, SWT.RADIO);
        mmButton.setText("女");

        if (human != null) {
            nameText.setText(human.getName() == null ? "" : human.getName());
            oldText.setText(String.valueOf(human.getOld()));
            ggButton.setSelection(human.isSex());
            mmButton.setSelection(!human.isSex());
        }
        return topComp;
    }
    
    protected void buttonPressed(int buttonId) {
        if (buttonId == IDialogConstants.OK_ID) {
            if (human == null)
                human = new Human();
            human.setName(nameText.getText());
            human.setOld(Integer.parseInt(oldText.getText()));
            human.setSex(ggButton.getSelection());
        }
        super.buttonPressed(buttonId);
    }
}
