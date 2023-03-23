/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.AdditionLimit;
import org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint;
import org.eclipse.sirius.sample.UGSML.InitializationMode;
import org.eclipse.sirius.sample.UGSML.MaximumValue;
import org.eclipse.sirius.sample.UGSML.MinimumValue;
import org.eclipse.sirius.sample.UGSML.RangeBasedConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;
import org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Range Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.ValueRangeBasedConstraintImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.ValueRangeBasedConstraintImpl#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.ValueRangeBasedConstraintImpl#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.ValueRangeBasedConstraintImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.ValueRangeBasedConstraintImpl#getConversionDependencyConstraint <em>Conversion Dependency Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueRangeBasedConstraintImpl extends MinimalEObjectImpl.Container implements ValueRangeBasedConstraint {
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
	 * The cached value of the '{@link #getMinimumValue() <em>Minimum Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValue()
	 * @generated
	 * @ordered
	 */
	protected MinimumValue minimumValue;

	/**
	 * The cached value of the '{@link #getMaximumValue() <em>Maximum Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumValue()
	 * @generated
	 * @ordered
	 */
	protected MaximumValue maximumValue;

	/**
	 * The default value of the '{@link #getInitializer() <em>Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializer()
	 * @generated
	 * @ordered
	 */
	protected static final InitializationMode INITIALIZER_EDEFAULT = InitializationMode.DEFAULT;

	/**
	 * The cached value of the '{@link #getInitializer() <em>Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializer()
	 * @generated
	 * @ordered
	 */
	protected InitializationMode initializer = INITIALIZER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConversionDependencyConstraint() <em>Conversion Dependency Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionDependencyConstraint()
	 * @generated
	 * @ordered
	 */
	protected ConversionDependencyConstraint conversionDependencyConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueRangeBasedConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.VALUE_RANGE_BASED_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__LIMIT,
					oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinimumValue getMinimumValue() {
		return minimumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinimumValue(MinimumValue newMinimumValue, NotificationChain msgs) {
		MinimumValue oldMinimumValue = minimumValue;
		minimumValue = newMinimumValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__MINIMUM_VALUE, oldMinimumValue, newMinimumValue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumValue(MinimumValue newMinimumValue) {
		if (newMinimumValue != minimumValue) {
			NotificationChain msgs = null;
			if (minimumValue != null)
				msgs = ((InternalEObject) minimumValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__MINIMUM_VALUE, null, msgs);
			if (newMinimumValue != null)
				msgs = ((InternalEObject) newMinimumValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__MINIMUM_VALUE, null, msgs);
			msgs = basicSetMinimumValue(newMinimumValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__MINIMUM_VALUE, newMinimumValue, newMinimumValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaximumValue getMaximumValue() {
		return maximumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaximumValue(MaximumValue newMaximumValue, NotificationChain msgs) {
		MaximumValue oldMaximumValue = maximumValue;
		maximumValue = newMaximumValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__MAXIMUM_VALUE, oldMaximumValue, newMaximumValue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumValue(MaximumValue newMaximumValue) {
		if (newMaximumValue != maximumValue) {
			NotificationChain msgs = null;
			if (maximumValue != null)
				msgs = ((InternalEObject) maximumValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__MAXIMUM_VALUE, null, msgs);
			if (newMaximumValue != null)
				msgs = ((InternalEObject) newMaximumValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__MAXIMUM_VALUE, null, msgs);
			msgs = basicSetMaximumValue(newMaximumValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__MAXIMUM_VALUE, newMaximumValue, newMaximumValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializationMode getInitializer() {
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializer(InitializationMode newInitializer) {
		InitializationMode oldInitializer = initializer;
		initializer = newInitializer == null ? INITIALIZER_EDEFAULT : newInitializer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__INITIALIZER, oldInitializer, initializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionDependencyConstraint getConversionDependencyConstraint() {
		return conversionDependencyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversionDependencyConstraint(
			ConversionDependencyConstraint newConversionDependencyConstraint, NotificationChain msgs) {
		ConversionDependencyConstraint oldConversionDependencyConstraint = conversionDependencyConstraint;
		conversionDependencyConstraint = newConversionDependencyConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__CONVERSION_DEPENDENCY_CONSTRAINT,
					oldConversionDependencyConstraint, newConversionDependencyConstraint);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversionDependencyConstraint(ConversionDependencyConstraint newConversionDependencyConstraint) {
		if (newConversionDependencyConstraint != conversionDependencyConstraint) {
			NotificationChain msgs = null;
			if (conversionDependencyConstraint != null)
				msgs = ((InternalEObject) conversionDependencyConstraint).eInverseRemove(this,
						UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__VALUE_RANGE_BASED_CONSTRAINT,
						ConversionDependencyConstraint.class, msgs);
			if (newConversionDependencyConstraint != null)
				msgs = ((InternalEObject) newConversionDependencyConstraint).eInverseAdd(this,
						UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__VALUE_RANGE_BASED_CONSTRAINT,
						ConversionDependencyConstraint.class, msgs);
			msgs = basicSetConversionDependencyConstraint(newConversionDependencyConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__CONVERSION_DEPENDENCY_CONSTRAINT,
					newConversionDependencyConstraint, newConversionDependencyConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__CONVERSION_DEPENDENCY_CONSTRAINT:
			if (conversionDependencyConstraint != null)
				msgs = ((InternalEObject) conversionDependencyConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__CONVERSION_DEPENDENCY_CONSTRAINT,
						null, msgs);
			return basicSetConversionDependencyConstraint((ConversionDependencyConstraint) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__MINIMUM_VALUE:
			return basicSetMinimumValue(null, msgs);
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__MAXIMUM_VALUE:
			return basicSetMaximumValue(null, msgs);
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__CONVERSION_DEPENDENCY_CONSTRAINT:
			return basicSetConversionDependencyConstraint(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__LIMIT:
			return getLimit();
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__MINIMUM_VALUE:
			return getMinimumValue();
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__MAXIMUM_VALUE:
			return getMaximumValue();
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__INITIALIZER:
			return getInitializer();
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__CONVERSION_DEPENDENCY_CONSTRAINT:
			return getConversionDependencyConstraint();
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
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__LIMIT:
			setLimit((AdditionLimit) newValue);
			return;
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__MINIMUM_VALUE:
			setMinimumValue((MinimumValue) newValue);
			return;
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__MAXIMUM_VALUE:
			setMaximumValue((MaximumValue) newValue);
			return;
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__INITIALIZER:
			setInitializer((InitializationMode) newValue);
			return;
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__CONVERSION_DEPENDENCY_CONSTRAINT:
			setConversionDependencyConstraint((ConversionDependencyConstraint) newValue);
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
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__LIMIT:
			setLimit(LIMIT_EDEFAULT);
			return;
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__MINIMUM_VALUE:
			setMinimumValue((MinimumValue) null);
			return;
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__MAXIMUM_VALUE:
			setMaximumValue((MaximumValue) null);
			return;
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__INITIALIZER:
			setInitializer(INITIALIZER_EDEFAULT);
			return;
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__CONVERSION_DEPENDENCY_CONSTRAINT:
			setConversionDependencyConstraint((ConversionDependencyConstraint) null);
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
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__LIMIT:
			return limit != LIMIT_EDEFAULT;
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__MINIMUM_VALUE:
			return minimumValue != null;
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__MAXIMUM_VALUE:
			return maximumValue != null;
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__INITIALIZER:
			return initializer != INITIALIZER_EDEFAULT;
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__CONVERSION_DEPENDENCY_CONSTRAINT:
			return conversionDependencyConstraint != null;
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
			case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__LIMIT:
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
				return UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__LIMIT;
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
		result.append(", Initializer: ");
		result.append(initializer);
		result.append(')');
		return result.toString();
	}

} //ValueRangeBasedConstraintImpl
