/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute;
import org.eclipse.sirius.sample.UGSML.RotatorBasedConstraint;
import org.eclipse.sirius.sample.UGSML.RotatorRangeBasedConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;
import org.eclipse.sirius.sample.UGSML.VariabilityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotator Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.RotatorBasedConstraintImpl#getVariability <em>Variability</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.RotatorBasedConstraintImpl#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.RotatorBasedConstraintImpl#getRotatorRangeBasedConstraint <em>Rotator Range Based Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotatorBasedConstraintImpl extends MinimalEObjectImpl.Container implements RotatorBasedConstraint {
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
	protected RotatorBasedAttribute constrainedAttributeInstance;

	/**
	 * The cached value of the '{@link #getRotatorRangeBasedConstraint() <em>Rotator Range Based Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotatorRangeBasedConstraint()
	 * @generated
	 * @ordered
	 */
	protected RotatorRangeBasedConstraint rotatorRangeBasedConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotatorBasedConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.ROTATOR_BASED_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.ROTATOR_BASED_CONSTRAINT__VARIABILITY,
					oldVariability, variability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotatorBasedAttribute getConstrainedAttributeInstance() {
		if (constrainedAttributeInstance != null && constrainedAttributeInstance.eIsProxy()) {
			InternalEObject oldConstrainedAttributeInstance = (InternalEObject) constrainedAttributeInstance;
			constrainedAttributeInstance = (RotatorBasedAttribute) eResolveProxy(oldConstrainedAttributeInstance);
			if (constrainedAttributeInstance != oldConstrainedAttributeInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.ROTATOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE,
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
	public RotatorBasedAttribute basicGetConstrainedAttributeInstance() {
		return constrainedAttributeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainedAttributeInstance(RotatorBasedAttribute newConstrainedAttributeInstance) {
		RotatorBasedAttribute oldConstrainedAttributeInstance = constrainedAttributeInstance;
		constrainedAttributeInstance = newConstrainedAttributeInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.ROTATOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE,
					oldConstrainedAttributeInstance, constrainedAttributeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotatorRangeBasedConstraint getRotatorRangeBasedConstraint() {
		return rotatorRangeBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotatorRangeBasedConstraint(
			RotatorRangeBasedConstraint newRotatorRangeBasedConstraint, NotificationChain msgs) {
		RotatorRangeBasedConstraint oldRotatorRangeBasedConstraint = rotatorRangeBasedConstraint;
		rotatorRangeBasedConstraint = newRotatorRangeBasedConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.ROTATOR_BASED_CONSTRAINT__ROTATOR_RANGE_BASED_CONSTRAINT,
					oldRotatorRangeBasedConstraint, newRotatorRangeBasedConstraint);
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
	public void setRotatorRangeBasedConstraint(RotatorRangeBasedConstraint newRotatorRangeBasedConstraint) {
		if (newRotatorRangeBasedConstraint != rotatorRangeBasedConstraint) {
			NotificationChain msgs = null;
			if (rotatorRangeBasedConstraint != null)
				msgs = ((InternalEObject) rotatorRangeBasedConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.ROTATOR_BASED_CONSTRAINT__ROTATOR_RANGE_BASED_CONSTRAINT,
						null, msgs);
			if (newRotatorRangeBasedConstraint != null)
				msgs = ((InternalEObject) newRotatorRangeBasedConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.ROTATOR_BASED_CONSTRAINT__ROTATOR_RANGE_BASED_CONSTRAINT,
						null, msgs);
			msgs = basicSetRotatorRangeBasedConstraint(newRotatorRangeBasedConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.ROTATOR_BASED_CONSTRAINT__ROTATOR_RANGE_BASED_CONSTRAINT,
					newRotatorRangeBasedConstraint, newRotatorRangeBasedConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UGSMLPackage.ROTATOR_BASED_CONSTRAINT__ROTATOR_RANGE_BASED_CONSTRAINT:
			return basicSetRotatorRangeBasedConstraint(null, msgs);
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
		case UGSMLPackage.ROTATOR_BASED_CONSTRAINT__VARIABILITY:
			return getVariability();
		case UGSMLPackage.ROTATOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			if (resolve)
				return getConstrainedAttributeInstance();
			return basicGetConstrainedAttributeInstance();
		case UGSMLPackage.ROTATOR_BASED_CONSTRAINT__ROTATOR_RANGE_BASED_CONSTRAINT:
			return getRotatorRangeBasedConstraint();
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
		case UGSMLPackage.ROTATOR_BASED_CONSTRAINT__VARIABILITY:
			setVariability((VariabilityType) newValue);
			return;
		case UGSMLPackage.ROTATOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			setConstrainedAttributeInstance((RotatorBasedAttribute) newValue);
			return;
		case UGSMLPackage.ROTATOR_BASED_CONSTRAINT__ROTATOR_RANGE_BASED_CONSTRAINT:
			setRotatorRangeBasedConstraint((RotatorRangeBasedConstraint) newValue);
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
		case UGSMLPackage.ROTATOR_BASED_CONSTRAINT__VARIABILITY:
			setVariability(VARIABILITY_EDEFAULT);
			return;
		case UGSMLPackage.ROTATOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			setConstrainedAttributeInstance((RotatorBasedAttribute) null);
			return;
		case UGSMLPackage.ROTATOR_BASED_CONSTRAINT__ROTATOR_RANGE_BASED_CONSTRAINT:
			setRotatorRangeBasedConstraint((RotatorRangeBasedConstraint) null);
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
		case UGSMLPackage.ROTATOR_BASED_CONSTRAINT__VARIABILITY:
			return variability != VARIABILITY_EDEFAULT;
		case UGSMLPackage.ROTATOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			return constrainedAttributeInstance != null;
		case UGSMLPackage.ROTATOR_BASED_CONSTRAINT__ROTATOR_RANGE_BASED_CONSTRAINT:
			return rotatorRangeBasedConstraint != null;
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

} //RotatorBasedConstraintImpl
