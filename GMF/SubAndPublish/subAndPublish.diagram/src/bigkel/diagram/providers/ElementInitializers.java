package bigkel.diagram.providers;

import bigkel.diagram.part.MyDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = MyDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			MyDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
