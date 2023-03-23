/**
 */
package org.eclipse.sirius.sample.UGSML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversion Dependency Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getConversionUnitToBase <em>Conversion Unit To Base</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getConversionChain <em>Conversion Chain</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getValueRangeBasedConstraint <em>Value Range Based Constraint</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getNextAttributeInChain <em>Next Attribute In Chain</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getConversionRate <em>Conversion Rate</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getConversionDependencyConstraint()
 * @model
 * @generated
 */
public interface ConversionDependencyConstraint extends DependencyConstraint {
	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' attribute.
	 * @see #setAttributeName(String)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getConversionDependencyConstraint_AttributeName()
	 * @model required="true"
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getAttributeName <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Conversion Unit To Base</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is only needed if there is a ConversionChain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conversion Unit To Base</em>' attribute.
	 * @see #setConversionUnitToBase(float)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getConversionDependencyConstraint_ConversionUnitToBase()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	float getConversionUnitToBase();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getConversionUnitToBase <em>Conversion Unit To Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion Unit To Base</em>' attribute.
	 * @see #getConversionUnitToBase()
	 * @generated
	 */
	void setConversionUnitToBase(float value);

	/**
	 * Returns the value of the '<em><b>Conversion Chain</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is only needed when Limit = Bounded.
	 * ConversionChain includes all attributes in the chain (including self).
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conversion Chain</em>' reference list.
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getConversionDependencyConstraint_ConversionChain()
	 * @model
	 * @generated
	 */
	EList<ConversionDependencyConstraint> getConversionChain();

	/**
	 * Returns the value of the '<em><b>Value Range Based Constraint</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint#getConversionDependencyConstraint <em>Conversion Dependency Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Range Based Constraint</em>' container reference.
	 * @see #setValueRangeBasedConstraint(ValueRangeBasedConstraint)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getConversionDependencyConstraint_ValueRangeBasedConstraint()
	 * @see org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint#getConversionDependencyConstraint
	 * @model opposite="ConversionDependencyConstraint" transient="false"
	 * @generated
	 */
	ValueRangeBasedConstraint getValueRangeBasedConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getValueRangeBasedConstraint <em>Value Range Based Constraint</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Range Based Constraint</em>' container reference.
	 * @see #getValueRangeBasedConstraint()
	 * @generated
	 */
	void setValueRangeBasedConstraint(ValueRangeBasedConstraint value);

	/**
	 * Returns the value of the '<em><b>Next Attribute In Chain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Attribute In Chain</em>' reference.
	 * @see #setNextAttributeInChain(ValueBasedAttribute)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getConversionDependencyConstraint_NextAttributeInChain()
	 * @model
	 * @generated
	 */
	ValueBasedAttribute getNextAttributeInChain();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getNextAttributeInChain <em>Next Attribute In Chain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Attribute In Chain</em>' reference.
	 * @see #getNextAttributeInChain()
	 * @generated
	 */
	void setNextAttributeInChain(ValueBasedAttribute value);

	/**
	 * Returns the value of the '<em><b>Conversion Rate</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion Rate</em>' attribute.
	 * @see #setConversionRate(float)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getConversionDependencyConstraint_ConversionRate()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	float getConversionRate();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint#getConversionRate <em>Conversion Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion Rate</em>' attribute.
	 * @see #getConversionRate()
	 * @generated
	 */
	void setConversionRate(float value);

} // ConversionDependencyConstraint
