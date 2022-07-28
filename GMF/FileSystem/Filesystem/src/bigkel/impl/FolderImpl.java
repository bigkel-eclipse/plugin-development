/**
 */
package bigkel.impl;

import bigkel.BigkelPackage;
import bigkel.File;
import bigkel.Folder;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bigkel.impl.FolderImpl#getName <em>Name</em>}</li>
 *   <li>{@link bigkel.impl.FolderImpl#getRequestFloder <em>Request Floder</em>}</li>
 *   <li>{@link bigkel.impl.FolderImpl#getRequestFiles <em>Request Files</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FolderImpl extends MinimalEObjectImpl.Container implements Folder {
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
	 * The cached value of the '{@link #getRequestFloder() <em>Request Floder</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestFloder()
	 * @generated
	 * @ordered
	 */
	protected EList<Folder> requestFloder;

	/**
	 * The cached value of the '{@link #getRequestFiles() <em>Request Files</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> requestFiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BigkelPackage.Literals.FOLDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BigkelPackage.FOLDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Folder> getRequestFloder() {
		if (requestFloder == null) {
			requestFloder = new EObjectResolvingEList<Folder>(Folder.class, this, BigkelPackage.FOLDER__REQUEST_FLODER);
		}
		return requestFloder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getRequestFiles() {
		if (requestFiles == null) {
			requestFiles = new EObjectResolvingEList<File>(File.class, this, BigkelPackage.FOLDER__REQUEST_FILES);
		}
		return requestFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BigkelPackage.FOLDER__NAME:
				return getName();
			case BigkelPackage.FOLDER__REQUEST_FLODER:
				return getRequestFloder();
			case BigkelPackage.FOLDER__REQUEST_FILES:
				return getRequestFiles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BigkelPackage.FOLDER__NAME:
				setName((String)newValue);
				return;
			case BigkelPackage.FOLDER__REQUEST_FLODER:
				getRequestFloder().clear();
				getRequestFloder().addAll((Collection<? extends Folder>)newValue);
				return;
			case BigkelPackage.FOLDER__REQUEST_FILES:
				getRequestFiles().clear();
				getRequestFiles().addAll((Collection<? extends File>)newValue);
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
			case BigkelPackage.FOLDER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BigkelPackage.FOLDER__REQUEST_FLODER:
				getRequestFloder().clear();
				return;
			case BigkelPackage.FOLDER__REQUEST_FILES:
				getRequestFiles().clear();
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
			case BigkelPackage.FOLDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BigkelPackage.FOLDER__REQUEST_FLODER:
				return requestFloder != null && !requestFloder.isEmpty();
			case BigkelPackage.FOLDER__REQUEST_FILES:
				return requestFiles != null && !requestFiles.isEmpty();
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

} //FolderImpl
