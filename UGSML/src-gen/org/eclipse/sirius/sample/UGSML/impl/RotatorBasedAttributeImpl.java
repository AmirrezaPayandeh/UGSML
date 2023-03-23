/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute;
import org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotator Based Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.RotatorBasedAttributeImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.RotatorBasedAttributeImpl#getRoll <em>Roll</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.RotatorBasedAttributeImpl#getPitch <em>Pitch</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.RotatorBasedAttributeImpl#getYaw <em>Yaw</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.RotatorBasedAttributeImpl#getROwningTransformation <em>ROwning Transformation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotatorBasedAttributeImpl extends MinimalEObjectImpl.Container implements RotatorBasedAttribute {
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
	 * The default value of the '{@link #getRoll() <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoll()
	 * @generated
	 * @ordered
	 */
	protected static final float ROLL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRoll() <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoll()
	 * @generated
	 * @ordered
	 */
	protected float roll = ROLL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPitch() <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitch()
	 * @generated
	 * @ordered
	 */
	protected static final float PITCH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPitch() <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitch()
	 * @generated
	 * @ordered
	 */
	protected float pitch = PITCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getYaw() <em>Yaw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYaw()
	 * @generated
	 * @ordered
	 */
	protected static final float YAW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getYaw() <em>Yaw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYaw()
	 * @generated
	 * @ordered
	 */
	protected float yaw = YAW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotatorBasedAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.ROTATOR_BASED_ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__FEATURE_NAME,
					oldFeatureName, featureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRoll() {
		return roll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoll(float newRoll) {
		float oldRoll = roll;
		roll = newRoll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__ROLL, oldRoll,
					roll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPitch() {
		return pitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPitch(float newPitch) {
		float oldPitch = pitch;
		pitch = newPitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__PITCH, oldPitch,
					pitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getYaw() {
		return yaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYaw(float newYaw) {
		float oldYaw = yaw;
		yaw = newYaw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__YAW, oldYaw,
					yaw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationBasedAttribute getROwningTransformation() {
		if (eContainerFeatureID() != UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__ROWNING_TRANSFORMATION)
			return null;
		return (TransformationBasedAttribute) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetROwningTransformation(TransformationBasedAttribute newROwningTransformation,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newROwningTransformation,
				UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__ROWNING_TRANSFORMATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setROwningTransformation(TransformationBasedAttribute newROwningTransformation) {
		if (newROwningTransformation != eInternalContainer()
				|| (eContainerFeatureID() != UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__ROWNING_TRANSFORMATION
						&& newROwningTransformation != null)) {
			if (EcoreUtil.isAncestor(this, newROwningTransformation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newROwningTransformation != null)
				msgs = ((InternalEObject) newROwningTransformation).eInverseAdd(this,
						UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__ROTATION, TransformationBasedAttribute.class,
						msgs);
			msgs = basicSetROwningTransformation(newROwningTransformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__ROWNING_TRANSFORMATION, newROwningTransformation,
					newROwningTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__ROWNING_TRANSFORMATION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetROwningTransformation((TransformationBasedAttribute) otherEnd, msgs);
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
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__ROWNING_TRANSFORMATION:
			return basicSetROwningTransformation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__ROWNING_TRANSFORMATION:
			return eInternalContainer().eInverseRemove(this, UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__ROTATION,
					TransformationBasedAttribute.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__FEATURE_NAME:
			return getFeatureName();
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__ROLL:
			return getRoll();
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__PITCH:
			return getPitch();
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__YAW:
			return getYaw();
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__ROWNING_TRANSFORMATION:
			return getROwningTransformation();
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
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__FEATURE_NAME:
			setFeatureName((String) newValue);
			return;
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__ROLL:
			setRoll((Float) newValue);
			return;
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__PITCH:
			setPitch((Float) newValue);
			return;
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__YAW:
			setYaw((Float) newValue);
			return;
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__ROWNING_TRANSFORMATION:
			setROwningTransformation((TransformationBasedAttribute) newValue);
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
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__FEATURE_NAME:
			setFeatureName(FEATURE_NAME_EDEFAULT);
			return;
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__ROLL:
			setRoll(ROLL_EDEFAULT);
			return;
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__PITCH:
			setPitch(PITCH_EDEFAULT);
			return;
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__YAW:
			setYaw(YAW_EDEFAULT);
			return;
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__ROWNING_TRANSFORMATION:
			setROwningTransformation((TransformationBasedAttribute) null);
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
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__FEATURE_NAME:
			return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__ROLL:
			return roll != ROLL_EDEFAULT;
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__PITCH:
			return pitch != PITCH_EDEFAULT;
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__YAW:
			return yaw != YAW_EDEFAULT;
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE__ROWNING_TRANSFORMATION:
			return getROwningTransformation() != null;
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
		result.append(", Roll: ");
		result.append(roll);
		result.append(", Pitch: ");
		result.append(pitch);
		result.append(", Yaw: ");
		result.append(yaw);
		result.append(')');
		return result.toString();
	}

} //RotatorBasedAttributeImpl
