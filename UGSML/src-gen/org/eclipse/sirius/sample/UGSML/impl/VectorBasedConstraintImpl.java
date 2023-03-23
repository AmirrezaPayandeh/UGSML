/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.UGSMLPackage;
import org.eclipse.sirius.sample.UGSML.VariabilityType;
import org.eclipse.sirius.sample.UGSML.VectorBasedAttribute;
import org.eclipse.sirius.sample.UGSML.VectorBasedConstraint;
import org.eclipse.sirius.sample.UGSML.VectorRangeBasedConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.VectorBasedConstraintImpl#getVariability <em>Variability</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.VectorBasedConstraintImpl#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.VectorBasedConstraintImpl#getVectorRangeBasedConstraint <em>Vector Range Based Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VectorBasedConstraintImpl extends MinimalEObjectImpl.Container implements VectorBasedConstraint {
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
	protected VectorBasedAttribute constrainedAttributeInstance;

	/**
	 * The cached value of the '{@link #getVectorRangeBasedConstraint() <em>Vector Range Based Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorRangeBasedConstraint()
	 * @generated
	 * @ordered
	 */
	protected VectorRangeBasedConstraint vectorRangeBasedConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VectorBasedConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.VECTOR_BASED_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.VECTOR_BASED_CONSTRAINT__VARIABILITY,
					oldVariability, variability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorBasedAttribute getConstrainedAttributeInstance() {
		if (constrainedAttributeInstance != null && constrainedAttributeInstance.eIsProxy()) {
			InternalEObject oldConstrainedAttributeInstance = (InternalEObject) constrainedAttributeInstance;
			constrainedAttributeInstance = (VectorBasedAttribute) eResolveProxy(oldConstrainedAttributeInstance);
			if (constrainedAttributeInstance != oldConstrainedAttributeInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.VECTOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE,
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
	public VectorBasedAttribute basicGetConstrainedAttributeInstance() {
		return constrainedAttributeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainedAttributeInstance(VectorBasedAttribute newConstrainedAttributeInstance) {
		VectorBasedAttribute oldConstrainedAttributeInstance = constrainedAttributeInstance;
		constrainedAttributeInstance = newConstrainedAttributeInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VECTOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE,
					oldConstrainedAttributeInstance, constrainedAttributeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorRangeBasedConstraint getVectorRangeBasedConstraint() {
		return vectorRangeBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVectorRangeBasedConstraint(
			VectorRangeBasedConstraint newVectorRangeBasedConstraint, NotificationChain msgs) {
		VectorRangeBasedConstraint oldVectorRangeBasedConstraint = vectorRangeBasedConstraint;
		vectorRangeBasedConstraint = newVectorRangeBasedConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VECTOR_BASED_CONSTRAINT__VECTOR_RANGE_BASED_CONSTRAINT, oldVectorRangeBasedConstraint,
					newVectorRangeBasedConstraint);
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
	public void setVectorRangeBasedConstraint(VectorRangeBasedConstraint newVectorRangeBasedConstraint) {
		if (newVectorRangeBasedConstraint != vectorRangeBasedConstraint) {
			NotificationChain msgs = null;
			if (vectorRangeBasedConstraint != null)
				msgs = ((InternalEObject) vectorRangeBasedConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.VECTOR_BASED_CONSTRAINT__VECTOR_RANGE_BASED_CONSTRAINT,
						null, msgs);
			if (newVectorRangeBasedConstraint != null)
				msgs = ((InternalEObject) newVectorRangeBasedConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.VECTOR_BASED_CONSTRAINT__VECTOR_RANGE_BASED_CONSTRAINT,
						null, msgs);
			msgs = basicSetVectorRangeBasedConstraint(newVectorRangeBasedConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VECTOR_BASED_CONSTRAINT__VECTOR_RANGE_BASED_CONSTRAINT, newVectorRangeBasedConstraint,
					newVectorRangeBasedConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UGSMLPackage.VECTOR_BASED_CONSTRAINT__VECTOR_RANGE_BASED_CONSTRAINT:
			return basicSetVectorRangeBasedConstraint(null, msgs);
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
		case UGSMLPackage.VECTOR_BASED_CONSTRAINT__VARIABILITY:
			return getVariability();
		case UGSMLPackage.VECTOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			if (resolve)
				return getConstrainedAttributeInstance();
			return basicGetConstrainedAttributeInstance();
		case UGSMLPackage.VECTOR_BASED_CONSTRAINT__VECTOR_RANGE_BASED_CONSTRAINT:
			return getVectorRangeBasedConstraint();
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
		case UGSMLPackage.VECTOR_BASED_CONSTRAINT__VARIABILITY:
			setVariability((VariabilityType) newValue);
			return;
		case UGSMLPackage.VECTOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			setConstrainedAttributeInstance((VectorBasedAttribute) newValue);
			return;
		case UGSMLPackage.VECTOR_BASED_CONSTRAINT__VECTOR_RANGE_BASED_CONSTRAINT:
			setVectorRangeBasedConstraint((VectorRangeBasedConstraint) newValue);
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
		case UGSMLPackage.VECTOR_BASED_CONSTRAINT__VARIABILITY:
			setVariability(VARIABILITY_EDEFAULT);
			return;
		case UGSMLPackage.VECTOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			setConstrainedAttributeInstance((VectorBasedAttribute) null);
			return;
		case UGSMLPackage.VECTOR_BASED_CONSTRAINT__VECTOR_RANGE_BASED_CONSTRAINT:
			setVectorRangeBasedConstraint((VectorRangeBasedConstraint) null);
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
		case UGSMLPackage.VECTOR_BASED_CONSTRAINT__VARIABILITY:
			return variability != VARIABILITY_EDEFAULT;
		case UGSMLPackage.VECTOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			return constrainedAttributeInstance != null;
		case UGSMLPackage.VECTOR_BASED_CONSTRAINT__VECTOR_RANGE_BASED_CONSTRAINT:
			return vectorRangeBasedConstraint != null;
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

} //VectorBasedConstraintImpl
