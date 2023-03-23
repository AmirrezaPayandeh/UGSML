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
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;
import org.eclipse.sirius.sample.UGSML.Vector2DBasedAttribute;
import org.eclipse.sirius.sample.UGSML.Vector2DRangeBasedConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector2 DRange Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.Vector2DRangeBasedConstraintImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.Vector2DRangeBasedConstraintImpl#getMinimumVector2DAttribute <em>Minimum Vector2 DAttribute</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.Vector2DRangeBasedConstraintImpl#getMaximumVector2DAttribute <em>Maximum Vector2 DAttribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Vector2DRangeBasedConstraintImpl extends MinimalEObjectImpl.Container
		implements Vector2DRangeBasedConstraint {
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
	 * The cached value of the '{@link #getMinimumVector2DAttribute() <em>Minimum Vector2 DAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumVector2DAttribute()
	 * @generated
	 * @ordered
	 */
	protected Vector2DBasedAttribute minimumVector2DAttribute;

	/**
	 * The cached value of the '{@link #getMaximumVector2DAttribute() <em>Maximum Vector2 DAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumVector2DAttribute()
	 * @generated
	 * @ordered
	 */
	protected Vector2DBasedAttribute maximumVector2DAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vector2DRangeBasedConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.VECTOR2_DRANGE_BASED_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT__LIMIT,
					oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector2DBasedAttribute getMinimumVector2DAttribute() {
		if (minimumVector2DAttribute != null && minimumVector2DAttribute.eIsProxy()) {
			InternalEObject oldMinimumVector2DAttribute = (InternalEObject) minimumVector2DAttribute;
			minimumVector2DAttribute = (Vector2DBasedAttribute) eResolveProxy(oldMinimumVector2DAttribute);
			if (minimumVector2DAttribute != oldMinimumVector2DAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT__MINIMUM_VECTOR2_DATTRIBUTE,
							oldMinimumVector2DAttribute, minimumVector2DAttribute));
			}
		}
		return minimumVector2DAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector2DBasedAttribute basicGetMinimumVector2DAttribute() {
		return minimumVector2DAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumVector2DAttribute(Vector2DBasedAttribute newMinimumVector2DAttribute) {
		Vector2DBasedAttribute oldMinimumVector2DAttribute = minimumVector2DAttribute;
		minimumVector2DAttribute = newMinimumVector2DAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT__MINIMUM_VECTOR2_DATTRIBUTE,
					oldMinimumVector2DAttribute, minimumVector2DAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector2DBasedAttribute getMaximumVector2DAttribute() {
		if (maximumVector2DAttribute != null && maximumVector2DAttribute.eIsProxy()) {
			InternalEObject oldMaximumVector2DAttribute = (InternalEObject) maximumVector2DAttribute;
			maximumVector2DAttribute = (Vector2DBasedAttribute) eResolveProxy(oldMaximumVector2DAttribute);
			if (maximumVector2DAttribute != oldMaximumVector2DAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT__MAXIMUM_VECTOR2_DATTRIBUTE,
							oldMaximumVector2DAttribute, maximumVector2DAttribute));
			}
		}
		return maximumVector2DAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector2DBasedAttribute basicGetMaximumVector2DAttribute() {
		return maximumVector2DAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumVector2DAttribute(Vector2DBasedAttribute newMaximumVector2DAttribute) {
		Vector2DBasedAttribute oldMaximumVector2DAttribute = maximumVector2DAttribute;
		maximumVector2DAttribute = newMaximumVector2DAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT__MAXIMUM_VECTOR2_DATTRIBUTE,
					oldMaximumVector2DAttribute, maximumVector2DAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT__LIMIT:
			return getLimit();
		case UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT__MINIMUM_VECTOR2_DATTRIBUTE:
			if (resolve)
				return getMinimumVector2DAttribute();
			return basicGetMinimumVector2DAttribute();
		case UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT__MAXIMUM_VECTOR2_DATTRIBUTE:
			if (resolve)
				return getMaximumVector2DAttribute();
			return basicGetMaximumVector2DAttribute();
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
		case UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT__LIMIT:
			setLimit((AdditionLimit) newValue);
			return;
		case UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT__MINIMUM_VECTOR2_DATTRIBUTE:
			setMinimumVector2DAttribute((Vector2DBasedAttribute) newValue);
			return;
		case UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT__MAXIMUM_VECTOR2_DATTRIBUTE:
			setMaximumVector2DAttribute((Vector2DBasedAttribute) newValue);
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
		case UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT__LIMIT:
			setLimit(LIMIT_EDEFAULT);
			return;
		case UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT__MINIMUM_VECTOR2_DATTRIBUTE:
			setMinimumVector2DAttribute((Vector2DBasedAttribute) null);
			return;
		case UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT__MAXIMUM_VECTOR2_DATTRIBUTE:
			setMaximumVector2DAttribute((Vector2DBasedAttribute) null);
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
		case UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT__LIMIT:
			return limit != LIMIT_EDEFAULT;
		case UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT__MINIMUM_VECTOR2_DATTRIBUTE:
			return minimumVector2DAttribute != null;
		case UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT__MAXIMUM_VECTOR2_DATTRIBUTE:
			return maximumVector2DAttribute != null;
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
			case UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT__LIMIT:
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
				return UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT__LIMIT;
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

} //Vector2DRangeBasedConstraintImpl
