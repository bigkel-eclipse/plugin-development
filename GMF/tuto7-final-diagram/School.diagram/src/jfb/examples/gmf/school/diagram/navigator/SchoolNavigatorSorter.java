package jfb.examples.gmf.school.diagram.navigator;

import jfb.examples.gmf.school.diagram.part.SchoolVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class SchoolNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof SchoolNavigatorItem) {
			SchoolNavigatorItem item = (SchoolNavigatorItem) element;
			return SchoolVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
