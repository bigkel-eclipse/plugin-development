/*
 * Copyright (c) 2009, Jean-François Brazeau. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 *  1. Redistributions of source code must retain the above copyright notice,
 *     this list of conditions and the following disclaimer.
 * 
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 * 
 *  3. The name of the author may not be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIEDWARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS
 * OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE
 * USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package jfb.examples.gmf.filesystem.diagram.providers;

import jfb.examples.gmf.filesystem.FilesystemPackage;
import jfb.examples.gmf.filesystem.diagram.edit.parts.FileName2EditPart;
import jfb.examples.gmf.filesystem.diagram.edit.parts.FileNameEditPart;
import jfb.examples.gmf.filesystem.diagram.edit.parts.FolderName2EditPart;
import jfb.examples.gmf.filesystem.diagram.edit.parts.FolderNameEditPart;
import jfb.examples.gmf.filesystem.diagram.parsers.MessageFormatParser;
import jfb.examples.gmf.filesystem.diagram.part.FilesystemVisualIDRegistry;

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
public class FilesystemParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser fileName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getFileName_5001Parser() {
		if (fileName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { FilesystemPackage.eINSTANCE
					.getFile_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fileName_5001Parser = parser;
		}
		return fileName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser folderName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getFolderName_5002Parser() {
		if (folderName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { FilesystemPackage.eINSTANCE
					.getFolder_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			folderName_5002Parser = parser;
		}
		return folderName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser folderName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getFolderName_5004Parser() {
		if (folderName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { FilesystemPackage.eINSTANCE
					.getFolder_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			folderName_5004Parser = parser;
		}
		return folderName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser fileName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getFileName_5003Parser() {
		if (fileName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { FilesystemPackage.eINSTANCE
					.getFile_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fileName_5003Parser = parser;
		}
		return fileName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case FileNameEditPart.VISUAL_ID:
			return getFileName_5001Parser();
		case FolderNameEditPart.VISUAL_ID:
			return getFolderName_5002Parser();
		case FolderName2EditPart.VISUAL_ID:
			return getFolderName_5004Parser();
		case FileName2EditPart.VISUAL_ID:
			return getFileName_5003Parser();
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
			return getParser(FilesystemVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(FilesystemVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (FilesystemElementTypes.getElement(hint) == null) {
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
