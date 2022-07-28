package bigkel.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import bigkel.BigkelPackage;
import bigkel.diagram.edit.parts.DataModelNameEditPart;
import bigkel.diagram.edit.parts.NextModelNameEditPart;
import bigkel.diagram.edit.parts.NodeModelNameEditPart;
import bigkel.diagram.parsers.MessageFormatParser;
import bigkel.diagram.part.MyVisualIDRegistry;

/**
 * @generated
 */
public class MyParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser nodeModelName_5002Parser;

	/**
	* @generated
	*/
	private IParser getNodeModelName_5002Parser() {
		if (nodeModelName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { BigkelPackage.eINSTANCE.getNodeModel_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodeModelName_5002Parser = parser;
		}
		return nodeModelName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser nextModelName_5003Parser;

	/**
	* @generated
	*/
	private IParser getNextModelName_5003Parser() {
		if (nextModelName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { BigkelPackage.eINSTANCE.getNextModel_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nextModelName_5003Parser = parser;
		}
		return nextModelName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser dataModelName_5001Parser;

	/**
	* @generated
	*/
	private IParser getDataModelName_5001Parser() {
		if (dataModelName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { BigkelPackage.eINSTANCE.getDataModel_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataModelName_5001Parser = parser;
		}
		return dataModelName_5001Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case NodeModelNameEditPart.VISUAL_ID:
			return getNodeModelName_5002Parser();
		case NextModelNameEditPart.VISUAL_ID:
			return getNextModelName_5003Parser();
		case DataModelNameEditPart.VISUAL_ID:
			return getDataModelName_5001Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(MyVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MyVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MyElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
