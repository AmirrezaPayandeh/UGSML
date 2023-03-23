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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.UGSML.BaseOrRangeConstraint;
import org.eclipse.sirius.sample.UGSML.DirectDependencyConstraint;
import org.eclipse.sirius.sample.UGSML.DistortionConstraint;
import org.eclipse.sirius.sample.UGSML.MarginOfErrorConstraint;
import org.eclipse.sirius.sample.UGSML.RegenerationConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;
import org.eclipse.sirius.sample.UGSML.ValueBasedAttribute;
import org.eclipse.sirius.sample.UGSML.ValueBasedConstraint;
import org.eclipse.sirius.sample.UGSML.VariabilityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.ValueBasedConstraintImpl#getVariability <em>Variability</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.ValueBasedConstraintImpl#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.ValueBasedConstraintImpl#getBaseOrRangeConstraint <em>Base Or Range Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.ValueBasedConstraintImpl#getMarginOfError <em>Margin Of Error</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.ValueBasedConstraintImpl#getRegenerationConstraint <em>Regeneration Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.ValueBasedConstraintImpl#getDirectDependencyConstraint <em>Direct Dependency Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.ValueBasedConstraintImpl#getDistortionConstraints <em>Distortion Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueBasedConstraintImpl extends MinimalEObjectImpl.Container implements ValueBasedConstraint {
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
	protected ValueBasedAttribute constrainedAttributeInstance;

	/**
	 * The cached value of the '{@link #getBaseOrRangeConstraint() <em>Base Or Range Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseOrRangeConstraint()
	 * @generated
	 * @ordered
	 */
	protected BaseOrRangeConstraint baseOrRangeConstraint;

	/**
	 * The cached value of the '{@link #getMarginOfError() <em>Margin Of Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginOfError()
	 * @generated
	 * @ordered
	 */
	protected MarginOfErrorConstraint marginOfError;

	/**
	 * The cached value of the '{@link #getRegenerationConstraint() <em>Regeneration Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegenerationConstraint()
	 * @generated
	 * @ordered
	 */
	protected RegenerationConstraint regenerationConstraint;

	/**
	 * The cached value of the '{@link #getDirectDependencyConstraint() <em>Direct Dependency Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectDependencyConstraint()
	 * @generated
	 * @ordered
	 */
	protected DirectDependencyConstraint directDependencyConstraint;

	/**
	 * The cached value of the '{@link #getDistortionConstraints() <em>Distortion Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistortionConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<DistortionConstraint> distortionConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueBasedConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.VALUE_BASED_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.VALUE_BASED_CONSTRAINT__VARIABILITY,
					oldVariability, variability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBasedAttribute getConstrainedAttributeInstance() {
		if (constrainedAttributeInstance != null && constrainedAttributeInstance.eIsProxy()) {
			InternalEObject oldConstrainedAttributeInstance = (InternalEObject) constrainedAttributeInstance;
			constrainedAttributeInstance = (ValueBasedAttribute) eResolveProxy(oldConstrainedAttributeInstance);
			if (constrainedAttributeInstance != oldConstrainedAttributeInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.VALUE_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE,
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
	public ValueBasedAttribute basicGetConstrainedAttributeInstance() {
		return constrainedAttributeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainedAttributeInstance(ValueBasedAttribute newConstrainedAttributeInstance) {
		ValueBasedAttribute oldConstrainedAttributeInstance = constrainedAttributeInstance;
		constrainedAttributeInstance = newConstrainedAttributeInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VALUE_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE,
					oldConstrainedAttributeInstance, constrainedAttributeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseOrRangeConstraint getBaseOrRangeConstraint() {
		return baseOrRangeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseOrRangeConstraint(BaseOrRangeConstraint newBaseOrRangeConstraint,
			NotificationChain msgs) {
		BaseOrRangeConstraint oldBaseOrRangeConstraint = baseOrRangeConstraint;
		baseOrRangeConstraint = newBaseOrRangeConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VALUE_BASED_CONSTRAINT__BASE_OR_RANGE_CONSTRAINT, oldBaseOrRangeConstraint,
					newBaseOrRangeConstraint);
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
	public void setBaseOrRangeConstraint(BaseOrRangeConstraint newBaseOrRangeConstraint) {
		if (newBaseOrRangeConstraint != baseOrRangeConstraint) {
			NotificationChain msgs = null;
			if (baseOrRangeConstraint != null)
				msgs = ((InternalEObject) baseOrRangeConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.VALUE_BASED_CONSTRAINT__BASE_OR_RANGE_CONSTRAINT, null,
						msgs);
			if (newBaseOrRangeConstraint != null)
				msgs = ((InternalEObject) newBaseOrRangeConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.VALUE_BASED_CONSTRAINT__BASE_OR_RANGE_CONSTRAINT, null,
						msgs);
			msgs = basicSetBaseOrRangeConstraint(newBaseOrRangeConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VALUE_BASED_CONSTRAINT__BASE_OR_RANGE_CONSTRAINT, newBaseOrRangeConstraint,
					newBaseOrRangeConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarginOfErrorConstraint getMarginOfError() {
		return marginOfError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarginOfError(MarginOfErrorConstraint newMarginOfError, NotificationChain msgs) {
		MarginOfErrorConstraint oldMarginOfError = marginOfError;
		marginOfError = newMarginOfError;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VALUE_BASED_CONSTRAINT__MARGIN_OF_ERROR, oldMarginOfError, newMarginOfError);
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
	public void setMarginOfError(MarginOfErrorConstraint newMarginOfError) {
		if (newMarginOfError != marginOfError) {
			NotificationChain msgs = null;
			if (marginOfError != null)
				msgs = ((InternalEObject) marginOfError).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.VALUE_BASED_CONSTRAINT__MARGIN_OF_ERROR, null, msgs);
			if (newMarginOfError != null)
				msgs = ((InternalEObject) newMarginOfError).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.VALUE_BASED_CONSTRAINT__MARGIN_OF_ERROR, null, msgs);
			msgs = basicSetMarginOfError(newMarginOfError, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.VALUE_BASED_CONSTRAINT__MARGIN_OF_ERROR,
					newMarginOfError, newMarginOfError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegenerationConstraint getRegenerationConstraint() {
		return regenerationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegenerationConstraint(RegenerationConstraint newRegenerationConstraint,
			NotificationChain msgs) {
		RegenerationConstraint oldRegenerationConstraint = regenerationConstraint;
		regenerationConstraint = newRegenerationConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VALUE_BASED_CONSTRAINT__REGENERATION_CONSTRAINT, oldRegenerationConstraint,
					newRegenerationConstraint);
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
	public void setRegenerationConstraint(RegenerationConstraint newRegenerationConstraint) {
		if (newRegenerationConstraint != regenerationConstraint) {
			NotificationChain msgs = null;
			if (regenerationConstraint != null)
				msgs = ((InternalEObject) regenerationConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.VALUE_BASED_CONSTRAINT__REGENERATION_CONSTRAINT, null,
						msgs);
			if (newRegenerationConstraint != null)
				msgs = ((InternalEObject) newRegenerationConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.VALUE_BASED_CONSTRAINT__REGENERATION_CONSTRAINT, null,
						msgs);
			msgs = basicSetRegenerationConstraint(newRegenerationConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VALUE_BASED_CONSTRAINT__REGENERATION_CONSTRAINT, newRegenerationConstraint,
					newRegenerationConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectDependencyConstraint getDirectDependencyConstraint() {
		return directDependencyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectDependencyConstraint(
			DirectDependencyConstraint newDirectDependencyConstraint, NotificationChain msgs) {
		DirectDependencyConstraint oldDirectDependencyConstraint = directDependencyConstraint;
		directDependencyConstraint = newDirectDependencyConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VALUE_BASED_CONSTRAINT__DIRECT_DEPENDENCY_CONSTRAINT, oldDirectDependencyConstraint,
					newDirectDependencyConstraint);
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
	public void setDirectDependencyConstraint(DirectDependencyConstraint newDirectDependencyConstraint) {
		if (newDirectDependencyConstraint != directDependencyConstraint) {
			NotificationChain msgs = null;
			if (directDependencyConstraint != null)
				msgs = ((InternalEObject) directDependencyConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.VALUE_BASED_CONSTRAINT__DIRECT_DEPENDENCY_CONSTRAINT,
						null, msgs);
			if (newDirectDependencyConstraint != null)
				msgs = ((InternalEObject) newDirectDependencyConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.VALUE_BASED_CONSTRAINT__DIRECT_DEPENDENCY_CONSTRAINT,
						null, msgs);
			msgs = basicSetDirectDependencyConstraint(newDirectDependencyConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VALUE_BASED_CONSTRAINT__DIRECT_DEPENDENCY_CONSTRAINT, newDirectDependencyConstraint,
					newDirectDependencyConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DistortionConstraint> getDistortionConstraints() {
		if (distortionConstraints == null) {
			distortionConstraints = new EObjectContainmentEList<DistortionConstraint>(DistortionConstraint.class, this,
					UGSMLPackage.VALUE_BASED_CONSTRAINT__DISTORTION_CONSTRAINTS);
		}
		return distortionConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__BASE_OR_RANGE_CONSTRAINT:
			return basicSetBaseOrRangeConstraint(null, msgs);
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__MARGIN_OF_ERROR:
			return basicSetMarginOfError(null, msgs);
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__REGENERATION_CONSTRAINT:
			return basicSetRegenerationConstraint(null, msgs);
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__DIRECT_DEPENDENCY_CONSTRAINT:
			return basicSetDirectDependencyConstraint(null, msgs);
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__DISTORTION_CONSTRAINTS:
			return ((InternalEList<?>) getDistortionConstraints()).basicRemove(otherEnd, msgs);
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
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__VARIABILITY:
			return getVariability();
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			if (resolve)
				return getConstrainedAttributeInstance();
			return basicGetConstrainedAttributeInstance();
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__BASE_OR_RANGE_CONSTRAINT:
			return getBaseOrRangeConstraint();
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__MARGIN_OF_ERROR:
			return getMarginOfError();
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__REGENERATION_CONSTRAINT:
			return getRegenerationConstraint();
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__DIRECT_DEPENDENCY_CONSTRAINT:
			return getDirectDependencyConstraint();
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__DISTORTION_CONSTRAINTS:
			return getDistortionConstraints();
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
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__VARIABILITY:
			setVariability((VariabilityType) newValue);
			return;
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			setConstrainedAttributeInstance((ValueBasedAttribute) newValue);
			return;
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__BASE_OR_RANGE_CONSTRAINT:
			setBaseOrRangeConstraint((BaseOrRangeConstraint) newValue);
			return;
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__MARGIN_OF_ERROR:
			setMarginOfError((MarginOfErrorConstraint) newValue);
			return;
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__REGENERATION_CONSTRAINT:
			setRegenerationConstraint((RegenerationConstraint) newValue);
			return;
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__DIRECT_DEPENDENCY_CONSTRAINT:
			setDirectDependencyConstraint((DirectDependencyConstraint) newValue);
			return;
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__DISTORTION_CONSTRAINTS:
			getDistortionConstraints().clear();
			getDistortionConstraints().addAll((Collection<? extends DistortionConstraint>) newValue);
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
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__VARIABILITY:
			setVariability(VARIABILITY_EDEFAULT);
			return;
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			setConstrainedAttributeInstance((ValueBasedAttribute) null);
			return;
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__BASE_OR_RANGE_CONSTRAINT:
			setBaseOrRangeConstraint((BaseOrRangeConstraint) null);
			return;
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__MARGIN_OF_ERROR:
			setMarginOfError((MarginOfErrorConstraint) null);
			return;
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__REGENERATION_CONSTRAINT:
			setRegenerationConstraint((RegenerationConstraint) null);
			return;
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__DIRECT_DEPENDENCY_CONSTRAINT:
			setDirectDependencyConstraint((DirectDependencyConstraint) null);
			return;
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__DISTORTION_CONSTRAINTS:
			getDistortionConstraints().clear();
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
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__VARIABILITY:
			return variability != VARIABILITY_EDEFAULT;
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE:
			return constrainedAttributeInstance != null;
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__BASE_OR_RANGE_CONSTRAINT:
			return baseOrRangeConstraint != null;
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__MARGIN_OF_ERROR:
			return marginOfError != null;
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__REGENERATION_CONSTRAINT:
			return regenerationConstraint != null;
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__DIRECT_DEPENDENCY_CONSTRAINT:
			return directDependencyConstraint != null;
		case UGSMLPackage.VALUE_BASED_CONSTRAINT__DISTORTION_CONSTRAINTS:
			return distortionConstraints != null && !distortionConstraints.isEmpty();
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

} //ValueBasedConstraintImpl
