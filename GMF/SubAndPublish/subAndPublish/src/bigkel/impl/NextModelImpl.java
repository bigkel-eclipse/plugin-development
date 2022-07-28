/**
 */
package bigkel.impl;

import bigkel.BigkelPackage;
import bigkel.NextModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Next Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bigkel.impl.NextModelImpl#getRequestNext <em>Request Next</em>}</li>
 *   <li>{@link bigkel.impl.NextModelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NextModelImpl extends MinimalEObjectImpl.Container implements NextModel {
	/**
	 * The cached value of the '{@link #getRequestNext() <em>Request Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestNext()
	 * @generated
	 * @ordered
	 */
	protected NextModel requestNext;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NextModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BigkelPackage.Literals.NEXT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextModel getRequestNext() {
		if (requestNext != null && requestNext.eIsProxy()) {
			InternalEObject oldRequestNext = (InternalEObject)requestNext;
			requestNext = (NextModel)eResolveProxy(oldRequestNext);
			if (requestNext != oldRequestNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BigkelPackage.NEXT_MODEL__REQUEST_NEXT, oldRequestNext, requestNext));
			}
		}
		return requestNext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextModel basicGetRequestNext() {
		return requestNext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestNext(NextModel newRequestNext) {
		NextModel oldRequestNext = requestNext;
		requestNext = newRequestNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BigkelPackage.NEXT_MODEL__REQUEST_NEXT, oldRequestNext, requestNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BigkelPackage.NEXT_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BigkelPackage.NEXT_MODEL__REQUEST_NEXT:
				if (resolve) return getRequestNext();
				return basicGetRequestNext();
			case BigkelPackage.NEXT_MODEL__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BigkelPackage.NEXT_MODEL__REQUEST_NEXT:
				setRequestNext((NextModel)newValue);
				return;
			case BigkelPackage.NEXT_MODEL__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BigkelPackage.NEXT_MODEL__REQUEST_NEXT:
				setRequestNext((NextModel)null);
				return;
			case BigkelPackage.NEXT_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BigkelPackage.NEXT_MODEL__REQUEST_NEXT:
				return requestNext != null;
			case BigkelPackage.NEXT_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NextModelImpl
