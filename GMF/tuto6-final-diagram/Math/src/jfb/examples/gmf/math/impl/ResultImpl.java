/*
 * Copyright (c) 2009, Jean-François Brazeau. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 *  1. Redistributions of source code must retain the above copyright notice,
 *     this list of conditions and the following disclaimer.
 * 
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 * 
 *  3. The name of the author may not be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIEDWARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS
 * OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE
 * USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package jfb.examples.gmf.math.impl;

import jfb.examples.gmf.math.MathPackage;
import jfb.examples.gmf.math.OperatorOutput;
import jfb.examples.gmf.math.Result;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jfb.examples.gmf.math.impl.ResultImpl#getOperatorOutput <em>Operator Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultImpl extends NumberImpl implements Result {
	/**
	 * The cached value of the '{@link #getOperatorOutput() <em>Operator Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorOutput()
	 * @generated
	 * @ordered
	 */
	protected OperatorOutput operatorOutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MathPackage.Literals.RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorOutput getOperatorOutput() {
		if (operatorOutput != null && operatorOutput.eIsProxy()) {
			InternalEObject oldOperatorOutput = (InternalEObject)operatorOutput;
			operatorOutput = (OperatorOutput)eResolveProxy(oldOperatorOutput);
			if (operatorOutput != oldOperatorOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MathPackage.RESULT__OPERATOR_OUTPUT, oldOperatorOutput, operatorOutput));
			}
		}
		return operatorOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorOutput basicGetOperatorOutput() {
		return operatorOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperatorOutput(OperatorOutput newOperatorOutput, NotificationChain msgs) {
		OperatorOutput oldOperatorOutput = operatorOutput;
		operatorOutput = newOperatorOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MathPackage.RESULT__OPERATOR_OUTPUT, oldOperatorOutput, newOperatorOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatorOutput(OperatorOutput newOperatorOutput) {
		if (newOperatorOutput != operatorOutput) {
			NotificationChain msgs = null;
			if (operatorOutput != null)
				msgs = ((InternalEObject)operatorOutput).eInverseRemove(this, MathPackage.OPERATOR_OUTPUT__RESULT, OperatorOutput.class, msgs);
			if (newOperatorOutput != null)
				msgs = ((InternalEObject)newOperatorOutput).eInverseAdd(this, MathPackage.OPERATOR_OUTPUT__RESULT, OperatorOutput.class, msgs);
			msgs = basicSetOperatorOutput(newOperatorOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MathPackage.RESULT__OPERATOR_OUTPUT, newOperatorOutput, newOperatorOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MathPackage.RESULT__OPERATOR_OUTPUT:
				if (operatorOutput != null)
					msgs = ((InternalEObject)operatorOutput).eInverseRemove(this, MathPackage.OPERATOR_OUTPUT__RESULT, OperatorOutput.class, msgs);
				return basicSetOperatorOutput((OperatorOutput)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MathPackage.RESULT__OPERATOR_OUTPUT:
				return basicSetOperatorOutput(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MathPackage.RESULT__OPERATOR_OUTPUT:
				if (resolve) return getOperatorOutput();
				return basicGetOperatorOutput();
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
			case MathPackage.RESULT__OPERATOR_OUTPUT:
				setOperatorOutput((OperatorOutput)newValue);
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
			case MathPackage.RESULT__OPERATOR_OUTPUT:
				setOperatorOutput((OperatorOutput)null);
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
			case MathPackage.RESULT__OPERATOR_OUTPUT:
				return operatorOutput != null;
		}
		return super.eIsSet(featureID);
	}

} //ResultImpl
