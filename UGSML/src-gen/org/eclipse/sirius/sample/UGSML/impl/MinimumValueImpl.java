/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.MinimumValue;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;
import org.eclipse.sirius.sample.UGSML.ValueBasedAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Minimum Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.MinimumValueImpl#isRemapValue <em>Remap Value</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.MinimumValueImpl#getMinimumAttribute <em>Minimum Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinimumValueImpl extends MinimalEObjectImpl.Container implements MinimumValue {
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
	 * The cached value of the '{@link #getMinimumAttribute() <em>Minimum Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumAttribute()
	 * @generated
	 * @ordered
	 */
	protected ValueBasedAttribute minimumAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinimumValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.MINIMUM_VALUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.MINIMUM_VALUE__REMAP_VALUE,
					oldRemapValue, remapValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBasedAttribute getMinimumAttribute() {
		if (minimumAttribute != null && minimumAttribute.eIsProxy()) {
			InternalEObject oldMinimumAttribute = (InternalEObject) minimumAttribute;
			minimumAttribute = (ValueBasedAttribute) eResolveProxy(oldMinimumAttribute);
			if (minimumAttribute != oldMinimumAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.MINIMUM_VALUE__MINIMUM_ATTRIBUTE, oldMinimumAttribute, minimumAttribute));
			}
		}
		return minimumAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBasedAttribute basicGetMinimumAttribute() {
		return minimumAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumAttribute(ValueBasedAttribute newMinimumAttribute) {
		ValueBasedAttribute oldMinimumAttribute = minimumAttribute;
		minimumAttribute = newMinimumAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.MINIMUM_VALUE__MINIMUM_ATTRIBUTE,
					oldMinimumAttribute, minimumAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.MINIMUM_VALUE__REMAP_VALUE:
			return isRemapValue();
		case UGSMLPackage.MINIMUM_VALUE__MINIMUM_ATTRIBUTE:
			if (resolve)
				return getMinimumAttribute();
			return basicGetMinimumAttribute();
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
		case UGSMLPackage.MINIMUM_VALUE__REMAP_VALUE:
			setRemapValue((Boolean) newValue);
			return;
		case UGSMLPackage.MINIMUM_VALUE__MINIMUM_ATTRIBUTE:
			setMinimumAttribute((ValueBasedAttribute) newValue);
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
		case UGSMLPackage.MINIMUM_VALUE__REMAP_VALUE:
			setRemapValue(REMAP_VALUE_EDEFAULT);
			return;
		case UGSMLPackage.MINIMUM_VALUE__MINIMUM_ATTRIBUTE:
			setMinimumAttribute((ValueBasedAttribute) null);
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
		case UGSMLPackage.MINIMUM_VALUE__REMAP_VALUE:
			return remapValue != REMAP_VALUE_EDEFAULT;
		case UGSMLPackage.MINIMUM_VALUE__MINIMUM_ATTRIBUTE:
			return minimumAttribute != null;
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

} //MinimumValueImpl
