/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.LetterBasedAttribute;
import org.eclipse.sirius.sample.UGSML.LetterBasedConstraint;
import org.eclipse.sirius.sample.UGSML.LetterCustomizationConstraint;
import org.eclipse.sirius.sample.UGSML.LetterLengthConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;
import org.eclipse.sirius.sample.UGSML.VariabilityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Letter Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.LetterBasedConstraintImpl#getVariability <em>Variability</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.LetterBasedConstraintImpl#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.LetterBasedConstraintImpl#getLetterLengthConstraint <em>Letter Length Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.LetterBasedConstraintImpl#getLetterCustomizationConstraint <em>Letter Customization Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LetterBasedConstraintImpl extends MinimalEObjectImpl.Container implements LetterBasedConstraint {
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
	protected LetterBasedAttribute constrainedAttributeInstance;

	/**
	 * The cached value of the '{@link #getLetterLengthConstraint() <em>Letter Length Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetterLengthConstraint()
	 * @generated
	 * @ordered
	 */
	protected LetterLengthConstraint letterLengthConstraint;

	/**
	 * The cached value of the '{@link #getLetterCustomizationConstraint() <em>Letter Customization Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetterCustomizationConstraint()
	 * @generated
	 * @ordered
	 */
	protected LetterCustomizationConstraint letterCustomizationConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LetterBasedConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.LETTER_BASED_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.LETTER_BASED_CONSTRAINT__VARIABILITY,
					oldVariability, variability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetterBasedAttribute getConstrainedAttributeInstance() {
		if (constrainedAttributeInstance != null && constrainedAttributeInstance.eIsProxy()) {
			InternalEObject oldConstrainedAttributeInstance = (InternalEObject) constrainedAttributeInstance;
			constrainedAttributeInstance = (LetterBasedAttribute) eResolveProxy(oldConstrainedAttributeInstance);
			if (constrainedAttributeInstance != oldConstrainedAttributeInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.LETTER_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE,
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
	public LetterBasedAttribute basicGetConstrainedAttributeInstance() {
		return constrainedAttributeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainedAttributeInstance(LetterBasedAttribute newConstrainedAttributeInstance) {
		LetterBasedAttribute oldConstrainedAttributeInstance = constrainedAttributeInstance;
		constrainedAttributeInstance = newConstrainedAttributeInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.LETTER_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE,
					oldConstrainedAttributeInstance, constrainedAttributeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetterLengthConstraint getLetterLengthConstraint() {
		return letterLengthConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLetterLengthConstraint(LetterLengthConstraint newLetterLengthConstraint,
			NotificationChain msgs) {
		LetterLengthConstraint oldLetterLengthConstraint = letterLengthConstraint;
		letterLengthConstraint = newLetterLengthConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.LETTER_BASED_CONSTRAINT__LETTER_LENGTH_CONSTRAINT, oldLetterLengthConstraint,
					newLetterLengthConstraint);
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
	public void setLetterLengthConstraint(LetterLengthConstraint newLetterLengthConstraint) {
		if (newLetterLengthConstraint != letterLengthConstraint) {
			NotificationChain msgs = null;
			if (letterLengthConstraint != null)
				msgs = ((InternalEObject) letterLengthConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.LETTER_BASED_CONSTRAINT__LETTER_LENGTH_CONSTRAINT, null,
						msgs);
			if (newLetterLengthConstraint != null)
				msgs = ((InternalEObject) newLetterLengthConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.LETTER_BASED_CONSTRAINT__LETTER_LENGTH_CONSTRAINT, null,
						msgs);
			msgs = basicSetLetterLengthConstraint(newLetterLengthConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.LETTER_BASED_CONSTRAINT__LETTER_LENGTH_CONSTRAINT, newLetterLengthConstraint,
					newLetterLengthConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetterCustomizationConstraint getLetterCustomizationConstraint() {
		return letterCustomizationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLetterCustomizationConstraint(
			LetterCustomizationConstraint newLetterCustomizationConstraint, NotificationChain msgs) {
		LetterCustomizationConstraint oldLetterCustomizationConstraint = letterCustomizationConstraint;
		letterCustomizationConstraint = newLetterCustomizationConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.LETTER_BASED_CONSTRAINT__LETTER_CUSTOMIZATION_CONSTRAINT,
					oldLetterCustomizationConstraint, newLetterCustomizationConstraint);
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
	public void setLetterCustomizationConstraint(LetterCustomizationConstraint newLetterCustomizationConstraint) {
		if (newLetterCustomizationConstraint != letterCustomizationConstraint) {
			NotificationChain msgs = null;
			if (letterCustomizationConstraint != null)
				msgs = ((InternalEObject) letterCustomizationConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.LETTER_BASED_CONSTRAINT__LETTER_CUSTOMIZATION_CONSTRAINT,
						null, msgs);
			if (newLetterCustomizationConstraint != null)
				msgs = ((InternalEObject) newLetterCustomizationConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.LETTER_BASED_CONSTRAINT__LETTER_CUSTOMIZATION_CONSTRAINT,
						null, msgs);
			msgs = basicSetLetterCustomizationConstraint(newLetterCustomizationConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.LETTER_BASED_CONSTRAINT__LETTER_CUSTOMIZATION_CONSTRAINT,
					newLetterCustomizationConstraint, newLetterCustomizationConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UGSMLPackage.LETTER_BASED_CONSTRAINT__LETTER_LENGTH_CONSTRAINT:
			return basicSetLetterLengthConstraint(null, msgs);
		case UGSMLPackage.LETTER_BASED_CONSTRAINT__LETTER_CUSTOMIZATION_CONSTRAINT:
			return basicSetLetterCustomizationConstraint(null, msgs);
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
		case UGSMLPackage.LETTER_BASED_CONSTRAINT__VARIABILITY:
			return getVariability();
		case UGSMLPackage.LETTER_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			if (resolve)
				return getConstrainedAttributeInstance();
			return basicGetConstrainedAttributeInstance();
		case UGSMLPackage.LETTER_BASED_CONSTRAINT__LETTER_LENGTH_CONSTRAINT:
			return getLetterLengthConstraint();
		case UGSMLPackage.LETTER_BASED_CONSTRAINT__LETTER_CUSTOMIZATION_CONSTRAINT:
			return getLetterCustomizationConstraint();
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
		case UGSMLPackage.LETTER_BASED_CONSTRAINT__VARIABILITY:
			setVariability((VariabilityType) newValue);
			return;
		case UGSMLPackage.LETTER_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			setConstrainedAttributeInstance((LetterBasedAttribute) newValue);
			return;
		case UGSMLPackage.LETTER_BASED_CONSTRAINT__LETTER_LENGTH_CONSTRAINT:
			setLetterLengthConstraint((LetterLengthConstraint) newValue);
			return;
		case UGSMLPackage.LETTER_BASED_CONSTRAINT__LETTER_CUSTOMIZATION_CONSTRAINT:
			setLetterCustomizationConstraint((LetterCustomizationConstraint) newValue);
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
		case UGSMLPackage.LETTER_BASED_CONSTRAINT__VARIABILITY:
			setVariability(VARIABILITY_EDEFAULT);
			return;
		case UGSMLPackage.LETTER_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			setConstrainedAttributeInstance((LetterBasedAttribute) null);
			return;
		case UGSMLPackage.LETTER_BASED_CONSTRAINT__LETTER_LENGTH_CONSTRAINT:
			setLetterLengthConstraint((LetterLengthConstraint) null);
			return;
		case UGSMLPackage.LETTER_BASED_CONSTRAINT__LETTER_CUSTOMIZATION_CONSTRAINT:
			setLetterCustomizationConstraint((LetterCustomizationConstraint) null);
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
		case UGSMLPackage.LETTER_BASED_CONSTRAINT__VARIABILITY:
			return variability != VARIABILITY_EDEFAULT;
		case UGSMLPackage.LETTER_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			return constrainedAttributeInstance != null;
		case UGSMLPackage.LETTER_BASED_CONSTRAINT__LETTER_LENGTH_CONSTRAINT:
			return letterLengthConstraint != null;
		case UGSMLPackage.LETTER_BASED_CONSTRAINT__LETTER_CUSTOMIZATION_CONSTRAINT:
			return letterCustomizationConstraint != null;
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

} //LetterBasedConstraintImpl
