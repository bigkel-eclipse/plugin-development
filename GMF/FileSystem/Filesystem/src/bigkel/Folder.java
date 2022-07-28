/**
 */
package bigkel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bigkel.Folder#getName <em>Name</em>}</li>
 *   <li>{@link bigkel.Folder#getRequestFloder <em>Request Floder</em>}</li>
 *   <li>{@link bigkel.Folder#getRequestFiles <em>Request Files</em>}</li>
 * </ul>
 *
 * @see bigkel.BigkelPackage#getFolder()
 * @model
 * @generated
 */
public interface Folder extends EObject {
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
	 * @see bigkel.BigkelPackage#getFolder_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bigkel.Folder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Request Floder</b></em>' reference list.
	 * The list contents are of type {@link bigkel.Folder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Floder</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Floder</em>' reference list.
	 * @see bigkel.BigkelPackage#getFolder_RequestFloder()
	 * @model
	 * @generated
	 */
	EList<Folder> getRequestFloder();

	/**
	 * Returns the value of the '<em><b>Request Files</b></em>' reference list.
	 * The list contents are of type {@link bigkel.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Files</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Files</em>' reference list.
	 * @see bigkel.BigkelPackage#getFolder_RequestFiles()
	 * @model
	 * @generated
	 */
	EList<File> getRequestFiles();

} // Folder
