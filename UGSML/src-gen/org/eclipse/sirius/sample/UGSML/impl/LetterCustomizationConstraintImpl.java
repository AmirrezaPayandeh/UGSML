/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.CustomizationType;
import org.eclipse.sirius.sample.UGSML.FilteringType;
import org.eclipse.sirius.sample.UGSML.LetterCustomizationConstraint;
import org.eclipse.sirius.sample.UGSML.StringBasedAttribute;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Letter Customization Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.LetterCustomizationConstraintImpl#getFilterType <em>Filter Type</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.LetterCustomizationConstraintImpl#getFilterStrings <em>Filter Strings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LetterCustomizationConstraintImpl extends MinimalEObjectImpl.Container
		implements LetterCustomizationConstraint {
	/**
	 * The default value of the '{@link #getFilterType() <em>Filter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterType()
	 * @generated
	 * @ordered
	 */
	protected static final FilteringType FILTER_TYPE_EDEFAULT = FilteringType.INCLUSION;

	/**
	 * The cached value of the '{@link #getFilterType() <em>Filter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterType()
	 * @generated
	 * @ordered
	 */
	protected FilteringType filterType = FILTER_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilterStrings() <em>Filter Strings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterStrings()
	 * @generated
	 * @ordered
	 */
	protected StringBasedAttribute filterStrings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LetterCustomizationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.LETTER_CUSTOMIZATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilteringType getFilterType() {
		return filterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterType(FilteringType newFilterType) {
		FilteringType oldFilterType = filterType;
		filterType = newFilterType == null ? FILTER_TYPE_EDEFAULT : newFilterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.LETTER_CUSTOMIZATION_CONSTRAINT__FILTER_TYPE, oldFilterType, filterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringBasedAttribute getFilterStrings() {
		if (filterStrings != null && filterStrings.eIsProxy()) {
			InternalEObject oldFilterStrings = (InternalEObject) filterStrings;
			filterStrings = (StringBasedAttribute) eResolveProxy(oldFilterStrings);
			if (filterStrings != oldFilterStrings) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UGSMLPackage.LETTER_CUSTOMIZATION_CONSTRAINT__FILTER_STRINGS, oldFilterStrings,
							filterStrings));
			}
		}
		return filterStrings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringBasedAttribute basicGetFilterStrings() {
		return filterStrings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterStrings(StringBasedAttribute newFilterStrings) {
		StringBasedAttribute oldFilterStrings = filterStrings;
		filterStrings = newFilterStrings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.LETTER_CUSTOMIZATION_CONSTRAINT__FILTER_STRINGS, oldFilterStrings, filterStrings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.LETTER_CUSTOMIZATION_CONSTRAINT__FILTER_TYPE:
			return getFilterType();
		case UGSMLPackage.LETTER_CUSTOMIZATION_CONSTRAINT__FILTER_STRINGS:
			if (resolve)
				return getFilterStrings();
			return basicGetFilterStrings();
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
		case UGSMLPackage.LETTER_CUSTOMIZATION_CONSTRAINT__FILTER_TYPE:
			setFilterType((FilteringType) newValue);
			return;
		case UGSMLPackage.LETTER_CUSTOMIZATION_CONSTRAINT__FILTER_STRINGS:
			setFilterStrings((StringBasedAttribute) newValue);
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
		case UGSMLPackage.LETTER_CUSTOMIZATION_CONSTRAINT__FILTER_TYPE:
			setFilterType(FILTER_TYPE_EDEFAULT);
			return;
		case UGSMLPackage.LETTER_CUSTOMIZATION_CONSTRAINT__FILTER_STRINGS:
			setFilterStrings((StringBasedAttribute) null);
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
		case UGSMLPackage.LETTER_CUSTOMIZATION_CONSTRAINT__FILTER_TYPE:
			return filterType != FILTER_TYPE_EDEFAULT;
		case UGSMLPackage.LETTER_CUSTOMIZATION_CONSTRAINT__FILTER_STRINGS:
			return filterStrings != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CustomizationType.class) {
			switch (derivedFeatureID) {
			case UGSMLPackage.LETTER_CUSTOMIZATION_CONSTRAINT__FILTER_TYPE:
				return UGSMLPackage.CUSTOMIZATION_TYPE__FILTER_TYPE;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CustomizationType.class) {
			switch (baseFeatureID) {
			case UGSMLPackage.CUSTOMIZATION_TYPE__FILTER_TYPE:
				return UGSMLPackage.LETTER_CUSTOMIZATION_CONSTRAINT__FILTER_TYPE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (FilterType: ");
		result.append(filterType);
		result.append(')');
		return result.toString();
	}

} //LetterCustomizationConstraintImpl
