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
import org.eclipse.sirius.sample.UGSML.VectorBasedAttribute;
import org.eclipse.sirius.sample.UGSML.VectorRangeBasedConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector Range Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.VectorRangeBasedConstraintImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.VectorRangeBasedConstraintImpl#getMaximumVectorAttribute <em>Maximum Vector Attribute</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.VectorRangeBasedConstraintImpl#getMinimumVectorAttribute <em>Minimum Vector Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VectorRangeBasedConstraintImpl extends MinimalEObjectImpl.Container implements VectorRangeBasedConstraint {
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
	 * The cached value of the '{@link #getMaximumVectorAttribute() <em>Maximum Vector Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumVectorAttribute()
	 * @generated
	 * @ordered
	 */
	protected VectorBasedAttribute maximumVectorAttribute;

	/**
	 * The cached value of the '{@link #getMinimumVectorAttribute() <em>Minimum Vector Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumVectorAttribute()
	 * @generated
	 * @ordered
	 */
	protected VectorBasedAttribute minimumVectorAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VectorRangeBasedConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.VECTOR_RANGE_BASED_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT__LIMIT,
					oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorBasedAttribute getMaximumVectorAttribute() {
		if (maximumVectorAttribute != null && maximumVectorAttribute.eIsProxy()) {
			InternalEObject oldMaximumVectorAttribute = (InternalEObject) maximumVectorAttribute;
			maximumVectorAttribute = (VectorBasedAttribute) eResolveProxy(oldMaximumVectorAttribute);
			if (maximumVectorAttribute != oldMaximumVectorAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT__MAXIMUM_VECTOR_ATTRIBUTE,
							oldMaximumVectorAttribute, maximumVectorAttribute));
			}
		}
		return maximumVectorAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorBasedAttribute basicGetMaximumVectorAttribute() {
		return maximumVectorAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumVectorAttribute(VectorBasedAttribute newMaximumVectorAttribute) {
		VectorBasedAttribute oldMaximumVectorAttribute = maximumVectorAttribute;
		maximumVectorAttribute = newMaximumVectorAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT__MAXIMUM_VECTOR_ATTRIBUTE, oldMaximumVectorAttribute,
					maximumVectorAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorBasedAttribute getMinimumVectorAttribute() {
		if (minimumVectorAttribute != null && minimumVectorAttribute.eIsProxy()) {
			InternalEObject oldMinimumVectorAttribute = (InternalEObject) minimumVectorAttribute;
			minimumVectorAttribute = (VectorBasedAttribute) eResolveProxy(oldMinimumVectorAttribute);
			if (minimumVectorAttribute != oldMinimumVectorAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT__MINIMUM_VECTOR_ATTRIBUTE,
							oldMinimumVectorAttribute, minimumVectorAttribute));
			}
		}
		return minimumVectorAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorBasedAttribute basicGetMinimumVectorAttribute() {
		return minimumVectorAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumVectorAttribute(VectorBasedAttribute newMinimumVectorAttribute) {
		VectorBasedAttribute oldMinimumVectorAttribute = minimumVectorAttribute;
		minimumVectorAttribute = newMinimumVectorAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT__MINIMUM_VECTOR_ATTRIBUTE, oldMinimumVectorAttribute,
					minimumVectorAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT__LIMIT:
			return getLimit();
		case UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT__MAXIMUM_VECTOR_ATTRIBUTE:
			if (resolve)
				return getMaximumVectorAttribute();
			return basicGetMaximumVectorAttribute();
		case UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT__MINIMUM_VECTOR_ATTRIBUTE:
			if (resolve)
				return getMinimumVectorAttribute();
			return basicGetMinimumVectorAttribute();
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
		case UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT__LIMIT:
			setLimit((AdditionLimit) newValue);
			return;
		case UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT__MAXIMUM_VECTOR_ATTRIBUTE:
			setMaximumVectorAttribute((VectorBasedAttribute) newValue);
			return;
		case UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT__MINIMUM_VECTOR_ATTRIBUTE:
			setMinimumVectorAttribute((VectorBasedAttribute) newValue);
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
		case UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT__LIMIT:
			setLimit(LIMIT_EDEFAULT);
			return;
		case UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT__MAXIMUM_VECTOR_ATTRIBUTE:
			setMaximumVectorAttribute((VectorBasedAttribute) null);
			return;
		case UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT__MINIMUM_VECTOR_ATTRIBUTE:
			setMinimumVectorAttribute((VectorBasedAttribute) null);
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
		case UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT__LIMIT:
			return limit != LIMIT_EDEFAULT;
		case UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT__MAXIMUM_VECTOR_ATTRIBUTE:
			return maximumVectorAttribute != null;
		case UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT__MINIMUM_VECTOR_ATTRIBUTE:
			return minimumVectorAttribute != null;
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
			case UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT__LIMIT:
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
				return UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT__LIMIT;
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

} //VectorRangeBasedConstraintImpl
