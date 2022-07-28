/**
 */
package bigkel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filesystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bigkel.Filesystem#getFolders <em>Folders</em>}</li>
 *   <li>{@link bigkel.Filesystem#getFiles <em>Files</em>}</li>
 * </ul>
 *
 * @see bigkel.BigkelPackage#getFilesystem()
 * @model
 * @generated
 */
public interface Filesystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Folders</b></em>' containment reference list.
	 * The list contents are of type {@link bigkel.Folder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folders</em>' containment reference list.
	 * @see bigkel.BigkelPackage#getFilesystem_Folders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Folder> getFolders();

	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link bigkel.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see bigkel.BigkelPackage#getFilesystem_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getFiles();

} // Filesystem
