/**
 */
package org.eclipse.sirius.sample.UGSML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customization Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.CustomizationType#getFilterType <em>Filter Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getCustomizationType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CustomizationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter Type</b></em>' attribute.
	 * The default value is <code>"Inclusion"</code>.
	 * The literals are from the enumeration {@link org.eclipse.sirius.sample.UGSML.FilteringType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Type</em>' attribute.
	 * @see org.eclipse.sirius.sample.UGSML.FilteringType
	 * @see #setFilterType(FilteringType)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getCustomizationType_FilterType()
	 * @model default="Inclusion" required="true"
	 * @generated
	 */
	FilteringType getFilterType();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.CustomizationType#getFilterType <em>Filter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Type</em>' attribute.
	 * @see org.eclipse.sirius.sample.UGSML.FilteringType
	 * @see #getFilterType()
	 * @generated
	 */
	void setFilterType(FilteringType value);

} // CustomizationType
