/**
 */
package bigkel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bigkel.DataModel#getRequestNext <em>Request Next</em>}</li>
 *   <li>{@link bigkel.DataModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see bigkel.BigkelPackage#getDataModel()
 * @model
 * @generated
 */
public interface DataModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Next</b></em>' reference list.
	 * The list contents are of type {@link bigkel.NextModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Next</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Next</em>' reference list.
	 * @see bigkel.BigkelPackage#getDataModel_RequestNext()
	 * @model
	 * @generated
	 */
	EList<NextModel> getRequestNext();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bigkel.BigkelPackage#getDataModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bigkel.DataModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DataModel
