
package bigkel.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import bigkel.diagram.providers.MyElementTypes;

/**
 * @generated
 */
public class MyPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createBigkel1Group());
	}

	/**
	* Creates "bigkel" palette tool group
	* @generated
	*/
	private PaletteContainer createBigkel1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Bigkel1Group_title);
		paletteContainer.setId("createBigkel1Group"); //$NON-NLS-1$
		paletteContainer.add(createFile1CreationTool());
		paletteContainer.add(createFolder2CreationTool());
		paletteContainer.add(createFolderRequestFloder3CreationTool());
		paletteContainer.add(createFolderRequestFiles4CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createFile1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.File1CreationTool_title,
				Messages.File1CreationTool_desc, Collections.singletonList(MyElementTypes.File_2002));
		entry.setId("createFile1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MyElementTypes.getImageDescriptor(MyElementTypes.File_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFolder2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Folder2CreationTool_title,
				Messages.Folder2CreationTool_desc, Collections.singletonList(MyElementTypes.Folder_2001));
		entry.setId("createFolder2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MyElementTypes.getImageDescriptor(MyElementTypes.Folder_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFolderRequestFloder3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.FolderRequestFloder3CreationTool_title,
				Messages.FolderRequestFloder3CreationTool_desc,
				Collections.singletonList(MyElementTypes.FolderRequestFloder_4001));
		entry.setId("createFolderRequestFloder3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MyElementTypes.getImageDescriptor(MyElementTypes.FolderRequestFloder_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFolderRequestFiles4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.FolderRequestFiles4CreationTool_title,
				Messages.FolderRequestFiles4CreationTool_desc,
				Collections.singletonList(MyElementTypes.FolderRequestFiles_4002));
		entry.setId("createFolderRequestFiles4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MyElementTypes.getImageDescriptor(MyElementTypes.FolderRequestFiles_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
