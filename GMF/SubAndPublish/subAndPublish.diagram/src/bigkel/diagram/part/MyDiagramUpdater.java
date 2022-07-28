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
import bigkel.DataModel;
import bigkel.NextModel;
import bigkel.NodeModel;
import bigkel.Root;
import bigkel.diagram.edit.parts.DataModelEditPart;
import bigkel.diagram.edit.parts.DataModelRequestNextEditPart;
import bigkel.diagram.edit.parts.NextModelEditPart;
import bigkel.diagram.edit.parts.NextModelRequestNextEditPart;
import bigkel.diagram.edit.parts.NodeModelEditPart;
import bigkel.diagram.edit.parts.RootEditPart;
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
		case RootEditPart.VISUAL_ID:
			return getRoot_1000SemanticChildren(view);
		case NodeModelEditPart.VISUAL_ID:
			return getNodeModel_2001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MyNodeDescriptor> getRoot_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Root modelElement = (Root) view.getElement();
		LinkedList<MyNodeDescriptor> result = new LinkedList<MyNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNode().iterator(); it.hasNext();) {
			NodeModel childElement = (NodeModel) it.next();
			int visualID = MyVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == NodeModelEditPart.VISUAL_ID) {
				result.add(new MyNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNext().iterator(); it.hasNext();) {
			NextModel childElement = (NextModel) it.next();
			int visualID = MyVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == NextModelEditPart.VISUAL_ID) {
				result.add(new MyNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<MyNodeDescriptor> getNodeModel_2001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		NodeModel modelElement = (NodeModel) view.getElement();
		LinkedList<MyNodeDescriptor> result = new LinkedList<MyNodeDescriptor>();
		for (Iterator<?> it = modelElement.getData().iterator(); it.hasNext();) {
			DataModel childElement = (DataModel) it.next();
			int visualID = MyVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataModelEditPart.VISUAL_ID) {
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
		case RootEditPart.VISUAL_ID:
			return getRoot_1000ContainedLinks(view);
		case NodeModelEditPart.VISUAL_ID:
			return getNodeModel_2001ContainedLinks(view);
		case NextModelEditPart.VISUAL_ID:
			return getNextModel_2002ContainedLinks(view);
		case DataModelEditPart.VISUAL_ID:
			return getDataModel_3001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MyLinkDescriptor> getIncomingLinks(View view) {
		switch (MyVisualIDRegistry.getVisualID(view)) {
		case NodeModelEditPart.VISUAL_ID:
			return getNodeModel_2001IncomingLinks(view);
		case NextModelEditPart.VISUAL_ID:
			return getNextModel_2002IncomingLinks(view);
		case DataModelEditPart.VISUAL_ID:
			return getDataModel_3001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MyLinkDescriptor> getOutgoingLinks(View view) {
		switch (MyVisualIDRegistry.getVisualID(view)) {
		case NodeModelEditPart.VISUAL_ID:
			return getNodeModel_2001OutgoingLinks(view);
		case NextModelEditPart.VISUAL_ID:
			return getNextModel_2002OutgoingLinks(view);
		case DataModelEditPart.VISUAL_ID:
			return getDataModel_3001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getRoot_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getNodeModel_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getNextModel_2002ContainedLinks(View view) {
		NextModel modelElement = (NextModel) view.getElement();
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_NextModel_RequestNext_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getDataModel_3001ContainedLinks(View view) {
		DataModel modelElement = (DataModel) view.getElement();
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataModel_RequestNext_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getNodeModel_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getNextModel_2002IncomingLinks(View view) {
		NextModel modelElement = (NextModel) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DataModel_RequestNext_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_NextModel_RequestNext_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getDataModel_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getNodeModel_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getNextModel_2002OutgoingLinks(View view) {
		NextModel modelElement = (NextModel) view.getElement();
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_NextModel_RequestNext_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getDataModel_3001OutgoingLinks(View view) {
		DataModel modelElement = (DataModel) view.getElement();
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataModel_RequestNext_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MyLinkDescriptor> getIncomingFeatureModelFacetLinks_DataModel_RequestNext_4001(
			NextModel target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == BigkelPackage.eINSTANCE.getDataModel_RequestNext()) {
				result.add(new MyLinkDescriptor(setting.getEObject(), target, MyElementTypes.DataModelRequestNext_4001,
						DataModelRequestNextEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MyLinkDescriptor> getIncomingFeatureModelFacetLinks_NextModel_RequestNext_4002(
			NextModel target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == BigkelPackage.eINSTANCE.getNextModel_RequestNext()) {
				result.add(new MyLinkDescriptor(setting.getEObject(), target, MyElementTypes.NextModelRequestNext_4002,
						NextModelRequestNextEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MyLinkDescriptor> getOutgoingFeatureModelFacetLinks_DataModel_RequestNext_4001(
			DataModel source) {
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		for (Iterator<?> destinations = source.getRequestNext().iterator(); destinations.hasNext();) {
			NextModel destination = (NextModel) destinations.next();
			result.add(new MyLinkDescriptor(source, destination, MyElementTypes.DataModelRequestNext_4001,
					DataModelRequestNextEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MyLinkDescriptor> getOutgoingFeatureModelFacetLinks_NextModel_RequestNext_4002(
			NextModel source) {
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		NextModel destination = source.getRequestNext();
		if (destination == null) {
			return result;
		}
		result.add(new MyLinkDescriptor(source, destination, MyElementTypes.NextModelRequestNext_4002,
				NextModelRequestNextEditPart.VISUAL_ID));
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
