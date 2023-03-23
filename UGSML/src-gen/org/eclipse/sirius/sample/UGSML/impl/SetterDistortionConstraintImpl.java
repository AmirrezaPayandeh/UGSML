/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.ArithmeticOperations;
import org.eclipse.sirius.sample.UGSML.SetterDistortionConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;
import org.eclipse.sirius.sample.UGSML.ValueBasedAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setter Distortion Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.SetterDistortionConstraintImpl#getDistortionAttribute <em>Distortion Attribute</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.SetterDistortionConstraintImpl#getDistortionMode <em>Distortion Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetterDistortionConstraintImpl extends MinimalEObjectImpl.Container implements SetterDistortionConstraint {
	/**
	 * The cached value of the '{@link #getDistortionAttribute() <em>Distortion Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistortionAttribute()
	 * @generated
	 * @ordered
	 */
	protected ValueBasedAttribute distortionAttribute;

	/**
	 * The default value of the '{@link #getDistortionMode() <em>Distortion Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistortionMode()
	 * @generated
	 * @ordered
	 */
	protected static final ArithmeticOperations DISTORTION_MODE_EDEFAULT = ArithmeticOperations.MULTIPLICATION;

	/**
	 * The cached value of the '{@link #getDistortionMode() <em>Distortion Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistortionMode()
	 * @generated
	 * @ordered
	 */
	protected ArithmeticOperations distortionMode = DISTORTION_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetterDistortionConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.SETTER_DISTORTION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBasedAttribute getDistortionAttribute() {
		if (distortionAttribute != null && distortionAttribute.eIsProxy()) {
			InternalEObject oldDistortionAttribute = (InternalEObject) distortionAttribute;
			distortionAttribute = (ValueBasedAttribute) eResolveProxy(oldDistortionAttribute);
			if (distortionAttribute != oldDistortionAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.SETTER_DISTORTION_CONSTRAINT__DISTORTION_ATTRIBUTE, oldDistortionAttribute,
							distortionAttribute));
			}
		}
		return distortionAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBasedAttribute basicGetDistortionAttribute() {
		return distortionAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistortionAttribute(ValueBasedAttribute newDistortionAttribute) {
		ValueBasedAttribute oldDistortionAttribute = distortionAttribute;
		distortionAttribute = newDistortionAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.SETTER_DISTORTION_CONSTRAINT__DISTORTION_ATTRIBUTE, oldDistortionAttribute,
					distortionAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperations getDistortionMode() {
		return distortionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistortionMode(ArithmeticOperations newDistortionMode) {
		ArithmeticOperations oldDistortionMode = distortionMode;
		distortionMode = newDistortionMode == null ? DISTORTION_MODE_EDEFAULT : newDistortionMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.SETTER_DISTORTION_CONSTRAINT__DISTORTION_MODE, oldDistortionMode, distortionMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.SETTER_DISTORTION_CONSTRAINT__DISTORTION_ATTRIBUTE:
			if (resolve)
				return getDistortionAttribute();
			return basicGetDistortionAttribute();
		case UGSMLPackage.SETTER_DISTORTION_CONSTRAINT__DISTORTION_MODE:
			return getDistortionMode();
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
		case UGSMLPackage.SETTER_DISTORTION_CONSTRAINT__DISTORTION_ATTRIBUTE:
			setDistortionAttribute((ValueBasedAttribute) newValue);
			return;
		case UGSMLPackage.SETTER_DISTORTION_CONSTRAINT__DISTORTION_MODE:
			setDistortionMode((ArithmeticOperations) newValue);
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
		case UGSMLPackage.SETTER_DISTORTION_CONSTRAINT__DISTORTION_ATTRIBUTE:
			setDistortionAttribute((ValueBasedAttribute) null);
			return;
		case UGSMLPackage.SETTER_DISTORTION_CONSTRAINT__DISTORTION_MODE:
			setDistortionMode(DISTORTION_MODE_EDEFAULT);
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
		case UGSMLPackage.SETTER_DISTORTION_CONSTRAINT__DISTORTION_ATTRIBUTE:
			return distortionAttribute != null;
		case UGSMLPackage.SETTER_DISTORTION_CONSTRAINT__DISTORTION_MODE:
			return distortionMode != DISTORTION_MODE_EDEFAULT;
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
		result.append(" (DistortionMode: ");
		result.append(distortionMode);
		result.append(')');
		return result.toString();
	}

} //SetterDistortionConstraintImpl
