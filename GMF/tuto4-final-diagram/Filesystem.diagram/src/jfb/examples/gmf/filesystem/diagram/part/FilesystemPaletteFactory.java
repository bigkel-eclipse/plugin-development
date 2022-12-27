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

import java.util.ArrayList;
import java.util.List;

import jfb.examples.gmf.filesystem.diagram.providers.FilesystemElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class FilesystemPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createFilesystem1Group());
	}

	/**
	 * Creates "filesystem" palette tool group
	 * @generated
	 */
	private PaletteContainer createFilesystem1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Filesystem1Group_title);
		paletteContainer.setId("createFilesystem1Group"); //$NON-NLS-1$
		paletteContainer.add(createFile1CreationTool());
		paletteContainer.add(createFolder2CreationTool());
		paletteContainer.add(createFolderFolders3CreationTool());
		paletteContainer.add(createFolderFiles4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFile1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(FilesystemElementTypes.File_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.File1CreationTool_title,
				Messages.File1CreationTool_desc, types);
		entry.setId("createFile1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(FilesystemDiagramEditorPlugin
						.findImageDescriptor("/Filesystem.edit/icons/full/obj16/File.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(FilesystemDiagramEditorPlugin
						.findImageDescriptor("/Filesystem.edit/icons/full/obj32/File.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFolder2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(FilesystemElementTypes.Folder_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Folder2CreationTool_title,
				Messages.Folder2CreationTool_desc, types);
		entry.setId("createFolder2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(FilesystemDiagramEditorPlugin
						.findImageDescriptor("/Filesystem.edit/icons/full/obj16/Folder.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(FilesystemDiagramEditorPlugin
						.findImageDescriptor("/Filesystem.edit/icons/full/obj32/Folder.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFolderFolders3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(FilesystemElementTypes.FolderFolders_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.FolderFolders3CreationTool_title,
				Messages.FolderFolders3CreationTool_desc, types);
		entry.setId("createFolderFolders3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(FilesystemDiagramEditorPlugin
						.findImageDescriptor("/Filesystem.edit/icons/full/obj16/Edge.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(FilesystemDiagramEditorPlugin
						.findImageDescriptor("/Filesystem.edit/icons/full/obj32/Edge.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFolderFiles4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(FilesystemElementTypes.FolderFiles_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.FolderFiles4CreationTool_title,
				Messages.FolderFiles4CreationTool_desc, types);
		entry.setId("createFolderFiles4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(FilesystemDiagramEditorPlugin
						.findImageDescriptor("/Filesystem.edit/icons/full/obj16/Edge.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(FilesystemDiagramEditorPlugin
						.findImageDescriptor("/Filesystem.edit/icons/full/obj32/Edge.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
