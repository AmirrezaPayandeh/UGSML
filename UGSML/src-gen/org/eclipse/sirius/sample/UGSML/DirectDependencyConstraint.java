/**
 */
package org.eclipse.sirius.sample.UGSML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Dependency Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.DirectDependencyConstraint#getDependentAttributes <em>Dependent Attributes</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.DirectDependencyConstraint#getDependencyFormula <em>Dependency Formula</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getDirectDependencyConstraint()
 * @model
 * @generated
 */
public interface DirectDependencyConstraint extends DependencyConstraint {
	/**
	 * Returns the value of the '<em><b>Dependent Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.UGSML.ValueBasedAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Attributes</em>' reference list.
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getDirectDependencyConstraint_DependentAttributes()
	 * @model required="true"
	 * @generated
	 */
	EList<ValueBasedAttribute> getDependentAttributes();

	/**
	 * Returns the value of the '<em><b>Dependency Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency Formula</em>' attribute.
	 * @see #setDependencyFormula(String)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getDirectDependencyConstraint_DependencyFormula()
	 * @model required="true"
	 * @generated
	 */
	String getDependencyFormula();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.DirectDependencyConstraint#getDependencyFormula <em>Dependency Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency Formula</em>' attribute.
	 * @see #getDependencyFormula()
	 * @generated
	 */
	void setDependencyFormula(String value);

} // DirectDependencyConstraint
