/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.EnumBasedAttribute;
import org.eclipse.sirius.sample.UGSML.EnumerationBasedStructure;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Based Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.EnumBasedAttributeImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.EnumBasedAttributeImpl#isDataStructureArray <em>Data Structure Array</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.EnumBasedAttributeImpl#getEnumType <em>Enum Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumBasedAttributeImpl extends MinimalEObjectImpl.Container implements EnumBasedAttribute {
	/**
	 * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_NAME_EDEFAULT = "FeatureName";

	/**
	 * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String featureName = FEATURE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isDataStructureArray() <em>Data Structure Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataStructureArray()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DATA_STRUCTURE_ARRAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDataStructureArray() <em>Data Structure Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataStructureArray()
	 * @generated
	 * @ordered
	 */
	protected boolean dataStructureArray = DATA_STRUCTURE_ARRAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnumType() <em>Enum Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumType()
	 * @generated
	 * @ordered
	 */
	protected EnumerationBasedStructure enumType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumBasedAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.ENUM_BASED_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureName(String newFeatureName) {
		String oldFeatureName = featureName;
		featureName = newFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.ENUM_BASED_ATTRIBUTE__FEATURE_NAME,
					oldFeatureName, featureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDataStructureArray() {
		return dataStructureArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataStructureArray(boolean newDataStructureArray) {
		boolean oldDataStructureArray = dataStructureArray;
		dataStructureArray = newDataStructureArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.ENUM_BASED_ATTRIBUTE__DATA_STRUCTURE_ARRAY, oldDataStructureArray,
					dataStructureArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationBasedStructure getEnumType() {
		if (enumType != null && enumType.eIsProxy()) {
			InternalEObject oldEnumType = (InternalEObject) enumType;
			enumType = (EnumerationBasedStructure) eResolveProxy(oldEnumType);
			if (enumType != oldEnumType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.ENUM_BASED_ATTRIBUTE__ENUM_TYPE, oldEnumType, enumType));
			}
		}
		return enumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationBasedStructure basicGetEnumType() {
		return enumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumType(EnumerationBasedStructure newEnumType) {
		EnumerationBasedStructure oldEnumType = enumType;
		enumType = newEnumType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.ENUM_BASED_ATTRIBUTE__ENUM_TYPE,
					oldEnumType, enumType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.ENUM_BASED_ATTRIBUTE__FEATURE_NAME:
			return getFeatureName();
		case UGSMLPackage.ENUM_BASED_ATTRIBUTE__DATA_STRUCTURE_ARRAY:
			return isDataStructureArray();
		case UGSMLPackage.ENUM_BASED_ATTRIBUTE__ENUM_TYPE:
			if (resolve)
				return getEnumType();
			return basicGetEnumType();
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
		case UGSMLPackage.ENUM_BASED_ATTRIBUTE__FEATURE_NAME:
			setFeatureName((String) newValue);
			return;
		case UGSMLPackage.ENUM_BASED_ATTRIBUTE__DATA_STRUCTURE_ARRAY:
			setDataStructureArray((Boolean) newValue);
			return;
		case UGSMLPackage.ENUM_BASED_ATTRIBUTE__ENUM_TYPE:
			setEnumType((EnumerationBasedStructure) newValue);
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
		case UGSMLPackage.ENUM_BASED_ATTRIBUTE__FEATURE_NAME:
			setFeatureName(FEATURE_NAME_EDEFAULT);
			return;
		case UGSMLPackage.ENUM_BASED_ATTRIBUTE__DATA_STRUCTURE_ARRAY:
			setDataStructureArray(DATA_STRUCTURE_ARRAY_EDEFAULT);
			return;
		case UGSMLPackage.ENUM_BASED_ATTRIBUTE__ENUM_TYPE:
			setEnumType((EnumerationBasedStructure) null);
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
		case UGSMLPackage.ENUM_BASED_ATTRIBUTE__FEATURE_NAME:
			return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
		case UGSMLPackage.ENUM_BASED_ATTRIBUTE__DATA_STRUCTURE_ARRAY:
			return dataStructureArray != DATA_STRUCTURE_ARRAY_EDEFAULT;
		case UGSMLPackage.ENUM_BASED_ATTRIBUTE__ENUM_TYPE:
			return enumType != null;
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
		result.append(" (FeatureName: ");
		result.append(featureName);
		result.append(", DataStructureArray: ");
		result.append(dataStructureArray);
		result.append(')');
		return result.toString();
	}

} //EnumBasedAttributeImpl
