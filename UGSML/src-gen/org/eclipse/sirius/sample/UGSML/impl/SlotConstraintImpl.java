/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.SlotConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.SlotConstraintImpl#getNumberOfSlots <em>Number Of Slots</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.SlotConstraintImpl#getMaximumSlots <em>Maximum Slots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlotConstraintImpl extends MinimalEObjectImpl.Container implements SlotConstraint {
	/**
	 * The default value of the '{@link #getNumberOfSlots() <em>Number Of Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSlots()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_SLOTS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNumberOfSlots() <em>Number Of Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSlots()
	 * @generated
	 * @ordered
	 */
	protected int numberOfSlots = NUMBER_OF_SLOTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumSlots() <em>Maximum Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSlots()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_SLOTS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMaximumSlots() <em>Maximum Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSlots()
	 * @generated
	 * @ordered
	 */
	protected int maximumSlots = MAXIMUM_SLOTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.SLOT_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfSlots() {
		return numberOfSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSlots(int newNumberOfSlots) {
		int oldNumberOfSlots = numberOfSlots;
		numberOfSlots = newNumberOfSlots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.SLOT_CONSTRAINT__NUMBER_OF_SLOTS,
					oldNumberOfSlots, numberOfSlots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaximumSlots() {
		return maximumSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumSlots(int newMaximumSlots) {
		int oldMaximumSlots = maximumSlots;
		maximumSlots = newMaximumSlots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.SLOT_CONSTRAINT__MAXIMUM_SLOTS,
					oldMaximumSlots, maximumSlots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.SLOT_CONSTRAINT__NUMBER_OF_SLOTS:
			return getNumberOfSlots();
		case UGSMLPackage.SLOT_CONSTRAINT__MAXIMUM_SLOTS:
			return getMaximumSlots();
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
		case UGSMLPackage.SLOT_CONSTRAINT__NUMBER_OF_SLOTS:
			setNumberOfSlots((Integer) newValue);
			return;
		case UGSMLPackage.SLOT_CONSTRAINT__MAXIMUM_SLOTS:
			setMaximumSlots((Integer) newValue);
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
		case UGSMLPackage.SLOT_CONSTRAINT__NUMBER_OF_SLOTS:
			setNumberOfSlots(NUMBER_OF_SLOTS_EDEFAULT);
			return;
		case UGSMLPackage.SLOT_CONSTRAINT__MAXIMUM_SLOTS:
			setMaximumSlots(MAXIMUM_SLOTS_EDEFAULT);
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
		case UGSMLPackage.SLOT_CONSTRAINT__NUMBER_OF_SLOTS:
			return numberOfSlots != NUMBER_OF_SLOTS_EDEFAULT;
		case UGSMLPackage.SLOT_CONSTRAINT__MAXIMUM_SLOTS:
			return maximumSlots != MAXIMUM_SLOTS_EDEFAULT;
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
		result.append(" (NumberOfSlots: ");
		result.append(numberOfSlots);
		result.append(", MaximumSlots: ");
		result.append(maximumSlots);
		result.append(')');
		return result.toString();
	}

} //SlotConstraintImpl
