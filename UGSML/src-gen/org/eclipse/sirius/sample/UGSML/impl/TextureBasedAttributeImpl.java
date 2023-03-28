/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.TextureBasedAttribute;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Texture Based Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.TextureBasedAttributeImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.TextureBasedAttributeImpl#isDataStructureArray <em>Data Structure Array</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextureBasedAttributeImpl extends MinimalEObjectImpl.Container implements TextureBasedAttribute {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextureBasedAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.TEXTURE_BASED_ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.TEXTURE_BASED_ATTRIBUTE__FEATURE_NAME,
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
					UGSMLPackage.TEXTURE_BASED_ATTRIBUTE__DATA_STRUCTURE_ARRAY, oldDataStructureArray,
					dataStructureArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.TEXTURE_BASED_ATTRIBUTE__FEATURE_NAME:
			return getFeatureName();
		case UGSMLPackage.TEXTURE_BASED_ATTRIBUTE__DATA_STRUCTURE_ARRAY:
			return isDataStructureArray();
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
		case UGSMLPackage.TEXTURE_BASED_ATTRIBUTE__FEATURE_NAME:
			setFeatureName((String) newValue);
			return;
		case UGSMLPackage.TEXTURE_BASED_ATTRIBUTE__DATA_STRUCTURE_ARRAY:
			setDataStructureArray((Boolean) newValue);
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
		case UGSMLPackage.TEXTURE_BASED_ATTRIBUTE__FEATURE_NAME:
			setFeatureName(FEATURE_NAME_EDEFAULT);
			return;
		case UGSMLPackage.TEXTURE_BASED_ATTRIBUTE__DATA_STRUCTURE_ARRAY:
			setDataStructureArray(DATA_STRUCTURE_ARRAY_EDEFAULT);
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
		case UGSMLPackage.TEXTURE_BASED_ATTRIBUTE__FEATURE_NAME:
			return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
		case UGSMLPackage.TEXTURE_BASED_ATTRIBUTE__DATA_STRUCTURE_ARRAY:
			return dataStructureArray != DATA_STRUCTURE_ARRAY_EDEFAULT;
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

} //TextureBasedAttributeImpl
