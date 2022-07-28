package bigkel.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import bigkel.diagram.providers.MyElementTypes;
import bigkel.diagram.providers.MyModelingAssistantProvider;

/**
 * @generated
 */
public class MyModelingAssistantProviderOfRootEditPart extends MyModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MyElementTypes.NodeModel_2001);
		types.add(MyElementTypes.NextModel_2002);
		return types;
	}

}
