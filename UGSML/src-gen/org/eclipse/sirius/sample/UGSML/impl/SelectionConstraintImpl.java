/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.SelectionConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.SelectionConstraintImpl#getSelectableAmount <em>Selectable Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectionConstraintImpl extends MinimalEObjectImpl.Container implements SelectionConstraint {
	/**
	 * The default value of the '{@link #getSelectableAmount() <em>Selectable Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectableAmount()
	 * @generated
	 * @ordered
	 */
	protected static final int SELECTABLE_AMOUNT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getSelectableAmount() <em>Selectable Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectableAmount()
	 * @generated
	 * @ordered
	 */
	protected int selectableAmount = SELECTABLE_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.SELECTION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSelectableAmount() {
		return selectableAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectableAmount(int newSelectableAmount) {
		int oldSelectableAmount = selectableAmount;
		selectableAmount = newSelectableAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.SELECTION_CONSTRAINT__SELECTABLE_AMOUNT,
					oldSelectableAmount, selectableAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.SELECTION_CONSTRAINT__SELECTABLE_AMOUNT:
			return getSelectableAmount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UGSMLPackage.SELECTION_CONSTRAINT__SELECTABLE_AMOUNT:
			setSelectableAmount((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case UGSMLPackage.SELECTION_CONSTRAINT__SELECTABLE_AMOUNT:
			setSelectableAmount(SELECTABLE_AMOUNT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case UGSMLPackage.SELECTION_CONSTRAINT__SELECTABLE_AMOUNT:
			return selectableAmount != SELECTABLE_AMOUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (SelectableAmount: ");
		result.append(selectableAmount);
		result.append(')');
		return result.toString();
	}

} //SelectionConstraintImpl
