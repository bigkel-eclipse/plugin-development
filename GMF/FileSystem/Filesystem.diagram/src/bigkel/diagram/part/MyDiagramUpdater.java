package bigkel.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import bigkel.BigkelPackage;
import bigkel.File;
import bigkel.Filesystem;
import bigkel.Folder;
import bigkel.diagram.edit.parts.FileEditPart;
import bigkel.diagram.edit.parts.FilesystemEditPart;
import bigkel.diagram.edit.parts.FolderEditPart;
import bigkel.diagram.edit.parts.FolderRequestFilesEditPart;
import bigkel.diagram.edit.parts.FolderRequestFloderEditPart;
import bigkel.diagram.providers.MyElementTypes;

/**
 * @generated
 */
public class MyDiagramUpdater {

	/**
	* @generated
	*/
	public static List<MyNodeDescriptor> getSemanticChildren(View view) {
		switch (MyVisualIDRegistry.getVisualID(view)) {
		case FilesystemEditPart.VISUAL_ID:
			return getFilesystem_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MyNodeDescriptor> getFilesystem_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Filesystem modelElement = (Filesystem) view.getElement();
		LinkedList<MyNodeDescriptor> result = new LinkedList<MyNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFolders().iterator(); it.hasNext();) {
			Folder childElement = (Folder) it.next();
			int visualID = MyVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FolderEditPart.VISUAL_ID) {
				result.add(new MyNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFiles().iterator(); it.hasNext();) {
			File childElement = (File) it.next();
			int visualID = MyVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FileEditPart.VISUAL_ID) {
				result.add(new MyNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<MyLinkDescriptor> getContainedLinks(View view) {
		switch (MyVisualIDRegistry.getVisualID(view)) {
		case FilesystemEditPart.VISUAL_ID:
			return getFilesystem_1000ContainedLinks(view);
		case FolderEditPart.VISUAL_ID:
			return getFolder_2001ContainedLinks(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MyLinkDescriptor> getIncomingLinks(View view) {
		switch (MyVisualIDRegistry.getVisualID(view)) {
		case FolderEditPart.VISUAL_ID:
			return getFolder_2001IncomingLinks(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MyLinkDescriptor> getOutgoingLinks(View view) {
		switch (MyVisualIDRegistry.getVisualID(view)) {
		case FolderEditPart.VISUAL_ID:
			return getFolder_2001OutgoingLinks(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getFilesystem_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getFolder_2001ContainedLinks(View view) {
		Folder modelElement = (Folder) view.getElement();
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Folder_RequestFloder_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Folder_RequestFiles_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getFile_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getFolder_2001IncomingLinks(View view) {
		Folder modelElement = (Folder) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Folder_RequestFloder_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getFile_2002IncomingLinks(View view) {
		File modelElement = (File) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Folder_RequestFiles_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getFolder_2001OutgoingLinks(View view) {
		Folder modelElement = (Folder) view.getElement();
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Folder_RequestFloder_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Folder_RequestFiles_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getFile_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<MyLinkDescriptor> getIncomingFeatureModelFacetLinks_Folder_RequestFloder_4001(
			Folder target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == BigkelPackage.eINSTANCE.getFolder_RequestFloder()) {
				result.add(new MyLinkDescriptor(setting.getEObject(), target, MyElementTypes.FolderRequestFloder_4001,
						FolderRequestFloderEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MyLinkDescriptor> getIncomingFeatureModelFacetLinks_Folder_RequestFiles_4002(File target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == BigkelPackage.eINSTANCE.getFolder_RequestFiles()) {
				result.add(new MyLinkDescriptor(setting.getEObject(), target, MyElementTypes.FolderRequestFiles_4002,
						FolderRequestFilesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MyLinkDescriptor> getOutgoingFeatureModelFacetLinks_Folder_RequestFloder_4001(
			Folder source) {
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		for (Iterator<?> destinations = source.getRequestFloder().iterator(); destinations.hasNext();) {
			Folder destination = (Folder) destinations.next();
			result.add(new MyLinkDescriptor(source, destination, MyElementTypes.FolderRequestFloder_4001,
					FolderRequestFloderEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MyLinkDescriptor> getOutgoingFeatureModelFacetLinks_Folder_RequestFiles_4002(
			Folder source) {
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		for (Iterator<?> destinations = source.getRequestFiles().iterator(); destinations.hasNext();) {
			File destination = (File) destinations.next();
			result.add(new MyLinkDescriptor(source, destination, MyElementTypes.FolderRequestFiles_4002,
					FolderRequestFilesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<MyNodeDescriptor> getSemanticChildren(View view) {
			return MyDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MyLinkDescriptor> getContainedLinks(View view) {
			return MyDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MyLinkDescriptor> getIncomingLinks(View view) {
			return MyDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MyLinkDescriptor> getOutgoingLinks(View view) {
			return MyDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
