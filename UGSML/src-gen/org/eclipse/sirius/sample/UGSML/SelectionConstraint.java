/**
 */
package org.eclipse.sirius.sample.UGSML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.SelectionConstraint#getSelectableAmount <em>Selectable Amount</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getSelectionConstraint()
 * @model
 * @generated
 */
public interface SelectionConstraint extends InventoryConstraintRule {
	/**
	 * Returns the value of the '<em><b>Selectable Amount</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectable Amount</em>' attribute.
	 * @see #setSelectableAmount(int)
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#getSelectionConstraint_SelectableAmount()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getSelectableAmount();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.UGSML.SelectionConstraint#getSelectableAmount <em>Selectable Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selectable Amount</em>' attribute.
	 * @see #getSelectableAmount()
	 * @generated
	 */
	void setSelectableAmount(int value);

} // SelectionConstraint
