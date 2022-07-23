package com.bigkel.jface;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ProgressTest {
	public static void main(String[] args) {
		final Display display = Display.getCurrent();
		final Shell shell = new Shell(display);
		shell.setSize(500,500);
		
		try {
			new ProgressMonitorDialog(shell).run(true, true, new MyRunnableProgress());
		} catch (InvocationTargetException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MyRunnableProgress implements IRunnableWithProgress {

	@Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		monitor.beginTask("开始下载任务......", 50);
		for(int i = 0; i < 50; i ++) {
			if (monitor.isCanceled()) {
				return;
			}
			Thread.sleep(1000);
			monitor.worked(1);
			monitor.setTaskName("第" + (i + 1) + "个文件下载成功");
		}
		monitor.done();
	}
}
