/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.MarginOfErrorConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;
import org.eclipse.sirius.sample.UGSML.ValueBasedAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Margin Of Error Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.MarginOfErrorConstraintImpl#getMOEAttribute <em>MOE Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarginOfErrorConstraintImpl extends MinimalEObjectImpl.Container implements MarginOfErrorConstraint {
	/**
	 * The cached value of the '{@link #getMOEAttribute() <em>MOE Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMOEAttribute()
	 * @generated
	 * @ordered
	 */
	protected ValueBasedAttribute moeAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarginOfErrorConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.MARGIN_OF_ERROR_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBasedAttribute getMOEAttribute() {
		if (moeAttribute != null && moeAttribute.eIsProxy()) {
			InternalEObject oldMOEAttribute = (InternalEObject) moeAttribute;
			moeAttribute = (ValueBasedAttribute) eResolveProxy(oldMOEAttribute);
			if (moeAttribute != oldMOEAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.MARGIN_OF_ERROR_CONSTRAINT__MOE_ATTRIBUTE, oldMOEAttribute, moeAttribute));
			}
		}
		return moeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBasedAttribute basicGetMOEAttribute() {
		return moeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMOEAttribute(ValueBasedAttribute newMOEAttribute) {
		ValueBasedAttribute oldMOEAttribute = moeAttribute;
		moeAttribute = newMOEAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.MARGIN_OF_ERROR_CONSTRAINT__MOE_ATTRIBUTE, oldMOEAttribute, moeAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.MARGIN_OF_ERROR_CONSTRAINT__MOE_ATTRIBUTE:
			if (resolve)
				return getMOEAttribute();
			return basicGetMOEAttribute();
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
		case UGSMLPackage.MARGIN_OF_ERROR_CONSTRAINT__MOE_ATTRIBUTE:
			setMOEAttribute((ValueBasedAttribute) newValue);
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
		case UGSMLPackage.MARGIN_OF_ERROR_CONSTRAINT__MOE_ATTRIBUTE:
			setMOEAttribute((ValueBasedAttribute) null);
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
		case UGSMLPackage.MARGIN_OF_ERROR_CONSTRAINT__MOE_ATTRIBUTE:
			return moeAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //MarginOfErrorConstraintImpl
