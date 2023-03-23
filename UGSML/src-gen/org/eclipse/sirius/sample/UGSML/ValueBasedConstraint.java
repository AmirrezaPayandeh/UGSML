/**
 */
package org.eclipse.sirius.sample.UGSML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getBaseOrRangeConstraint <em>Base Or Range Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getMarginOfError <em>Margin Of Error</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getRegenerationConstraint <em>Regeneration Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getDirectDependencyConstraint <em>Direct Dependency Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getDistortionConstraints <em>Distortion Constraints</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getValueBasedConstraint()
 * @model
 * @generated
 */
public interface ValueBasedConstraint extends SingleValueConstraint {
	/**
	 * Returns the value of the '<em><b>Constrained Attribute Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Attribute Instance</em>' reference.
	 * @see #setConstrainedAttributeInstance(ValueBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getValueBasedConstraint_ConstrainedAttributeInstance()
	 * @model required="true"
	 * @generated
	 */
	ValueBasedAttribute getConstrainedAttributeInstance();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getConstrainedAttributeInstance <em>Constrained Attribute Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Attribute Instance</em>' reference.
	 * @see #getConstrainedAttributeInstance()
	 * @generated
	 */
	void setConstrainedAttributeInstance(ValueBasedAttribute value);

	/**
	 * Returns the value of the '<em><b>Base Or Range Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Or Range Constraint</em>' containment reference.
	 * @see #setBaseOrRangeConstraint(BaseOrRangeConstraint)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getValueBasedConstraint_BaseOrRangeConstraint()
	 * @model containment="true"
	 * @generated
	 */
	BaseOrRangeConstraint getBaseOrRangeConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getBaseOrRangeConstraint <em>Base Or Range Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Or Range Constraint</em>' containment reference.
	 * @see #getBaseOrRangeConstraint()
	 * @generated
	 */
	void setBaseOrRangeConstraint(BaseOrRangeConstraint value);

	/**
	 * Returns the value of the '<em><b>Margin Of Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Of Error</em>' containment reference.
	 * @see #setMarginOfError(MarginOfErrorConstraint)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getValueBasedConstraint_MarginOfError()
	 * @model containment="true"
	 * @generated
	 */
	MarginOfErrorConstraint getMarginOfError();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getMarginOfError <em>Margin Of Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Of Error</em>' containment reference.
	 * @see #getMarginOfError()
	 * @generated
	 */
	void setMarginOfError(MarginOfErrorConstraint value);

	/**
	 * Returns the value of the '<em><b>Regeneration Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regeneration Constraint</em>' containment reference.
	 * @see #setRegenerationConstraint(RegenerationConstraint)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getValueBasedConstraint_RegenerationConstraint()
	 * @model containment="true"
	 * @generated
	 */
	RegenerationConstraint getRegenerationConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getRegenerationConstraint <em>Regeneration Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regeneration Constraint</em>' containment reference.
	 * @see #getRegenerationConstraint()
	 * @generated
	 */
	void setRegenerationConstraint(RegenerationConstraint value);

	/**
	 * Returns the value of the '<em><b>Direct Dependency Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct Dependency Constraint</em>' containment reference.
	 * @see #setDirectDependencyConstraint(DirectDependencyConstraint)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getValueBasedConstraint_DirectDependencyConstraint()
	 * @model containment="true"
	 * @generated
	 */
	DirectDependencyConstraint getDirectDependencyConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ValueBasedConstraint#getDirectDependencyConstraint <em>Direct Dependency Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direct Dependency Constraint</em>' containment reference.
	 * @see #getDirectDependencyConstraint()
	 * @generated
	 */
	void setDirectDependencyConstraint(DirectDependencyConstraint value);

	/**
	 * Returns the value of the '<em><b>Distortion Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.UGSML.DistortionConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distortion Constraints</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getValueBasedConstraint_DistortionConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<DistortionConstraint> getDistortionConstraints();

} // ValueBasedConstraint
