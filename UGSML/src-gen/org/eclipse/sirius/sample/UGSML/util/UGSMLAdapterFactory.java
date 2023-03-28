/**
 */
package org.eclipse.sirius.sample.UGSML.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.sample.UGSML.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage
 * @generated
 */
public class UGSMLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UGSMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UGSMLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UGSMLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UGSMLSwitch<Adapter> modelSwitch = new UGSMLSwitch<Adapter>() {
		@Override
		public Adapter caseRoot(Root object) {
			return createRootAdapter();
		}

		@Override
		public Adapter caseGame(Game object) {
			return createGameAdapter();
		}

		@Override
		public Adapter caseGameFeatureContainer(GameFeatureContainer object) {
			return createGameFeatureContainerAdapter();
		}

		@Override
		public Adapter caseGameAttributeContainer(GameAttributeContainer object) {
			return createGameAttributeContainerAdapter();
		}

		@Override
		public Adapter caseGameFeature(GameFeature object) {
			return createGameFeatureAdapter();
		}

		@Override
		public Adapter caseGameAttribute(GameAttribute object) {
			return createGameAttributeAdapter();
		}

		@Override
		public Adapter caseEnumerationBasedStructure(EnumerationBasedStructure object) {
			return createEnumerationBasedStructureAdapter();
		}

		@Override
		public Adapter caseEnumState(EnumState object) {
			return createEnumStateAdapter();
		}

		@Override
		public Adapter caseDataBasedStructure(DataBasedStructure object) {
			return createDataBasedStructureAdapter();
		}

		@Override
		public Adapter caseBooleanBasedAttribute(BooleanBasedAttribute object) {
			return createBooleanBasedAttributeAdapter();
		}

		@Override
		public Adapter caseValueBasedAttribute(ValueBasedAttribute object) {
			return createValueBasedAttributeAdapter();
		}

		@Override
		public Adapter caseLetterBasedAttribute(LetterBasedAttribute object) {
			return createLetterBasedAttributeAdapter();
		}

		@Override
		public Adapter caseNameBasedAttribute(NameBasedAttribute object) {
			return createNameBasedAttributeAdapter();
		}

		@Override
		public Adapter caseStringBasedAttribute(StringBasedAttribute object) {
			return createStringBasedAttributeAdapter();
		}

		@Override
		public Adapter caseTextBasedAttribute(TextBasedAttribute object) {
			return createTextBasedAttributeAdapter();
		}

		@Override
		public Adapter caseVector2DBasedAttribute(Vector2DBasedAttribute object) {
			return createVector2DBasedAttributeAdapter();
		}

		@Override
		public Adapter caseVectorBasedAttribute(VectorBasedAttribute object) {
			return createVectorBasedAttributeAdapter();
		}

		@Override
		public Adapter caseRotatorBasedAttribute(RotatorBasedAttribute object) {
			return createRotatorBasedAttributeAdapter();
		}

		@Override
		public Adapter caseTransformationBasedAttribute(TransformationBasedAttribute object) {
			return createTransformationBasedAttributeAdapter();
		}

		@Override
		public Adapter caseColorBasedAttribute(ColorBasedAttribute object) {
			return createColorBasedAttributeAdapter();
		}

		@Override
		public Adapter caseTextureBasedAttribute(TextureBasedAttribute object) {
			return createTextureBasedAttributeAdapter();
		}

		@Override
		public Adapter caseGameItemContainer(GameItemContainer object) {
			return createGameItemContainerAdapter();
		}

		@Override
		public Adapter caseGameItem(GameItem object) {
			return createGameItemAdapter();
		}

		@Override
		public Adapter caseItemMode(ItemMode object) {
			return createItemModeAdapter();
		}

		@Override
		public Adapter caseGameSystem(GameSystem object) {
			return createGameSystemAdapter();
		}

		@Override
		public Adapter caseAttributeSystem(AttributeSystem object) {
			return createAttributeSystemAdapter();
		}

		@Override
		public Adapter caseGameSystemConstraint(GameSystemConstraint object) {
			return createGameSystemConstraintAdapter();
		}

		@Override
		public Adapter caseAttributeSystemConstraint(AttributeSystemConstraint object) {
			return createAttributeSystemConstraintAdapter();
		}

		@Override
		public Adapter caseBaseGameConstraintRule(BaseGameConstraintRule object) {
			return createBaseGameConstraintRuleAdapter();
		}

		@Override
		public Adapter caseAttributeConstraintRule(AttributeConstraintRule object) {
			return createAttributeConstraintRuleAdapter();
		}

		@Override
		public Adapter caseArrayConstraint(ArrayConstraint object) {
			return createArrayConstraintAdapter();
		}

		@Override
		public Adapter caseBooleanBasedConstraint(BooleanBasedConstraint object) {
			return createBooleanBasedConstraintAdapter();
		}

		@Override
		public Adapter caseValueBasedConstraint(ValueBasedConstraint object) {
			return createValueBasedConstraintAdapter();
		}

		@Override
		public Adapter caseMinimumValue(MinimumValue object) {
			return createMinimumValueAdapter();
		}

		@Override
		public Adapter caseMaximumValue(MaximumValue object) {
			return createMaximumValueAdapter();
		}

		@Override
		public Adapter caseRegenerationConstraint(RegenerationConstraint object) {
			return createRegenerationConstraintAdapter();
		}

		@Override
		public Adapter caseDependencyConstraint(DependencyConstraint object) {
			return createDependencyConstraintAdapter();
		}

		@Override
		public Adapter caseLetterBasedConstraint(LetterBasedConstraint object) {
			return createLetterBasedConstraintAdapter();
		}

		@Override
		public Adapter caseInventorySystem(InventorySystem object) {
			return createInventorySystemAdapter();
		}

		@Override
		public Adapter caseInventorySystemConstraint(InventorySystemConstraint object) {
			return createInventorySystemConstraintAdapter();
		}

		@Override
		public Adapter caseInventoryConstraintRule(InventoryConstraintRule object) {
			return createInventoryConstraintRuleAdapter();
		}

		@Override
		public Adapter caseAutoCraftConstraint(AutoCraftConstraint object) {
			return createAutoCraftConstraintAdapter();
		}

		@Override
		public Adapter caseStackWeightConstraint(StackWeightConstraint object) {
			return createStackWeightConstraintAdapter();
		}

		@Override
		public Adapter caseStackConstraint(StackConstraint object) {
			return createStackConstraintAdapter();
		}

		@Override
		public Adapter caseWeightConstraint(WeightConstraint object) {
			return createWeightConstraintAdapter();
		}

		@Override
		public Adapter caseSlotConstraint(SlotConstraint object) {
			return createSlotConstraintAdapter();
		}

		@Override
		public Adapter caseEquipItemConstraint(EquipItemConstraint object) {
			return createEquipItemConstraintAdapter();
		}

		@Override
		public Adapter caseSelectionConstraint(SelectionConstraint object) {
			return createSelectionConstraintAdapter();
		}

		@Override
		public Adapter caseModelBasedAttribute(ModelBasedAttribute object) {
			return createModelBasedAttributeAdapter();
		}

		@Override
		public Adapter caseParticleBasedAttribute(ParticleBasedAttribute object) {
			return createParticleBasedAttributeAdapter();
		}

		@Override
		public Adapter caseVainConstraint(VainConstraint object) {
			return createVainConstraintAdapter();
		}

		@Override
		public Adapter caseBaseValueConstraint(BaseValueConstraint object) {
			return createBaseValueConstraintAdapter();
		}

		@Override
		public Adapter caseBaseOrRangeConstraint(BaseOrRangeConstraint object) {
			return createBaseOrRangeConstraintAdapter();
		}

		@Override
		public Adapter caseValueRangeBasedConstraint(ValueRangeBasedConstraint object) {
			return createValueRangeBasedConstraintAdapter();
		}

		@Override
		public Adapter caseBaseValueRangedConstraint(BaseValueRangedConstraint object) {
			return createBaseValueRangedConstraintAdapter();
		}

		@Override
		public Adapter caseSingleValueConstraint(SingleValueConstraint object) {
			return createSingleValueConstraintAdapter();
		}

		@Override
		public Adapter caseMarginOfErrorConstraint(MarginOfErrorConstraint object) {
			return createMarginOfErrorConstraintAdapter();
		}

		@Override
		public Adapter caseAudioBasedAttribute(AudioBasedAttribute object) {
			return createAudioBasedAttributeAdapter();
		}

		@Override
		public Adapter caseCharacterBasedAttribute(CharacterBasedAttribute object) {
			return createCharacterBasedAttributeAdapter();
		}

		@Override
		public Adapter caseIntegerBasedAttribute(IntegerBasedAttribute object) {
			return createIntegerBasedAttributeAdapter();
		}

		@Override
		public Adapter caseDecimalBasedAttribute(DecimalBasedAttribute object) {
			return createDecimalBasedAttributeAdapter();
		}

		@Override
		public Adapter caseDirectDependencyConstraint(DirectDependencyConstraint object) {
			return createDirectDependencyConstraintAdapter();
		}

		@Override
		public Adapter caseConversionDependencyConstraint(ConversionDependencyConstraint object) {
			return createConversionDependencyConstraintAdapter();
		}

		@Override
		public Adapter caseDistortionConstraint(DistortionConstraint object) {
			return createDistortionConstraintAdapter();
		}

		@Override
		public Adapter caseVector2DBasedConstraint(Vector2DBasedConstraint object) {
			return createVector2DBasedConstraintAdapter();
		}

		@Override
		public Adapter caseVectorBasedConstraint(VectorBasedConstraint object) {
			return createVectorBasedConstraintAdapter();
		}

		@Override
		public Adapter caseRotatorBasedConstraint(RotatorBasedConstraint object) {
			return createRotatorBasedConstraintAdapter();
		}

		@Override
		public Adapter caseTransformationBasedConstraint(TransformationBasedConstraint object) {
			return createTransformationBasedConstraintAdapter();
		}

		@Override
		public Adapter caseColorBasedConstraint(ColorBasedConstraint object) {
			return createColorBasedConstraintAdapter();
		}

		@Override
		public Adapter caseTextureBasedConstraint(TextureBasedConstraint object) {
			return createTextureBasedConstraintAdapter();
		}

		@Override
		public Adapter caseModelBasedConstraint(ModelBasedConstraint object) {
			return createModelBasedConstraintAdapter();
		}

		@Override
		public Adapter caseParticleBasedConstraint(ParticleBasedConstraint object) {
			return createParticleBasedConstraintAdapter();
		}

		@Override
		public Adapter caseAudioBasedConstraint(AudioBasedConstraint object) {
			return createAudioBasedConstraintAdapter();
		}

		@Override
		public Adapter caseLetterLengthConstraint(LetterLengthConstraint object) {
			return createLetterLengthConstraintAdapter();
		}

		@Override
		public Adapter caseLetterCustomizationConstraint(LetterCustomizationConstraint object) {
			return createLetterCustomizationConstraintAdapter();
		}

		@Override
		public Adapter caseValueConstraintRule(ValueConstraintRule object) {
			return createValueConstraintRuleAdapter();
		}

		@Override
		public Adapter caseLetterConstraintRule(LetterConstraintRule object) {
			return createLetterConstraintRuleAdapter();
		}

		@Override
		public Adapter caseVector2DRangeBasedConstraint(Vector2DRangeBasedConstraint object) {
			return createVector2DRangeBasedConstraintAdapter();
		}

		@Override
		public Adapter caseVector2DConstraintRule(Vector2DConstraintRule object) {
			return createVector2DConstraintRuleAdapter();
		}

		@Override
		public Adapter caseVectorConstraintRule(VectorConstraintRule object) {
			return createVectorConstraintRuleAdapter();
		}

		@Override
		public Adapter caseVectorRangeBasedConstraint(VectorRangeBasedConstraint object) {
			return createVectorRangeBasedConstraintAdapter();
		}

		@Override
		public Adapter caseRangeBasedConstraint(RangeBasedConstraint object) {
			return createRangeBasedConstraintAdapter();
		}

		@Override
		public Adapter caseRotatorConstraintRule(RotatorConstraintRule object) {
			return createRotatorConstraintRuleAdapter();
		}

		@Override
		public Adapter caseRotatorRangeBasedConstraint(RotatorRangeBasedConstraint object) {
			return createRotatorRangeBasedConstraintAdapter();
		}

		@Override
		public Adapter caseTransformationConstraintRule(TransformationConstraintRule object) {
			return createTransformationConstraintRuleAdapter();
		}

		@Override
		public Adapter caseTransformationRangeBasedConstraint(TransformationRangeBasedConstraint object) {
			return createTransformationRangeBasedConstraintAdapter();
		}

		@Override
		public Adapter caseCustomizationType(CustomizationType object) {
			return createCustomizationTypeAdapter();
		}

		@Override
		public Adapter caseColorCustomizationConstraint(ColorCustomizationConstraint object) {
			return createColorCustomizationConstraintAdapter();
		}

		@Override
		public Adapter caseColorConstraintRule(ColorConstraintRule object) {
			return createColorConstraintRuleAdapter();
		}

		@Override
		public Adapter caseEnumBasedConstraint(EnumBasedConstraint object) {
			return createEnumBasedConstraintAdapter();
		}

		@Override
		public Adapter caseSimpleEnumStructure(SimpleEnumStructure object) {
			return createSimpleEnumStructureAdapter();
		}

		@Override
		public Adapter caseBitmaskedEnumStructure(BitmaskedEnumStructure object) {
			return createBitmaskedEnumStructureAdapter();
		}

		@Override
		public Adapter caseGameStructureContainer(GameStructureContainer object) {
			return createGameStructureContainerAdapter();
		}

		@Override
		public Adapter caseGameStructure(GameStructure object) {
			return createGameStructureAdapter();
		}

		@Override
		public Adapter caseEnumBasedAttribute(EnumBasedAttribute object) {
			return createEnumBasedAttributeAdapter();
		}

		@Override
		public Adapter caseStructureBasedAttribute(StructureBasedAttribute object) {
			return createStructureBasedAttributeAdapter();
		}

		@Override
		public Adapter caseStructureBasedConstraint(StructureBasedConstraint object) {
			return createStructureBasedConstraintAdapter();
		}

		@Override
		public Adapter caseGetterDistortionConstraint(GetterDistortionConstraint object) {
			return createGetterDistortionConstraintAdapter();
		}

		@Override
		public Adapter caseSetterDistortionConstraint(SetterDistortionConstraint object) {
			return createSetterDistortionConstraintAdapter();
		}

		@Override
		public Adapter caseMaterialBasedConstraint(MaterialBasedConstraint object) {
			return createMaterialBasedConstraintAdapter();
		}

		@Override
		public Adapter caseMaterialBasedAttribute(MaterialBasedAttribute object) {
			return createMaterialBasedAttributeAdapter();
		}

		@Override
		public Adapter caseAnimationBasedAttribute(AnimationBasedAttribute object) {
			return createAnimationBasedAttributeAdapter();
		}

		@Override
		public Adapter caseAnimationBasedConstraint(AnimationBasedConstraint object) {
			return createAnimationBasedConstraintAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.Game
	 * @generated
	 */
	public Adapter createGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.GameFeatureContainer <em>Game Feature Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.GameFeatureContainer
	 * @generated
	 */
	public Adapter createGameFeatureContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.GameAttributeContainer <em>Game Attribute Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.GameAttributeContainer
	 * @generated
	 */
	public Adapter createGameAttributeContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.GameFeature <em>Game Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.GameFeature
	 * @generated
	 */
	public Adapter createGameFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.GameAttribute <em>Game Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.GameAttribute
	 * @generated
	 */
	public Adapter createGameAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.EnumerationBasedStructure <em>Enumeration Based Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.EnumerationBasedStructure
	 * @generated
	 */
	public Adapter createEnumerationBasedStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.EnumState <em>Enum State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.EnumState
	 * @generated
	 */
	public Adapter createEnumStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.DataBasedStructure <em>Data Based Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.DataBasedStructure
	 * @generated
	 */
	public Adapter createDataBasedStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.BooleanBasedAttribute <em>Boolean Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.BooleanBasedAttribute
	 * @generated
	 */
	public Adapter createBooleanBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.ValueBasedAttribute <em>Value Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.ValueBasedAttribute
	 * @generated
	 */
	public Adapter createValueBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.LetterBasedAttribute <em>Letter Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.LetterBasedAttribute
	 * @generated
	 */
	public Adapter createLetterBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.NameBasedAttribute <em>Name Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.NameBasedAttribute
	 * @generated
	 */
	public Adapter createNameBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.StringBasedAttribute <em>String Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.StringBasedAttribute
	 * @generated
	 */
	public Adapter createStringBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.TextBasedAttribute <em>Text Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.TextBasedAttribute
	 * @generated
	 */
	public Adapter createTextBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.Vector2DBasedAttribute <em>Vector2 DBased Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.Vector2DBasedAttribute
	 * @generated
	 */
	public Adapter createVector2DBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.VectorBasedAttribute <em>Vector Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.VectorBasedAttribute
	 * @generated
	 */
	public Adapter createVectorBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute <em>Rotator Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute
	 * @generated
	 */
	public Adapter createRotatorBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute <em>Transformation Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute
	 * @generated
	 */
	public Adapter createTransformationBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.ColorBasedAttribute <em>Color Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.ColorBasedAttribute
	 * @generated
	 */
	public Adapter createColorBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.TextureBasedAttribute <em>Texture Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.TextureBasedAttribute
	 * @generated
	 */
	public Adapter createTextureBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.GameItemContainer <em>Game Item Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.GameItemContainer
	 * @generated
	 */
	public Adapter createGameItemContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.GameItem <em>Game Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.GameItem
	 * @generated
	 */
	public Adapter createGameItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.ItemMode <em>Item Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.ItemMode
	 * @generated
	 */
	public Adapter createItemModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.GameSystem <em>Game System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.GameSystem
	 * @generated
	 */
	public Adapter createGameSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.AttributeSystem <em>Attribute System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.AttributeSystem
	 * @generated
	 */
	public Adapter createAttributeSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.GameSystemConstraint <em>Game System Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.GameSystemConstraint
	 * @generated
	 */
	public Adapter createGameSystemConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.AttributeSystemConstraint <em>Attribute System Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.AttributeSystemConstraint
	 * @generated
	 */
	public Adapter createAttributeSystemConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.BaseGameConstraintRule <em>Base Game Constraint Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.BaseGameConstraintRule
	 * @generated
	 */
	public Adapter createBaseGameConstraintRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.AttributeConstraintRule <em>Attribute Constraint Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.AttributeConstraintRule
	 * @generated
	 */
	public Adapter createAttributeConstraintRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.ArrayConstraint <em>Array Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.ArrayConstraint
	 * @generated
	 */
	public Adapter createArrayConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.BooleanBasedConstraint <em>Boolean Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.BooleanBasedConstraint
	 * @generated
	 */
	public Adapter createBooleanBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.ValueBasedConstraint <em>Value Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.ValueBasedConstraint
	 * @generated
	 */
	public Adapter createValueBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.MinimumValue <em>Minimum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.MinimumValue
	 * @generated
	 */
	public Adapter createMinimumValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.MaximumValue <em>Maximum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.MaximumValue
	 * @generated
	 */
	public Adapter createMaximumValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.RegenerationConstraint <em>Regeneration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.RegenerationConstraint
	 * @generated
	 */
	public Adapter createRegenerationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.DependencyConstraint <em>Dependency Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.DependencyConstraint
	 * @generated
	 */
	public Adapter createDependencyConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.LetterBasedConstraint <em>Letter Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.LetterBasedConstraint
	 * @generated
	 */
	public Adapter createLetterBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.InventorySystem <em>Inventory System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.InventorySystem
	 * @generated
	 */
	public Adapter createInventorySystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.InventorySystemConstraint <em>Inventory System Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.InventorySystemConstraint
	 * @generated
	 */
	public Adapter createInventorySystemConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.InventoryConstraintRule <em>Inventory Constraint Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.InventoryConstraintRule
	 * @generated
	 */
	public Adapter createInventoryConstraintRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.AutoCraftConstraint <em>Auto Craft Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.AutoCraftConstraint
	 * @generated
	 */
	public Adapter createAutoCraftConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.StackWeightConstraint <em>Stack Weight Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.StackWeightConstraint
	 * @generated
	 */
	public Adapter createStackWeightConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.StackConstraint <em>Stack Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.StackConstraint
	 * @generated
	 */
	public Adapter createStackConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.WeightConstraint <em>Weight Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.WeightConstraint
	 * @generated
	 */
	public Adapter createWeightConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.SlotConstraint <em>Slot Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.SlotConstraint
	 * @generated
	 */
	public Adapter createSlotConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.EquipItemConstraint <em>Equip Item Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.EquipItemConstraint
	 * @generated
	 */
	public Adapter createEquipItemConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.SelectionConstraint <em>Selection Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.SelectionConstraint
	 * @generated
	 */
	public Adapter createSelectionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.ModelBasedAttribute <em>Model Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.ModelBasedAttribute
	 * @generated
	 */
	public Adapter createModelBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.ParticleBasedAttribute <em>Particle Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.ParticleBasedAttribute
	 * @generated
	 */
	public Adapter createParticleBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.VainConstraint <em>Vain Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.VainConstraint
	 * @generated
	 */
	public Adapter createVainConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.BaseValueConstraint <em>Base Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.BaseValueConstraint
	 * @generated
	 */
	public Adapter createBaseValueConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.BaseOrRangeConstraint <em>Base Or Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.BaseOrRangeConstraint
	 * @generated
	 */
	public Adapter createBaseOrRangeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint <em>Value Range Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint
	 * @generated
	 */
	public Adapter createValueRangeBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.BaseValueRangedConstraint <em>Base Value Ranged Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.BaseValueRangedConstraint
	 * @generated
	 */
	public Adapter createBaseValueRangedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.SingleValueConstraint <em>Single Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.SingleValueConstraint
	 * @generated
	 */
	public Adapter createSingleValueConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.MarginOfErrorConstraint <em>Margin Of Error Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.MarginOfErrorConstraint
	 * @generated
	 */
	public Adapter createMarginOfErrorConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.AudioBasedAttribute <em>Audio Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.AudioBasedAttribute
	 * @generated
	 */
	public Adapter createAudioBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.CharacterBasedAttribute <em>Character Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.CharacterBasedAttribute
	 * @generated
	 */
	public Adapter createCharacterBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.IntegerBasedAttribute <em>Integer Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.IntegerBasedAttribute
	 * @generated
	 */
	public Adapter createIntegerBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.DecimalBasedAttribute <em>Decimal Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.DecimalBasedAttribute
	 * @generated
	 */
	public Adapter createDecimalBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.DirectDependencyConstraint <em>Direct Dependency Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.DirectDependencyConstraint
	 * @generated
	 */
	public Adapter createDirectDependencyConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint <em>Conversion Dependency Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint
	 * @generated
	 */
	public Adapter createConversionDependencyConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.DistortionConstraint <em>Distortion Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.DistortionConstraint
	 * @generated
	 */
	public Adapter createDistortionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.Vector2DBasedConstraint <em>Vector2 DBased Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.Vector2DBasedConstraint
	 * @generated
	 */
	public Adapter createVector2DBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.VectorBasedConstraint <em>Vector Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.VectorBasedConstraint
	 * @generated
	 */
	public Adapter createVectorBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.RotatorBasedConstraint <em>Rotator Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.RotatorBasedConstraint
	 * @generated
	 */
	public Adapter createRotatorBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.TransformationBasedConstraint <em>Transformation Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.TransformationBasedConstraint
	 * @generated
	 */
	public Adapter createTransformationBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.ColorBasedConstraint <em>Color Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.ColorBasedConstraint
	 * @generated
	 */
	public Adapter createColorBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.TextureBasedConstraint <em>Texture Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.TextureBasedConstraint
	 * @generated
	 */
	public Adapter createTextureBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.ModelBasedConstraint <em>Model Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.ModelBasedConstraint
	 * @generated
	 */
	public Adapter createModelBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.ParticleBasedConstraint <em>Particle Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.ParticleBasedConstraint
	 * @generated
	 */
	public Adapter createParticleBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.AudioBasedConstraint <em>Audio Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.AudioBasedConstraint
	 * @generated
	 */
	public Adapter createAudioBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.LetterLengthConstraint <em>Letter Length Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.LetterLengthConstraint
	 * @generated
	 */
	public Adapter createLetterLengthConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.LetterCustomizationConstraint <em>Letter Customization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.LetterCustomizationConstraint
	 * @generated
	 */
	public Adapter createLetterCustomizationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.ValueConstraintRule <em>Value Constraint Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.ValueConstraintRule
	 * @generated
	 */
	public Adapter createValueConstraintRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.LetterConstraintRule <em>Letter Constraint Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.LetterConstraintRule
	 * @generated
	 */
	public Adapter createLetterConstraintRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.Vector2DRangeBasedConstraint <em>Vector2 DRange Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.Vector2DRangeBasedConstraint
	 * @generated
	 */
	public Adapter createVector2DRangeBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.Vector2DConstraintRule <em>Vector2 DConstraint Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.Vector2DConstraintRule
	 * @generated
	 */
	public Adapter createVector2DConstraintRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.VectorConstraintRule <em>Vector Constraint Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.VectorConstraintRule
	 * @generated
	 */
	public Adapter createVectorConstraintRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.VectorRangeBasedConstraint <em>Vector Range Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.VectorRangeBasedConstraint
	 * @generated
	 */
	public Adapter createVectorRangeBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.RangeBasedConstraint <em>Range Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.RangeBasedConstraint
	 * @generated
	 */
	public Adapter createRangeBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.RotatorConstraintRule <em>Rotator Constraint Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.RotatorConstraintRule
	 * @generated
	 */
	public Adapter createRotatorConstraintRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.RotatorRangeBasedConstraint <em>Rotator Range Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.RotatorRangeBasedConstraint
	 * @generated
	 */
	public Adapter createRotatorRangeBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.TransformationConstraintRule <em>Transformation Constraint Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.TransformationConstraintRule
	 * @generated
	 */
	public Adapter createTransformationConstraintRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.TransformationRangeBasedConstraint <em>Transformation Range Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.TransformationRangeBasedConstraint
	 * @generated
	 */
	public Adapter createTransformationRangeBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.CustomizationType <em>Customization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.CustomizationType
	 * @generated
	 */
	public Adapter createCustomizationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.ColorCustomizationConstraint <em>Color Customization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.ColorCustomizationConstraint
	 * @generated
	 */
	public Adapter createColorCustomizationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.ColorConstraintRule <em>Color Constraint Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.ColorConstraintRule
	 * @generated
	 */
	public Adapter createColorConstraintRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.EnumBasedConstraint <em>Enum Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.EnumBasedConstraint
	 * @generated
	 */
	public Adapter createEnumBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.SimpleEnumStructure <em>Simple Enum Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.SimpleEnumStructure
	 * @generated
	 */
	public Adapter createSimpleEnumStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.BitmaskedEnumStructure <em>Bitmasked Enum Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.BitmaskedEnumStructure
	 * @generated
	 */
	public Adapter createBitmaskedEnumStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.GameStructureContainer <em>Game Structure Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.GameStructureContainer
	 * @generated
	 */
	public Adapter createGameStructureContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.GameStructure <em>Game Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.GameStructure
	 * @generated
	 */
	public Adapter createGameStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.EnumBasedAttribute <em>Enum Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.EnumBasedAttribute
	 * @generated
	 */
	public Adapter createEnumBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.StructureBasedAttribute <em>Structure Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.StructureBasedAttribute
	 * @generated
	 */
	public Adapter createStructureBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.StructureBasedConstraint <em>Structure Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.StructureBasedConstraint
	 * @generated
	 */
	public Adapter createStructureBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.GetterDistortionConstraint <em>Getter Distortion Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.GetterDistortionConstraint
	 * @generated
	 */
	public Adapter createGetterDistortionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.SetterDistortionConstraint <em>Setter Distortion Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.SetterDistortionConstraint
	 * @generated
	 */
	public Adapter createSetterDistortionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.MaterialBasedConstraint <em>Material Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.MaterialBasedConstraint
	 * @generated
	 */
	public Adapter createMaterialBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.MaterialBasedAttribute <em>Material Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.MaterialBasedAttribute
	 * @generated
	 */
	public Adapter createMaterialBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.AnimationBasedAttribute <em>Animation Based Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.AnimationBasedAttribute
	 * @generated
	 */
	public Adapter createAnimationBasedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sirius.sample.UGSML.AnimationBasedConstraint <em>Animation Based Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sirius.sample.UGSML.AnimationBasedConstraint
	 * @generated
	 */
	public Adapter createAnimationBasedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UGSMLAdapterFactory
