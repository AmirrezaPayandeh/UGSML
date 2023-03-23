/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.RegenerationConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;
import org.eclipse.sirius.sample.UGSML.ValueBasedAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regeneration Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.RegenerationConstraintImpl#getRegenerationAttribute <em>Regeneration Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegenerationConstraintImpl extends MinimalEObjectImpl.Container implements RegenerationConstraint {
	/**
	 * The cached value of the '{@link #getRegenerationAttribute() <em>Regeneration Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegenerationAttribute()
	 * @generated
	 * @ordered
	 */
	protected ValueBasedAttribute regenerationAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegenerationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.REGENERATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBasedAttribute getRegenerationAttribute() {
		if (regenerationAttribute != null && regenerationAttribute.eIsProxy()) {
			InternalEObject oldRegenerationAttribute = (InternalEObject) regenerationAttribute;
			regenerationAttribute = (ValueBasedAttribute) eResolveProxy(oldRegenerationAttribute);
			if (regenerationAttribute != oldRegenerationAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.REGENERATION_CONSTRAINT__REGENERATION_ATTRIBUTE, oldRegenerationAttribute,
							regenerationAttribute));
			}
		}
		return regenerationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBasedAttribute basicGetRegenerationAttribute() {
		return regenerationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegenerationAttribute(ValueBasedAttribute newRegenerationAttribute) {
		ValueBasedAttribute oldRegenerationAttribute = regenerationAttribute;
		regenerationAttribute = newRegenerationAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.REGENERATION_CONSTRAINT__REGENERATION_ATTRIBUTE, oldRegenerationAttribute,
					regenerationAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.REGENERATION_CONSTRAINT__REGENERATION_ATTRIBUTE:
			if (resolve)
				return getRegenerationAttribute();
			return basicGetRegenerationAttribute();
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
		case UGSMLPackage.REGENERATION_CONSTRAINT__REGENERATION_ATTRIBUTE:
			setRegenerationAttribute((ValueBasedAttribute) newValue);
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
		case UGSMLPackage.REGENERATION_CONSTRAINT__REGENERATION_ATTRIBUTE:
			setRegenerationAttribute((ValueBasedAttribute) null);
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
		case UGSMLPackage.REGENERATION_CONSTRAINT__REGENERATION_ATTRIBUTE:
			return regenerationAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //RegenerationConstraintImpl
