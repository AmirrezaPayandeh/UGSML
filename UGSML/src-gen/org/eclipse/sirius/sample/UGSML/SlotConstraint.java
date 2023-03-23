/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.SlotConstraint#getNumberOfSlots <em>Number Of Slots</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.SlotConstraint#getMaximumSlots <em>Maximum Slots</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getSlotConstraint()
 * @model
 * @generated
 */
public interface SlotConstraint extends InventoryConstraintRule {
	/**
	 * Returns the value of the '<em><b>Number Of Slots</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Slots</em>' attribute.
	 * @see #setNumberOfSlots(int)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getSlotConstraint_NumberOfSlots()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getNumberOfSlots();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.SlotConstraint#getNumberOfSlots <em>Number Of Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Slots</em>' attribute.
	 * @see #getNumberOfSlots()
	 * @generated
	 */
	void setNumberOfSlots(int value);

	/**
	 * Returns the value of the '<em><b>Maximum Slots</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Slots</em>' attribute.
	 * @see #setMaximumSlots(int)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getSlotConstraint_MaximumSlots()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getMaximumSlots();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.SlotConstraint#getMaximumSlots <em>Maximum Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Slots</em>' attribute.
	 * @see #getMaximumSlots()
	 * @generated
	 */
	void setMaximumSlots(int value);

} // SlotConstraint
