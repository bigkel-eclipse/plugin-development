package com.bigkel.wizard;

import org.eclipse.jface.wizard.Wizard;

public class NewWizard extends Wizard {

	private NamePage namePage;
	private SchoolPage schoolPage;

	public void addPages() {
		// ����ҳ����󣬲�����ҳ�������
		namePage = new NamePage("namePage");
		schoolPage = new SchoolPage("schoolPage");
		// ������ҳ�棬�����˳����ǽ�������ʾ��˳��
		addPage(namePage);
		addPage(schoolPage);
	}

	// �ɴ˷����жϡ���ɡ���ť��ʱ��Ч������true����Ч��false��Ч
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

	// ����������ɡ���ť�˳���ʱ����ִ�д˷���
	public boolean performFinish() {
		// ȡ����ҳ���ֵ������ӡ���
		System.out.println(namePage.getName());
		System.out.println(namePage.getEmail());
		System.out.println(schoolPage.getSchool());
		return true;
	}
}
