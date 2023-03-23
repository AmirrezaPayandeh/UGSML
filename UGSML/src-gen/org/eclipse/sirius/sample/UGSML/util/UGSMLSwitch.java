/**
 */
package org.eclipse.sirius.sample.UGSML.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.sirius.sample.UGSML.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage
 * @generated
 */
public class UGSMLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UGSMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UGSMLSwitch() {
		if (modelPackage == null) {
			modelPackage = UGSMLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case UGSMLPackage.ROOT: {
			Root root = (Root) theEObject;
			T result = caseRoot(root);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.GAME: {
			Game game = (Game) theEObject;
			T result = caseGame(game);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.GAME_FEATURE_CONTAINER: {
			GameFeatureContainer gameFeatureContainer = (GameFeatureContainer) theEObject;
			T result = caseGameFeatureContainer(gameFeatureContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.GAME_ATTRIBUTE_CONTAINER: {
			GameAttributeContainer gameAttributeContainer = (GameAttributeContainer) theEObject;
			T result = caseGameAttributeContainer(gameAttributeContainer);
			if (result == null)
				result = caseGameFeatureContainer(gameAttributeContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.GAME_FEATURE: {
			GameFeature gameFeature = (GameFeature) theEObject;
			T result = caseGameFeature(gameFeature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.GAME_ATTRIBUTE: {
			GameAttribute gameAttribute = (GameAttribute) theEObject;
			T result = caseGameAttribute(gameAttribute);
			if (result == null)
				result = caseGameFeature(gameAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.ENUMERATION_BASED_STRUCTURE: {
			EnumerationBasedStructure enumerationBasedStructure = (EnumerationBasedStructure) theEObject;
			T result = caseEnumerationBasedStructure(enumerationBasedStructure);
			if (result == null)
				result = caseGameStructure(enumerationBasedStructure);
			if (result == null)
				result = caseGameFeature(enumerationBasedStructure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.ENUM_STATE: {
			EnumState enumState = (EnumState) theEObject;
			T result = caseEnumState(enumState);
			if (result == null)
				result = caseGameFeature(enumState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.DATA_BASED_STRUCTURE: {
			DataBasedStructure dataBasedStructure = (DataBasedStructure) theEObject;
			T result = caseDataBasedStructure(dataBasedStructure);
			if (result == null)
				result = caseGameStructure(dataBasedStructure);
			if (result == null)
				result = caseGameFeature(dataBasedStructure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.BOOLEAN_BASED_ATTRIBUTE: {
			BooleanBasedAttribute booleanBasedAttribute = (BooleanBasedAttribute) theEObject;
			T result = caseBooleanBasedAttribute(booleanBasedAttribute);
			if (result == null)
				result = caseGameAttribute(booleanBasedAttribute);
			if (result == null)
				result = caseGameFeature(booleanBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.VALUE_BASED_ATTRIBUTE: {
			ValueBasedAttribute valueBasedAttribute = (ValueBasedAttribute) theEObject;
			T result = caseValueBasedAttribute(valueBasedAttribute);
			if (result == null)
				result = caseGameAttribute(valueBasedAttribute);
			if (result == null)
				result = caseGameFeature(valueBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.LETTER_BASED_ATTRIBUTE: {
			LetterBasedAttribute letterBasedAttribute = (LetterBasedAttribute) theEObject;
			T result = caseLetterBasedAttribute(letterBasedAttribute);
			if (result == null)
				result = caseGameAttribute(letterBasedAttribute);
			if (result == null)
				result = caseGameFeature(letterBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.NAME_BASED_ATTRIBUTE: {
			NameBasedAttribute nameBasedAttribute = (NameBasedAttribute) theEObject;
			T result = caseNameBasedAttribute(nameBasedAttribute);
			if (result == null)
				result = caseLetterBasedAttribute(nameBasedAttribute);
			if (result == null)
				result = caseGameAttribute(nameBasedAttribute);
			if (result == null)
				result = caseGameFeature(nameBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.STRING_BASED_ATTRIBUTE: {
			StringBasedAttribute stringBasedAttribute = (StringBasedAttribute) theEObject;
			T result = caseStringBasedAttribute(stringBasedAttribute);
			if (result == null)
				result = caseLetterBasedAttribute(stringBasedAttribute);
			if (result == null)
				result = caseGameAttribute(stringBasedAttribute);
			if (result == null)
				result = caseGameFeature(stringBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.TEXT_BASED_ATTRIBUTE: {
			TextBasedAttribute textBasedAttribute = (TextBasedAttribute) theEObject;
			T result = caseTextBasedAttribute(textBasedAttribute);
			if (result == null)
				result = caseLetterBasedAttribute(textBasedAttribute);
			if (result == null)
				result = caseGameAttribute(textBasedAttribute);
			if (result == null)
				result = caseGameFeature(textBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.VECTOR2_DBASED_ATTRIBUTE: {
			Vector2DBasedAttribute vector2DBasedAttribute = (Vector2DBasedAttribute) theEObject;
			T result = caseVector2DBasedAttribute(vector2DBasedAttribute);
			if (result == null)
				result = caseGameAttribute(vector2DBasedAttribute);
			if (result == null)
				result = caseGameFeature(vector2DBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE: {
			VectorBasedAttribute vectorBasedAttribute = (VectorBasedAttribute) theEObject;
			T result = caseVectorBasedAttribute(vectorBasedAttribute);
			if (result == null)
				result = caseGameAttribute(vectorBasedAttribute);
			if (result == null)
				result = caseGameFeature(vectorBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE: {
			RotatorBasedAttribute rotatorBasedAttribute = (RotatorBasedAttribute) theEObject;
			T result = caseRotatorBasedAttribute(rotatorBasedAttribute);
			if (result == null)
				result = caseGameAttribute(rotatorBasedAttribute);
			if (result == null)
				result = caseGameFeature(rotatorBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE: {
			TransformationBasedAttribute transformationBasedAttribute = (TransformationBasedAttribute) theEObject;
			T result = caseTransformationBasedAttribute(transformationBasedAttribute);
			if (result == null)
				result = caseGameAttribute(transformationBasedAttribute);
			if (result == null)
				result = caseGameFeature(transformationBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.COLOR_BASED_ATTRIBUTE: {
			ColorBasedAttribute colorBasedAttribute = (ColorBasedAttribute) theEObject;
			T result = caseColorBasedAttribute(colorBasedAttribute);
			if (result == null)
				result = caseGameAttribute(colorBasedAttribute);
			if (result == null)
				result = caseGameFeature(colorBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.TEXTURE_BASED_ATTRIBUTE: {
			TextureBasedAttribute textureBasedAttribute = (TextureBasedAttribute) theEObject;
			T result = caseTextureBasedAttribute(textureBasedAttribute);
			if (result == null)
				result = caseGameAttribute(textureBasedAttribute);
			if (result == null)
				result = caseGameFeature(textureBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.GAME_ITEM_CONTAINER: {
			GameItemContainer gameItemContainer = (GameItemContainer) theEObject;
			T result = caseGameItemContainer(gameItemContainer);
			if (result == null)
				result = caseGameFeatureContainer(gameItemContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.GAME_ITEM: {
			GameItem gameItem = (GameItem) theEObject;
			T result = caseGameItem(gameItem);
			if (result == null)
				result = caseGameFeature(gameItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.ITEM_MODE: {
			ItemMode itemMode = (ItemMode) theEObject;
			T result = caseItemMode(itemMode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.GAME_SYSTEM: {
			GameSystem gameSystem = (GameSystem) theEObject;
			T result = caseGameSystem(gameSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.ATTRIBUTE_SYSTEM: {
			AttributeSystem attributeSystem = (AttributeSystem) theEObject;
			T result = caseAttributeSystem(attributeSystem);
			if (result == null)
				result = caseGameSystem(attributeSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.GAME_SYSTEM_CONSTRAINT: {
			GameSystemConstraint gameSystemConstraint = (GameSystemConstraint) theEObject;
			T result = caseGameSystemConstraint(gameSystemConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.ATTRIBUTE_SYSTEM_CONSTRAINT: {
			AttributeSystemConstraint attributeSystemConstraint = (AttributeSystemConstraint) theEObject;
			T result = caseAttributeSystemConstraint(attributeSystemConstraint);
			if (result == null)
				result = caseGameSystemConstraint(attributeSystemConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.BASE_GAME_CONSTRAINT_RULE: {
			BaseGameConstraintRule baseGameConstraintRule = (BaseGameConstraintRule) theEObject;
			T result = caseBaseGameConstraintRule(baseGameConstraintRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.ATTRIBUTE_CONSTRAINT_RULE: {
			AttributeConstraintRule attributeConstraintRule = (AttributeConstraintRule) theEObject;
			T result = caseAttributeConstraintRule(attributeConstraintRule);
			if (result == null)
				result = caseBaseGameConstraintRule(attributeConstraintRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.ARRAY_CONSTRAINT: {
			ArrayConstraint arrayConstraint = (ArrayConstraint) theEObject;
			T result = caseArrayConstraint(arrayConstraint);
			if (result == null)
				result = caseAttributeSystemConstraint(arrayConstraint);
			if (result == null)
				result = caseGameSystemConstraint(arrayConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.BOOLEAN_BASED_CONSTRAINT: {
			BooleanBasedConstraint booleanBasedConstraint = (BooleanBasedConstraint) theEObject;
			T result = caseBooleanBasedConstraint(booleanBasedConstraint);
			if (result == null)
				result = caseSingleValueConstraint(booleanBasedConstraint);
			if (result == null)
				result = caseAttributeSystemConstraint(booleanBasedConstraint);
			if (result == null)
				result = caseGameSystemConstraint(booleanBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.VALUE_BASED_CONSTRAINT: {
			ValueBasedConstraint valueBasedConstraint = (ValueBasedConstraint) theEObject;
			T result = caseValueBasedConstraint(valueBasedConstraint);
			if (result == null)
				result = caseSingleValueConstraint(valueBasedConstraint);
			if (result == null)
				result = caseAttributeSystemConstraint(valueBasedConstraint);
			if (result == null)
				result = caseGameSystemConstraint(valueBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.MINIMUM_VALUE: {
			MinimumValue minimumValue = (MinimumValue) theEObject;
			T result = caseMinimumValue(minimumValue);
			if (result == null)
				result = caseBaseValueRangedConstraint(minimumValue);
			if (result == null)
				result = caseValueConstraintRule(minimumValue);
			if (result == null)
				result = caseAttributeConstraintRule(minimumValue);
			if (result == null)
				result = caseBaseGameConstraintRule(minimumValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.MAXIMUM_VALUE: {
			MaximumValue maximumValue = (MaximumValue) theEObject;
			T result = caseMaximumValue(maximumValue);
			if (result == null)
				result = caseBaseValueRangedConstraint(maximumValue);
			if (result == null)
				result = caseValueConstraintRule(maximumValue);
			if (result == null)
				result = caseAttributeConstraintRule(maximumValue);
			if (result == null)
				result = caseBaseGameConstraintRule(maximumValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.REGENERATION_CONSTRAINT: {
			RegenerationConstraint regenerationConstraint = (RegenerationConstraint) theEObject;
			T result = caseRegenerationConstraint(regenerationConstraint);
			if (result == null)
				result = caseValueConstraintRule(regenerationConstraint);
			if (result == null)
				result = caseAttributeConstraintRule(regenerationConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(regenerationConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.DEPENDENCY_CONSTRAINT: {
			DependencyConstraint dependencyConstraint = (DependencyConstraint) theEObject;
			T result = caseDependencyConstraint(dependencyConstraint);
			if (result == null)
				result = caseValueConstraintRule(dependencyConstraint);
			if (result == null)
				result = caseAttributeConstraintRule(dependencyConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(dependencyConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.LETTER_BASED_CONSTRAINT: {
			LetterBasedConstraint letterBasedConstraint = (LetterBasedConstraint) theEObject;
			T result = caseLetterBasedConstraint(letterBasedConstraint);
			if (result == null)
				result = caseSingleValueConstraint(letterBasedConstraint);
			if (result == null)
				result = caseAttributeSystemConstraint(letterBasedConstraint);
			if (result == null)
				result = caseGameSystemConstraint(letterBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.INVENTORY_SYSTEM: {
			InventorySystem inventorySystem = (InventorySystem) theEObject;
			T result = caseInventorySystem(inventorySystem);
			if (result == null)
				result = caseGameSystem(inventorySystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT: {
			InventorySystemConstraint inventorySystemConstraint = (InventorySystemConstraint) theEObject;
			T result = caseInventorySystemConstraint(inventorySystemConstraint);
			if (result == null)
				result = caseGameSystemConstraint(inventorySystemConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.INVENTORY_CONSTRAINT_RULE: {
			InventoryConstraintRule inventoryConstraintRule = (InventoryConstraintRule) theEObject;
			T result = caseInventoryConstraintRule(inventoryConstraintRule);
			if (result == null)
				result = caseBaseGameConstraintRule(inventoryConstraintRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.AUTO_CRAFT_CONSTRAINT: {
			AutoCraftConstraint autoCraftConstraint = (AutoCraftConstraint) theEObject;
			T result = caseAutoCraftConstraint(autoCraftConstraint);
			if (result == null)
				result = caseInventoryConstraintRule(autoCraftConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(autoCraftConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.STACK_WEIGHT_CONSTRAINT: {
			StackWeightConstraint stackWeightConstraint = (StackWeightConstraint) theEObject;
			T result = caseStackWeightConstraint(stackWeightConstraint);
			if (result == null)
				result = caseInventoryConstraintRule(stackWeightConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(stackWeightConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.STACK_CONSTRAINT: {
			StackConstraint stackConstraint = (StackConstraint) theEObject;
			T result = caseStackConstraint(stackConstraint);
			if (result == null)
				result = caseStackWeightConstraint(stackConstraint);
			if (result == null)
				result = caseInventoryConstraintRule(stackConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(stackConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.WEIGHT_CONSTRAINT: {
			WeightConstraint weightConstraint = (WeightConstraint) theEObject;
			T result = caseWeightConstraint(weightConstraint);
			if (result == null)
				result = caseStackWeightConstraint(weightConstraint);
			if (result == null)
				result = caseInventoryConstraintRule(weightConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(weightConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.SLOT_CONSTRAINT: {
			SlotConstraint slotConstraint = (SlotConstraint) theEObject;
			T result = caseSlotConstraint(slotConstraint);
			if (result == null)
				result = caseInventoryConstraintRule(slotConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(slotConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.EQUIP_ITEM_CONSTRAINT: {
			EquipItemConstraint equipItemConstraint = (EquipItemConstraint) theEObject;
			T result = caseEquipItemConstraint(equipItemConstraint);
			if (result == null)
				result = caseInventoryConstraintRule(equipItemConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(equipItemConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.SELECTION_CONSTRAINT: {
			SelectionConstraint selectionConstraint = (SelectionConstraint) theEObject;
			T result = caseSelectionConstraint(selectionConstraint);
			if (result == null)
				result = caseInventoryConstraintRule(selectionConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(selectionConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.MODEL_BASED_ATTRIBUTE: {
			ModelBasedAttribute modelBasedAttribute = (ModelBasedAttribute) theEObject;
			T result = caseModelBasedAttribute(modelBasedAttribute);
			if (result == null)
				result = caseGameAttribute(modelBasedAttribute);
			if (result == null)
				result = caseGameFeature(modelBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.PARTICLE_BASED_ATTRIBUTE: {
			ParticleBasedAttribute particleBasedAttribute = (ParticleBasedAttribute) theEObject;
			T result = caseParticleBasedAttribute(particleBasedAttribute);
			if (result == null)
				result = caseGameAttribute(particleBasedAttribute);
			if (result == null)
				result = caseGameFeature(particleBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.VAIN_CONSTRAINT: {
			VainConstraint vainConstraint = (VainConstraint) theEObject;
			T result = caseVainConstraint(vainConstraint);
			if (result == null)
				result = caseInventoryConstraintRule(vainConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(vainConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.BASE_VALUE_CONSTRAINT: {
			BaseValueConstraint baseValueConstraint = (BaseValueConstraint) theEObject;
			T result = caseBaseValueConstraint(baseValueConstraint);
			if (result == null)
				result = caseBaseOrRangeConstraint(baseValueConstraint);
			if (result == null)
				result = caseValueConstraintRule(baseValueConstraint);
			if (result == null)
				result = caseAttributeConstraintRule(baseValueConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(baseValueConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.BASE_OR_RANGE_CONSTRAINT: {
			BaseOrRangeConstraint baseOrRangeConstraint = (BaseOrRangeConstraint) theEObject;
			T result = caseBaseOrRangeConstraint(baseOrRangeConstraint);
			if (result == null)
				result = caseValueConstraintRule(baseOrRangeConstraint);
			if (result == null)
				result = caseAttributeConstraintRule(baseOrRangeConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(baseOrRangeConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT: {
			ValueRangeBasedConstraint valueRangeBasedConstraint = (ValueRangeBasedConstraint) theEObject;
			T result = caseValueRangeBasedConstraint(valueRangeBasedConstraint);
			if (result == null)
				result = caseBaseOrRangeConstraint(valueRangeBasedConstraint);
			if (result == null)
				result = caseRangeBasedConstraint(valueRangeBasedConstraint);
			if (result == null)
				result = caseValueConstraintRule(valueRangeBasedConstraint);
			if (result == null)
				result = caseAttributeConstraintRule(valueRangeBasedConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(valueRangeBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.BASE_VALUE_RANGED_CONSTRAINT: {
			BaseValueRangedConstraint baseValueRangedConstraint = (BaseValueRangedConstraint) theEObject;
			T result = caseBaseValueRangedConstraint(baseValueRangedConstraint);
			if (result == null)
				result = caseValueConstraintRule(baseValueRangedConstraint);
			if (result == null)
				result = caseAttributeConstraintRule(baseValueRangedConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(baseValueRangedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.SINGLE_VALUE_CONSTRAINT: {
			SingleValueConstraint singleValueConstraint = (SingleValueConstraint) theEObject;
			T result = caseSingleValueConstraint(singleValueConstraint);
			if (result == null)
				result = caseAttributeSystemConstraint(singleValueConstraint);
			if (result == null)
				result = caseGameSystemConstraint(singleValueConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.MARGIN_OF_ERROR_CONSTRAINT: {
			MarginOfErrorConstraint marginOfErrorConstraint = (MarginOfErrorConstraint) theEObject;
			T result = caseMarginOfErrorConstraint(marginOfErrorConstraint);
			if (result == null)
				result = caseValueConstraintRule(marginOfErrorConstraint);
			if (result == null)
				result = caseAttributeConstraintRule(marginOfErrorConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(marginOfErrorConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.AUDIO_BASED_ATTRIBUTE: {
			AudioBasedAttribute audioBasedAttribute = (AudioBasedAttribute) theEObject;
			T result = caseAudioBasedAttribute(audioBasedAttribute);
			if (result == null)
				result = caseGameAttribute(audioBasedAttribute);
			if (result == null)
				result = caseGameFeature(audioBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.CHARACTER_BASED_ATTRIBUTE: {
			CharacterBasedAttribute characterBasedAttribute = (CharacterBasedAttribute) theEObject;
			T result = caseCharacterBasedAttribute(characterBasedAttribute);
			if (result == null)
				result = caseLetterBasedAttribute(characterBasedAttribute);
			if (result == null)
				result = caseGameAttribute(characterBasedAttribute);
			if (result == null)
				result = caseGameFeature(characterBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.INTEGER_BASED_ATTRIBUTE: {
			IntegerBasedAttribute integerBasedAttribute = (IntegerBasedAttribute) theEObject;
			T result = caseIntegerBasedAttribute(integerBasedAttribute);
			if (result == null)
				result = caseValueBasedAttribute(integerBasedAttribute);
			if (result == null)
				result = caseGameAttribute(integerBasedAttribute);
			if (result == null)
				result = caseGameFeature(integerBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.DECIMAL_BASED_ATTRIBUTE: {
			DecimalBasedAttribute decimalBasedAttribute = (DecimalBasedAttribute) theEObject;
			T result = caseDecimalBasedAttribute(decimalBasedAttribute);
			if (result == null)
				result = caseValueBasedAttribute(decimalBasedAttribute);
			if (result == null)
				result = caseGameAttribute(decimalBasedAttribute);
			if (result == null)
				result = caseGameFeature(decimalBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.DIRECT_DEPENDENCY_CONSTRAINT: {
			DirectDependencyConstraint directDependencyConstraint = (DirectDependencyConstraint) theEObject;
			T result = caseDirectDependencyConstraint(directDependencyConstraint);
			if (result == null)
				result = caseDependencyConstraint(directDependencyConstraint);
			if (result == null)
				result = caseValueConstraintRule(directDependencyConstraint);
			if (result == null)
				result = caseAttributeConstraintRule(directDependencyConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(directDependencyConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT: {
			ConversionDependencyConstraint conversionDependencyConstraint = (ConversionDependencyConstraint) theEObject;
			T result = caseConversionDependencyConstraint(conversionDependencyConstraint);
			if (result == null)
				result = caseDependencyConstraint(conversionDependencyConstraint);
			if (result == null)
				result = caseValueConstraintRule(conversionDependencyConstraint);
			if (result == null)
				result = caseAttributeConstraintRule(conversionDependencyConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(conversionDependencyConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.DISTORTION_CONSTRAINT: {
			DistortionConstraint distortionConstraint = (DistortionConstraint) theEObject;
			T result = caseDistortionConstraint(distortionConstraint);
			if (result == null)
				result = caseValueConstraintRule(distortionConstraint);
			if (result == null)
				result = caseAttributeConstraintRule(distortionConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(distortionConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.VECTOR2_DBASED_CONSTRAINT: {
			Vector2DBasedConstraint vector2DBasedConstraint = (Vector2DBasedConstraint) theEObject;
			T result = caseVector2DBasedConstraint(vector2DBasedConstraint);
			if (result == null)
				result = caseSingleValueConstraint(vector2DBasedConstraint);
			if (result == null)
				result = caseAttributeSystemConstraint(vector2DBasedConstraint);
			if (result == null)
				result = caseGameSystemConstraint(vector2DBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.VECTOR_BASED_CONSTRAINT: {
			VectorBasedConstraint vectorBasedConstraint = (VectorBasedConstraint) theEObject;
			T result = caseVectorBasedConstraint(vectorBasedConstraint);
			if (result == null)
				result = caseSingleValueConstraint(vectorBasedConstraint);
			if (result == null)
				result = caseAttributeSystemConstraint(vectorBasedConstraint);
			if (result == null)
				result = caseGameSystemConstraint(vectorBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.ROTATOR_BASED_CONSTRAINT: {
			RotatorBasedConstraint rotatorBasedConstraint = (RotatorBasedConstraint) theEObject;
			T result = caseRotatorBasedConstraint(rotatorBasedConstraint);
			if (result == null)
				result = caseSingleValueConstraint(rotatorBasedConstraint);
			if (result == null)
				result = caseAttributeSystemConstraint(rotatorBasedConstraint);
			if (result == null)
				result = caseGameSystemConstraint(rotatorBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT: {
			TransformationBasedConstraint transformationBasedConstraint = (TransformationBasedConstraint) theEObject;
			T result = caseTransformationBasedConstraint(transformationBasedConstraint);
			if (result == null)
				result = caseSingleValueConstraint(transformationBasedConstraint);
			if (result == null)
				result = caseAttributeSystemConstraint(transformationBasedConstraint);
			if (result == null)
				result = caseGameSystemConstraint(transformationBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.COLOR_BASED_CONSTRAINT: {
			ColorBasedConstraint colorBasedConstraint = (ColorBasedConstraint) theEObject;
			T result = caseColorBasedConstraint(colorBasedConstraint);
			if (result == null)
				result = caseSingleValueConstraint(colorBasedConstraint);
			if (result == null)
				result = caseAttributeSystemConstraint(colorBasedConstraint);
			if (result == null)
				result = caseGameSystemConstraint(colorBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.TEXTURE_BASED_CONSTRAINT: {
			TextureBasedConstraint textureBasedConstraint = (TextureBasedConstraint) theEObject;
			T result = caseTextureBasedConstraint(textureBasedConstraint);
			if (result == null)
				result = caseSingleValueConstraint(textureBasedConstraint);
			if (result == null)
				result = caseAttributeSystemConstraint(textureBasedConstraint);
			if (result == null)
				result = caseGameSystemConstraint(textureBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.MODEL_BASED_CONSTRAINT: {
			ModelBasedConstraint modelBasedConstraint = (ModelBasedConstraint) theEObject;
			T result = caseModelBasedConstraint(modelBasedConstraint);
			if (result == null)
				result = caseSingleValueConstraint(modelBasedConstraint);
			if (result == null)
				result = caseAttributeSystemConstraint(modelBasedConstraint);
			if (result == null)
				result = caseGameSystemConstraint(modelBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.PARTICLE_BASED_CONSTRAINT: {
			ParticleBasedConstraint particleBasedConstraint = (ParticleBasedConstraint) theEObject;
			T result = caseParticleBasedConstraint(particleBasedConstraint);
			if (result == null)
				result = caseSingleValueConstraint(particleBasedConstraint);
			if (result == null)
				result = caseAttributeSystemConstraint(particleBasedConstraint);
			if (result == null)
				result = caseGameSystemConstraint(particleBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.AUDIO_BASED_CONSTRAINT: {
			AudioBasedConstraint audioBasedConstraint = (AudioBasedConstraint) theEObject;
			T result = caseAudioBasedConstraint(audioBasedConstraint);
			if (result == null)
				result = caseSingleValueConstraint(audioBasedConstraint);
			if (result == null)
				result = caseAttributeSystemConstraint(audioBasedConstraint);
			if (result == null)
				result = caseGameSystemConstraint(audioBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.LETTER_LENGTH_CONSTRAINT: {
			LetterLengthConstraint letterLengthConstraint = (LetterLengthConstraint) theEObject;
			T result = caseLetterLengthConstraint(letterLengthConstraint);
			if (result == null)
				result = caseLetterConstraintRule(letterLengthConstraint);
			if (result == null)
				result = caseAttributeConstraintRule(letterLengthConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(letterLengthConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.LETTER_CUSTOMIZATION_CONSTRAINT: {
			LetterCustomizationConstraint letterCustomizationConstraint = (LetterCustomizationConstraint) theEObject;
			T result = caseLetterCustomizationConstraint(letterCustomizationConstraint);
			if (result == null)
				result = caseLetterConstraintRule(letterCustomizationConstraint);
			if (result == null)
				result = caseCustomizationType(letterCustomizationConstraint);
			if (result == null)
				result = caseAttributeConstraintRule(letterCustomizationConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(letterCustomizationConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.VALUE_CONSTRAINT_RULE: {
			ValueConstraintRule valueConstraintRule = (ValueConstraintRule) theEObject;
			T result = caseValueConstraintRule(valueConstraintRule);
			if (result == null)
				result = caseAttributeConstraintRule(valueConstraintRule);
			if (result == null)
				result = caseBaseGameConstraintRule(valueConstraintRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.LETTER_CONSTRAINT_RULE: {
			LetterConstraintRule letterConstraintRule = (LetterConstraintRule) theEObject;
			T result = caseLetterConstraintRule(letterConstraintRule);
			if (result == null)
				result = caseAttributeConstraintRule(letterConstraintRule);
			if (result == null)
				result = caseBaseGameConstraintRule(letterConstraintRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT: {
			Vector2DRangeBasedConstraint vector2DRangeBasedConstraint = (Vector2DRangeBasedConstraint) theEObject;
			T result = caseVector2DRangeBasedConstraint(vector2DRangeBasedConstraint);
			if (result == null)
				result = caseVector2DConstraintRule(vector2DRangeBasedConstraint);
			if (result == null)
				result = caseRangeBasedConstraint(vector2DRangeBasedConstraint);
			if (result == null)
				result = caseAttributeConstraintRule(vector2DRangeBasedConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(vector2DRangeBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.VECTOR2_DCONSTRAINT_RULE: {
			Vector2DConstraintRule vector2DConstraintRule = (Vector2DConstraintRule) theEObject;
			T result = caseVector2DConstraintRule(vector2DConstraintRule);
			if (result == null)
				result = caseAttributeConstraintRule(vector2DConstraintRule);
			if (result == null)
				result = caseBaseGameConstraintRule(vector2DConstraintRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.VECTOR_CONSTRAINT_RULE: {
			VectorConstraintRule vectorConstraintRule = (VectorConstraintRule) theEObject;
			T result = caseVectorConstraintRule(vectorConstraintRule);
			if (result == null)
				result = caseAttributeConstraintRule(vectorConstraintRule);
			if (result == null)
				result = caseBaseGameConstraintRule(vectorConstraintRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT: {
			VectorRangeBasedConstraint vectorRangeBasedConstraint = (VectorRangeBasedConstraint) theEObject;
			T result = caseVectorRangeBasedConstraint(vectorRangeBasedConstraint);
			if (result == null)
				result = caseVectorConstraintRule(vectorRangeBasedConstraint);
			if (result == null)
				result = caseRangeBasedConstraint(vectorRangeBasedConstraint);
			if (result == null)
				result = caseAttributeConstraintRule(vectorRangeBasedConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(vectorRangeBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.RANGE_BASED_CONSTRAINT: {
			RangeBasedConstraint rangeBasedConstraint = (RangeBasedConstraint) theEObject;
			T result = caseRangeBasedConstraint(rangeBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.ROTATOR_CONSTRAINT_RULE: {
			RotatorConstraintRule rotatorConstraintRule = (RotatorConstraintRule) theEObject;
			T result = caseRotatorConstraintRule(rotatorConstraintRule);
			if (result == null)
				result = caseAttributeConstraintRule(rotatorConstraintRule);
			if (result == null)
				result = caseBaseGameConstraintRule(rotatorConstraintRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT: {
			RotatorRangeBasedConstraint rotatorRangeBasedConstraint = (RotatorRangeBasedConstraint) theEObject;
			T result = caseRotatorRangeBasedConstraint(rotatorRangeBasedConstraint);
			if (result == null)
				result = caseRotatorConstraintRule(rotatorRangeBasedConstraint);
			if (result == null)
				result = caseRangeBasedConstraint(rotatorRangeBasedConstraint);
			if (result == null)
				result = caseAttributeConstraintRule(rotatorRangeBasedConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(rotatorRangeBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.TRANSFORMATION_CONSTRAINT_RULE: {
			TransformationConstraintRule transformationConstraintRule = (TransformationConstraintRule) theEObject;
			T result = caseTransformationConstraintRule(transformationConstraintRule);
			if (result == null)
				result = caseAttributeConstraintRule(transformationConstraintRule);
			if (result == null)
				result = caseBaseGameConstraintRule(transformationConstraintRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT: {
			TransformationRangeBasedConstraint transformationRangeBasedConstraint = (TransformationRangeBasedConstraint) theEObject;
			T result = caseTransformationRangeBasedConstraint(transformationRangeBasedConstraint);
			if (result == null)
				result = caseTransformationConstraintRule(transformationRangeBasedConstraint);
			if (result == null)
				result = caseRangeBasedConstraint(transformationRangeBasedConstraint);
			if (result == null)
				result = caseAttributeConstraintRule(transformationRangeBasedConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(transformationRangeBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.CUSTOMIZATION_TYPE: {
			CustomizationType customizationType = (CustomizationType) theEObject;
			T result = caseCustomizationType(customizationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.COLOR_CUSTOMIZATION_CONSTRAINT: {
			ColorCustomizationConstraint colorCustomizationConstraint = (ColorCustomizationConstraint) theEObject;
			T result = caseColorCustomizationConstraint(colorCustomizationConstraint);
			if (result == null)
				result = caseColorConstraintRule(colorCustomizationConstraint);
			if (result == null)
				result = caseCustomizationType(colorCustomizationConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.COLOR_CONSTRAINT_RULE: {
			ColorConstraintRule colorConstraintRule = (ColorConstraintRule) theEObject;
			T result = caseColorConstraintRule(colorConstraintRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.ENUM_BASED_CONSTRAINT: {
			EnumBasedConstraint enumBasedConstraint = (EnumBasedConstraint) theEObject;
			T result = caseEnumBasedConstraint(enumBasedConstraint);
			if (result == null)
				result = caseSingleValueConstraint(enumBasedConstraint);
			if (result == null)
				result = caseAttributeSystemConstraint(enumBasedConstraint);
			if (result == null)
				result = caseGameSystemConstraint(enumBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.SIMPLE_ENUM_STRUCTURE: {
			SimpleEnumStructure simpleEnumStructure = (SimpleEnumStructure) theEObject;
			T result = caseSimpleEnumStructure(simpleEnumStructure);
			if (result == null)
				result = caseEnumerationBasedStructure(simpleEnumStructure);
			if (result == null)
				result = caseGameStructure(simpleEnumStructure);
			if (result == null)
				result = caseGameFeature(simpleEnumStructure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.BITMASKED_ENUM_STRUCTURE: {
			BitmaskedEnumStructure bitmaskedEnumStructure = (BitmaskedEnumStructure) theEObject;
			T result = caseBitmaskedEnumStructure(bitmaskedEnumStructure);
			if (result == null)
				result = caseEnumerationBasedStructure(bitmaskedEnumStructure);
			if (result == null)
				result = caseGameStructure(bitmaskedEnumStructure);
			if (result == null)
				result = caseGameFeature(bitmaskedEnumStructure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.GAME_STRUCTURE_CONTAINER: {
			GameStructureContainer gameStructureContainer = (GameStructureContainer) theEObject;
			T result = caseGameStructureContainer(gameStructureContainer);
			if (result == null)
				result = caseGameFeatureContainer(gameStructureContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.GAME_STRUCTURE: {
			GameStructure gameStructure = (GameStructure) theEObject;
			T result = caseGameStructure(gameStructure);
			if (result == null)
				result = caseGameFeature(gameStructure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.ENUM_BASED_ATTRIBUTE: {
			EnumBasedAttribute enumBasedAttribute = (EnumBasedAttribute) theEObject;
			T result = caseEnumBasedAttribute(enumBasedAttribute);
			if (result == null)
				result = caseGameAttribute(enumBasedAttribute);
			if (result == null)
				result = caseGameFeature(enumBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.STRUCTURE_BASED_ATTRIBUTE: {
			StructureBasedAttribute structureBasedAttribute = (StructureBasedAttribute) theEObject;
			T result = caseStructureBasedAttribute(structureBasedAttribute);
			if (result == null)
				result = caseGameAttribute(structureBasedAttribute);
			if (result == null)
				result = caseGameFeature(structureBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.STRUCTURE_BASED_CONSTRAINT: {
			StructureBasedConstraint structureBasedConstraint = (StructureBasedConstraint) theEObject;
			T result = caseStructureBasedConstraint(structureBasedConstraint);
			if (result == null)
				result = caseSingleValueConstraint(structureBasedConstraint);
			if (result == null)
				result = caseAttributeSystemConstraint(structureBasedConstraint);
			if (result == null)
				result = caseGameSystemConstraint(structureBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.GETTER_DISTORTION_CONSTRAINT: {
			GetterDistortionConstraint getterDistortionConstraint = (GetterDistortionConstraint) theEObject;
			T result = caseGetterDistortionConstraint(getterDistortionConstraint);
			if (result == null)
				result = caseDistortionConstraint(getterDistortionConstraint);
			if (result == null)
				result = caseValueConstraintRule(getterDistortionConstraint);
			if (result == null)
				result = caseAttributeConstraintRule(getterDistortionConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(getterDistortionConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.SETTER_DISTORTION_CONSTRAINT: {
			SetterDistortionConstraint setterDistortionConstraint = (SetterDistortionConstraint) theEObject;
			T result = caseSetterDistortionConstraint(setterDistortionConstraint);
			if (result == null)
				result = caseDistortionConstraint(setterDistortionConstraint);
			if (result == null)
				result = caseValueConstraintRule(setterDistortionConstraint);
			if (result == null)
				result = caseAttributeConstraintRule(setterDistortionConstraint);
			if (result == null)
				result = caseBaseGameConstraintRule(setterDistortionConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.MATERIAL_BASED_CONSTRAINT: {
			MaterialBasedConstraint materialBasedConstraint = (MaterialBasedConstraint) theEObject;
			T result = caseMaterialBasedConstraint(materialBasedConstraint);
			if (result == null)
				result = caseSingleValueConstraint(materialBasedConstraint);
			if (result == null)
				result = caseAttributeSystemConstraint(materialBasedConstraint);
			if (result == null)
				result = caseGameSystemConstraint(materialBasedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UGSMLPackage.MATERIAL_BASED_ATTRIBUTE: {
			MaterialBasedAttribute materialBasedAttribute = (MaterialBasedAttribute) theEObject;
			T result = caseMaterialBasedAttribute(materialBasedAttribute);
			if (result == null)
				result = caseGameAttribute(materialBasedAttribute);
			if (result == null)
				result = caseGameFeature(materialBasedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGame(Game object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Feature Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Feature Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameFeatureContainer(GameFeatureContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Attribute Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Attribute Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameAttributeContainer(GameAttributeContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameFeature(GameFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameAttribute(GameAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Based Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Based Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationBasedStructure(EnumerationBasedStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumState(EnumState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Based Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Based Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataBasedStructure(DataBasedStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Based Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Based Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanBasedAttribute(BooleanBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Based Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Based Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueBasedAttribute(ValueBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Letter Based Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Letter Based Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLetterBasedAttribute(LetterBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Based Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Based Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameBasedAttribute(NameBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Based Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Based Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringBasedAttribute(StringBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Based Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Based Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextBasedAttribute(TextBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector2 DBased Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector2 DBased Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVector2DBasedAttribute(Vector2DBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Based Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Based Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVectorBasedAttribute(VectorBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotator Based Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotator Based Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotatorBasedAttribute(RotatorBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Based Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Based Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationBasedAttribute(TransformationBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Based Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Based Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorBasedAttribute(ColorBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Texture Based Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Texture Based Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextureBasedAttribute(TextureBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Item Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Item Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameItemContainer(GameItemContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameItem(GameItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemMode(ItemMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameSystem(GameSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeSystem(AttributeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game System Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game System Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameSystemConstraint(GameSystemConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute System Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute System Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeSystemConstraint(AttributeSystemConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Game Constraint Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Game Constraint Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseGameConstraintRule(BaseGameConstraintRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Constraint Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Constraint Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeConstraintRule(AttributeConstraintRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayConstraint(ArrayConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanBasedConstraint(BooleanBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueBasedConstraint(ValueBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minimum Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minimum Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinimumValue(MinimumValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maximum Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maximum Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaximumValue(MaximumValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regeneration Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regeneration Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegenerationConstraint(RegenerationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyConstraint(DependencyConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Letter Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Letter Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLetterBasedConstraint(LetterBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inventory System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inventory System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInventorySystem(InventorySystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inventory System Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inventory System Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInventorySystemConstraint(InventorySystemConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inventory Constraint Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inventory Constraint Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInventoryConstraintRule(InventoryConstraintRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Craft Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Craft Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutoCraftConstraint(AutoCraftConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stack Weight Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stack Weight Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStackWeightConstraint(StackWeightConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stack Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stack Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStackConstraint(StackConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weight Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weight Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeightConstraint(WeightConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlotConstraint(SlotConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equip Item Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equip Item Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipItemConstraint(EquipItemConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionConstraint(SelectionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Based Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Based Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelBasedAttribute(ModelBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Particle Based Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Particle Based Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticleBasedAttribute(ParticleBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vain Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vain Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVainConstraint(VainConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Value Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Value Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseValueConstraint(BaseValueConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Or Range Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Or Range Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseOrRangeConstraint(BaseOrRangeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Range Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Range Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueRangeBasedConstraint(ValueRangeBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Value Ranged Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Value Ranged Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseValueRangedConstraint(BaseValueRangedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Value Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Value Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleValueConstraint(SingleValueConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Margin Of Error Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Margin Of Error Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarginOfErrorConstraint(MarginOfErrorConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Based Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Based Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioBasedAttribute(AudioBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Based Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Based Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterBasedAttribute(CharacterBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Based Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Based Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerBasedAttribute(IntegerBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Based Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Based Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalBasedAttribute(DecimalBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Dependency Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Dependency Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectDependencyConstraint(DirectDependencyConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversion Dependency Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversion Dependency Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConversionDependencyConstraint(ConversionDependencyConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distortion Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distortion Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistortionConstraint(DistortionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector2 DBased Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector2 DBased Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVector2DBasedConstraint(Vector2DBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVectorBasedConstraint(VectorBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotator Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotator Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotatorBasedConstraint(RotatorBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationBasedConstraint(TransformationBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorBasedConstraint(ColorBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Texture Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Texture Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextureBasedConstraint(TextureBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelBasedConstraint(ModelBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Particle Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Particle Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticleBasedConstraint(ParticleBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioBasedConstraint(AudioBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Letter Length Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Letter Length Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLetterLengthConstraint(LetterLengthConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Letter Customization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Letter Customization Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLetterCustomizationConstraint(LetterCustomizationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Constraint Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Constraint Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueConstraintRule(ValueConstraintRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Letter Constraint Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Letter Constraint Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLetterConstraintRule(LetterConstraintRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector2 DRange Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector2 DRange Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVector2DRangeBasedConstraint(Vector2DRangeBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector2 DConstraint Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector2 DConstraint Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVector2DConstraintRule(Vector2DConstraintRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Constraint Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Constraint Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVectorConstraintRule(VectorConstraintRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Range Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Range Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVectorRangeBasedConstraint(VectorRangeBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeBasedConstraint(RangeBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotator Constraint Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotator Constraint Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotatorConstraintRule(RotatorConstraintRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotator Range Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotator Range Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotatorRangeBasedConstraint(RotatorRangeBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Constraint Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Constraint Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationConstraintRule(TransformationConstraintRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Range Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Range Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationRangeBasedConstraint(TransformationRangeBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customization Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customization Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomizationType(CustomizationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Customization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Customization Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorCustomizationConstraint(ColorCustomizationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Constraint Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Constraint Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorConstraintRule(ColorConstraintRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumBasedConstraint(EnumBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Enum Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Enum Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleEnumStructure(SimpleEnumStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bitmasked Enum Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bitmasked Enum Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitmaskedEnumStructure(BitmaskedEnumStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Structure Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Structure Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameStructureContainer(GameStructureContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameStructure(GameStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Based Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Based Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumBasedAttribute(EnumBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Based Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Based Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureBasedAttribute(StructureBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureBasedConstraint(StructureBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Getter Distortion Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Getter Distortion Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetterDistortionConstraint(GetterDistortionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setter Distortion Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setter Distortion Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetterDistortionConstraint(SetterDistortionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material Based Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material Based Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterialBasedConstraint(MaterialBasedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material Based Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material Based Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterialBasedAttribute(MaterialBasedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UGSMLSwitch
