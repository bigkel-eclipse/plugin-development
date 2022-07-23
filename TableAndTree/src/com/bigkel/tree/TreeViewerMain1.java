package com.bigkel.tree;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class TreeViewerMain1 {
	public static void main(String[] args) {
		TreeViewerMain1 window = new TreeViewerMain1();
        window.open();
    }

    //�������open()����.���Ǵ���һ�����͵�SWT����Ĳ���
    public void open(){
        //1.Display�������һʵ��ѭ���Ϳ���UI�̺߳������߳�֮���ͨ��
        final Display display = new Display();
        //2.����һ�����߶��Shell(shell�ǳ����������)
        final Shell shell = new Shell();
        //3.����shell�Ĳ���.
        shell.setSize(200, 300);
        //����shell�Ĳ���ΪFillLayout
        shell.setLayout(new FillLayout());
        shell.setText("TreeViewer�ĵ�һ������");


        Composite c = new Composite(shell, SWT.NONE);
        c.setLayout(new FillLayout());
        TreeViewer treeViewer = new TreeViewer(c, SWT.BORDER);
        treeViewer.setContentProvider(new TreeViewerContentProvider());
        treeViewer.setLabelProvider(new TreeViewerLableProvider());
        // ��TableViewerһ�������ݵ����Ҳ��setInput����
        Object inputObj = DataFactory.createTreeData();
        treeViewer.setInput(inputObj);

        //7.����Shell�е����(���������û�м������,ֻ��һ���մ���)
        shell.open();
        //8.дһ��ʱ��ת��ѭ��
        while(!shell.isDisposed()){//���������û�йر�,��һֱѭ��
            //dispose ��"����,����,�ٵ�"����˼
            if(!display.readAndDispatch()){//// ���display��æ
                display.sleep();// display����
            }
        }
    }
}
