package bigkel.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import bigkel.diagram.edit.parts.FilesystemEditPart;
import bigkel.diagram.edit.parts.MyEditPartFactory;
import bigkel.diagram.part.MyVisualIDRegistry;

/**
 * @generated
 */
public class MyEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public MyEditPartProvider() {
		super(new MyEditPartFactory(), MyVisualIDRegistry.TYPED_INSTANCE, FilesystemEditPart.MODEL_ID);
	}

}
