package com.itchenyang.library;

import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface Book extends EObject
{
  /**
   * @model
   */
  String getTitle();

  /**
	 * Sets the value of the '{@link com.itchenyang.library.Book#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

		/**
   * @model default="100"
   */
  int getPages();

  /**
	 * Sets the value of the '{@link com.itchenyang.library.Book#getPages <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pages</em>' attribute.
	 * @see #getPages()
	 * @generated
	 */
	void setPages(int value);

		/**
   * @model
   */
  BookCategory getCategory();

  /**
	 * Sets the value of the '{@link com.itchenyang.library.Book#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see com.itchenyang.library.BookCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(BookCategory value);

		/**
   * @model opposite="books"
   */
  Writer getAuthor();

		/**
	 * Sets the value of the '{@link com.itchenyang.library.Book#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Writer value);
}
