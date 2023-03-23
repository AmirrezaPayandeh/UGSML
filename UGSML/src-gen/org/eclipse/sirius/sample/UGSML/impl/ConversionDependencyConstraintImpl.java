/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;
import org.eclipse.sirius.sample.UGSML.ValueBasedAttribute;
import org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversion Dependency Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.ConversionDependencyConstraintImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.ConversionDependencyConstraintImpl#getConversionUnitToBase <em>Conversion Unit To Base</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.ConversionDependencyConstraintImpl#getConversionChain <em>Conversion Chain</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.ConversionDependencyConstraintImpl#getValueRangeBasedConstraint <em>Value Range Based Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.ConversionDependencyConstraintImpl#getNextAttributeInChain <em>Next Attribute In Chain</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.ConversionDependencyConstraintImpl#getConversionRate <em>Conversion Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConversionDependencyConstraintImpl extends MinimalEObjectImpl.Container
		implements ConversionDependencyConstraint {
	/**
	 * The default value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String attributeName = ATTRIBUTE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConversionUnitToBase() <em>Conversion Unit To Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionUnitToBase()
	 * @generated
	 * @ordered
	 */
	protected static final float CONVERSION_UNIT_TO_BASE_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getConversionUnitToBase() <em>Conversion Unit To Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionUnitToBase()
	 * @generated
	 * @ordered
	 */
	protected float conversionUnitToBase = CONVERSION_UNIT_TO_BASE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConversionChain() <em>Conversion Chain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionChain()
	 * @generated
	 * @ordered
	 */
	protected EList<ConversionDependencyConstraint> conversionChain;

	/**
	 * The cached value of the '{@link #getNextAttributeInChain() <em>Next Attribute In Chain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextAttributeInChain()
	 * @generated
	 * @ordered
	 */
	protected ValueBasedAttribute nextAttributeInChain;

	/**
	 * The default value of the '{@link #getConversionRate() <em>Conversion Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionRate()
	 * @generated
	 * @ordered
	 */
	protected static final float CONVERSION_RATE_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getConversionRate() <em>Conversion Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionRate()
	 * @generated
	 * @ordered
	 */
	protected float conversionRate = CONVERSION_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConversionDependencyConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.CONVERSION_DEPENDENCY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeName(String newAttributeName) {
		String oldAttributeName = attributeName;
		attributeName = newAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__ATTRIBUTE_NAME, oldAttributeName, attributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getConversionUnitToBase() {
		return conversionUnitToBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversionUnitToBase(float newConversionUnitToBase) {
		float oldConversionUnitToBase = conversionUnitToBase;
		conversionUnitToBase = newConversionUnitToBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_UNIT_TO_BASE, oldConversionUnitToBase,
					conversionUnitToBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConversionDependencyConstraint> getConversionChain() {
		if (conversionChain == null) {
			conversionChain = new EObjectResolvingEList<ConversionDependencyConstraint>(
					ConversionDependencyConstraint.class, this,
					UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_CHAIN);
		}
		return conversionChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueRangeBasedConstraint getValueRangeBasedConstraint() {
		if (eContainerFeatureID() != UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__VALUE_RANGE_BASED_CONSTRAINT)
			return null;
		return (ValueRangeBasedConstraint) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueRangeBasedConstraint(ValueRangeBasedConstraint newValueRangeBasedConstraint,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newValueRangeBasedConstraint,
				UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__VALUE_RANGE_BASED_CONSTRAINT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueRangeBasedConstraint(ValueRangeBasedConstraint newValueRangeBasedConstraint) {
		if (newValueRangeBasedConstraint != eInternalContainer()
				|| (eContainerFeatureID() != UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__VALUE_RANGE_BASED_CONSTRAINT
						&& newValueRangeBasedConstraint != null)) {
			if (EcoreUtil.isAncestor(this, newValueRangeBasedConstraint))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newValueRangeBasedConstraint != null)
				msgs = ((InternalEObject) newValueRangeBasedConstraint).eInverseAdd(this,
						UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__CONVERSION_DEPENDENCY_CONSTRAINT,
						ValueRangeBasedConstraint.class, msgs);
			msgs = basicSetValueRangeBasedConstraint(newValueRangeBasedConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__VALUE_RANGE_BASED_CONSTRAINT,
					newValueRangeBasedConstraint, newValueRangeBasedConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBasedAttribute getNextAttributeInChain() {
		if (nextAttributeInChain != null && nextAttributeInChain.eIsProxy()) {
			InternalEObject oldNextAttributeInChain = (InternalEObject) nextAttributeInChain;
			nextAttributeInChain = (ValueBasedAttribute) eResolveProxy(oldNextAttributeInChain);
			if (nextAttributeInChain != oldNextAttributeInChain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__NEXT_ATTRIBUTE_IN_CHAIN,
							oldNextAttributeInChain, nextAttributeInChain));
			}
		}
		return nextAttributeInChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBasedAttribute basicGetNextAttributeInChain() {
		return nextAttributeInChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextAttributeInChain(ValueBasedAttribute newNextAttributeInChain) {
		ValueBasedAttribute oldNextAttributeInChain = nextAttributeInChain;
		nextAttributeInChain = newNextAttributeInChain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__NEXT_ATTRIBUTE_IN_CHAIN, oldNextAttributeInChain,
					nextAttributeInChain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getConversionRate() {
		return conversionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversionRate(float newConversionRate) {
		float oldConversionRate = conversionRate;
		conversionRate = newConversionRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_RATE, oldConversionRate, conversionRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__VALUE_RANGE_BASED_CONSTRAINT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetValueRangeBasedConstraint((ValueRangeBasedConstraint) otherEnd, msgs);
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
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__VALUE_RANGE_BASED_CONSTRAINT:
			return basicSetValueRangeBasedConstraint(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__VALUE_RANGE_BASED_CONSTRAINT:
			return eInternalContainer().eInverseRemove(this,
					UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT__CONVERSION_DEPENDENCY_CONSTRAINT,
					ValueRangeBasedConstraint.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__ATTRIBUTE_NAME:
			return getAttributeName();
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_UNIT_TO_BASE:
			return getConversionUnitToBase();
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_CHAIN:
			return getConversionChain();
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__VALUE_RANGE_BASED_CONSTRAINT:
			return getValueRangeBasedConstraint();
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__NEXT_ATTRIBUTE_IN_CHAIN:
			if (resolve)
				return getNextAttributeInChain();
			return basicGetNextAttributeInChain();
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_RATE:
			return getConversionRate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__ATTRIBUTE_NAME:
			setAttributeName((String) newValue);
			return;
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_UNIT_TO_BASE:
			setConversionUnitToBase((Float) newValue);
			return;
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_CHAIN:
			getConversionChain().clear();
			getConversionChain().addAll((Collection<? extends ConversionDependencyConstraint>) newValue);
			return;
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__VALUE_RANGE_BASED_CONSTRAINT:
			setValueRangeBasedConstraint((ValueRangeBasedConstraint) newValue);
			return;
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__NEXT_ATTRIBUTE_IN_CHAIN:
			setNextAttributeInChain((ValueBasedAttribute) newValue);
			return;
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_RATE:
			setConversionRate((Float) newValue);
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
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__ATTRIBUTE_NAME:
			setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
			return;
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_UNIT_TO_BASE:
			setConversionUnitToBase(CONVERSION_UNIT_TO_BASE_EDEFAULT);
			return;
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_CHAIN:
			getConversionChain().clear();
			return;
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__VALUE_RANGE_BASED_CONSTRAINT:
			setValueRangeBasedConstraint((ValueRangeBasedConstraint) null);
			return;
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__NEXT_ATTRIBUTE_IN_CHAIN:
			setNextAttributeInChain((ValueBasedAttribute) null);
			return;
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_RATE:
			setConversionRate(CONVERSION_RATE_EDEFAULT);
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
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__ATTRIBUTE_NAME:
			return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null
					: !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_UNIT_TO_BASE:
			return conversionUnitToBase != CONVERSION_UNIT_TO_BASE_EDEFAULT;
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_CHAIN:
			return conversionChain != null && !conversionChain.isEmpty();
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__VALUE_RANGE_BASED_CONSTRAINT:
			return getValueRangeBasedConstraint() != null;
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__NEXT_ATTRIBUTE_IN_CHAIN:
			return nextAttributeInChain != null;
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_RATE:
			return conversionRate != CONVERSION_RATE_EDEFAULT;
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
		result.append(" (AttributeName: ");
		result.append(attributeName);
		result.append(", ConversionUnitToBase: ");
		result.append(conversionUnitToBase);
		result.append(", ConversionRate: ");
		result.append(conversionRate);
		result.append(')');
		return result.toString();
	}

} //ConversionDependencyConstraintImpl
