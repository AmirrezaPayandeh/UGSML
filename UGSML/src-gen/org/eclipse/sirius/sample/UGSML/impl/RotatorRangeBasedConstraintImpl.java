/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.AdditionLimit;
import org.eclipse.sirius.sample.UGSML.RangeBasedConstraint;
import org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute;
import org.eclipse.sirius.sample.UGSML.RotatorRangeBasedConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotator Range Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.RotatorRangeBasedConstraintImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.RotatorRangeBasedConstraintImpl#getMaximumRotatorAttribute <em>Maximum Rotator Attribute</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.RotatorRangeBasedConstraintImpl#getMinimumRotatorAttribute <em>Minimum Rotator Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotatorRangeBasedConstraintImpl extends MinimalEObjectImpl.Container
		implements RotatorRangeBasedConstraint {
	/**
	 * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected static final AdditionLimit LIMIT_EDEFAULT = AdditionLimit.NO_LIMIT;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected AdditionLimit limit = LIMIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMaximumRotatorAttribute() <em>Maximum Rotator Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRotatorAttribute()
	 * @generated
	 * @ordered
	 */
	protected RotatorBasedAttribute maximumRotatorAttribute;

	/**
	 * The cached value of the '{@link #getMinimumRotatorAttribute() <em>Minimum Rotator Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumRotatorAttribute()
	 * @generated
	 * @ordered
	 */
	protected RotatorBasedAttribute minimumRotatorAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotatorRangeBasedConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.ROTATOR_RANGE_BASED_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionLimit getLimit() {
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimit(AdditionLimit newLimit) {
		AdditionLimit oldLimit = limit;
		limit = newLimit == null ? LIMIT_EDEFAULT : newLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT__LIMIT,
					oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotatorBasedAttribute getMaximumRotatorAttribute() {
		if (maximumRotatorAttribute != null && maximumRotatorAttribute.eIsProxy()) {
			InternalEObject oldMaximumRotatorAttribute = (InternalEObject) maximumRotatorAttribute;
			maximumRotatorAttribute = (RotatorBasedAttribute) eResolveProxy(oldMaximumRotatorAttribute);
			if (maximumRotatorAttribute != oldMaximumRotatorAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT__MAXIMUM_ROTATOR_ATTRIBUTE,
							oldMaximumRotatorAttribute, maximumRotatorAttribute));
			}
		}
		return maximumRotatorAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotatorBasedAttribute basicGetMaximumRotatorAttribute() {
		return maximumRotatorAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumRotatorAttribute(RotatorBasedAttribute newMaximumRotatorAttribute) {
		RotatorBasedAttribute oldMaximumRotatorAttribute = maximumRotatorAttribute;
		maximumRotatorAttribute = newMaximumRotatorAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT__MAXIMUM_ROTATOR_ATTRIBUTE, oldMaximumRotatorAttribute,
					maximumRotatorAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotatorBasedAttribute getMinimumRotatorAttribute() {
		if (minimumRotatorAttribute != null && minimumRotatorAttribute.eIsProxy()) {
			InternalEObject oldMinimumRotatorAttribute = (InternalEObject) minimumRotatorAttribute;
			minimumRotatorAttribute = (RotatorBasedAttribute) eResolveProxy(oldMinimumRotatorAttribute);
			if (minimumRotatorAttribute != oldMinimumRotatorAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT__MINIMUM_ROTATOR_ATTRIBUTE,
							oldMinimumRotatorAttribute, minimumRotatorAttribute));
			}
		}
		return minimumRotatorAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotatorBasedAttribute basicGetMinimumRotatorAttribute() {
		return minimumRotatorAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumRotatorAttribute(RotatorBasedAttribute newMinimumRotatorAttribute) {
		RotatorBasedAttribute oldMinimumRotatorAttribute = minimumRotatorAttribute;
		minimumRotatorAttribute = newMinimumRotatorAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT__MINIMUM_ROTATOR_ATTRIBUTE, oldMinimumRotatorAttribute,
					minimumRotatorAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT__LIMIT:
			return getLimit();
		case UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT__MAXIMUM_ROTATOR_ATTRIBUTE:
			if (resolve)
				return getMaximumRotatorAttribute();
			return basicGetMaximumRotatorAttribute();
		case UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT__MINIMUM_ROTATOR_ATTRIBUTE:
			if (resolve)
				return getMinimumRotatorAttribute();
			return basicGetMinimumRotatorAttribute();
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
		case UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT__LIMIT:
			setLimit((AdditionLimit) newValue);
			return;
		case UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT__MAXIMUM_ROTATOR_ATTRIBUTE:
			setMaximumRotatorAttribute((RotatorBasedAttribute) newValue);
			return;
		case UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT__MINIMUM_ROTATOR_ATTRIBUTE:
			setMinimumRotatorAttribute((RotatorBasedAttribute) newValue);
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
		case UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT__LIMIT:
			setLimit(LIMIT_EDEFAULT);
			return;
		case UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT__MAXIMUM_ROTATOR_ATTRIBUTE:
			setMaximumRotatorAttribute((RotatorBasedAttribute) null);
			return;
		case UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT__MINIMUM_ROTATOR_ATTRIBUTE:
			setMinimumRotatorAttribute((RotatorBasedAttribute) null);
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
		case UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT__LIMIT:
			return limit != LIMIT_EDEFAULT;
		case UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT__MAXIMUM_ROTATOR_ATTRIBUTE:
			return maximumRotatorAttribute != null;
		case UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT__MINIMUM_ROTATOR_ATTRIBUTE:
			return minimumRotatorAttribute != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RangeBasedConstraint.class) {
			switch (derivedFeatureID) {
			case UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT__LIMIT:
				return UGSMLPackage.RANGE_BASED_CONSTRAINT__LIMIT;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == RangeBasedConstraint.class) {
			switch (baseFeatureID) {
			case UGSMLPackage.RANGE_BASED_CONSTRAINT__LIMIT:
				return UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT__LIMIT;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (Limit: ");
		result.append(limit);
		result.append(')');
		return result.toString();
	}

} //RotatorRangeBasedConstraintImpl
