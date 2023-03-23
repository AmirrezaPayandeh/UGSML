/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Range Based Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint#getConversionDependencyConstraint <em>Conversion Dependency Constraint</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getValueRangeBasedConstraint()
 * @model
 * @generated
 */
public interface ValueRangeBasedConstraint extends BaseOrRangeConstraint, RangeBasedConstraint {
	/**
	 * Returns the value of the '<em><b>Minimum Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Value</em>' containment reference.
	 * @see #setMinimumValue(MinimumValue)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getValueRangeBasedConstraint_MinimumValue()
	 * @model containment="true"
	 * @generated
	 */
	MinimumValue getMinimumValue();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint#getMinimumValue <em>Minimum Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Value</em>' containment reference.
	 * @see #getMinimumValue()
	 * @generated
	 */
	void setMinimumValue(MinimumValue value);

	/**
	 * Returns the value of the '<em><b>Maximum Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Value</em>' containment reference.
	 * @see #setMaximumValue(MaximumValue)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getValueRangeBasedConstraint_MaximumValue()
	 * @model containment="true"
	 * @generated
	 */
	MaximumValue getMaximumValue();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint#getMaximumValue <em>Maximum Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Value</em>' containment reference.
	 * @see #getMaximumValue()
	 * @generated
	 */
	void setMaximumValue(MaximumValue value);

	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' attribute.
	 * The default value is <code>"Default"</code>.
	 * The literals are from the enumeration {@link org.eclipse.sirius.sample.UGSML.InitializationMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' attribute.
	 * @see org.eclipse.sirius.sample.UGSML.InitializationMode
	 * @see #setInitializer(InitializationMode)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getValueRangeBasedConstraint_Initializer()
	 * @model default="Default" required="true"
	 * @generated
	 */
	InitializationMode getInitializer();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint#getInitializer <em>Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' attribute.
	 * @see org.eclipse.sirius.sample.UGSML.InitializationMode
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(InitializationMode value);

	/**
	 * Returns the value of the '<em><b>Conversion Dependency Constraint</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getValueRangeBasedConstraint <em>Value Range Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion Dependency Constraint</em>' containment reference.
	 * @see #setConversionDependencyConstraint(ConversionDependencyConstraint)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getValueRangeBasedConstraint_ConversionDependencyConstraint()
	 * @see org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getValueRangeBasedConstraint
	 * @model opposite="ValueRangeBasedConstraint" containment="true"
	 * @generated
	 */
	ConversionDependencyConstraint getConversionDependencyConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint#getConversionDependencyConstraint <em>Conversion Dependency Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion Dependency Constraint</em>' containment reference.
	 * @see #getConversionDependencyConstraint()
	 * @generated
	 */
	void setConversionDependencyConstraint(ConversionDependencyConstraint value);

} // ValueRangeBasedConstraint
