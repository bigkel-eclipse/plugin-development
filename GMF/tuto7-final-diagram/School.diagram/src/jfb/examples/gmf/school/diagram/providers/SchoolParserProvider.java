package jfb.examples.gmf.school.diagram.providers;

import jfb.examples.gmf.school.SchoolPackage;
import jfb.examples.gmf.school.diagram.edit.parts.ClassroomNameEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.SchoolNameEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.StudentNameEditPart;
import jfb.examples.gmf.school.diagram.parsers.MessageFormatParser;
import jfb.examples.gmf.school.diagram.part.SchoolVisualIDRegistry;

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

/**
 * @generated
 */
public class SchoolParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser schoolName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getSchoolName_5003Parser() {
		if (schoolName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { SchoolPackage.eINSTANCE
					.getSchool_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			schoolName_5003Parser = parser;
		}
		return schoolName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser classroomName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getClassroomName_5002Parser() {
		if (classroomName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { SchoolPackage.eINSTANCE
					.getClassroom_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			classroomName_5002Parser = parser;
		}
		return classroomName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser studentName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getStudentName_5001Parser() {
		if (studentName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { SchoolPackage.eINSTANCE
					.getStudent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			studentName_5001Parser = parser;
		}
		return studentName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SchoolNameEditPart.VISUAL_ID:
			return getSchoolName_5003Parser();
		case ClassroomNameEditPart.VISUAL_ID:
			return getClassroomName_5002Parser();
		case StudentNameEditPart.VISUAL_ID:
			return getStudentName_5001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(SchoolVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(SchoolVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (SchoolElementTypes.getElement(hint) == null) {
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
