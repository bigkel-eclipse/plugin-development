/**
 */
package bigkel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Next Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bigkel.NextModel#getRequestNext <em>Request Next</em>}</li>
 *   <li>{@link bigkel.NextModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see bigkel.BigkelPackage#getNextModel()
 * @model
 * @generated
 */
public interface NextModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Next</em>' reference.
	 * @see #setRequestNext(NextModel)
	 * @see bigkel.BigkelPackage#getNextModel_RequestNext()
	 * @model
	 * @generated
	 */
	NextModel getRequestNext();

	/**
	 * Sets the value of the '{@link bigkel.NextModel#getRequestNext <em>Request Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Next</em>' reference.
	 * @see #getRequestNext()
	 * @generated
	 */
	void setRequestNext(NextModel value);

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
	 * @see bigkel.BigkelPackage#getNextModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bigkel.NextModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NextModel
