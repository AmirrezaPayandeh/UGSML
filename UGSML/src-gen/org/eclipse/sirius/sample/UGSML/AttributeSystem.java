/**
 */
package org.eclipse.sirius.sample.UGSML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.AttributeSystem#getArrayConstraints <em>Array Constraints</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.AttributeSystem#getSingleValueConstraints <em>Single Value Constraints</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.AttributeSystem#getParentAttributeSystem <em>Parent Attribute System</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getAttributeSystem()
 * @model
 * @generated
 */
public interface AttributeSystem extends GameSystem {
	/**
	 * Returns the value of the '<em><b>Array Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.UGSML.ArrayConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Constraints</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getAttributeSystem_ArrayConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArrayConstraint> getArrayConstraints();

	/**
	 * Returns the value of the '<em><b>Single Value Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.UGSML.SingleValueConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Value Constraints</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getAttributeSystem_SingleValueConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<SingleValueConstraint> getSingleValueConstraints();

	/**
	 * Returns the value of the '<em><b>Parent Attribute System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Attribute System</em>' reference.
	 * @see #setParentAttributeSystem(AttributeSystem)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getAttributeSystem_ParentAttributeSystem()
	 * @model
	 * @generated
	 */
	AttributeSystem getParentAttributeSystem();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.AttributeSystem#getParentAttributeSystem <em>Parent Attribute System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Attribute System</em>' reference.
	 * @see #getParentAttributeSystem()
	 * @generated
	 */
	void setParentAttributeSystem(AttributeSystem value);

} // AttributeSystem
