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

    //定义这个open()方法.就是创建一个典型的SWT程序的步骤
    public void open(){
        //1.Display负责管理一实现循环和控制UI线程和其他线程之间的通信
        final Display display = new Display();
        //2.创建一个或者多个Shell(shell是程序的主窗口)
        final Shell shell = new Shell();
        //3.设置shell的布局.
        shell.setSize(200, 300);
        //设置shell的布局为FillLayout
        shell.setLayout(new FillLayout());
        shell.setText("TreeViewer的第一个例子");


        Composite c = new Composite(shell, SWT.NONE);
        c.setLayout(new FillLayout());
        TreeViewer treeViewer = new TreeViewer(c, SWT.BORDER);
        treeViewer.setContentProvider(new TreeViewerContentProvider());
        treeViewer.setLabelProvider(new TreeViewerLableProvider());
        // 和TableViewer一样，数据的入口也是setInput方法
        Object inputObj = DataFactory.createTreeData();
        treeViewer.setInput(inputObj);

        //7.创建Shell中的组件(这个例子中没有加入组件,只有一个空窗口)
        shell.open();
        //8.写一个时间转发循环
        while(!shell.isDisposed()){//如果主窗口没有关闭,则一直循环
            //dispose 是"处理,处置,毁掉"的意思
            if(!display.readAndDispatch()){//// 如果display不忙
                display.sleep();// display休眠
            }
        }
    }
}
