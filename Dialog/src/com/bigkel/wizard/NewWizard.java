package com.bigkel.wizard;

import org.eclipse.jface.wizard.Wizard;

public class NewWizard extends Wizard {

	private NamePage namePage;
	private SchoolPage schoolPage;

	public void addPages() {
		// 创建页面对象，并设置页面的名称
		namePage = new NamePage("namePage");
		schoolPage = new SchoolPage("schoolPage");
		// 加入两页面，加入的顺序就是界面上显示的顺序
		addPage(namePage);
		addPage(schoolPage);
	}

	// 由此方法判断“完成”按钮何时有效。返回true则有效，false无效
	public boolean canFinish() {
		if (this.getContainer().getCurrentPage() != schoolPage) {
			return false;
		}else {
			if (schoolPage.getSchool() != null && schoolPage.getSchool().isEmpty()) {
				return false;
			}else if (schoolPage.getSchool() == null) {
				return false;
			}else {
				return true;
			}
		}
		//return super.canFinish();
	}

	// 当单击“完成”按钮退出向导时，将执行此方法
	public boolean performFinish() {
		// 取出各页面的值，并打印输出
		System.out.println(namePage.getName());
		System.out.println(namePage.getEmail());
		System.out.println(schoolPage.getSchool());
		return true;
	}
}
