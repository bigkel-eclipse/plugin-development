/**
 */
package bigkel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bigkel.BigkelFactory
 * @model kind="package"
 * @generated
 */
public interface BigkelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bigkel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "bigkel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bigkel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BigkelPackage eINSTANCE = bigkel.impl.BigkelPackageImpl.init();

	/**
	 * The meta object id for the '{@link bigkel.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bigkel.impl.RootImpl
	 * @see bigkel.impl.BigkelPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__NEXT = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__NODE = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bigkel.impl.NodeModelImpl <em>Node Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bigkel.impl.NodeModelImpl
	 * @see bigkel.impl.BigkelPackageImpl#getNodeModel()
	 * @generated
	 */
	int NODE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MODEL__DATA = 1;

	/**
	 * The number of structural features of the '<em>Node Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Node Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bigkel.impl.DataModelImpl <em>Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bigkel.impl.DataModelImpl
	 * @see bigkel.impl.BigkelPackageImpl#getDataModel()
	 * @generated
	 */
	int DATA_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Request Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__REQUEST_NEXT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bigkel.impl.NextModelImpl <em>Next Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bigkel.impl.NextModelImpl
	 * @see bigkel.impl.BigkelPackageImpl#getNextModel()
	 * @generated
	 */
	int NEXT_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Request Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_MODEL__REQUEST_NEXT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_MODEL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Next Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Next Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link bigkel.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see bigkel.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link bigkel.Root#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next</em>'.
	 * @see bigkel.Root#getNext()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Next();

	/**
	 * Returns the meta object for the containment reference list '{@link bigkel.Root#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see bigkel.Root#getNode()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Node();

	/**
	 * Returns the meta object for class '{@link bigkel.NodeModel <em>Node Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Model</em>'.
	 * @see bigkel.NodeModel
	 * @generated
	 */
	EClass getNodeModel();

	/**
	 * Returns the meta object for the attribute '{@link bigkel.NodeModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bigkel.NodeModel#getName()
	 * @see #getNodeModel()
	 * @generated
	 */
	EAttribute getNodeModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link bigkel.NodeModel#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see bigkel.NodeModel#getData()
	 * @see #getNodeModel()
	 * @generated
	 */
	EReference getNodeModel_Data();

	/**
	 * Returns the meta object for class '{@link bigkel.DataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Model</em>'.
	 * @see bigkel.DataModel
	 * @generated
	 */
	EClass getDataModel();

	/**
	 * Returns the meta object for the reference list '{@link bigkel.DataModel#getRequestNext <em>Request Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Request Next</em>'.
	 * @see bigkel.DataModel#getRequestNext()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_RequestNext();

	/**
	 * Returns the meta object for the attribute '{@link bigkel.DataModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bigkel.DataModel#getName()
	 * @see #getDataModel()
	 * @generated
	 */
	EAttribute getDataModel_Name();

	/**
	 * Returns the meta object for class '{@link bigkel.NextModel <em>Next Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Next Model</em>'.
	 * @see bigkel.NextModel
	 * @generated
	 */
	EClass getNextModel();

	/**
	 * Returns the meta object for the reference '{@link bigkel.NextModel#getRequestNext <em>Request Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Request Next</em>'.
	 * @see bigkel.NextModel#getRequestNext()
	 * @see #getNextModel()
	 * @generated
	 */
	EReference getNextModel_RequestNext();

	/**
	 * Returns the meta object for the attribute '{@link bigkel.NextModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bigkel.NextModel#getName()
	 * @see #getNextModel()
	 * @generated
	 */
	EAttribute getNextModel_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BigkelFactory getBigkelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bigkel.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bigkel.impl.RootImpl
		 * @see bigkel.impl.BigkelPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__NEXT = eINSTANCE.getRoot_Next();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__NODE = eINSTANCE.getRoot_Node();

		/**
		 * The meta object literal for the '{@link bigkel.impl.NodeModelImpl <em>Node Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bigkel.impl.NodeModelImpl
		 * @see bigkel.impl.BigkelPackageImpl#getNodeModel()
		 * @generated
		 */
		EClass NODE_MODEL = eINSTANCE.getNodeModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_MODEL__NAME = eINSTANCE.getNodeModel_Name();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_MODEL__DATA = eINSTANCE.getNodeModel_Data();

		/**
		 * The meta object literal for the '{@link bigkel.impl.DataModelImpl <em>Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bigkel.impl.DataModelImpl
		 * @see bigkel.impl.BigkelPackageImpl#getDataModel()
		 * @generated
		 */
		EClass DATA_MODEL = eINSTANCE.getDataModel();

		/**
		 * The meta object literal for the '<em><b>Request Next</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__REQUEST_NEXT = eINSTANCE.getDataModel_RequestNext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MODEL__NAME = eINSTANCE.getDataModel_Name();

		/**
		 * The meta object literal for the '{@link bigkel.impl.NextModelImpl <em>Next Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bigkel.impl.NextModelImpl
		 * @see bigkel.impl.BigkelPackageImpl#getNextModel()
		 * @generated
		 */
		EClass NEXT_MODEL = eINSTANCE.getNextModel();

		/**
		 * The meta object literal for the '<em><b>Request Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEXT_MODEL__REQUEST_NEXT = eINSTANCE.getNextModel_RequestNext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEXT_MODEL__NAME = eINSTANCE.getNextModel_Name();

	}

} //BigkelPackage
