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
import org.eclipse.sirius.sample.UGSML.Vector2DBasedAttribute;
import org.eclipse.sirius.sample.UGSML.Vector2DBasedConstraint;
import org.eclipse.sirius.sample.UGSML.Vector2DRangeBasedConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector2 DBased Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.Vector2DBasedConstraintImpl#getVariability <em>Variability</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.Vector2DBasedConstraintImpl#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.Vector2DBasedConstraintImpl#getVector2DRangeBasedConstraint <em>Vector2 DRange Based Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Vector2DBasedConstraintImpl extends MinimalEObjectImpl.Container implements Vector2DBasedConstraint {
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
	protected Vector2DBasedAttribute constrainedAttributeInstance;

	/**
	 * The cached value of the '{@link #getVector2DRangeBasedConstraint() <em>Vector2 DRange Based Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVector2DRangeBasedConstraint()
	 * @generated
	 * @ordered
	 */
	protected Vector2DRangeBasedConstraint vector2DRangeBasedConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vector2DBasedConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.VECTOR2_DBASED_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.VECTOR2_DBASED_CONSTRAINT__VARIABILITY,
					oldVariability, variability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector2DBasedAttribute getConstrainedAttributeInstance() {
		if (constrainedAttributeInstance != null && constrainedAttributeInstance.eIsProxy()) {
			InternalEObject oldConstrainedAttributeInstance = (InternalEObject) constrainedAttributeInstance;
			constrainedAttributeInstance = (Vector2DBasedAttribute) eResolveProxy(oldConstrainedAttributeInstance);
			if (constrainedAttributeInstance != oldConstrainedAttributeInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.VECTOR2_DBASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE,
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
	public Vector2DBasedAttribute basicGetConstrainedAttributeInstance() {
		return constrainedAttributeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainedAttributeInstance(Vector2DBasedAttribute newConstrainedAttributeInstance) {
		Vector2DBasedAttribute oldConstrainedAttributeInstance = constrainedAttributeInstance;
		constrainedAttributeInstance = newConstrainedAttributeInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VECTOR2_DBASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE,
					oldConstrainedAttributeInstance, constrainedAttributeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector2DRangeBasedConstraint getVector2DRangeBasedConstraint() {
		return vector2DRangeBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVector2DRangeBasedConstraint(
			Vector2DRangeBasedConstraint newVector2DRangeBasedConstraint, NotificationChain msgs) {
		Vector2DRangeBasedConstraint oldVector2DRangeBasedConstraint = vector2DRangeBasedConstraint;
		vector2DRangeBasedConstraint = newVector2DRangeBasedConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VECTOR2_DBASED_CONSTRAINT__VECTOR2_DRANGE_BASED_CONSTRAINT,
					oldVector2DRangeBasedConstraint, newVector2DRangeBasedConstraint);
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
	public void setVector2DRangeBasedConstraint(Vector2DRangeBasedConstraint newVector2DRangeBasedConstraint) {
		if (newVector2DRangeBasedConstraint != vector2DRangeBasedConstraint) {
			NotificationChain msgs = null;
			if (vector2DRangeBasedConstraint != null)
				msgs = ((InternalEObject) vector2DRangeBasedConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- UGSMLPackage.VECTOR2_DBASED_CONSTRAINT__VECTOR2_DRANGE_BASED_CONSTRAINT, null, msgs);
			if (newVector2DRangeBasedConstraint != null)
				msgs = ((InternalEObject) newVector2DRangeBasedConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UGSMLPackage.VECTOR2_DBASED_CONSTRAINT__VECTOR2_DRANGE_BASED_CONSTRAINT, null, msgs);
			msgs = basicSetVector2DRangeBasedConstraint(newVector2DRangeBasedConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VECTOR2_DBASED_CONSTRAINT__VECTOR2_DRANGE_BASED_CONSTRAINT,
					newVector2DRangeBasedConstraint, newVector2DRangeBasedConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UGSMLPackage.VECTOR2_DBASED_CONSTRAINT__VECTOR2_DRANGE_BASED_CONSTRAINT:
			return basicSetVector2DRangeBasedConstraint(null, msgs);
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
		case UGSMLPackage.VECTOR2_DBASED_CONSTRAINT__VARIABILITY:
			return getVariability();
		case UGSMLPackage.VECTOR2_DBASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			if (resolve)
				return getConstrainedAttributeInstance();
			return basicGetConstrainedAttributeInstance();
		case UGSMLPackage.VECTOR2_DBASED_CONSTRAINT__VECTOR2_DRANGE_BASED_CONSTRAINT:
			return getVector2DRangeBasedConstraint();
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
		case UGSMLPackage.VECTOR2_DBASED_CONSTRAINT__VARIABILITY:
			setVariability((VariabilityType) newValue);
			return;
		case UGSMLPackage.VECTOR2_DBASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			setConstrainedAttributeInstance((Vector2DBasedAttribute) newValue);
			return;
		case UGSMLPackage.VECTOR2_DBASED_CONSTRAINT__VECTOR2_DRANGE_BASED_CONSTRAINT:
			setVector2DRangeBasedConstraint((Vector2DRangeBasedConstraint) newValue);
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
		case UGSMLPackage.VECTOR2_DBASED_CONSTRAINT__VARIABILITY:
			setVariability(VARIABILITY_EDEFAULT);
			return;
		case UGSMLPackage.VECTOR2_DBASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			setConstrainedAttributeInstance((Vector2DBasedAttribute) null);
			return;
		case UGSMLPackage.VECTOR2_DBASED_CONSTRAINT__VECTOR2_DRANGE_BASED_CONSTRAINT:
			setVector2DRangeBasedConstraint((Vector2DRangeBasedConstraint) null);
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
		case UGSMLPackage.VECTOR2_DBASED_CONSTRAINT__VARIABILITY:
			return variability != VARIABILITY_EDEFAULT;
		case UGSMLPackage.VECTOR2_DBASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			return constrainedAttributeInstance != null;
		case UGSMLPackage.VECTOR2_DBASED_CONSTRAINT__VECTOR2_DRANGE_BASED_CONSTRAINT:
			return vector2DRangeBasedConstraint != null;
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

} //Vector2DBasedConstraintImpl
