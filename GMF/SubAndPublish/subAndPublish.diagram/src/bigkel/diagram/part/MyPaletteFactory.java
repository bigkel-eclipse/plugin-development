
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
		paletteContainer.add(createNodeModel1CreationTool());
		paletteContainer.add(createDataModel2CreationTool());
		paletteContainer.add(createDataModelRequestNext3CreationTool());
		paletteContainer.add(createNextModel4CreationTool());
		paletteContainer.add(createNextModelRequestNext5CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createNodeModel1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NodeModel1CreationTool_title,
				Messages.NodeModel1CreationTool_desc, Collections.singletonList(MyElementTypes.NodeModel_2001));
		entry.setId("createNodeModel1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MyElementTypes.getImageDescriptor(MyElementTypes.NodeModel_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataModel2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DataModel2CreationTool_title,
				Messages.DataModel2CreationTool_desc, Collections.singletonList(MyElementTypes.DataModel_3001));
		entry.setId("createDataModel2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MyElementTypes.getImageDescriptor(MyElementTypes.DataModel_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataModelRequestNext3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.DataModelRequestNext3CreationTool_title,
				Messages.DataModelRequestNext3CreationTool_desc,
				Collections.singletonList(MyElementTypes.DataModelRequestNext_4001));
		entry.setId("createDataModelRequestNext3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MyElementTypes.getImageDescriptor(MyElementTypes.DataModelRequestNext_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNextModel4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NextModel4CreationTool_title,
				Messages.NextModel4CreationTool_desc, Collections.singletonList(MyElementTypes.NextModel_2002));
		entry.setId("createNextModel4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MyElementTypes.getImageDescriptor(MyElementTypes.NextModel_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNextModelRequestNext5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.NextModelRequestNext5CreationTool_title,
				Messages.NextModelRequestNext5CreationTool_desc,
				Collections.singletonList(MyElementTypes.NextModelRequestNext_4002));
		entry.setId("createNextModelRequestNext5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MyElementTypes.getImageDescriptor(MyElementTypes.NextModelRequestNext_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
