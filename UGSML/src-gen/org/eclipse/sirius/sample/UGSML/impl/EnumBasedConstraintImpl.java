/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.EnumBasedAttribute;
import org.eclipse.sirius.sample.UGSML.EnumBasedConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;
import org.eclipse.sirius.sample.UGSML.VariabilityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.EnumBasedConstraintImpl#getVariability <em>Variability</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.EnumBasedConstraintImpl#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumBasedConstraintImpl extends MinimalEObjectImpl.Container implements EnumBasedConstraint {
	/**
	 * The default value of the '{@link #getVariability() <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariability()
	 * @generated
	 * @ordered
	 */
	protected static final VariabilityType VARIABILITY_EDEFAULT = VariabilityType.VARIABLE;

	/**
	 * The cached value of the '{@link #getVariability() <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariability()
	 * @generated
	 * @ordered
	 */
	protected VariabilityType variability = VARIABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstrainedAttributeInstance() <em>Constrained Attribute Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedAttributeInstance()
	 * @generated
	 * @ordered
	 */
	protected EnumBasedAttribute constrainedAttributeInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumBasedConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.ENUM_BASED_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityType getVariability() {
		return variability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariability(VariabilityType newVariability) {
		VariabilityType oldVariability = variability;
		variability = newVariability == null ? VARIABILITY_EDEFAULT : newVariability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.ENUM_BASED_CONSTRAINT__VARIABILITY,
					oldVariability, variability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumBasedAttribute getConstrainedAttributeInstance() {
		if (constrainedAttributeInstance != null && constrainedAttributeInstance.eIsProxy()) {
			InternalEObject oldConstrainedAttributeInstance = (InternalEObject) constrainedAttributeInstance;
			constrainedAttributeInstance = (EnumBasedAttribute) eResolveProxy(oldConstrainedAttributeInstance);
			if (constrainedAttributeInstance != oldConstrainedAttributeInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.ENUM_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE,
							oldConstrainedAttributeInstance, constrainedAttributeInstance));
			}
		}
		return constrainedAttributeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumBasedAttribute basicGetConstrainedAttributeInstance() {
		return constrainedAttributeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainedAttributeInstance(EnumBasedAttribute newConstrainedAttributeInstance) {
		EnumBasedAttribute oldConstrainedAttributeInstance = constrainedAttributeInstance;
		constrainedAttributeInstance = newConstrainedAttributeInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.ENUM_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE, oldConstrainedAttributeInstance,
					constrainedAttributeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.ENUM_BASED_CONSTRAINT__VARIABILITY:
			return getVariability();
		case UGSMLPackage.ENUM_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			if (resolve)
				return getConstrainedAttributeInstance();
			return basicGetConstrainedAttributeInstance();
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
		case UGSMLPackage.ENUM_BASED_CONSTRAINT__VARIABILITY:
			setVariability((VariabilityType) newValue);
			return;
		case UGSMLPackage.ENUM_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			setConstrainedAttributeInstance((EnumBasedAttribute) newValue);
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
		case UGSMLPackage.ENUM_BASED_CONSTRAINT__VARIABILITY:
			setVariability(VARIABILITY_EDEFAULT);
			return;
		case UGSMLPackage.ENUM_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			setConstrainedAttributeInstance((EnumBasedAttribute) null);
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
		case UGSMLPackage.ENUM_BASED_CONSTRAINT__VARIABILITY:
			return variability != VARIABILITY_EDEFAULT;
		case UGSMLPackage.ENUM_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			return constrainedAttributeInstance != null;
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
		result.append(" (Variability: ");
		result.append(variability);
		result.append(')');
		return result.toString();
	}

} //EnumBasedConstraintImpl
