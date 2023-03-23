/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute;
import org.eclipse.sirius.sample.UGSML.TransformationBasedConstraint;
import org.eclipse.sirius.sample.UGSML.TransformationRangeBasedConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;
import org.eclipse.sirius.sample.UGSML.VariabilityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.TransformationBasedConstraintImpl#getVariability <em>Variability</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.TransformationBasedConstraintImpl#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.TransformationBasedConstraintImpl#getTransformationRangeBasedConstraint <em>Transformation Range Based Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationBasedConstraintImpl extends MinimalEObjectImpl.Container
		implements TransformationBasedConstraint {
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
	protected TransformationBasedAttribute constrainedAttributeInstance;

	/**
	 * The cached value of the '{@link #getTransformationRangeBasedConstraint() <em>Transformation Range Based Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationRangeBasedConstraint()
	 * @generated
	 * @ordered
	 */
	protected TransformationRangeBasedConstraint transformationRangeBasedConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationBasedConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.TRANSFORMATION_BASED_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT__VARIABILITY, oldVariability, variability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationBasedAttribute getConstrainedAttributeInstance() {
		if (constrainedAttributeInstance != null && constrainedAttributeInstance.eIsProxy()) {
			InternalEObject oldConstrainedAttributeInstance = (InternalEObject) constrainedAttributeInstance;
			constrainedAttributeInstance = (TransformationBasedAttribute) eResolveProxy(
					oldConstrainedAttributeInstance);
			if (constrainedAttributeInstance != oldConstrainedAttributeInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE,
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
	public TransformationBasedAttribute basicGetConstrainedAttributeInstance() {
		return constrainedAttributeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainedAttributeInstance(TransformationBasedAttribute newConstrainedAttributeInstance) {
		TransformationBasedAttribute oldConstrainedAttributeInstance = constrainedAttributeInstance;
		constrainedAttributeInstance = newConstrainedAttributeInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE,
					oldConstrainedAttributeInstance, constrainedAttributeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationRangeBasedConstraint getTransformationRangeBasedConstraint() {
		return transformationRangeBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformationRangeBasedConstraint(
			TransformationRangeBasedConstraint newTransformationRangeBasedConstraint, NotificationChain msgs) {
		TransformationRangeBasedConstraint oldTransformationRangeBasedConstraint = transformationRangeBasedConstraint;
		transformationRangeBasedConstraint = newTransformationRangeBasedConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT__TRANSFORMATION_RANGE_BASED_CONSTRAINT,
					oldTransformationRangeBasedConstraint, newTransformationRangeBasedConstraint);
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
	public void setTransformationRangeBasedConstraint(
			TransformationRangeBasedConstraint newTransformationRangeBasedConstraint) {
		if (newTransformationRangeBasedConstraint != transformationRangeBasedConstraint) {
			NotificationChain msgs = null;
			if (transformationRangeBasedConstraint != null)
				msgs = ((InternalEObject) transformationRangeBasedConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT__TRANSFORMATION_RANGE_BASED_CONSTRAINT,
						null, msgs);
			if (newTransformationRangeBasedConstraint != null)
				msgs = ((InternalEObject) newTransformationRangeBasedConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT__TRANSFORMATION_RANGE_BASED_CONSTRAINT,
						null, msgs);
			msgs = basicSetTransformationRangeBasedConstraint(newTransformationRangeBasedConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT__TRANSFORMATION_RANGE_BASED_CONSTRAINT,
					newTransformationRangeBasedConstraint, newTransformationRangeBasedConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT__TRANSFORMATION_RANGE_BASED_CONSTRAINT:
			return basicSetTransformationRangeBasedConstraint(null, msgs);
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
		case UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT__VARIABILITY:
			return getVariability();
		case UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			if (resolve)
				return getConstrainedAttributeInstance();
			return basicGetConstrainedAttributeInstance();
		case UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT__TRANSFORMATION_RANGE_BASED_CONSTRAINT:
			return getTransformationRangeBasedConstraint();
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
		case UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT__VARIABILITY:
			setVariability((VariabilityType) newValue);
			return;
		case UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			setConstrainedAttributeInstance((TransformationBasedAttribute) newValue);
			return;
		case UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT__TRANSFORMATION_RANGE_BASED_CONSTRAINT:
			setTransformationRangeBasedConstraint((TransformationRangeBasedConstraint) newValue);
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
		case UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT__VARIABILITY:
			setVariability(VARIABILITY_EDEFAULT);
			return;
		case UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			setConstrainedAttributeInstance((TransformationBasedAttribute) null);
			return;
		case UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT__TRANSFORMATION_RANGE_BASED_CONSTRAINT:
			setTransformationRangeBasedConstraint((TransformationRangeBasedConstraint) null);
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
		case UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT__VARIABILITY:
			return variability != VARIABILITY_EDEFAULT;
		case UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			return constrainedAttributeInstance != null;
		case UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT__TRANSFORMATION_RANGE_BASED_CONSTRAINT:
			return transformationRangeBasedConstraint != null;
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

} //TransformationBasedConstraintImpl
