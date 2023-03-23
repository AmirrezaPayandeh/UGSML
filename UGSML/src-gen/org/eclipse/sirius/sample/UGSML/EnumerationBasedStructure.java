/**
 */
package org.eclipse.sirius.sample.UGSML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Based Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.EnumerationBasedStructure#getEnumStates <em>Enum States</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getEnumerationBasedStructure()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EnumerationBasedStructure extends GameStructure {
	/**
	 * Returns the value of the '<em><b>Enum States</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.UGSML.EnumState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum States</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getEnumerationBasedStructure_EnumStates()
	 * @model containment="true" required="true" upper="256"
	 * @generated
	 */
	EList<EnumState> getEnumStates();

} // EnumerationBasedStructure
