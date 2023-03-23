/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.LetterLengthConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;
import org.eclipse.sirius.sample.UGSML.ValueBasedAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Letter Length Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.LetterLengthConstraintImpl#getMaximumLengthAttribute <em>Maximum Length Attribute</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.LetterLengthConstraintImpl#getMinimumLengthAttribute <em>Minimum Length Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LetterLengthConstraintImpl extends MinimalEObjectImpl.Container implements LetterLengthConstraint {
	/**
	 * The cached value of the '{@link #getMaximumLengthAttribute() <em>Maximum Length Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumLengthAttribute()
	 * @generated
	 * @ordered
	 */
	protected ValueBasedAttribute maximumLengthAttribute;

	/**
	 * The cached value of the '{@link #getMinimumLengthAttribute() <em>Minimum Length Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumLengthAttribute()
	 * @generated
	 * @ordered
	 */
	protected ValueBasedAttribute minimumLengthAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LetterLengthConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.LETTER_LENGTH_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBasedAttribute getMaximumLengthAttribute() {
		if (maximumLengthAttribute != null && maximumLengthAttribute.eIsProxy()) {
			InternalEObject oldMaximumLengthAttribute = (InternalEObject) maximumLengthAttribute;
			maximumLengthAttribute = (ValueBasedAttribute) eResolveProxy(oldMaximumLengthAttribute);
			if (maximumLengthAttribute != oldMaximumLengthAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.LETTER_LENGTH_CONSTRAINT__MAXIMUM_LENGTH_ATTRIBUTE, oldMaximumLengthAttribute,
							maximumLengthAttribute));
			}
		}
		return maximumLengthAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBasedAttribute basicGetMaximumLengthAttribute() {
		return maximumLengthAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumLengthAttribute(ValueBasedAttribute newMaximumLengthAttribute) {
		ValueBasedAttribute oldMaximumLengthAttribute = maximumLengthAttribute;
		maximumLengthAttribute = newMaximumLengthAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.LETTER_LENGTH_CONSTRAINT__MAXIMUM_LENGTH_ATTRIBUTE, oldMaximumLengthAttribute,
					maximumLengthAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBasedAttribute getMinimumLengthAttribute() {
		if (minimumLengthAttribute != null && minimumLengthAttribute.eIsProxy()) {
			InternalEObject oldMinimumLengthAttribute = (InternalEObject) minimumLengthAttribute;
			minimumLengthAttribute = (ValueBasedAttribute) eResolveProxy(oldMinimumLengthAttribute);
			if (minimumLengthAttribute != oldMinimumLengthAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.LETTER_LENGTH_CONSTRAINT__MINIMUM_LENGTH_ATTRIBUTE, oldMinimumLengthAttribute,
							minimumLengthAttribute));
			}
		}
		return minimumLengthAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBasedAttribute basicGetMinimumLengthAttribute() {
		return minimumLengthAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumLengthAttribute(ValueBasedAttribute newMinimumLengthAttribute) {
		ValueBasedAttribute oldMinimumLengthAttribute = minimumLengthAttribute;
		minimumLengthAttribute = newMinimumLengthAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.LETTER_LENGTH_CONSTRAINT__MINIMUM_LENGTH_ATTRIBUTE, oldMinimumLengthAttribute,
					minimumLengthAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.LETTER_LENGTH_CONSTRAINT__MAXIMUM_LENGTH_ATTRIBUTE:
			if (resolve)
				return getMaximumLengthAttribute();
			return basicGetMaximumLengthAttribute();
		case UGSMLPackage.LETTER_LENGTH_CONSTRAINT__MINIMUM_LENGTH_ATTRIBUTE:
			if (resolve)
				return getMinimumLengthAttribute();
			return basicGetMinimumLengthAttribute();
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
		case UGSMLPackage.LETTER_LENGTH_CONSTRAINT__MAXIMUM_LENGTH_ATTRIBUTE:
			setMaximumLengthAttribute((ValueBasedAttribute) newValue);
			return;
		case UGSMLPackage.LETTER_LENGTH_CONSTRAINT__MINIMUM_LENGTH_ATTRIBUTE:
			setMinimumLengthAttribute((ValueBasedAttribute) newValue);
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
		case UGSMLPackage.LETTER_LENGTH_CONSTRAINT__MAXIMUM_LENGTH_ATTRIBUTE:
			setMaximumLengthAttribute((ValueBasedAttribute) null);
			return;
		case UGSMLPackage.LETTER_LENGTH_CONSTRAINT__MINIMUM_LENGTH_ATTRIBUTE:
			setMinimumLengthAttribute((ValueBasedAttribute) null);
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
		case UGSMLPackage.LETTER_LENGTH_CONSTRAINT__MAXIMUM_LENGTH_ATTRIBUTE:
			return maximumLengthAttribute != null;
		case UGSMLPackage.LETTER_LENGTH_CONSTRAINT__MINIMUM_LENGTH_ATTRIBUTE:
			return minimumLengthAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //LetterLengthConstraintImpl
