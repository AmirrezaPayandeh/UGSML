/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.BaseValueConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Value Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.BaseValueConstraintImpl#getDefaultBaseValue <em>Default Base Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseValueConstraintImpl extends MinimalEObjectImpl.Container implements BaseValueConstraint {
	/**
	 * The default value of the '{@link #getDefaultBaseValue() <em>Default Base Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultBaseValue()
	 * @generated
	 * @ordered
	 */
	protected static final float DEFAULT_BASE_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDefaultBaseValue() <em>Default Base Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultBaseValue()
	 * @generated
	 * @ordered
	 */
	protected float defaultBaseValue = DEFAULT_BASE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseValueConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.BASE_VALUE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDefaultBaseValue() {
		return defaultBaseValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultBaseValue(float newDefaultBaseValue) {
		float oldDefaultBaseValue = defaultBaseValue;
		defaultBaseValue = newDefaultBaseValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.BASE_VALUE_CONSTRAINT__DEFAULT_BASE_VALUE, oldDefaultBaseValue, defaultBaseValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.BASE_VALUE_CONSTRAINT__DEFAULT_BASE_VALUE:
			return getDefaultBaseValue();
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
		case UGSMLPackage.BASE_VALUE_CONSTRAINT__DEFAULT_BASE_VALUE:
			setDefaultBaseValue((Float) newValue);
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
		case UGSMLPackage.BASE_VALUE_CONSTRAINT__DEFAULT_BASE_VALUE:
			setDefaultBaseValue(DEFAULT_BASE_VALUE_EDEFAULT);
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
		case UGSMLPackage.BASE_VALUE_CONSTRAINT__DEFAULT_BASE_VALUE:
			return defaultBaseValue != DEFAULT_BASE_VALUE_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (DefaultBaseValue: ");
		result.append(defaultBaseValue);
		result.append(')');
		return result.toString();
	}

} //BaseValueConstraintImpl
