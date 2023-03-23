/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.sirius.sample.UGSML.DirectDependencyConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;
import org.eclipse.sirius.sample.UGSML.ValueBasedAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct Dependency Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.DirectDependencyConstraintImpl#getDependentAttributes <em>Dependent Attributes</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.DirectDependencyConstraintImpl#getDependencyFormula <em>Dependency Formula</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectDependencyConstraintImpl extends MinimalEObjectImpl.Container implements DirectDependencyConstraint {
	/**
	 * The cached value of the '{@link #getDependentAttributes() <em>Dependent Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueBasedAttribute> dependentAttributes;

	/**
	 * The default value of the '{@link #getDependencyFormula() <em>Dependency Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyFormula()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDENCY_FORMULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependencyFormula() <em>Dependency Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyFormula()
	 * @generated
	 * @ordered
	 */
	protected String dependencyFormula = DEPENDENCY_FORMULA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectDependencyConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.DIRECT_DEPENDENCY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueBasedAttribute> getDependentAttributes() {
		if (dependentAttributes == null) {
			dependentAttributes = new EObjectResolvingEList<ValueBasedAttribute>(ValueBasedAttribute.class, this,
					UGSMLPackage.DIRECT_DEPENDENCY_CONSTRAINT__DEPENDENT_ATTRIBUTES);
		}
		return dependentAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDependencyFormula() {
		return dependencyFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencyFormula(String newDependencyFormula) {
		String oldDependencyFormula = dependencyFormula;
		dependencyFormula = newDependencyFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.DIRECT_DEPENDENCY_CONSTRAINT__DEPENDENCY_FORMULA, oldDependencyFormula,
					dependencyFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.DIRECT_DEPENDENCY_CONSTRAINT__DEPENDENT_ATTRIBUTES:
			return getDependentAttributes();
		case UGSMLPackage.DIRECT_DEPENDENCY_CONSTRAINT__DEPENDENCY_FORMULA:
			return getDependencyFormula();
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
		case UGSMLPackage.DIRECT_DEPENDENCY_CONSTRAINT__DEPENDENT_ATTRIBUTES:
			getDependentAttributes().clear();
			getDependentAttributes().addAll((Collection<? extends ValueBasedAttribute>) newValue);
			return;
		case UGSMLPackage.DIRECT_DEPENDENCY_CONSTRAINT__DEPENDENCY_FORMULA:
			setDependencyFormula((String) newValue);
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
		case UGSMLPackage.DIRECT_DEPENDENCY_CONSTRAINT__DEPENDENT_ATTRIBUTES:
			getDependentAttributes().clear();
			return;
		case UGSMLPackage.DIRECT_DEPENDENCY_CONSTRAINT__DEPENDENCY_FORMULA:
			setDependencyFormula(DEPENDENCY_FORMULA_EDEFAULT);
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
		case UGSMLPackage.DIRECT_DEPENDENCY_CONSTRAINT__DEPENDENT_ATTRIBUTES:
			return dependentAttributes != null && !dependentAttributes.isEmpty();
		case UGSMLPackage.DIRECT_DEPENDENCY_CONSTRAINT__DEPENDENCY_FORMULA:
			return DEPENDENCY_FORMULA_EDEFAULT == null ? dependencyFormula != null
					: !DEPENDENCY_FORMULA_EDEFAULT.equals(dependencyFormula);
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
		result.append(" (DependencyFormula: ");
		result.append(dependencyFormula);
		result.append(')');
		return result.toString();
	}

} //DirectDependencyConstraintImpl
