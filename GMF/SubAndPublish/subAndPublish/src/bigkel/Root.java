/**
 */
package bigkel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bigkel.Root#getNext <em>Next</em>}</li>
 *   <li>{@link bigkel.Root#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see bigkel.BigkelPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference list.
	 * The list contents are of type {@link bigkel.NextModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference list.
	 * @see bigkel.BigkelPackage#getRoot_Next()
	 * @model containment="true"
	 * @generated
	 */
	EList<NextModel> getNext();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link bigkel.NodeModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see bigkel.BigkelPackage#getRoot_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeModel> getNode();

} // Root
