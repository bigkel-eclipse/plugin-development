package com.bigkel.wizard;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class SchoolPage extends WizardPage {
	
    private String school;
    private Text schoolText;

    protected SchoolPage(String pageName) {
        super(pageName);
    }

    public void createControl(Composite parent) {
        setTitle("用户信息");
        setMessage("请输入您的学校的名称", INFORMATION);
        setPageComplete(false);
        
        Composite topComp = new Composite(parent, SWT.NULL);
        topComp.setLayout(new GridLayout());

        schoolText = new Text(topComp, SWT.BORDER);
        schoolText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        schoolText.setText(StringUtils.defaultString(school));
        schoolText.addModifyListener(new MyModifyListener());
        
        setControl(topComp);
    }

    private class MyModifyListener implements ModifyListener {
        public void modifyText(ModifyEvent e) {
            school = schoolText.getText().trim();
            if (StringUtils.isBlank(school)) {
                setErrorMessage("学校名不能为空");
                setPageComplete(false);
                return;
            }
            setErrorMessage(null);
            setPageComplete(true);
        }
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String string) {
        school = string;
    }
}
