package jfb.examples.gmf.school;

import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface Diagram extends EObject {

	/**
	 * @model containment="true"
	 */
	School getSchool();

	/**
	 * Sets the value of the '{@link jfb.examples.gmf.school.Diagram#getSchool <em>School</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School</em>' containment reference.
	 * @see #getSchool()
	 * @generated
	 */
	void setSchool(School value);

}
