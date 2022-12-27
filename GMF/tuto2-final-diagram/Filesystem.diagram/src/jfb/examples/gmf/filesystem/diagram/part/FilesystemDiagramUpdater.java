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

package jfb.examples.gmf.filesystem.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import jfb.examples.gmf.filesystem.File;
import jfb.examples.gmf.filesystem.Filesystem;
import jfb.examples.gmf.filesystem.Folder;
import jfb.examples.gmf.filesystem.diagram.edit.parts.File2EditPart;
import jfb.examples.gmf.filesystem.diagram.edit.parts.FileEditPart;
import jfb.examples.gmf.filesystem.diagram.edit.parts.FilesystemEditPart;
import jfb.examples.gmf.filesystem.diagram.edit.parts.Folder2EditPart;
import jfb.examples.gmf.filesystem.diagram.edit.parts.FolderEditPart;
import jfb.examples.gmf.filesystem.diagram.edit.parts.FolderFolderCompartment2EditPart;
import jfb.examples.gmf.filesystem.diagram.edit.parts.FolderFolderCompartmentEditPart;

import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class FilesystemDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (FilesystemVisualIDRegistry.getVisualID(view)) {
		case FolderFolderCompartmentEditPart.VISUAL_ID:
			return getFolderFolderCompartment_7001SemanticChildren(view);
		case FolderFolderCompartment2EditPart.VISUAL_ID:
			return getFolderFolderCompartment_7002SemanticChildren(view);
		case FilesystemEditPart.VISUAL_ID:
			return getFilesystem_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFolderFolderCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Folder modelElement = (Folder) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getFolders().iterator(); it.hasNext();) {
			Folder childElement = (Folder) it.next();
			int visualID = FilesystemVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Folder2EditPart.VISUAL_ID) {
				result
						.add(new FilesystemNodeDescriptor(childElement,
								visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getFiles().iterator(); it.hasNext();) {
			File childElement = (File) it.next();
			int visualID = FilesystemVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == File2EditPart.VISUAL_ID) {
				result
						.add(new FilesystemNodeDescriptor(childElement,
								visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFolderFolderCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Folder modelElement = (Folder) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getFolders().iterator(); it.hasNext();) {
			Folder childElement = (Folder) it.next();
			int visualID = FilesystemVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Folder2EditPart.VISUAL_ID) {
				result
						.add(new FilesystemNodeDescriptor(childElement,
								visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getFiles().iterator(); it.hasNext();) {
			File childElement = (File) it.next();
			int visualID = FilesystemVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == File2EditPart.VISUAL_ID) {
				result
						.add(new FilesystemNodeDescriptor(childElement,
								visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFilesystem_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Filesystem modelElement = (Filesystem) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getFiles().iterator(); it.hasNext();) {
			File childElement = (File) it.next();
			int visualID = FilesystemVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FileEditPart.VISUAL_ID) {
				result
						.add(new FilesystemNodeDescriptor(childElement,
								visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getFolders().iterator(); it.hasNext();) {
			Folder childElement = (Folder) it.next();
			int visualID = FilesystemVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FolderEditPart.VISUAL_ID) {
				result
						.add(new FilesystemNodeDescriptor(childElement,
								visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (FilesystemVisualIDRegistry.getVisualID(view)) {
		case FilesystemEditPart.VISUAL_ID:
			return getFilesystem_1000ContainedLinks(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2001ContainedLinks(view);
		case FolderEditPart.VISUAL_ID:
			return getFolder_2002ContainedLinks(view);
		case Folder2EditPart.VISUAL_ID:
			return getFolder_3001ContainedLinks(view);
		case File2EditPart.VISUAL_ID:
			return getFile_3002ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (FilesystemVisualIDRegistry.getVisualID(view)) {
		case FileEditPart.VISUAL_ID:
			return getFile_2001IncomingLinks(view);
		case FolderEditPart.VISUAL_ID:
			return getFolder_2002IncomingLinks(view);
		case Folder2EditPart.VISUAL_ID:
			return getFolder_3001IncomingLinks(view);
		case File2EditPart.VISUAL_ID:
			return getFile_3002IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (FilesystemVisualIDRegistry.getVisualID(view)) {
		case FileEditPart.VISUAL_ID:
			return getFile_2001OutgoingLinks(view);
		case FolderEditPart.VISUAL_ID:
			return getFolder_2002OutgoingLinks(view);
		case Folder2EditPart.VISUAL_ID:
			return getFolder_3001OutgoingLinks(view);
		case File2EditPart.VISUAL_ID:
			return getFile_3002OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFilesystem_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFile_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFolder_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFolder_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFile_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFile_2001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFolder_2002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFolder_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFile_3002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFile_2001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFolder_2002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFolder_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFile_3002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

}
