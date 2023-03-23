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
import org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute;
import org.eclipse.sirius.sample.UGSML.TransformationRangeBasedConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Range Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.TransformationRangeBasedConstraintImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.TransformationRangeBasedConstraintImpl#getMaximumTransformationAttribute <em>Maximum Transformation Attribute</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.TransformationRangeBasedConstraintImpl#getMinimumTransformationAttribute <em>Minimum Transformation Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationRangeBasedConstraintImpl extends MinimalEObjectImpl.Container
		implements TransformationRangeBasedConstraint {
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
	 * The cached value of the '{@link #getMaximumTransformationAttribute() <em>Maximum Transformation Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumTransformationAttribute()
	 * @generated
	 * @ordered
	 */
	protected TransformationBasedAttribute maximumTransformationAttribute;

	/**
	 * The cached value of the '{@link #getMinimumTransformationAttribute() <em>Minimum Transformation Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumTransformationAttribute()
	 * @generated
	 * @ordered
	 */
	protected TransformationBasedAttribute minimumTransformationAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationRangeBasedConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.TRANSFORMATION_RANGE_BASED_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT__LIMIT, oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationBasedAttribute getMaximumTransformationAttribute() {
		if (maximumTransformationAttribute != null && maximumTransformationAttribute.eIsProxy()) {
			InternalEObject oldMaximumTransformationAttribute = (InternalEObject) maximumTransformationAttribute;
			maximumTransformationAttribute = (TransformationBasedAttribute) eResolveProxy(
					oldMaximumTransformationAttribute);
			if (maximumTransformationAttribute != oldMaximumTransformationAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT__MAXIMUM_TRANSFORMATION_ATTRIBUTE,
							oldMaximumTransformationAttribute, maximumTransformationAttribute));
			}
		}
		return maximumTransformationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationBasedAttribute basicGetMaximumTransformationAttribute() {
		return maximumTransformationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumTransformationAttribute(TransformationBasedAttribute newMaximumTransformationAttribute) {
		TransformationBasedAttribute oldMaximumTransformationAttribute = maximumTransformationAttribute;
		maximumTransformationAttribute = newMaximumTransformationAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT__MAXIMUM_TRANSFORMATION_ATTRIBUTE,
					oldMaximumTransformationAttribute, maximumTransformationAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationBasedAttribute getMinimumTransformationAttribute() {
		if (minimumTransformationAttribute != null && minimumTransformationAttribute.eIsProxy()) {
			InternalEObject oldMinimumTransformationAttribute = (InternalEObject) minimumTransformationAttribute;
			minimumTransformationAttribute = (TransformationBasedAttribute) eResolveProxy(
					oldMinimumTransformationAttribute);
			if (minimumTransformationAttribute != oldMinimumTransformationAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT__MINIMUM_TRANSFORMATION_ATTRIBUTE,
							oldMinimumTransformationAttribute, minimumTransformationAttribute));
			}
		}
		return minimumTransformationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationBasedAttribute basicGetMinimumTransformationAttribute() {
		return minimumTransformationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumTransformationAttribute(TransformationBasedAttribute newMinimumTransformationAttribute) {
		TransformationBasedAttribute oldMinimumTransformationAttribute = minimumTransformationAttribute;
		minimumTransformationAttribute = newMinimumTransformationAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT__MINIMUM_TRANSFORMATION_ATTRIBUTE,
					oldMinimumTransformationAttribute, minimumTransformationAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT__LIMIT:
			return getLimit();
		case UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT__MAXIMUM_TRANSFORMATION_ATTRIBUTE:
			if (resolve)
				return getMaximumTransformationAttribute();
			return basicGetMaximumTransformationAttribute();
		case UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT__MINIMUM_TRANSFORMATION_ATTRIBUTE:
			if (resolve)
				return getMinimumTransformationAttribute();
			return basicGetMinimumTransformationAttribute();
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
		case UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT__LIMIT:
			setLimit((AdditionLimit) newValue);
			return;
		case UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT__MAXIMUM_TRANSFORMATION_ATTRIBUTE:
			setMaximumTransformationAttribute((TransformationBasedAttribute) newValue);
			return;
		case UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT__MINIMUM_TRANSFORMATION_ATTRIBUTE:
			setMinimumTransformationAttribute((TransformationBasedAttribute) newValue);
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
		case UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT__LIMIT:
			setLimit(LIMIT_EDEFAULT);
			return;
		case UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT__MAXIMUM_TRANSFORMATION_ATTRIBUTE:
			setMaximumTransformationAttribute((TransformationBasedAttribute) null);
			return;
		case UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT__MINIMUM_TRANSFORMATION_ATTRIBUTE:
			setMinimumTransformationAttribute((TransformationBasedAttribute) null);
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
		case UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT__LIMIT:
			return limit != LIMIT_EDEFAULT;
		case UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT__MAXIMUM_TRANSFORMATION_ATTRIBUTE:
			return maximumTransformationAttribute != null;
		case UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT__MINIMUM_TRANSFORMATION_ATTRIBUTE:
			return minimumTransformationAttribute != null;
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
			case UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT__LIMIT:
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
				return UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT__LIMIT;
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

} //TransformationRangeBasedConstraintImpl
