package com.itchenyang.library;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface Writer extends EObject
{
  /**
   * @model
   */
  String getName();

  /**
	 * Sets the value of the '{@link com.itchenyang.library.Writer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

		/**
   * @model opposite="author"
   */
  EList<Book> getBooks();
}