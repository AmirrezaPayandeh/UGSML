/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute;
import org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;
import org.eclipse.sirius.sample.UGSML.VectorBasedAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Based Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.TransformationBasedAttributeImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.TransformationBasedAttributeImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.TransformationBasedAttributeImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.TransformationBasedAttributeImpl#getScale3D <em>Scale3 D</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationBasedAttributeImpl extends MinimalEObjectImpl.Container
		implements TransformationBasedAttribute {
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
	 * The cached value of the '{@link #getTranslation() <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected VectorBasedAttribute translation;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected RotatorBasedAttribute rotation;

	/**
	 * The cached value of the '{@link #getScale3D() <em>Scale3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale3D()
	 * @generated
	 * @ordered
	 */
	protected VectorBasedAttribute scale3D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationBasedAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.TRANSFORMATION_BASED_ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__FEATURE_NAME, oldFeatureName, featureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorBasedAttribute getTranslation() {
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslation(VectorBasedAttribute newTranslation, NotificationChain msgs) {
		VectorBasedAttribute oldTranslation = translation;
		translation = newTranslation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__TRANSLATION, oldTranslation, newTranslation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslation(VectorBasedAttribute newTranslation) {
		if (newTranslation != translation) {
			NotificationChain msgs = null;
			if (translation != null)
				msgs = ((InternalEObject) translation).eInverseRemove(this,
						UGSMLPackage.VECTOR_BASED_ATTRIBUTE__TOWNING_TRANSFORMATION, VectorBasedAttribute.class, msgs);
			if (newTranslation != null)
				msgs = ((InternalEObject) newTranslation).eInverseAdd(this,
						UGSMLPackage.VECTOR_BASED_ATTRIBUTE__TOWNING_TRANSFORMATION, VectorBasedAttribute.class, msgs);
			msgs = basicSetTranslation(newTranslation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__TRANSLATION, newTranslation, newTranslation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotatorBasedAttribute getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotation(RotatorBasedAttribute newRotation, NotificationChain msgs) {
		RotatorBasedAttribute oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__ROTATION, oldRotation, newRotation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(RotatorBasedAttribute newRotation) {
		if (newRotation != rotation) {
			NotificationChain msgs = null;
			if (rotation != null)
				msgs = ((InternalEObject) rotation).eInverseRemove(this,
						UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__ROWNING_TRANSFORMATION, RotatorBasedAttribute.class,
						msgs);
			if (newRotation != null)
				msgs = ((InternalEObject) newRotation).eInverseAdd(this,
						UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__ROWNING_TRANSFORMATION, RotatorBasedAttribute.class,
						msgs);
			msgs = basicSetRotation(newRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__ROTATION,
					newRotation, newRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorBasedAttribute getScale3D() {
		return scale3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScale3D(VectorBasedAttribute newScale3D, NotificationChain msgs) {
		VectorBasedAttribute oldScale3D = scale3D;
		scale3D = newScale3D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__SCALE3_D, oldScale3D, newScale3D);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale3D(VectorBasedAttribute newScale3D) {
		if (newScale3D != scale3D) {
			NotificationChain msgs = null;
			if (scale3D != null)
				msgs = ((InternalEObject) scale3D).eInverseRemove(this,
						UGSMLPackage.VECTOR_BASED_ATTRIBUTE__SOWNING_TRANSFORMATION, VectorBasedAttribute.class, msgs);
			if (newScale3D != null)
				msgs = ((InternalEObject) newScale3D).eInverseAdd(this,
						UGSMLPackage.VECTOR_BASED_ATTRIBUTE__SOWNING_TRANSFORMATION, VectorBasedAttribute.class, msgs);
			msgs = basicSetScale3D(newScale3D, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__SCALE3_D,
					newScale3D, newScale3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__TRANSLATION:
			if (translation != null)
				msgs = ((InternalEObject) translation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__TRANSLATION, null, msgs);
			return basicSetTranslation((VectorBasedAttribute) otherEnd, msgs);
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__ROTATION:
			if (rotation != null)
				msgs = ((InternalEObject) rotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__ROTATION, null, msgs);
			return basicSetRotation((RotatorBasedAttribute) otherEnd, msgs);
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__SCALE3_D:
			if (scale3D != null)
				msgs = ((InternalEObject) scale3D).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__SCALE3_D, null, msgs);
			return basicSetScale3D((VectorBasedAttribute) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__TRANSLATION:
			return basicSetTranslation(null, msgs);
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__ROTATION:
			return basicSetRotation(null, msgs);
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__SCALE3_D:
			return basicSetScale3D(null, msgs);
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
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__FEATURE_NAME:
			return getFeatureName();
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__TRANSLATION:
			return getTranslation();
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__ROTATION:
			return getRotation();
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__SCALE3_D:
			return getScale3D();
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
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__FEATURE_NAME:
			setFeatureName((String) newValue);
			return;
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__TRANSLATION:
			setTranslation((VectorBasedAttribute) newValue);
			return;
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__ROTATION:
			setRotation((RotatorBasedAttribute) newValue);
			return;
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__SCALE3_D:
			setScale3D((VectorBasedAttribute) newValue);
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
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__FEATURE_NAME:
			setFeatureName(FEATURE_NAME_EDEFAULT);
			return;
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__TRANSLATION:
			setTranslation((VectorBasedAttribute) null);
			return;
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__ROTATION:
			setRotation((RotatorBasedAttribute) null);
			return;
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__SCALE3_D:
			setScale3D((VectorBasedAttribute) null);
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
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__FEATURE_NAME:
			return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__TRANSLATION:
			return translation != null;
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__ROTATION:
			return rotation != null;
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__SCALE3_D:
			return scale3D != null;
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
		result.append(')');
		return result.toString();
	}

} //TransformationBasedAttributeImpl
