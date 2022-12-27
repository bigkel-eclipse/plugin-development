package jfb.examples.gmf.school;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface Classroom extends EObject {

	/**
	 * @model
	 */
	String getName();


	/**
	 * Sets the value of the '{@link jfb.examples.gmf.school.Classroom#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);


	/**
	 * @model containment="true"
	 */
	EList<Student> getStudents();

}
