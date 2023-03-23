/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.UGSML.ArrayConstraint;
import org.eclipse.sirius.sample.UGSML.AttributeSystem;
import org.eclipse.sirius.sample.UGSML.SingleValueConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.AttributeSystemImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.AttributeSystemImpl#getArrayConstraints <em>Array Constraints</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.AttributeSystemImpl#getSingleValueConstraints <em>Single Value Constraints</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.AttributeSystemImpl#getParentAttributeSystem <em>Parent Attribute System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeSystemImpl extends MinimalEObjectImpl.Container implements AttributeSystem {
	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = "SystemName";

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArrayConstraints() <em>Array Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayConstraint> arrayConstraints;

	/**
	 * The cached value of the '{@link #getSingleValueConstraints() <em>Single Value Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleValueConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleValueConstraint> singleValueConstraints;

	/**
	 * The cached value of the '{@link #getParentAttributeSystem() <em>Parent Attribute System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentAttributeSystem()
	 * @generated
	 * @ordered
	 */
	protected AttributeSystem parentAttributeSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.ATTRIBUTE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.ATTRIBUTE_SYSTEM__SYSTEM_NAME,
					oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayConstraint> getArrayConstraints() {
		if (arrayConstraints == null) {
			arrayConstraints = new EObjectContainmentEList<ArrayConstraint>(ArrayConstraint.class, this,
					UGSMLPackage.ATTRIBUTE_SYSTEM__ARRAY_CONSTRAINTS);
		}
		return arrayConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingleValueConstraint> getSingleValueConstraints() {
		if (singleValueConstraints == null) {
			singleValueConstraints = new EObjectContainmentEList<SingleValueConstraint>(SingleValueConstraint.class,
					this, UGSMLPackage.ATTRIBUTE_SYSTEM__SINGLE_VALUE_CONSTRAINTS);
		}
		return singleValueConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeSystem getParentAttributeSystem() {
		if (parentAttributeSystem != null && parentAttributeSystem.eIsProxy()) {
			InternalEObject oldParentAttributeSystem = (InternalEObject) parentAttributeSystem;
			parentAttributeSystem = (AttributeSystem) eResolveProxy(oldParentAttributeSystem);
			if (parentAttributeSystem != oldParentAttributeSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.ATTRIBUTE_SYSTEM__PARENT_ATTRIBUTE_SYSTEM, oldParentAttributeSystem,
							parentAttributeSystem));
			}
		}
		return parentAttributeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeSystem basicGetParentAttributeSystem() {
		return parentAttributeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAttributeSystem(AttributeSystem newParentAttributeSystem) {
		AttributeSystem oldParentAttributeSystem = parentAttributeSystem;
		parentAttributeSystem = newParentAttributeSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.ATTRIBUTE_SYSTEM__PARENT_ATTRIBUTE_SYSTEM, oldParentAttributeSystem,
					parentAttributeSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UGSMLPackage.ATTRIBUTE_SYSTEM__ARRAY_CONSTRAINTS:
			return ((InternalEList<?>) getArrayConstraints()).basicRemove(otherEnd, msgs);
		case UGSMLPackage.ATTRIBUTE_SYSTEM__SINGLE_VALUE_CONSTRAINTS:
			return ((InternalEList<?>) getSingleValueConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.ATTRIBUTE_SYSTEM__SYSTEM_NAME:
			return getSystemName();
		case UGSMLPackage.ATTRIBUTE_SYSTEM__ARRAY_CONSTRAINTS:
			return getArrayConstraints();
		case UGSMLPackage.ATTRIBUTE_SYSTEM__SINGLE_VALUE_CONSTRAINTS:
			return getSingleValueConstraints();
		case UGSMLPackage.ATTRIBUTE_SYSTEM__PARENT_ATTRIBUTE_SYSTEM:
			if (resolve)
				return getParentAttributeSystem();
			return basicGetParentAttributeSystem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UGSMLPackage.ATTRIBUTE_SYSTEM__SYSTEM_NAME:
			setSystemName((String) newValue);
			return;
		case UGSMLPackage.ATTRIBUTE_SYSTEM__ARRAY_CONSTRAINTS:
			getArrayConstraints().clear();
			getArrayConstraints().addAll((Collection<? extends ArrayConstraint>) newValue);
			return;
		case UGSMLPackage.ATTRIBUTE_SYSTEM__SINGLE_VALUE_CONSTRAINTS:
			getSingleValueConstraints().clear();
			getSingleValueConstraints().addAll((Collection<? extends SingleValueConstraint>) newValue);
			return;
		case UGSMLPackage.ATTRIBUTE_SYSTEM__PARENT_ATTRIBUTE_SYSTEM:
			setParentAttributeSystem((AttributeSystem) newValue);
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
		case UGSMLPackage.ATTRIBUTE_SYSTEM__SYSTEM_NAME:
			setSystemName(SYSTEM_NAME_EDEFAULT);
			return;
		case UGSMLPackage.ATTRIBUTE_SYSTEM__ARRAY_CONSTRAINTS:
			getArrayConstraints().clear();
			return;
		case UGSMLPackage.ATTRIBUTE_SYSTEM__SINGLE_VALUE_CONSTRAINTS:
			getSingleValueConstraints().clear();
			return;
		case UGSMLPackage.ATTRIBUTE_SYSTEM__PARENT_ATTRIBUTE_SYSTEM:
			setParentAttributeSystem((AttributeSystem) null);
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
		case UGSMLPackage.ATTRIBUTE_SYSTEM__SYSTEM_NAME:
			return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
		case UGSMLPackage.ATTRIBUTE_SYSTEM__ARRAY_CONSTRAINTS:
			return arrayConstraints != null && !arrayConstraints.isEmpty();
		case UGSMLPackage.ATTRIBUTE_SYSTEM__SINGLE_VALUE_CONSTRAINTS:
			return singleValueConstraints != null && !singleValueConstraints.isEmpty();
		case UGSMLPackage.ATTRIBUTE_SYSTEM__PARENT_ATTRIBUTE_SYSTEM:
			return parentAttributeSystem != null;
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
		result.append(" (SystemName: ");
		result.append(systemName);
		result.append(')');
		return result.toString();
	}

} //AttributeSystemImpl
