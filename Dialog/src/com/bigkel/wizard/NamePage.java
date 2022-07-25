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

public class NamePage extends WizardPage {
    private String name;
    private String email;
    private Text nameText;
    private Text emailText;

    protected NamePage(String pageName) {
        super(pageName);
    }

    public void createControl(Composite parent) {
        setTitle("用户信息");
        setMessage("请输入您的姓名及Email", INFORMATION);
        setPageComplete(false);   // 未输入时无法进行下一步
        
        Composite topComp = new Composite(parent, SWT.NULL);
        topComp.setLayout(new GridLayout());
        nameText = new Text(topComp, SWT.BORDER);
        nameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        nameText.setText(StringUtils.defaultString(name));
        emailText = new Text(topComp, SWT.BORDER);
        emailText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        emailText.setText(StringUtils.defaultString(email));
        
        MyModifyListener listener = new MyModifyListener();
        nameText.addModifyListener(listener);
        emailText.addModifyListener(listener);

        setControl(topComp);
    }

    private class MyModifyListener implements ModifyListener {
        public void modifyText(ModifyEvent e) {
            name = nameText.getText().trim();
            if (StringUtils.isBlank(name)) {
                setErrorMessage("姓名不能为空"); // 提示错误信息
                return;
            }
            email = emailText.getText().trim();
            if (StringUtils.isBlank(email)) {
                setErrorMessage("邮箱不能为空");
                return;
            }
            setErrorMessage(null);
            setPageComplete(true);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String string) {
        name = string;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String string) {
        email = string;
    }
}
