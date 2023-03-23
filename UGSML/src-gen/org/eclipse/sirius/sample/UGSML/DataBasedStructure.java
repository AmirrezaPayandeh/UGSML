/**
 */
package org.eclipse.sirius.sample.UGSML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Based Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.DataBasedStructure#getStructureAttributes <em>Structure Attributes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getDataBasedStructure()
 * @model
 * @generated
 */
public interface DataBasedStructure extends GameStructure {
	/**
	 * Returns the value of the '<em><b>Structure Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.UGSML.GameAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Attributes</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getDataBasedStructure_StructureAttributes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GameAttribute> getStructureAttributes();

} // DataBasedStructure
