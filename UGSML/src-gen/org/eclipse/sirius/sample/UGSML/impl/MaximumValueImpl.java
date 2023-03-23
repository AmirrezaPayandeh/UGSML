/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.MaximumValue;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;
import org.eclipse.sirius.sample.UGSML.ValueBasedAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maximum Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.MaximumValueImpl#isRemapValue <em>Remap Value</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.MaximumValueImpl#getMaximumAttribute <em>Maximum Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaximumValueImpl extends MinimalEObjectImpl.Container implements MaximumValue {
	/**
	 * The default value of the '{@link #isRemapValue() <em>Remap Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemapValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMAP_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemapValue() <em>Remap Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemapValue()
	 * @generated
	 * @ordered
	 */
	protected boolean remapValue = REMAP_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMaximumAttribute() <em>Maximum Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAttribute()
	 * @generated
	 * @ordered
	 */
	protected ValueBasedAttribute maximumAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaximumValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.MAXIMUM_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemapValue() {
		return remapValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemapValue(boolean newRemapValue) {
		boolean oldRemapValue = remapValue;
		remapValue = newRemapValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.MAXIMUM_VALUE__REMAP_VALUE,
					oldRemapValue, remapValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBasedAttribute getMaximumAttribute() {
		if (maximumAttribute != null && maximumAttribute.eIsProxy()) {
			InternalEObject oldMaximumAttribute = (InternalEObject) maximumAttribute;
			maximumAttribute = (ValueBasedAttribute) eResolveProxy(oldMaximumAttribute);
			if (maximumAttribute != oldMaximumAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.MAXIMUM_VALUE__MAXIMUM_ATTRIBUTE, oldMaximumAttribute, maximumAttribute));
			}
		}
		return maximumAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBasedAttribute basicGetMaximumAttribute() {
		return maximumAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumAttribute(ValueBasedAttribute newMaximumAttribute) {
		ValueBasedAttribute oldMaximumAttribute = maximumAttribute;
		maximumAttribute = newMaximumAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.MAXIMUM_VALUE__MAXIMUM_ATTRIBUTE,
					oldMaximumAttribute, maximumAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.MAXIMUM_VALUE__REMAP_VALUE:
			return isRemapValue();
		case UGSMLPackage.MAXIMUM_VALUE__MAXIMUM_ATTRIBUTE:
			if (resolve)
				return getMaximumAttribute();
			return basicGetMaximumAttribute();
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
		case UGSMLPackage.MAXIMUM_VALUE__REMAP_VALUE:
			setRemapValue((Boolean) newValue);
			return;
		case UGSMLPackage.MAXIMUM_VALUE__MAXIMUM_ATTRIBUTE:
			setMaximumAttribute((ValueBasedAttribute) newValue);
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
		case UGSMLPackage.MAXIMUM_VALUE__REMAP_VALUE:
			setRemapValue(REMAP_VALUE_EDEFAULT);
			return;
		case UGSMLPackage.MAXIMUM_VALUE__MAXIMUM_ATTRIBUTE:
			setMaximumAttribute((ValueBasedAttribute) null);
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
		case UGSMLPackage.MAXIMUM_VALUE__REMAP_VALUE:
			return remapValue != REMAP_VALUE_EDEFAULT;
		case UGSMLPackage.MAXIMUM_VALUE__MAXIMUM_ATTRIBUTE:
			return maximumAttribute != null;
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
		result.append(" (RemapValue: ");
		result.append(remapValue);
		result.append(')');
		return result.toString();
	}

} //MaximumValueImpl
