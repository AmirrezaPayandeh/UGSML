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

import org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;
import org.eclipse.sirius.sample.UGSML.VectorBasedAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector Based Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.VectorBasedAttributeImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.VectorBasedAttributeImpl#isDataStructureArray <em>Data Structure Array</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.VectorBasedAttributeImpl#getX <em>X</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.VectorBasedAttributeImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.VectorBasedAttributeImpl#getZ <em>Z</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.VectorBasedAttributeImpl#getTOwningTransformation <em>TOwning Transformation</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.UGSML.impl.VectorBasedAttributeImpl#getSOwningTransformation <em>SOwning Transformation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VectorBasedAttributeImpl extends MinimalEObjectImpl.Container implements VectorBasedAttribute {
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
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final float X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected float x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final float Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected float y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected static final float Z_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected float z = Z_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VectorBasedAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UGSMLPackage.Literals.VECTOR_BASED_ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.VECTOR_BASED_ATTRIBUTE__FEATURE_NAME,
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
					UGSMLPackage.VECTOR_BASED_ATTRIBUTE__DATA_STRUCTURE_ARRAY, oldDataStructureArray,
					dataStructureArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(float newX) {
		float oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.VECTOR_BASED_ATTRIBUTE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(float newY) {
		float oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.VECTOR_BASED_ATTRIBUTE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ(float newZ) {
		float oldZ = z;
		z = newZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UGSMLPackage.VECTOR_BASED_ATTRIBUTE__Z, oldZ, z));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationBasedAttribute getTOwningTransformation() {
		if (eContainerFeatureID() != UGSMLPackage.VECTOR_BASED_ATTRIBUTE__TOWNING_TRANSFORMATION)
			return null;
		return (TransformationBasedAttribute) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTOwningTransformation(TransformationBasedAttribute newTOwningTransformation,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTOwningTransformation,
				UGSMLPackage.VECTOR_BASED_ATTRIBUTE__TOWNING_TRANSFORMATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTOwningTransformation(TransformationBasedAttribute newTOwningTransformation) {
		if (newTOwningTransformation != eInternalContainer()
				|| (eContainerFeatureID() != UGSMLPackage.VECTOR_BASED_ATTRIBUTE__TOWNING_TRANSFORMATION
						&& newTOwningTransformation != null)) {
			if (EcoreUtil.isAncestor(this, newTOwningTransformation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTOwningTransformation != null)
				msgs = ((InternalEObject) newTOwningTransformation).eInverseAdd(this,
						UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__TRANSLATION, TransformationBasedAttribute.class,
						msgs);
			msgs = basicSetTOwningTransformation(newTOwningTransformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VECTOR_BASED_ATTRIBUTE__TOWNING_TRANSFORMATION, newTOwningTransformation,
					newTOwningTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationBasedAttribute getSOwningTransformation() {
		if (eContainerFeatureID() != UGSMLPackage.VECTOR_BASED_ATTRIBUTE__SOWNING_TRANSFORMATION)
			return null;
		return (TransformationBasedAttribute) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSOwningTransformation(TransformationBasedAttribute newSOwningTransformation,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSOwningTransformation,
				UGSMLPackage.VECTOR_BASED_ATTRIBUTE__SOWNING_TRANSFORMATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSOwningTransformation(TransformationBasedAttribute newSOwningTransformation) {
		if (newSOwningTransformation != eInternalContainer()
				|| (eContainerFeatureID() != UGSMLPackage.VECTOR_BASED_ATTRIBUTE__SOWNING_TRANSFORMATION
						&& newSOwningTransformation != null)) {
			if (EcoreUtil.isAncestor(this, newSOwningTransformation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSOwningTransformation != null)
				msgs = ((InternalEObject) newSOwningTransformation).eInverseAdd(this,
						UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__SCALE3_D, TransformationBasedAttribute.class,
						msgs);
			msgs = basicSetSOwningTransformation(newSOwningTransformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UGSMLPackage.VECTOR_BASED_ATTRIBUTE__SOWNING_TRANSFORMATION, newSOwningTransformation,
					newSOwningTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__TOWNING_TRANSFORMATION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTOwningTransformation((TransformationBasedAttribute) otherEnd, msgs);
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__SOWNING_TRANSFORMATION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSOwningTransformation((TransformationBasedAttribute) otherEnd, msgs);
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
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__TOWNING_TRANSFORMATION:
			return basicSetTOwningTransformation(null, msgs);
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__SOWNING_TRANSFORMATION:
			return basicSetSOwningTransformation(null, msgs);
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
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__TOWNING_TRANSFORMATION:
			return eInternalContainer().eInverseRemove(this, UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__TRANSLATION,
					TransformationBasedAttribute.class, msgs);
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__SOWNING_TRANSFORMATION:
			return eInternalContainer().eInverseRemove(this, UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE__SCALE3_D,
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
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__FEATURE_NAME:
			return getFeatureName();
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__DATA_STRUCTURE_ARRAY:
			return isDataStructureArray();
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__X:
			return getX();
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__Y:
			return getY();
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__Z:
			return getZ();
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__TOWNING_TRANSFORMATION:
			return getTOwningTransformation();
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__SOWNING_TRANSFORMATION:
			return getSOwningTransformation();
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
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__FEATURE_NAME:
			setFeatureName((String) newValue);
			return;
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__DATA_STRUCTURE_ARRAY:
			setDataStructureArray((Boolean) newValue);
			return;
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__X:
			setX((Float) newValue);
			return;
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__Y:
			setY((Float) newValue);
			return;
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__Z:
			setZ((Float) newValue);
			return;
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__TOWNING_TRANSFORMATION:
			setTOwningTransformation((TransformationBasedAttribute) newValue);
			return;
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__SOWNING_TRANSFORMATION:
			setSOwningTransformation((TransformationBasedAttribute) newValue);
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
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__FEATURE_NAME:
			setFeatureName(FEATURE_NAME_EDEFAULT);
			return;
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__DATA_STRUCTURE_ARRAY:
			setDataStructureArray(DATA_STRUCTURE_ARRAY_EDEFAULT);
			return;
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__X:
			setX(X_EDEFAULT);
			return;
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__Y:
			setY(Y_EDEFAULT);
			return;
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__Z:
			setZ(Z_EDEFAULT);
			return;
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__TOWNING_TRANSFORMATION:
			setTOwningTransformation((TransformationBasedAttribute) null);
			return;
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__SOWNING_TRANSFORMATION:
			setSOwningTransformation((TransformationBasedAttribute) null);
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
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__FEATURE_NAME:
			return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__DATA_STRUCTURE_ARRAY:
			return dataStructureArray != DATA_STRUCTURE_ARRAY_EDEFAULT;
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__X:
			return x != X_EDEFAULT;
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__Y:
			return y != Y_EDEFAULT;
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__Z:
			return z != Z_EDEFAULT;
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__TOWNING_TRANSFORMATION:
			return getTOwningTransformation() != null;
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE__SOWNING_TRANSFORMATION:
			return getSOwningTransformation() != null;
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
		result.append(", X: ");
		result.append(x);
		result.append(", Y: ");
		result.append(y);
		result.append(", Z: ");
		result.append(z);
		result.append(')');
		return result.toString();
	}

} //VectorBasedAttributeImpl
