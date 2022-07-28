package bigkel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import bigkel.diagram.part.MyVisualIDRegistry;

/**
 * @generated
 */
public class MyNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4004;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof MyNavigatorItem) {
			MyNavigatorItem item = (MyNavigatorItem) element;
			return MyVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
