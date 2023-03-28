/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.sirius.sample.UGSML.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UGSMLFactoryImpl extends EFactoryImpl implements UGSMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UGSMLFactory init() {
		try {
			UGSMLFactory theUGSMLFactory = (UGSMLFactory) EPackage.Registry.INSTANCE.getEFactory(UGSMLPackage.eNS_URI);
			if (theUGSMLFactory != null) {
				return theUGSMLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UGSMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UGSMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case UGSMLPackage.ROOT:
			return createRoot();
		case UGSMLPackage.GAME:
			return createGame();
		case UGSMLPackage.GAME_ATTRIBUTE_CONTAINER:
			return createGameAttributeContainer();
		case UGSMLPackage.ENUM_STATE:
			return createEnumState();
		case UGSMLPackage.DATA_BASED_STRUCTURE:
			return createDataBasedStructure();
		case UGSMLPackage.BOOLEAN_BASED_ATTRIBUTE:
			return createBooleanBasedAttribute();
		case UGSMLPackage.NAME_BASED_ATTRIBUTE:
			return createNameBasedAttribute();
		case UGSMLPackage.STRING_BASED_ATTRIBUTE:
			return createStringBasedAttribute();
		case UGSMLPackage.TEXT_BASED_ATTRIBUTE:
			return createTextBasedAttribute();
		case UGSMLPackage.VECTOR2_DBASED_ATTRIBUTE:
			return createVector2DBasedAttribute();
		case UGSMLPackage.VECTOR_BASED_ATTRIBUTE:
			return createVectorBasedAttribute();
		case UGSMLPackage.ROTATOR_BASED_ATTRIBUTE:
			return createRotatorBasedAttribute();
		case UGSMLPackage.TRANSFORMATION_BASED_ATTRIBUTE:
			return createTransformationBasedAttribute();
		case UGSMLPackage.COLOR_BASED_ATTRIBUTE:
			return createColorBasedAttribute();
		case UGSMLPackage.TEXTURE_BASED_ATTRIBUTE:
			return createTextureBasedAttribute();
		case UGSMLPackage.GAME_ITEM_CONTAINER:
			return createGameItemContainer();
		case UGSMLPackage.GAME_ITEM:
			return createGameItem();
		case UGSMLPackage.ITEM_MODE:
			return createItemMode();
		case UGSMLPackage.ATTRIBUTE_SYSTEM:
			return createAttributeSystem();
		case UGSMLPackage.ARRAY_CONSTRAINT:
			return createArrayConstraint();
		case UGSMLPackage.BOOLEAN_BASED_CONSTRAINT:
			return createBooleanBasedConstraint();
		case UGSMLPackage.VALUE_BASED_CONSTRAINT:
			return createValueBasedConstraint();
		case UGSMLPackage.MINIMUM_VALUE:
			return createMinimumValue();
		case UGSMLPackage.MAXIMUM_VALUE:
			return createMaximumValue();
		case UGSMLPackage.REGENERATION_CONSTRAINT:
			return createRegenerationConstraint();
		case UGSMLPackage.LETTER_BASED_CONSTRAINT:
			return createLetterBasedConstraint();
		case UGSMLPackage.INVENTORY_SYSTEM:
			return createInventorySystem();
		case UGSMLPackage.INVENTORY_SYSTEM_CONSTRAINT:
			return createInventorySystemConstraint();
		case UGSMLPackage.AUTO_CRAFT_CONSTRAINT:
			return createAutoCraftConstraint();
		case UGSMLPackage.STACK_CONSTRAINT:
			return createStackConstraint();
		case UGSMLPackage.WEIGHT_CONSTRAINT:
			return createWeightConstraint();
		case UGSMLPackage.SLOT_CONSTRAINT:
			return createSlotConstraint();
		case UGSMLPackage.EQUIP_ITEM_CONSTRAINT:
			return createEquipItemConstraint();
		case UGSMLPackage.SELECTION_CONSTRAINT:
			return createSelectionConstraint();
		case UGSMLPackage.MODEL_BASED_ATTRIBUTE:
			return createModelBasedAttribute();
		case UGSMLPackage.PARTICLE_BASED_ATTRIBUTE:
			return createParticleBasedAttribute();
		case UGSMLPackage.VAIN_CONSTRAINT:
			return createVainConstraint();
		case UGSMLPackage.BASE_VALUE_CONSTRAINT:
			return createBaseValueConstraint();
		case UGSMLPackage.VALUE_RANGE_BASED_CONSTRAINT:
			return createValueRangeBasedConstraint();
		case UGSMLPackage.MARGIN_OF_ERROR_CONSTRAINT:
			return createMarginOfErrorConstraint();
		case UGSMLPackage.AUDIO_BASED_ATTRIBUTE:
			return createAudioBasedAttribute();
		case UGSMLPackage.CHARACTER_BASED_ATTRIBUTE:
			return createCharacterBasedAttribute();
		case UGSMLPackage.INTEGER_BASED_ATTRIBUTE:
			return createIntegerBasedAttribute();
		case UGSMLPackage.DECIMAL_BASED_ATTRIBUTE:
			return createDecimalBasedAttribute();
		case UGSMLPackage.DIRECT_DEPENDENCY_CONSTRAINT:
			return createDirectDependencyConstraint();
		case UGSMLPackage.CONVERSION_DEPENDENCY_CONSTRAINT:
			return createConversionDependencyConstraint();
		case UGSMLPackage.VECTOR2_DBASED_CONSTRAINT:
			return createVector2DBasedConstraint();
		case UGSMLPackage.VECTOR_BASED_CONSTRAINT:
			return createVectorBasedConstraint();
		case UGSMLPackage.ROTATOR_BASED_CONSTRAINT:
			return createRotatorBasedConstraint();
		case UGSMLPackage.TRANSFORMATION_BASED_CONSTRAINT:
			return createTransformationBasedConstraint();
		case UGSMLPackage.COLOR_BASED_CONSTRAINT:
			return createColorBasedConstraint();
		case UGSMLPackage.TEXTURE_BASED_CONSTRAINT:
			return createTextureBasedConstraint();
		case UGSMLPackage.MODEL_BASED_CONSTRAINT:
			return createModelBasedConstraint();
		case UGSMLPackage.PARTICLE_BASED_CONSTRAINT:
			return createParticleBasedConstraint();
		case UGSMLPackage.AUDIO_BASED_CONSTRAINT:
			return createAudioBasedConstraint();
		case UGSMLPackage.LETTER_LENGTH_CONSTRAINT:
			return createLetterLengthConstraint();
		case UGSMLPackage.LETTER_CUSTOMIZATION_CONSTRAINT:
			return createLetterCustomizationConstraint();
		case UGSMLPackage.VECTOR2_DRANGE_BASED_CONSTRAINT:
			return createVector2DRangeBasedConstraint();
		case UGSMLPackage.VECTOR_RANGE_BASED_CONSTRAINT:
			return createVectorRangeBasedConstraint();
		case UGSMLPackage.ROTATOR_RANGE_BASED_CONSTRAINT:
			return createRotatorRangeBasedConstraint();
		case UGSMLPackage.TRANSFORMATION_RANGE_BASED_CONSTRAINT:
			return createTransformationRangeBasedConstraint();
		case UGSMLPackage.COLOR_CUSTOMIZATION_CONSTRAINT:
			return createColorCustomizationConstraint();
		case UGSMLPackage.ENUM_BASED_CONSTRAINT:
			return createEnumBasedConstraint();
		case UGSMLPackage.SIMPLE_ENUM_STRUCTURE:
			return createSimpleEnumStructure();
		case UGSMLPackage.BITMASKED_ENUM_STRUCTURE:
			return createBitmaskedEnumStructure();
		case UGSMLPackage.GAME_STRUCTURE_CONTAINER:
			return createGameStructureContainer();
		case UGSMLPackage.ENUM_BASED_ATTRIBUTE:
			return createEnumBasedAttribute();
		case UGSMLPackage.STRUCTURE_BASED_ATTRIBUTE:
			return createStructureBasedAttribute();
		case UGSMLPackage.STRUCTURE_BASED_CONSTRAINT:
			return createStructureBasedConstraint();
		case UGSMLPackage.GETTER_DISTORTION_CONSTRAINT:
			return createGetterDistortionConstraint();
		case UGSMLPackage.SETTER_DISTORTION_CONSTRAINT:
			return createSetterDistortionConstraint();
		case UGSMLPackage.MATERIAL_BASED_CONSTRAINT:
			return createMaterialBasedConstraint();
		case UGSMLPackage.MATERIAL_BASED_ATTRIBUTE:
			return createMaterialBasedAttribute();
		case UGSMLPackage.ANIMATION_BASED_ATTRIBUTE:
			return createAnimationBasedAttribute();
		case UGSMLPackage.ANIMATION_BASED_CONSTRAINT:
			return createAnimationBasedConstraint();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case UGSMLPackage.ADDITION_LIMIT:
			return createAdditionLimitFromString(eDataType, initialValue);
		case UGSMLPackage.VARIABILITY_TYPE:
			return createVariabilityTypeFromString(eDataType, initialValue);
		case UGSMLPackage.FILTERING_TYPE:
			return createFilteringTypeFromString(eDataType, initialValue);
		case UGSMLPackage.ARITHMETIC_OPERATIONS:
			return createArithmeticOperationsFromString(eDataType, initialValue);
		case UGSMLPackage.INITIALIZATION_MODE:
			return createInitializationModeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case UGSMLPackage.ADDITION_LIMIT:
			return convertAdditionLimitToString(eDataType, instanceValue);
		case UGSMLPackage.VARIABILITY_TYPE:
			return convertVariabilityTypeToString(eDataType, instanceValue);
		case UGSMLPackage.FILTERING_TYPE:
			return convertFilteringTypeToString(eDataType, instanceValue);
		case UGSMLPackage.ARITHMETIC_OPERATIONS:
			return convertArithmeticOperationsToString(eDataType, instanceValue);
		case UGSMLPackage.INITIALIZATION_MODE:
			return convertInitializationModeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game createGame() {
		GameImpl game = new GameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameAttributeContainer createGameAttributeContainer() {
		GameAttributeContainerImpl gameAttributeContainer = new GameAttributeContainerImpl();
		return gameAttributeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumState createEnumState() {
		EnumStateImpl enumState = new EnumStateImpl();
		return enumState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBasedStructure createDataBasedStructure() {
		DataBasedStructureImpl dataBasedStructure = new DataBasedStructureImpl();
		return dataBasedStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBasedAttribute createBooleanBasedAttribute() {
		BooleanBasedAttributeImpl booleanBasedAttribute = new BooleanBasedAttributeImpl();
		return booleanBasedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameBasedAttribute createNameBasedAttribute() {
		NameBasedAttributeImpl nameBasedAttribute = new NameBasedAttributeImpl();
		return nameBasedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringBasedAttribute createStringBasedAttribute() {
		StringBasedAttributeImpl stringBasedAttribute = new StringBasedAttributeImpl();
		return stringBasedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextBasedAttribute createTextBasedAttribute() {
		TextBasedAttributeImpl textBasedAttribute = new TextBasedAttributeImpl();
		return textBasedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector2DBasedAttribute createVector2DBasedAttribute() {
		Vector2DBasedAttributeImpl vector2DBasedAttribute = new Vector2DBasedAttributeImpl();
		return vector2DBasedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorBasedAttribute createVectorBasedAttribute() {
		VectorBasedAttributeImpl vectorBasedAttribute = new VectorBasedAttributeImpl();
		return vectorBasedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotatorBasedAttribute createRotatorBasedAttribute() {
		RotatorBasedAttributeImpl rotatorBasedAttribute = new RotatorBasedAttributeImpl();
		return rotatorBasedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationBasedAttribute createTransformationBasedAttribute() {
		TransformationBasedAttributeImpl transformationBasedAttribute = new TransformationBasedAttributeImpl();
		return transformationBasedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorBasedAttribute createColorBasedAttribute() {
		ColorBasedAttributeImpl colorBasedAttribute = new ColorBasedAttributeImpl();
		return colorBasedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureBasedAttribute createTextureBasedAttribute() {
		TextureBasedAttributeImpl textureBasedAttribute = new TextureBasedAttributeImpl();
		return textureBasedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameItemContainer createGameItemContainer() {
		GameItemContainerImpl gameItemContainer = new GameItemContainerImpl();
		return gameItemContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameItem createGameItem() {
		GameItemImpl gameItem = new GameItemImpl();
		return gameItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemMode createItemMode() {
		ItemModeImpl itemMode = new ItemModeImpl();
		return itemMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeSystem createAttributeSystem() {
		AttributeSystemImpl attributeSystem = new AttributeSystemImpl();
		return attributeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayConstraint createArrayConstraint() {
		ArrayConstraintImpl arrayConstraint = new ArrayConstraintImpl();
		return arrayConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBasedConstraint createBooleanBasedConstraint() {
		BooleanBasedConstraintImpl booleanBasedConstraint = new BooleanBasedConstraintImpl();
		return booleanBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBasedConstraint createValueBasedConstraint() {
		ValueBasedConstraintImpl valueBasedConstraint = new ValueBasedConstraintImpl();
		return valueBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinimumValue createMinimumValue() {
		MinimumValueImpl minimumValue = new MinimumValueImpl();
		return minimumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaximumValue createMaximumValue() {
		MaximumValueImpl maximumValue = new MaximumValueImpl();
		return maximumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegenerationConstraint createRegenerationConstraint() {
		RegenerationConstraintImpl regenerationConstraint = new RegenerationConstraintImpl();
		return regenerationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetterBasedConstraint createLetterBasedConstraint() {
		LetterBasedConstraintImpl letterBasedConstraint = new LetterBasedConstraintImpl();
		return letterBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventorySystem createInventorySystem() {
		InventorySystemImpl inventorySystem = new InventorySystemImpl();
		return inventorySystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventorySystemConstraint createInventorySystemConstraint() {
		InventorySystemConstraintImpl inventorySystemConstraint = new InventorySystemConstraintImpl();
		return inventorySystemConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoCraftConstraint createAutoCraftConstraint() {
		AutoCraftConstraintImpl autoCraftConstraint = new AutoCraftConstraintImpl();
		return autoCraftConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackConstraint createStackConstraint() {
		StackConstraintImpl stackConstraint = new StackConstraintImpl();
		return stackConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeightConstraint createWeightConstraint() {
		WeightConstraintImpl weightConstraint = new WeightConstraintImpl();
		return weightConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotConstraint createSlotConstraint() {
		SlotConstraintImpl slotConstraint = new SlotConstraintImpl();
		return slotConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipItemConstraint createEquipItemConstraint() {
		EquipItemConstraintImpl equipItemConstraint = new EquipItemConstraintImpl();
		return equipItemConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionConstraint createSelectionConstraint() {
		SelectionConstraintImpl selectionConstraint = new SelectionConstraintImpl();
		return selectionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelBasedAttribute createModelBasedAttribute() {
		ModelBasedAttributeImpl modelBasedAttribute = new ModelBasedAttributeImpl();
		return modelBasedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticleBasedAttribute createParticleBasedAttribute() {
		ParticleBasedAttributeImpl particleBasedAttribute = new ParticleBasedAttributeImpl();
		return particleBasedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VainConstraint createVainConstraint() {
		VainConstraintImpl vainConstraint = new VainConstraintImpl();
		return vainConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseValueConstraint createBaseValueConstraint() {
		BaseValueConstraintImpl baseValueConstraint = new BaseValueConstraintImpl();
		return baseValueConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueRangeBasedConstraint createValueRangeBasedConstraint() {
		ValueRangeBasedConstraintImpl valueRangeBasedConstraint = new ValueRangeBasedConstraintImpl();
		return valueRangeBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarginOfErrorConstraint createMarginOfErrorConstraint() {
		MarginOfErrorConstraintImpl marginOfErrorConstraint = new MarginOfErrorConstraintImpl();
		return marginOfErrorConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioBasedAttribute createAudioBasedAttribute() {
		AudioBasedAttributeImpl audioBasedAttribute = new AudioBasedAttributeImpl();
		return audioBasedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterBasedAttribute createCharacterBasedAttribute() {
		CharacterBasedAttributeImpl characterBasedAttribute = new CharacterBasedAttributeImpl();
		return characterBasedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerBasedAttribute createIntegerBasedAttribute() {
		IntegerBasedAttributeImpl integerBasedAttribute = new IntegerBasedAttributeImpl();
		return integerBasedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalBasedAttribute createDecimalBasedAttribute() {
		DecimalBasedAttributeImpl decimalBasedAttribute = new DecimalBasedAttributeImpl();
		return decimalBasedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectDependencyConstraint createDirectDependencyConstraint() {
		DirectDependencyConstraintImpl directDependencyConstraint = new DirectDependencyConstraintImpl();
		return directDependencyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionDependencyConstraint createConversionDependencyConstraint() {
		ConversionDependencyConstraintImpl conversionDependencyConstraint = new ConversionDependencyConstraintImpl();
		return conversionDependencyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector2DBasedConstraint createVector2DBasedConstraint() {
		Vector2DBasedConstraintImpl vector2DBasedConstraint = new Vector2DBasedConstraintImpl();
		return vector2DBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorBasedConstraint createVectorBasedConstraint() {
		VectorBasedConstraintImpl vectorBasedConstraint = new VectorBasedConstraintImpl();
		return vectorBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotatorBasedConstraint createRotatorBasedConstraint() {
		RotatorBasedConstraintImpl rotatorBasedConstraint = new RotatorBasedConstraintImpl();
		return rotatorBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationBasedConstraint createTransformationBasedConstraint() {
		TransformationBasedConstraintImpl transformationBasedConstraint = new TransformationBasedConstraintImpl();
		return transformationBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorBasedConstraint createColorBasedConstraint() {
		ColorBasedConstraintImpl colorBasedConstraint = new ColorBasedConstraintImpl();
		return colorBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureBasedConstraint createTextureBasedConstraint() {
		TextureBasedConstraintImpl textureBasedConstraint = new TextureBasedConstraintImpl();
		return textureBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelBasedConstraint createModelBasedConstraint() {
		ModelBasedConstraintImpl modelBasedConstraint = new ModelBasedConstraintImpl();
		return modelBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticleBasedConstraint createParticleBasedConstraint() {
		ParticleBasedConstraintImpl particleBasedConstraint = new ParticleBasedConstraintImpl();
		return particleBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioBasedConstraint createAudioBasedConstraint() {
		AudioBasedConstraintImpl audioBasedConstraint = new AudioBasedConstraintImpl();
		return audioBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetterLengthConstraint createLetterLengthConstraint() {
		LetterLengthConstraintImpl letterLengthConstraint = new LetterLengthConstraintImpl();
		return letterLengthConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetterCustomizationConstraint createLetterCustomizationConstraint() {
		LetterCustomizationConstraintImpl letterCustomizationConstraint = new LetterCustomizationConstraintImpl();
		return letterCustomizationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector2DRangeBasedConstraint createVector2DRangeBasedConstraint() {
		Vector2DRangeBasedConstraintImpl vector2DRangeBasedConstraint = new Vector2DRangeBasedConstraintImpl();
		return vector2DRangeBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorRangeBasedConstraint createVectorRangeBasedConstraint() {
		VectorRangeBasedConstraintImpl vectorRangeBasedConstraint = new VectorRangeBasedConstraintImpl();
		return vectorRangeBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotatorRangeBasedConstraint createRotatorRangeBasedConstraint() {
		RotatorRangeBasedConstraintImpl rotatorRangeBasedConstraint = new RotatorRangeBasedConstraintImpl();
		return rotatorRangeBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationRangeBasedConstraint createTransformationRangeBasedConstraint() {
		TransformationRangeBasedConstraintImpl transformationRangeBasedConstraint = new TransformationRangeBasedConstraintImpl();
		return transformationRangeBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorCustomizationConstraint createColorCustomizationConstraint() {
		ColorCustomizationConstraintImpl colorCustomizationConstraint = new ColorCustomizationConstraintImpl();
		return colorCustomizationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumBasedConstraint createEnumBasedConstraint() {
		EnumBasedConstraintImpl enumBasedConstraint = new EnumBasedConstraintImpl();
		return enumBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleEnumStructure createSimpleEnumStructure() {
		SimpleEnumStructureImpl simpleEnumStructure = new SimpleEnumStructureImpl();
		return simpleEnumStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitmaskedEnumStructure createBitmaskedEnumStructure() {
		BitmaskedEnumStructureImpl bitmaskedEnumStructure = new BitmaskedEnumStructureImpl();
		return bitmaskedEnumStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameStructureContainer createGameStructureContainer() {
		GameStructureContainerImpl gameStructureContainer = new GameStructureContainerImpl();
		return gameStructureContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumBasedAttribute createEnumBasedAttribute() {
		EnumBasedAttributeImpl enumBasedAttribute = new EnumBasedAttributeImpl();
		return enumBasedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureBasedAttribute createStructureBasedAttribute() {
		StructureBasedAttributeImpl structureBasedAttribute = new StructureBasedAttributeImpl();
		return structureBasedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureBasedConstraint createStructureBasedConstraint() {
		StructureBasedConstraintImpl structureBasedConstraint = new StructureBasedConstraintImpl();
		return structureBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetterDistortionConstraint createGetterDistortionConstraint() {
		GetterDistortionConstraintImpl getterDistortionConstraint = new GetterDistortionConstraintImpl();
		return getterDistortionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetterDistortionConstraint createSetterDistortionConstraint() {
		SetterDistortionConstraintImpl setterDistortionConstraint = new SetterDistortionConstraintImpl();
		return setterDistortionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialBasedConstraint createMaterialBasedConstraint() {
		MaterialBasedConstraintImpl materialBasedConstraint = new MaterialBasedConstraintImpl();
		return materialBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialBasedAttribute createMaterialBasedAttribute() {
		MaterialBasedAttributeImpl materialBasedAttribute = new MaterialBasedAttributeImpl();
		return materialBasedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationBasedAttribute createAnimationBasedAttribute() {
		AnimationBasedAttributeImpl animationBasedAttribute = new AnimationBasedAttributeImpl();
		return animationBasedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationBasedConstraint createAnimationBasedConstraint() {
		AnimationBasedConstraintImpl animationBasedConstraint = new AnimationBasedConstraintImpl();
		return animationBasedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionLimit createAdditionLimitFromString(EDataType eDataType, String initialValue) {
		AdditionLimit result = AdditionLimit.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdditionLimitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityType createVariabilityTypeFromString(EDataType eDataType, String initialValue) {
		VariabilityType result = VariabilityType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariabilityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilteringType createFilteringTypeFromString(EDataType eDataType, String initialValue) {
		FilteringType result = FilteringType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilteringTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperations createArithmeticOperationsFromString(EDataType eDataType, String initialValue) {
		ArithmeticOperations result = ArithmeticOperations.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArithmeticOperationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializationMode createInitializationModeFromString(EDataType eDataType, String initialValue) {
		InitializationMode result = InitializationMode.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitializationModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UGSMLPackage getUGSMLPackage() {
		return (UGSMLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UGSMLPackage getPackage() {
		return UGSMLPackage.eINSTANCE;
	}

} //UGSMLFactoryImpl
