/**
 */
package org.eclipse.sirius.sample.UGSML.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sirius.sample.UGSML.AdditionLimit;
import org.eclipse.sirius.sample.UGSML.AnimationBasedAttribute;
import org.eclipse.sirius.sample.UGSML.AnimationBasedConstraint;
import org.eclipse.sirius.sample.UGSML.ArithmeticOperations;
import org.eclipse.sirius.sample.UGSML.ArrayConstraint;
import org.eclipse.sirius.sample.UGSML.AttributeConstraintRule;
import org.eclipse.sirius.sample.UGSML.AttributeSystem;
import org.eclipse.sirius.sample.UGSML.AttributeSystemConstraint;
import org.eclipse.sirius.sample.UGSML.AudioBasedAttribute;
import org.eclipse.sirius.sample.UGSML.AudioBasedConstraint;
import org.eclipse.sirius.sample.UGSML.AutoCraftConstraint;
import org.eclipse.sirius.sample.UGSML.BaseGameConstraintRule;
import org.eclipse.sirius.sample.UGSML.BaseOrRangeConstraint;
import org.eclipse.sirius.sample.UGSML.BaseValueConstraint;
import org.eclipse.sirius.sample.UGSML.BaseValueRangedConstraint;
import org.eclipse.sirius.sample.UGSML.BitmaskedEnumStructure;
import org.eclipse.sirius.sample.UGSML.BooleanBasedAttribute;
import org.eclipse.sirius.sample.UGSML.BooleanBasedConstraint;
import org.eclipse.sirius.sample.UGSML.CharacterBasedAttribute;
import org.eclipse.sirius.sample.UGSML.ColorBasedAttribute;
import org.eclipse.sirius.sample.UGSML.ColorBasedConstraint;
import org.eclipse.sirius.sample.UGSML.ColorConstraintRule;
import org.eclipse.sirius.sample.UGSML.ColorCustomizationConstraint;
import org.eclipse.sirius.sample.UGSML.ConversionDependencyConstraint;
import org.eclipse.sirius.sample.UGSML.CustomizationType;
import org.eclipse.sirius.sample.UGSML.DataBasedStructure;
import org.eclipse.sirius.sample.UGSML.DecimalBasedAttribute;
import org.eclipse.sirius.sample.UGSML.DependencyConstraint;
import org.eclipse.sirius.sample.UGSML.DirectDependencyConstraint;
import org.eclipse.sirius.sample.UGSML.DistortionConstraint;
import org.eclipse.sirius.sample.UGSML.EnumBasedAttribute;
import org.eclipse.sirius.sample.UGSML.EnumBasedConstraint;
import org.eclipse.sirius.sample.UGSML.EnumState;
import org.eclipse.sirius.sample.UGSML.EnumerationBasedStructure;
import org.eclipse.sirius.sample.UGSML.EquipItemConstraint;
import org.eclipse.sirius.sample.UGSML.FilteringType;
import org.eclipse.sirius.sample.UGSML.Game;
import org.eclipse.sirius.sample.UGSML.GameAttribute;
import org.eclipse.sirius.sample.UGSML.GameAttributeContainer;
import org.eclipse.sirius.sample.UGSML.GameFeature;
import org.eclipse.sirius.sample.UGSML.GameFeatureContainer;
import org.eclipse.sirius.sample.UGSML.GameItem;
import org.eclipse.sirius.sample.UGSML.GameItemContainer;
import org.eclipse.sirius.sample.UGSML.GameStructure;
import org.eclipse.sirius.sample.UGSML.GameStructureContainer;
import org.eclipse.sirius.sample.UGSML.GameSystem;
import org.eclipse.sirius.sample.UGSML.GameSystemConstraint;
import org.eclipse.sirius.sample.UGSML.GetterDistortionConstraint;
import org.eclipse.sirius.sample.UGSML.InitializationMode;
import org.eclipse.sirius.sample.UGSML.IntegerBasedAttribute;
import org.eclipse.sirius.sample.UGSML.InventoryConstraintRule;
import org.eclipse.sirius.sample.UGSML.InventorySystem;
import org.eclipse.sirius.sample.UGSML.InventorySystemConstraint;
import org.eclipse.sirius.sample.UGSML.ItemMode;
import org.eclipse.sirius.sample.UGSML.LetterBasedAttribute;
import org.eclipse.sirius.sample.UGSML.LetterBasedConstraint;
import org.eclipse.sirius.sample.UGSML.LetterConstraintRule;
import org.eclipse.sirius.sample.UGSML.LetterCustomizationConstraint;
import org.eclipse.sirius.sample.UGSML.LetterLengthConstraint;
import org.eclipse.sirius.sample.UGSML.MarginOfErrorConstraint;
import org.eclipse.sirius.sample.UGSML.MaterialBasedAttribute;
import org.eclipse.sirius.sample.UGSML.MaterialBasedConstraint;
import org.eclipse.sirius.sample.UGSML.MaximumValue;
import org.eclipse.sirius.sample.UGSML.MinimumValue;
import org.eclipse.sirius.sample.UGSML.ModelBasedAttribute;
import org.eclipse.sirius.sample.UGSML.ModelBasedConstraint;
import org.eclipse.sirius.sample.UGSML.NameBasedAttribute;
import org.eclipse.sirius.sample.UGSML.ParticleBasedAttribute;
import org.eclipse.sirius.sample.UGSML.ParticleBasedConstraint;
import org.eclipse.sirius.sample.UGSML.RangeBasedConstraint;
import org.eclipse.sirius.sample.UGSML.RegenerationConstraint;
import org.eclipse.sirius.sample.UGSML.Root;
import org.eclipse.sirius.sample.UGSML.RotatorBasedAttribute;
import org.eclipse.sirius.sample.UGSML.RotatorBasedConstraint;
import org.eclipse.sirius.sample.UGSML.RotatorConstraintRule;
import org.eclipse.sirius.sample.UGSML.RotatorRangeBasedConstraint;
import org.eclipse.sirius.sample.UGSML.SelectionConstraint;
import org.eclipse.sirius.sample.UGSML.SetterDistortionConstraint;
import org.eclipse.sirius.sample.UGSML.SimpleEnumStructure;
import org.eclipse.sirius.sample.UGSML.SingleValueConstraint;
import org.eclipse.sirius.sample.UGSML.SlotConstraint;
import org.eclipse.sirius.sample.UGSML.StackConstraint;
import org.eclipse.sirius.sample.UGSML.StackWeightConstraint;
import org.eclipse.sirius.sample.UGSML.StringBasedAttribute;
import org.eclipse.sirius.sample.UGSML.StructureBasedAttribute;
import org.eclipse.sirius.sample.UGSML.StructureBasedConstraint;
import org.eclipse.sirius.sample.UGSML.TextBasedAttribute;
import org.eclipse.sirius.sample.UGSML.TextureBasedAttribute;
import org.eclipse.sirius.sample.UGSML.TextureBasedConstraint;
import org.eclipse.sirius.sample.UGSML.TransformationBasedAttribute;
import org.eclipse.sirius.sample.UGSML.TransformationBasedConstraint;
import org.eclipse.sirius.sample.UGSML.TransformationConstraintRule;
import org.eclipse.sirius.sample.UGSML.TransformationRangeBasedConstraint;
import org.eclipse.sirius.sample.UGSML.UGSMLFactory;
import org.eclipse.sirius.sample.UGSML.UGSMLPackage;
import org.eclipse.sirius.sample.UGSML.VainConstraint;
import org.eclipse.sirius.sample.UGSML.ValueBasedAttribute;
import org.eclipse.sirius.sample.UGSML.ValueBasedConstraint;
import org.eclipse.sirius.sample.UGSML.ValueConstraintRule;
import org.eclipse.sirius.sample.UGSML.ValueRangeBasedConstraint;
import org.eclipse.sirius.sample.UGSML.VariabilityType;
import org.eclipse.sirius.sample.UGSML.Vector2DBasedAttribute;
import org.eclipse.sirius.sample.UGSML.Vector2DBasedConstraint;
import org.eclipse.sirius.sample.UGSML.Vector2DConstraintRule;
import org.eclipse.sirius.sample.UGSML.Vector2DRangeBasedConstraint;
import org.eclipse.sirius.sample.UGSML.VectorBasedAttribute;
import org.eclipse.sirius.sample.UGSML.VectorBasedConstraint;
import org.eclipse.sirius.sample.UGSML.VectorConstraintRule;
import org.eclipse.sirius.sample.UGSML.VectorRangeBasedConstraint;
import org.eclipse.sirius.sample.UGSML.WeightConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UGSMLPackageImpl extends EPackageImpl implements UGSMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameFeatureContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameAttributeContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationBasedStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBasedStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass letterBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vector2DBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotatorBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textureBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameItemContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameSystemConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeSystemConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseGameConstraintRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeConstraintRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minimumValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maximumValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regenerationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass letterBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventorySystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventorySystemConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryConstraintRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autoCraftConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stackWeightConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stackConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weightConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equipItemConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass particleBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vainConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseValueConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseOrRangeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueRangeBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseValueRangedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleValueConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marginOfErrorConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directDependencyConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversionDependencyConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distortionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vector2DBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotatorBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textureBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass particleBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass letterLengthConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass letterCustomizationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueConstraintRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass letterConstraintRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vector2DRangeBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vector2DConstraintRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorConstraintRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorRangeBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotatorConstraintRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotatorRangeBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationConstraintRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationRangeBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customizationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorCustomizationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorConstraintRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleEnumStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitmaskedEnumStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameStructureContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getterDistortionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setterDistortionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animationBasedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animationBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum additionLimitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variabilityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filteringTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arithmeticOperationsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum initializationModeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.sirius.sample.UGSML.UGSMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UGSMLPackageImpl() {
		super(eNS_URI, UGSMLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UGSMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UGSMLPackage init() {
		if (isInited)
			return (UGSMLPackage) EPackage.Registry.INSTANCE.getEPackage(UGSMLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUGSMLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UGSMLPackageImpl theUGSMLPackage = registeredUGSMLPackage instanceof UGSMLPackageImpl
				? (UGSMLPackageImpl) registeredUGSMLPackage
				: new UGSMLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theUGSMLPackage.createPackageContents();

		// Initialize created meta-data
		theUGSMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUGSMLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UGSMLPackage.eNS_URI, theUGSMLPackage);
		return theUGSMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Game() {
		return (EReference) rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGame() {
		return gameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_GameTitle() {
		return (EAttribute) gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_GameFeatureContainers() {
		return (EReference) gameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_GameSystems() {
		return (EReference) gameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_GameVersionName() {
		return (EAttribute) gameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_GameVersionNumber() {
		return (EAttribute) gameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameFeatureContainer() {
		return gameFeatureContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameFeatureContainer_FeatureCategory() {
		return (EAttribute) gameFeatureContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameAttributeContainer() {
		return gameAttributeContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameAttributeContainer_GameAttributes() {
		return (EReference) gameAttributeContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameFeature() {
		return gameFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameFeature_FeatureName() {
		return (EAttribute) gameFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameAttribute() {
		return gameAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameAttribute_DataStructureArray() {
		return (EAttribute) gameAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationBasedStructure() {
		return enumerationBasedStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationBasedStructure_EnumStates() {
		return (EReference) enumerationBasedStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumState() {
		return enumStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataBasedStructure() {
		return dataBasedStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBasedStructure_StructureAttributes() {
		return (EReference) dataBasedStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanBasedAttribute() {
		return booleanBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanBasedAttribute_DefaultValue() {
		return (EAttribute) booleanBasedAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueBasedAttribute() {
		return valueBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLetterBasedAttribute() {
		return letterBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameBasedAttribute() {
		return nameBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameBasedAttribute_DefaultValue() {
		return (EAttribute) nameBasedAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringBasedAttribute() {
		return stringBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringBasedAttribute_DefaultValue() {
		return (EAttribute) stringBasedAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextBasedAttribute() {
		return textBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextBasedAttribute_DefaultValue() {
		return (EAttribute) textBasedAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVector2DBasedAttribute() {
		return vector2DBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector2DBasedAttribute_X() {
		return (EAttribute) vector2DBasedAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector2DBasedAttribute_Y() {
		return (EAttribute) vector2DBasedAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVectorBasedAttribute() {
		return vectorBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVectorBasedAttribute_X() {
		return (EAttribute) vectorBasedAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVectorBasedAttribute_Y() {
		return (EAttribute) vectorBasedAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVectorBasedAttribute_Z() {
		return (EAttribute) vectorBasedAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVectorBasedAttribute_TOwningTransformation() {
		return (EReference) vectorBasedAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVectorBasedAttribute_SOwningTransformation() {
		return (EReference) vectorBasedAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotatorBasedAttribute() {
		return rotatorBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotatorBasedAttribute_Roll() {
		return (EAttribute) rotatorBasedAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotatorBasedAttribute_Pitch() {
		return (EAttribute) rotatorBasedAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotatorBasedAttribute_Yaw() {
		return (EAttribute) rotatorBasedAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRotatorBasedAttribute_ROwningTransformation() {
		return (EReference) rotatorBasedAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationBasedAttribute() {
		return transformationBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationBasedAttribute_Translation() {
		return (EReference) transformationBasedAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationBasedAttribute_Rotation() {
		return (EReference) transformationBasedAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationBasedAttribute_Scale3D() {
		return (EReference) transformationBasedAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorBasedAttribute() {
		return colorBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorBasedAttribute_R() {
		return (EAttribute) colorBasedAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorBasedAttribute_G() {
		return (EAttribute) colorBasedAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorBasedAttribute_B() {
		return (EAttribute) colorBasedAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorBasedAttribute_A() {
		return (EAttribute) colorBasedAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextureBasedAttribute() {
		return textureBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameItemContainer() {
		return gameItemContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameItemContainer_GameItems() {
		return (EReference) gameItemContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameItem() {
		return gameItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameItem_ItemAttributeInstances() {
		return (EReference) gameItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameItem_ItemModes() {
		return (EReference) gameItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameItem_DerivedItems() {
		return (EReference) gameItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameItem_ParentItem() {
		return (EReference) gameItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameItem_PlacableInventories() {
		return (EReference) gameItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameItem_IsAbstract() {
		return (EAttribute) gameItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemMode() {
		return itemModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameSystem() {
		return gameSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameSystem_SystemName() {
		return (EAttribute) gameSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeSystem() {
		return attributeSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeSystem_ArrayConstraints() {
		return (EReference) attributeSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeSystem_SingleValueConstraints() {
		return (EReference) attributeSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeSystem_ParentAttributeSystem() {
		return (EReference) attributeSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameSystemConstraint() {
		return gameSystemConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeSystemConstraint() {
		return attributeSystemConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseGameConstraintRule() {
		return baseGameConstraintRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeConstraintRule() {
		return attributeConstraintRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayConstraint() {
		return arrayConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayConstraint_ConstrainedAttributeInstance() {
		return (EReference) arrayConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanBasedConstraint() {
		return booleanBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanBasedConstraint_ConstrainedAttributeInstance() {
		return (EReference) booleanBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueBasedConstraint() {
		return valueBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueBasedConstraint_ConstrainedAttributeInstance() {
		return (EReference) valueBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueBasedConstraint_BaseOrRangeConstraint() {
		return (EReference) valueBasedConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueBasedConstraint_MarginOfError() {
		return (EReference) valueBasedConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueBasedConstraint_RegenerationConstraint() {
		return (EReference) valueBasedConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueBasedConstraint_DirectDependencyConstraint() {
		return (EReference) valueBasedConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueBasedConstraint_DistortionConstraints() {
		return (EReference) valueBasedConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinimumValue() {
		return minimumValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMinimumValue_MinimumAttribute() {
		return (EReference) minimumValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaximumValue() {
		return maximumValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaximumValue_MaximumAttribute() {
		return (EReference) maximumValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegenerationConstraint() {
		return regenerationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegenerationConstraint_RegenerationAttribute() {
		return (EReference) regenerationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependencyConstraint() {
		return dependencyConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLetterBasedConstraint() {
		return letterBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetterBasedConstraint_ConstrainedAttributeInstance() {
		return (EReference) letterBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetterBasedConstraint_LetterLengthConstraint() {
		return (EReference) letterBasedConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetterBasedConstraint_LetterCustomizationConstraint() {
		return (EReference) letterBasedConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInventorySystem() {
		return inventorySystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInventorySystem_InventoryConstraints() {
		return (EReference) inventorySystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInventorySystem_SystemItems() {
		return (EReference) inventorySystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInventorySystemConstraint() {
		return inventorySystemConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInventorySystemConstraint_SelectionConstraint() {
		return (EReference) inventorySystemConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInventorySystemConstraint_EquipItemConstraint() {
		return (EReference) inventorySystemConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInventorySystemConstraint_SlotConstraint() {
		return (EReference) inventorySystemConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInventorySystemConstraint_StackWeightConstraint() {
		return (EReference) inventorySystemConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInventorySystemConstraint_AutoCraftConstraint() {
		return (EReference) inventorySystemConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInventorySystemConstraint_VainConstraint() {
		return (EReference) inventorySystemConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInventoryConstraintRule() {
		return inventoryConstraintRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutoCraftConstraint() {
		return autoCraftConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStackWeightConstraint() {
		return stackWeightConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStackConstraint() {
		return stackConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStackConstraint_StackAmount() {
		return (EAttribute) stackConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeightConstraint() {
		return weightConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeightConstraint_TotalWeight() {
		return (EAttribute) weightConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlotConstraint() {
		return slotConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlotConstraint_NumberOfSlots() {
		return (EAttribute) slotConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlotConstraint_MaximumSlots() {
		return (EAttribute) slotConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquipItemConstraint() {
		return equipItemConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionConstraint() {
		return selectionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionConstraint_SelectableAmount() {
		return (EAttribute) selectionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelBasedAttribute() {
		return modelBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticleBasedAttribute() {
		return particleBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVainConstraint() {
		return vainConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseValueConstraint() {
		return baseValueConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseValueConstraint_DefaultBaseValue() {
		return (EAttribute) baseValueConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseOrRangeConstraint() {
		return baseOrRangeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueRangeBasedConstraint() {
		return valueRangeBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueRangeBasedConstraint_MinimumValue() {
		return (EReference) valueRangeBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueRangeBasedConstraint_MaximumValue() {
		return (EReference) valueRangeBasedConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeBasedConstraint_Initializer() {
		return (EAttribute) valueRangeBasedConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueRangeBasedConstraint_ConversionDependencyConstraint() {
		return (EReference) valueRangeBasedConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseValueRangedConstraint() {
		return baseValueRangedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseValueRangedConstraint_RemapValue() {
		return (EAttribute) baseValueRangedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleValueConstraint() {
		return singleValueConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleValueConstraint_Variability() {
		return (EAttribute) singleValueConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarginOfErrorConstraint() {
		return marginOfErrorConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarginOfErrorConstraint_MOEAttribute() {
		return (EReference) marginOfErrorConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioBasedAttribute() {
		return audioBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterBasedAttribute() {
		return characterBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterBasedAttribute_DefaultValue() {
		return (EAttribute) characterBasedAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerBasedAttribute() {
		return integerBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerBasedAttribute_DefaultValue() {
		return (EAttribute) integerBasedAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalBasedAttribute() {
		return decimalBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalBasedAttribute_DefaultValue() {
		return (EAttribute) decimalBasedAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectDependencyConstraint() {
		return directDependencyConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectDependencyConstraint_DependentAttributes() {
		return (EReference) directDependencyConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectDependencyConstraint_DependencyFormula() {
		return (EAttribute) directDependencyConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConversionDependencyConstraint() {
		return conversionDependencyConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionDependencyConstraint_AttributeName() {
		return (EAttribute) conversionDependencyConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionDependencyConstraint_ConversionUnitToBase() {
		return (EAttribute) conversionDependencyConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionDependencyConstraint_ConversionChain() {
		return (EReference) conversionDependencyConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionDependencyConstraint_ValueRangeBasedConstraint() {
		return (EReference) conversionDependencyConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionDependencyConstraint_NextAttributeInChain() {
		return (EReference) conversionDependencyConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionDependencyConstraint_ConversionRate() {
		return (EAttribute) conversionDependencyConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistortionConstraint() {
		return distortionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistortionConstraint_DistortionAttribute() {
		return (EReference) distortionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistortionConstraint_DistortionMode() {
		return (EAttribute) distortionConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVector2DBasedConstraint() {
		return vector2DBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVector2DBasedConstraint_ConstrainedAttributeInstance() {
		return (EReference) vector2DBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVector2DBasedConstraint_Vector2DRangeBasedConstraint() {
		return (EReference) vector2DBasedConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVectorBasedConstraint() {
		return vectorBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVectorBasedConstraint_ConstrainedAttributeInstance() {
		return (EReference) vectorBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVectorBasedConstraint_VectorRangeBasedConstraint() {
		return (EReference) vectorBasedConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotatorBasedConstraint() {
		return rotatorBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRotatorBasedConstraint_ConstrainedAttributeInstance() {
		return (EReference) rotatorBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRotatorBasedConstraint_RotatorRangeBasedConstraint() {
		return (EReference) rotatorBasedConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationBasedConstraint() {
		return transformationBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationBasedConstraint_ConstrainedAttributeInstance() {
		return (EReference) transformationBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationBasedConstraint_TransformationRangeBasedConstraint() {
		return (EReference) transformationBasedConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorBasedConstraint() {
		return colorBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColorBasedConstraint_ConstrainedAttributeInstance() {
		return (EReference) colorBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColorBasedConstraint_ColorCustomizationConstraint() {
		return (EReference) colorBasedConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextureBasedConstraint() {
		return textureBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextureBasedConstraint_ConstrainedAttributeInstance() {
		return (EReference) textureBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelBasedConstraint() {
		return modelBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelBasedConstraint_ConstrainedAttributeInstance() {
		return (EReference) modelBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticleBasedConstraint() {
		return particleBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticleBasedConstraint_ConstrainedAttributeInstance() {
		return (EReference) particleBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioBasedConstraint() {
		return audioBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioBasedConstraint_ConstrainedAttributeInstance() {
		return (EReference) audioBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLetterLengthConstraint() {
		return letterLengthConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetterLengthConstraint_MaximumLengthAttribute() {
		return (EReference) letterLengthConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetterLengthConstraint_MinimumLengthAttribute() {
		return (EReference) letterLengthConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLetterCustomizationConstraint() {
		return letterCustomizationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetterCustomizationConstraint_FilterStrings() {
		return (EReference) letterCustomizationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueConstraintRule() {
		return valueConstraintRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLetterConstraintRule() {
		return letterConstraintRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVector2DRangeBasedConstraint() {
		return vector2DRangeBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVector2DRangeBasedConstraint_MinimumVector2DAttribute() {
		return (EReference) vector2DRangeBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVector2DRangeBasedConstraint_MaximumVector2DAttribute() {
		return (EReference) vector2DRangeBasedConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVector2DConstraintRule() {
		return vector2DConstraintRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVectorConstraintRule() {
		return vectorConstraintRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVectorRangeBasedConstraint() {
		return vectorRangeBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVectorRangeBasedConstraint_MaximumVectorAttribute() {
		return (EReference) vectorRangeBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVectorRangeBasedConstraint_MinimumVectorAttribute() {
		return (EReference) vectorRangeBasedConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeBasedConstraint() {
		return rangeBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeBasedConstraint_Limit() {
		return (EAttribute) rangeBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotatorConstraintRule() {
		return rotatorConstraintRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotatorRangeBasedConstraint() {
		return rotatorRangeBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRotatorRangeBasedConstraint_MaximumRotatorAttribute() {
		return (EReference) rotatorRangeBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRotatorRangeBasedConstraint_MinimumRotatorAttribute() {
		return (EReference) rotatorRangeBasedConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationConstraintRule() {
		return transformationConstraintRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationRangeBasedConstraint() {
		return transformationRangeBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationRangeBasedConstraint_MaximumTransformationAttribute() {
		return (EReference) transformationRangeBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationRangeBasedConstraint_MinimumTransformationAttribute() {
		return (EReference) transformationRangeBasedConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomizationType() {
		return customizationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomizationType_FilterType() {
		return (EAttribute) customizationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorCustomizationConstraint() {
		return colorCustomizationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColorCustomizationConstraint_FilterColors() {
		return (EReference) colorCustomizationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorConstraintRule() {
		return colorConstraintRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumBasedConstraint() {
		return enumBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumBasedConstraint_ConstrainedAttributeInstance() {
		return (EReference) enumBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleEnumStructure() {
		return simpleEnumStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitmaskedEnumStructure() {
		return bitmaskedEnumStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameStructureContainer() {
		return gameStructureContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameStructureContainer_GameStructures() {
		return (EReference) gameStructureContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameStructure() {
		return gameStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumBasedAttribute() {
		return enumBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumBasedAttribute_EnumType() {
		return (EReference) enumBasedAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureBasedAttribute() {
		return structureBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureBasedAttribute_DataType() {
		return (EReference) structureBasedAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureBasedConstraint() {
		return structureBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureBasedConstraint_ConstrainedAttributeInstance() {
		return (EReference) structureBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetterDistortionConstraint() {
		return getterDistortionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetterDistortionConstraint() {
		return setterDistortionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterialBasedConstraint() {
		return materialBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialBasedConstraint_ConstrainedAttributeInstance() {
		return (EReference) materialBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterialBasedAttribute() {
		return materialBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimationBasedAttribute() {
		return animationBasedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimationBasedConstraint() {
		return animationBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationBasedConstraint_ConstrainedAttributeInstance() {
		return (EReference) animationBasedConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdditionLimit() {
		return additionLimitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariabilityType() {
		return variabilityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFilteringType() {
		return filteringTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArithmeticOperations() {
		return arithmeticOperationsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInitializationMode() {
		return initializationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UGSMLFactory getUGSMLFactory() {
		return (UGSMLFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__GAME);

		gameEClass = createEClass(GAME);
		createEAttribute(gameEClass, GAME__GAME_TITLE);
		createEReference(gameEClass, GAME__GAME_FEATURE_CONTAINERS);
		createEReference(gameEClass, GAME__GAME_SYSTEMS);
		createEAttribute(gameEClass, GAME__GAME_VERSION_NAME);
		createEAttribute(gameEClass, GAME__GAME_VERSION_NUMBER);

		gameFeatureContainerEClass = createEClass(GAME_FEATURE_CONTAINER);
		createEAttribute(gameFeatureContainerEClass, GAME_FEATURE_CONTAINER__FEATURE_CATEGORY);

		gameAttributeContainerEClass = createEClass(GAME_ATTRIBUTE_CONTAINER);
		createEReference(gameAttributeContainerEClass, GAME_ATTRIBUTE_CONTAINER__GAME_ATTRIBUTES);

		gameFeatureEClass = createEClass(GAME_FEATURE);
		createEAttribute(gameFeatureEClass, GAME_FEATURE__FEATURE_NAME);

		gameAttributeEClass = createEClass(GAME_ATTRIBUTE);
		createEAttribute(gameAttributeEClass, GAME_ATTRIBUTE__DATA_STRUCTURE_ARRAY);

		enumerationBasedStructureEClass = createEClass(ENUMERATION_BASED_STRUCTURE);
		createEReference(enumerationBasedStructureEClass, ENUMERATION_BASED_STRUCTURE__ENUM_STATES);

		enumStateEClass = createEClass(ENUM_STATE);

		dataBasedStructureEClass = createEClass(DATA_BASED_STRUCTURE);
		createEReference(dataBasedStructureEClass, DATA_BASED_STRUCTURE__STRUCTURE_ATTRIBUTES);

		booleanBasedAttributeEClass = createEClass(BOOLEAN_BASED_ATTRIBUTE);
		createEAttribute(booleanBasedAttributeEClass, BOOLEAN_BASED_ATTRIBUTE__DEFAULT_VALUE);

		valueBasedAttributeEClass = createEClass(VALUE_BASED_ATTRIBUTE);

		letterBasedAttributeEClass = createEClass(LETTER_BASED_ATTRIBUTE);

		nameBasedAttributeEClass = createEClass(NAME_BASED_ATTRIBUTE);
		createEAttribute(nameBasedAttributeEClass, NAME_BASED_ATTRIBUTE__DEFAULT_VALUE);

		stringBasedAttributeEClass = createEClass(STRING_BASED_ATTRIBUTE);
		createEAttribute(stringBasedAttributeEClass, STRING_BASED_ATTRIBUTE__DEFAULT_VALUE);

		textBasedAttributeEClass = createEClass(TEXT_BASED_ATTRIBUTE);
		createEAttribute(textBasedAttributeEClass, TEXT_BASED_ATTRIBUTE__DEFAULT_VALUE);

		vector2DBasedAttributeEClass = createEClass(VECTOR2_DBASED_ATTRIBUTE);
		createEAttribute(vector2DBasedAttributeEClass, VECTOR2_DBASED_ATTRIBUTE__X);
		createEAttribute(vector2DBasedAttributeEClass, VECTOR2_DBASED_ATTRIBUTE__Y);

		vectorBasedAttributeEClass = createEClass(VECTOR_BASED_ATTRIBUTE);
		createEAttribute(vectorBasedAttributeEClass, VECTOR_BASED_ATTRIBUTE__X);
		createEAttribute(vectorBasedAttributeEClass, VECTOR_BASED_ATTRIBUTE__Y);
		createEAttribute(vectorBasedAttributeEClass, VECTOR_BASED_ATTRIBUTE__Z);
		createEReference(vectorBasedAttributeEClass, VECTOR_BASED_ATTRIBUTE__TOWNING_TRANSFORMATION);
		createEReference(vectorBasedAttributeEClass, VECTOR_BASED_ATTRIBUTE__SOWNING_TRANSFORMATION);

		rotatorBasedAttributeEClass = createEClass(ROTATOR_BASED_ATTRIBUTE);
		createEAttribute(rotatorBasedAttributeEClass, ROTATOR_BASED_ATTRIBUTE__ROLL);
		createEAttribute(rotatorBasedAttributeEClass, ROTATOR_BASED_ATTRIBUTE__PITCH);
		createEAttribute(rotatorBasedAttributeEClass, ROTATOR_BASED_ATTRIBUTE__YAW);
		createEReference(rotatorBasedAttributeEClass, ROTATOR_BASED_ATTRIBUTE__ROWNING_TRANSFORMATION);

		transformationBasedAttributeEClass = createEClass(TRANSFORMATION_BASED_ATTRIBUTE);
		createEReference(transformationBasedAttributeEClass, TRANSFORMATION_BASED_ATTRIBUTE__TRANSLATION);
		createEReference(transformationBasedAttributeEClass, TRANSFORMATION_BASED_ATTRIBUTE__ROTATION);
		createEReference(transformationBasedAttributeEClass, TRANSFORMATION_BASED_ATTRIBUTE__SCALE3_D);

		colorBasedAttributeEClass = createEClass(COLOR_BASED_ATTRIBUTE);
		createEAttribute(colorBasedAttributeEClass, COLOR_BASED_ATTRIBUTE__R);
		createEAttribute(colorBasedAttributeEClass, COLOR_BASED_ATTRIBUTE__G);
		createEAttribute(colorBasedAttributeEClass, COLOR_BASED_ATTRIBUTE__B);
		createEAttribute(colorBasedAttributeEClass, COLOR_BASED_ATTRIBUTE__A);

		textureBasedAttributeEClass = createEClass(TEXTURE_BASED_ATTRIBUTE);

		gameItemContainerEClass = createEClass(GAME_ITEM_CONTAINER);
		createEReference(gameItemContainerEClass, GAME_ITEM_CONTAINER__GAME_ITEMS);

		gameItemEClass = createEClass(GAME_ITEM);
		createEReference(gameItemEClass, GAME_ITEM__ITEM_ATTRIBUTE_INSTANCES);
		createEReference(gameItemEClass, GAME_ITEM__ITEM_MODES);
		createEReference(gameItemEClass, GAME_ITEM__DERIVED_ITEMS);
		createEReference(gameItemEClass, GAME_ITEM__PARENT_ITEM);
		createEReference(gameItemEClass, GAME_ITEM__PLACABLE_INVENTORIES);
		createEAttribute(gameItemEClass, GAME_ITEM__IS_ABSTRACT);

		itemModeEClass = createEClass(ITEM_MODE);

		gameSystemEClass = createEClass(GAME_SYSTEM);
		createEAttribute(gameSystemEClass, GAME_SYSTEM__SYSTEM_NAME);

		attributeSystemEClass = createEClass(ATTRIBUTE_SYSTEM);
		createEReference(attributeSystemEClass, ATTRIBUTE_SYSTEM__ARRAY_CONSTRAINTS);
		createEReference(attributeSystemEClass, ATTRIBUTE_SYSTEM__SINGLE_VALUE_CONSTRAINTS);
		createEReference(attributeSystemEClass, ATTRIBUTE_SYSTEM__PARENT_ATTRIBUTE_SYSTEM);

		gameSystemConstraintEClass = createEClass(GAME_SYSTEM_CONSTRAINT);

		attributeSystemConstraintEClass = createEClass(ATTRIBUTE_SYSTEM_CONSTRAINT);

		baseGameConstraintRuleEClass = createEClass(BASE_GAME_CONSTRAINT_RULE);

		attributeConstraintRuleEClass = createEClass(ATTRIBUTE_CONSTRAINT_RULE);

		arrayConstraintEClass = createEClass(ARRAY_CONSTRAINT);
		createEReference(arrayConstraintEClass, ARRAY_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE);

		booleanBasedConstraintEClass = createEClass(BOOLEAN_BASED_CONSTRAINT);
		createEReference(booleanBasedConstraintEClass, BOOLEAN_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE);

		valueBasedConstraintEClass = createEClass(VALUE_BASED_CONSTRAINT);
		createEReference(valueBasedConstraintEClass, VALUE_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE);
		createEReference(valueBasedConstraintEClass, VALUE_BASED_CONSTRAINT__BASE_OR_RANGE_CONSTRAINT);
		createEReference(valueBasedConstraintEClass, VALUE_BASED_CONSTRAINT__MARGIN_OF_ERROR);
		createEReference(valueBasedConstraintEClass, VALUE_BASED_CONSTRAINT__REGENERATION_CONSTRAINT);
		createEReference(valueBasedConstraintEClass, VALUE_BASED_CONSTRAINT__DIRECT_DEPENDENCY_CONSTRAINT);
		createEReference(valueBasedConstraintEClass, VALUE_BASED_CONSTRAINT__DISTORTION_CONSTRAINTS);

		minimumValueEClass = createEClass(MINIMUM_VALUE);
		createEReference(minimumValueEClass, MINIMUM_VALUE__MINIMUM_ATTRIBUTE);

		maximumValueEClass = createEClass(MAXIMUM_VALUE);
		createEReference(maximumValueEClass, MAXIMUM_VALUE__MAXIMUM_ATTRIBUTE);

		regenerationConstraintEClass = createEClass(REGENERATION_CONSTRAINT);
		createEReference(regenerationConstraintEClass, REGENERATION_CONSTRAINT__REGENERATION_ATTRIBUTE);

		dependencyConstraintEClass = createEClass(DEPENDENCY_CONSTRAINT);

		letterBasedConstraintEClass = createEClass(LETTER_BASED_CONSTRAINT);
		createEReference(letterBasedConstraintEClass, LETTER_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE);
		createEReference(letterBasedConstraintEClass, LETTER_BASED_CONSTRAINT__LETTER_LENGTH_CONSTRAINT);
		createEReference(letterBasedConstraintEClass, LETTER_BASED_CONSTRAINT__LETTER_CUSTOMIZATION_CONSTRAINT);

		inventorySystemEClass = createEClass(INVENTORY_SYSTEM);
		createEReference(inventorySystemEClass, INVENTORY_SYSTEM__INVENTORY_CONSTRAINTS);
		createEReference(inventorySystemEClass, INVENTORY_SYSTEM__SYSTEM_ITEMS);

		inventorySystemConstraintEClass = createEClass(INVENTORY_SYSTEM_CONSTRAINT);
		createEReference(inventorySystemConstraintEClass, INVENTORY_SYSTEM_CONSTRAINT__SELECTION_CONSTRAINT);
		createEReference(inventorySystemConstraintEClass, INVENTORY_SYSTEM_CONSTRAINT__EQUIP_ITEM_CONSTRAINT);
		createEReference(inventorySystemConstraintEClass, INVENTORY_SYSTEM_CONSTRAINT__SLOT_CONSTRAINT);
		createEReference(inventorySystemConstraintEClass, INVENTORY_SYSTEM_CONSTRAINT__STACK_WEIGHT_CONSTRAINT);
		createEReference(inventorySystemConstraintEClass, INVENTORY_SYSTEM_CONSTRAINT__AUTO_CRAFT_CONSTRAINT);
		createEReference(inventorySystemConstraintEClass, INVENTORY_SYSTEM_CONSTRAINT__VAIN_CONSTRAINT);

		inventoryConstraintRuleEClass = createEClass(INVENTORY_CONSTRAINT_RULE);

		autoCraftConstraintEClass = createEClass(AUTO_CRAFT_CONSTRAINT);

		stackWeightConstraintEClass = createEClass(STACK_WEIGHT_CONSTRAINT);

		stackConstraintEClass = createEClass(STACK_CONSTRAINT);
		createEAttribute(stackConstraintEClass, STACK_CONSTRAINT__STACK_AMOUNT);

		weightConstraintEClass = createEClass(WEIGHT_CONSTRAINT);
		createEAttribute(weightConstraintEClass, WEIGHT_CONSTRAINT__TOTAL_WEIGHT);

		slotConstraintEClass = createEClass(SLOT_CONSTRAINT);
		createEAttribute(slotConstraintEClass, SLOT_CONSTRAINT__NUMBER_OF_SLOTS);
		createEAttribute(slotConstraintEClass, SLOT_CONSTRAINT__MAXIMUM_SLOTS);

		equipItemConstraintEClass = createEClass(EQUIP_ITEM_CONSTRAINT);

		selectionConstraintEClass = createEClass(SELECTION_CONSTRAINT);
		createEAttribute(selectionConstraintEClass, SELECTION_CONSTRAINT__SELECTABLE_AMOUNT);

		modelBasedAttributeEClass = createEClass(MODEL_BASED_ATTRIBUTE);

		particleBasedAttributeEClass = createEClass(PARTICLE_BASED_ATTRIBUTE);

		vainConstraintEClass = createEClass(VAIN_CONSTRAINT);

		baseValueConstraintEClass = createEClass(BASE_VALUE_CONSTRAINT);
		createEAttribute(baseValueConstraintEClass, BASE_VALUE_CONSTRAINT__DEFAULT_BASE_VALUE);

		baseOrRangeConstraintEClass = createEClass(BASE_OR_RANGE_CONSTRAINT);

		valueRangeBasedConstraintEClass = createEClass(VALUE_RANGE_BASED_CONSTRAINT);
		createEReference(valueRangeBasedConstraintEClass, VALUE_RANGE_BASED_CONSTRAINT__MINIMUM_VALUE);
		createEReference(valueRangeBasedConstraintEClass, VALUE_RANGE_BASED_CONSTRAINT__MAXIMUM_VALUE);
		createEAttribute(valueRangeBasedConstraintEClass, VALUE_RANGE_BASED_CONSTRAINT__INITIALIZER);
		createEReference(valueRangeBasedConstraintEClass,
				VALUE_RANGE_BASED_CONSTRAINT__CONVERSION_DEPENDENCY_CONSTRAINT);

		baseValueRangedConstraintEClass = createEClass(BASE_VALUE_RANGED_CONSTRAINT);
		createEAttribute(baseValueRangedConstraintEClass, BASE_VALUE_RANGED_CONSTRAINT__REMAP_VALUE);

		singleValueConstraintEClass = createEClass(SINGLE_VALUE_CONSTRAINT);
		createEAttribute(singleValueConstraintEClass, SINGLE_VALUE_CONSTRAINT__VARIABILITY);

		marginOfErrorConstraintEClass = createEClass(MARGIN_OF_ERROR_CONSTRAINT);
		createEReference(marginOfErrorConstraintEClass, MARGIN_OF_ERROR_CONSTRAINT__MOE_ATTRIBUTE);

		audioBasedAttributeEClass = createEClass(AUDIO_BASED_ATTRIBUTE);

		characterBasedAttributeEClass = createEClass(CHARACTER_BASED_ATTRIBUTE);
		createEAttribute(characterBasedAttributeEClass, CHARACTER_BASED_ATTRIBUTE__DEFAULT_VALUE);

		integerBasedAttributeEClass = createEClass(INTEGER_BASED_ATTRIBUTE);
		createEAttribute(integerBasedAttributeEClass, INTEGER_BASED_ATTRIBUTE__DEFAULT_VALUE);

		decimalBasedAttributeEClass = createEClass(DECIMAL_BASED_ATTRIBUTE);
		createEAttribute(decimalBasedAttributeEClass, DECIMAL_BASED_ATTRIBUTE__DEFAULT_VALUE);

		directDependencyConstraintEClass = createEClass(DIRECT_DEPENDENCY_CONSTRAINT);
		createEReference(directDependencyConstraintEClass, DIRECT_DEPENDENCY_CONSTRAINT__DEPENDENT_ATTRIBUTES);
		createEAttribute(directDependencyConstraintEClass, DIRECT_DEPENDENCY_CONSTRAINT__DEPENDENCY_FORMULA);

		conversionDependencyConstraintEClass = createEClass(CONVERSION_DEPENDENCY_CONSTRAINT);
		createEAttribute(conversionDependencyConstraintEClass, CONVERSION_DEPENDENCY_CONSTRAINT__ATTRIBUTE_NAME);
		createEAttribute(conversionDependencyConstraintEClass,
				CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_UNIT_TO_BASE);
		createEReference(conversionDependencyConstraintEClass, CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_CHAIN);
		createEReference(conversionDependencyConstraintEClass,
				CONVERSION_DEPENDENCY_CONSTRAINT__VALUE_RANGE_BASED_CONSTRAINT);
		createEReference(conversionDependencyConstraintEClass,
				CONVERSION_DEPENDENCY_CONSTRAINT__NEXT_ATTRIBUTE_IN_CHAIN);
		createEAttribute(conversionDependencyConstraintEClass, CONVERSION_DEPENDENCY_CONSTRAINT__CONVERSION_RATE);

		distortionConstraintEClass = createEClass(DISTORTION_CONSTRAINT);
		createEReference(distortionConstraintEClass, DISTORTION_CONSTRAINT__DISTORTION_ATTRIBUTE);
		createEAttribute(distortionConstraintEClass, DISTORTION_CONSTRAINT__DISTORTION_MODE);

		vector2DBasedConstraintEClass = createEClass(VECTOR2_DBASED_CONSTRAINT);
		createEReference(vector2DBasedConstraintEClass, VECTOR2_DBASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE);
		createEReference(vector2DBasedConstraintEClass, VECTOR2_DBASED_CONSTRAINT__VECTOR2_DRANGE_BASED_CONSTRAINT);

		vectorBasedConstraintEClass = createEClass(VECTOR_BASED_CONSTRAINT);
		createEReference(vectorBasedConstraintEClass, VECTOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE);
		createEReference(vectorBasedConstraintEClass, VECTOR_BASED_CONSTRAINT__VECTOR_RANGE_BASED_CONSTRAINT);

		rotatorBasedConstraintEClass = createEClass(ROTATOR_BASED_CONSTRAINT);
		createEReference(rotatorBasedConstraintEClass, ROTATOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE);
		createEReference(rotatorBasedConstraintEClass, ROTATOR_BASED_CONSTRAINT__ROTATOR_RANGE_BASED_CONSTRAINT);

		transformationBasedConstraintEClass = createEClass(TRANSFORMATION_BASED_CONSTRAINT);
		createEReference(transformationBasedConstraintEClass,
				TRANSFORMATION_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE);
		createEReference(transformationBasedConstraintEClass,
				TRANSFORMATION_BASED_CONSTRAINT__TRANSFORMATION_RANGE_BASED_CONSTRAINT);

		colorBasedConstraintEClass = createEClass(COLOR_BASED_CONSTRAINT);
		createEReference(colorBasedConstraintEClass, COLOR_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE);
		createEReference(colorBasedConstraintEClass, COLOR_BASED_CONSTRAINT__COLOR_CUSTOMIZATION_CONSTRAINT);

		textureBasedConstraintEClass = createEClass(TEXTURE_BASED_CONSTRAINT);
		createEReference(textureBasedConstraintEClass, TEXTURE_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE);

		modelBasedConstraintEClass = createEClass(MODEL_BASED_CONSTRAINT);
		createEReference(modelBasedConstraintEClass, MODEL_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE);

		particleBasedConstraintEClass = createEClass(PARTICLE_BASED_CONSTRAINT);
		createEReference(particleBasedConstraintEClass, PARTICLE_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE);

		audioBasedConstraintEClass = createEClass(AUDIO_BASED_CONSTRAINT);
		createEReference(audioBasedConstraintEClass, AUDIO_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE);

		letterLengthConstraintEClass = createEClass(LETTER_LENGTH_CONSTRAINT);
		createEReference(letterLengthConstraintEClass, LETTER_LENGTH_CONSTRAINT__MAXIMUM_LENGTH_ATTRIBUTE);
		createEReference(letterLengthConstraintEClass, LETTER_LENGTH_CONSTRAINT__MINIMUM_LENGTH_ATTRIBUTE);

		letterCustomizationConstraintEClass = createEClass(LETTER_CUSTOMIZATION_CONSTRAINT);
		createEReference(letterCustomizationConstraintEClass, LETTER_CUSTOMIZATION_CONSTRAINT__FILTER_STRINGS);

		valueConstraintRuleEClass = createEClass(VALUE_CONSTRAINT_RULE);

		letterConstraintRuleEClass = createEClass(LETTER_CONSTRAINT_RULE);

		vector2DRangeBasedConstraintEClass = createEClass(VECTOR2_DRANGE_BASED_CONSTRAINT);
		createEReference(vector2DRangeBasedConstraintEClass,
				VECTOR2_DRANGE_BASED_CONSTRAINT__MINIMUM_VECTOR2_DATTRIBUTE);
		createEReference(vector2DRangeBasedConstraintEClass,
				VECTOR2_DRANGE_BASED_CONSTRAINT__MAXIMUM_VECTOR2_DATTRIBUTE);

		vector2DConstraintRuleEClass = createEClass(VECTOR2_DCONSTRAINT_RULE);

		vectorConstraintRuleEClass = createEClass(VECTOR_CONSTRAINT_RULE);

		vectorRangeBasedConstraintEClass = createEClass(VECTOR_RANGE_BASED_CONSTRAINT);
		createEReference(vectorRangeBasedConstraintEClass, VECTOR_RANGE_BASED_CONSTRAINT__MAXIMUM_VECTOR_ATTRIBUTE);
		createEReference(vectorRangeBasedConstraintEClass, VECTOR_RANGE_BASED_CONSTRAINT__MINIMUM_VECTOR_ATTRIBUTE);

		rangeBasedConstraintEClass = createEClass(RANGE_BASED_CONSTRAINT);
		createEAttribute(rangeBasedConstraintEClass, RANGE_BASED_CONSTRAINT__LIMIT);

		rotatorConstraintRuleEClass = createEClass(ROTATOR_CONSTRAINT_RULE);

		rotatorRangeBasedConstraintEClass = createEClass(ROTATOR_RANGE_BASED_CONSTRAINT);
		createEReference(rotatorRangeBasedConstraintEClass, ROTATOR_RANGE_BASED_CONSTRAINT__MAXIMUM_ROTATOR_ATTRIBUTE);
		createEReference(rotatorRangeBasedConstraintEClass, ROTATOR_RANGE_BASED_CONSTRAINT__MINIMUM_ROTATOR_ATTRIBUTE);

		transformationConstraintRuleEClass = createEClass(TRANSFORMATION_CONSTRAINT_RULE);

		transformationRangeBasedConstraintEClass = createEClass(TRANSFORMATION_RANGE_BASED_CONSTRAINT);
		createEReference(transformationRangeBasedConstraintEClass,
				TRANSFORMATION_RANGE_BASED_CONSTRAINT__MAXIMUM_TRANSFORMATION_ATTRIBUTE);
		createEReference(transformationRangeBasedConstraintEClass,
				TRANSFORMATION_RANGE_BASED_CONSTRAINT__MINIMUM_TRANSFORMATION_ATTRIBUTE);

		customizationTypeEClass = createEClass(CUSTOMIZATION_TYPE);
		createEAttribute(customizationTypeEClass, CUSTOMIZATION_TYPE__FILTER_TYPE);

		colorCustomizationConstraintEClass = createEClass(COLOR_CUSTOMIZATION_CONSTRAINT);
		createEReference(colorCustomizationConstraintEClass, COLOR_CUSTOMIZATION_CONSTRAINT__FILTER_COLORS);

		colorConstraintRuleEClass = createEClass(COLOR_CONSTRAINT_RULE);

		enumBasedConstraintEClass = createEClass(ENUM_BASED_CONSTRAINT);
		createEReference(enumBasedConstraintEClass, ENUM_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE);

		simpleEnumStructureEClass = createEClass(SIMPLE_ENUM_STRUCTURE);

		bitmaskedEnumStructureEClass = createEClass(BITMASKED_ENUM_STRUCTURE);

		gameStructureContainerEClass = createEClass(GAME_STRUCTURE_CONTAINER);
		createEReference(gameStructureContainerEClass, GAME_STRUCTURE_CONTAINER__GAME_STRUCTURES);

		gameStructureEClass = createEClass(GAME_STRUCTURE);

		enumBasedAttributeEClass = createEClass(ENUM_BASED_ATTRIBUTE);
		createEReference(enumBasedAttributeEClass, ENUM_BASED_ATTRIBUTE__ENUM_TYPE);

		structureBasedAttributeEClass = createEClass(STRUCTURE_BASED_ATTRIBUTE);
		createEReference(structureBasedAttributeEClass, STRUCTURE_BASED_ATTRIBUTE__DATA_TYPE);

		structureBasedConstraintEClass = createEClass(STRUCTURE_BASED_CONSTRAINT);
		createEReference(structureBasedConstraintEClass, STRUCTURE_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE);

		getterDistortionConstraintEClass = createEClass(GETTER_DISTORTION_CONSTRAINT);

		setterDistortionConstraintEClass = createEClass(SETTER_DISTORTION_CONSTRAINT);

		materialBasedConstraintEClass = createEClass(MATERIAL_BASED_CONSTRAINT);
		createEReference(materialBasedConstraintEClass, MATERIAL_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE);

		materialBasedAttributeEClass = createEClass(MATERIAL_BASED_ATTRIBUTE);

		animationBasedAttributeEClass = createEClass(ANIMATION_BASED_ATTRIBUTE);

		animationBasedConstraintEClass = createEClass(ANIMATION_BASED_CONSTRAINT);
		createEReference(animationBasedConstraintEClass, ANIMATION_BASED_CONSTRAINT__CONSTRAINED_ATTRIBUTE_INSTANCE);

		// Create enums
		additionLimitEEnum = createEEnum(ADDITION_LIMIT);
		variabilityTypeEEnum = createEEnum(VARIABILITY_TYPE);
		filteringTypeEEnum = createEEnum(FILTERING_TYPE);
		arithmeticOperationsEEnum = createEEnum(ARITHMETIC_OPERATIONS);
		initializationModeEEnum = createEEnum(INITIALIZATION_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gameAttributeContainerEClass.getESuperTypes().add(this.getGameFeatureContainer());
		gameAttributeEClass.getESuperTypes().add(this.getGameFeature());
		enumerationBasedStructureEClass.getESuperTypes().add(this.getGameStructure());
		enumStateEClass.getESuperTypes().add(this.getGameFeature());
		dataBasedStructureEClass.getESuperTypes().add(this.getGameStructure());
		booleanBasedAttributeEClass.getESuperTypes().add(this.getGameAttribute());
		valueBasedAttributeEClass.getESuperTypes().add(this.getGameAttribute());
		letterBasedAttributeEClass.getESuperTypes().add(this.getGameAttribute());
		nameBasedAttributeEClass.getESuperTypes().add(this.getLetterBasedAttribute());
		stringBasedAttributeEClass.getESuperTypes().add(this.getLetterBasedAttribute());
		textBasedAttributeEClass.getESuperTypes().add(this.getLetterBasedAttribute());
		vector2DBasedAttributeEClass.getESuperTypes().add(this.getGameAttribute());
		vectorBasedAttributeEClass.getESuperTypes().add(this.getGameAttribute());
		rotatorBasedAttributeEClass.getESuperTypes().add(this.getGameAttribute());
		transformationBasedAttributeEClass.getESuperTypes().add(this.getGameAttribute());
		colorBasedAttributeEClass.getESuperTypes().add(this.getGameAttribute());
		textureBasedAttributeEClass.getESuperTypes().add(this.getGameAttribute());
		gameItemContainerEClass.getESuperTypes().add(this.getGameFeatureContainer());
		gameItemEClass.getESuperTypes().add(this.getGameFeature());
		attributeSystemEClass.getESuperTypes().add(this.getGameSystem());
		attributeSystemConstraintEClass.getESuperTypes().add(this.getGameSystemConstraint());
		attributeConstraintRuleEClass.getESuperTypes().add(this.getBaseGameConstraintRule());
		arrayConstraintEClass.getESuperTypes().add(this.getAttributeSystemConstraint());
		booleanBasedConstraintEClass.getESuperTypes().add(this.getSingleValueConstraint());
		valueBasedConstraintEClass.getESuperTypes().add(this.getSingleValueConstraint());
		minimumValueEClass.getESuperTypes().add(this.getBaseValueRangedConstraint());
		maximumValueEClass.getESuperTypes().add(this.getBaseValueRangedConstraint());
		regenerationConstraintEClass.getESuperTypes().add(this.getValueConstraintRule());
		dependencyConstraintEClass.getESuperTypes().add(this.getValueConstraintRule());
		letterBasedConstraintEClass.getESuperTypes().add(this.getSingleValueConstraint());
		inventorySystemEClass.getESuperTypes().add(this.getGameSystem());
		inventorySystemConstraintEClass.getESuperTypes().add(this.getGameSystemConstraint());
		inventoryConstraintRuleEClass.getESuperTypes().add(this.getBaseGameConstraintRule());
		autoCraftConstraintEClass.getESuperTypes().add(this.getInventoryConstraintRule());
		stackWeightConstraintEClass.getESuperTypes().add(this.getInventoryConstraintRule());
		stackConstraintEClass.getESuperTypes().add(this.getStackWeightConstraint());
		weightConstraintEClass.getESuperTypes().add(this.getStackWeightConstraint());
		slotConstraintEClass.getESuperTypes().add(this.getInventoryConstraintRule());
		equipItemConstraintEClass.getESuperTypes().add(this.getInventoryConstraintRule());
		selectionConstraintEClass.getESuperTypes().add(this.getInventoryConstraintRule());
		modelBasedAttributeEClass.getESuperTypes().add(this.getGameAttribute());
		particleBasedAttributeEClass.getESuperTypes().add(this.getGameAttribute());
		vainConstraintEClass.getESuperTypes().add(this.getInventoryConstraintRule());
		baseValueConstraintEClass.getESuperTypes().add(this.getBaseOrRangeConstraint());
		baseOrRangeConstraintEClass.getESuperTypes().add(this.getValueConstraintRule());
		valueRangeBasedConstraintEClass.getESuperTypes().add(this.getBaseOrRangeConstraint());
		valueRangeBasedConstraintEClass.getESuperTypes().add(this.getRangeBasedConstraint());
		baseValueRangedConstraintEClass.getESuperTypes().add(this.getValueConstraintRule());
		singleValueConstraintEClass.getESuperTypes().add(this.getAttributeSystemConstraint());
		marginOfErrorConstraintEClass.getESuperTypes().add(this.getValueConstraintRule());
		audioBasedAttributeEClass.getESuperTypes().add(this.getGameAttribute());
		characterBasedAttributeEClass.getESuperTypes().add(this.getLetterBasedAttribute());
		integerBasedAttributeEClass.getESuperTypes().add(this.getValueBasedAttribute());
		decimalBasedAttributeEClass.getESuperTypes().add(this.getValueBasedAttribute());
		directDependencyConstraintEClass.getESuperTypes().add(this.getDependencyConstraint());
		conversionDependencyConstraintEClass.getESuperTypes().add(this.getDependencyConstraint());
		distortionConstraintEClass.getESuperTypes().add(this.getValueConstraintRule());
		vector2DBasedConstraintEClass.getESuperTypes().add(this.getSingleValueConstraint());
		vectorBasedConstraintEClass.getESuperTypes().add(this.getSingleValueConstraint());
		rotatorBasedConstraintEClass.getESuperTypes().add(this.getSingleValueConstraint());
		transformationBasedConstraintEClass.getESuperTypes().add(this.getSingleValueConstraint());
		colorBasedConstraintEClass.getESuperTypes().add(this.getSingleValueConstraint());
		textureBasedConstraintEClass.getESuperTypes().add(this.getSingleValueConstraint());
		modelBasedConstraintEClass.getESuperTypes().add(this.getSingleValueConstraint());
		particleBasedConstraintEClass.getESuperTypes().add(this.getSingleValueConstraint());
		audioBasedConstraintEClass.getESuperTypes().add(this.getSingleValueConstraint());
		letterLengthConstraintEClass.getESuperTypes().add(this.getLetterConstraintRule());
		letterCustomizationConstraintEClass.getESuperTypes().add(this.getLetterConstraintRule());
		letterCustomizationConstraintEClass.getESuperTypes().add(this.getCustomizationType());
		valueConstraintRuleEClass.getESuperTypes().add(this.getAttributeConstraintRule());
		letterConstraintRuleEClass.getESuperTypes().add(this.getAttributeConstraintRule());
		vector2DRangeBasedConstraintEClass.getESuperTypes().add(this.getVector2DConstraintRule());
		vector2DRangeBasedConstraintEClass.getESuperTypes().add(this.getRangeBasedConstraint());
		vector2DConstraintRuleEClass.getESuperTypes().add(this.getAttributeConstraintRule());
		vectorConstraintRuleEClass.getESuperTypes().add(this.getAttributeConstraintRule());
		vectorRangeBasedConstraintEClass.getESuperTypes().add(this.getVectorConstraintRule());
		vectorRangeBasedConstraintEClass.getESuperTypes().add(this.getRangeBasedConstraint());
		rotatorConstraintRuleEClass.getESuperTypes().add(this.getAttributeConstraintRule());
		rotatorRangeBasedConstraintEClass.getESuperTypes().add(this.getRotatorConstraintRule());
		rotatorRangeBasedConstraintEClass.getESuperTypes().add(this.getRangeBasedConstraint());
		transformationConstraintRuleEClass.getESuperTypes().add(this.getAttributeConstraintRule());
		transformationRangeBasedConstraintEClass.getESuperTypes().add(this.getTransformationConstraintRule());
		transformationRangeBasedConstraintEClass.getESuperTypes().add(this.getRangeBasedConstraint());
		colorCustomizationConstraintEClass.getESuperTypes().add(this.getColorConstraintRule());
		colorCustomizationConstraintEClass.getESuperTypes().add(this.getCustomizationType());
		enumBasedConstraintEClass.getESuperTypes().add(this.getSingleValueConstraint());
		simpleEnumStructureEClass.getESuperTypes().add(this.getEnumerationBasedStructure());
		bitmaskedEnumStructureEClass.getESuperTypes().add(this.getEnumerationBasedStructure());
		gameStructureContainerEClass.getESuperTypes().add(this.getGameFeatureContainer());
		gameStructureEClass.getESuperTypes().add(this.getGameFeature());
		enumBasedAttributeEClass.getESuperTypes().add(this.getGameAttribute());
		structureBasedAttributeEClass.getESuperTypes().add(this.getGameAttribute());
		structureBasedConstraintEClass.getESuperTypes().add(this.getSingleValueConstraint());
		getterDistortionConstraintEClass.getESuperTypes().add(this.getDistortionConstraint());
		setterDistortionConstraintEClass.getESuperTypes().add(this.getDistortionConstraint());
		materialBasedConstraintEClass.getESuperTypes().add(this.getSingleValueConstraint());
		materialBasedAttributeEClass.getESuperTypes().add(this.getGameAttribute());
		animationBasedAttributeEClass.getESuperTypes().add(this.getGameAttribute());
		animationBasedConstraintEClass.getESuperTypes().add(this.getSingleValueConstraint());

		// Initialize classes, features, and operations; add parameters
		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Game(), this.getGame(), null, "Game", null, 0, 1, Root.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGame_GameTitle(), ecorePackage.getEString(), "GameTitle", "Game Title", 1, 1, Game.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_GameFeatureContainers(), this.getGameFeatureContainer(), null, "GameFeatureContainers",
				null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_GameSystems(), this.getGameSystem(), null, "GameSystems", null, 0, -1, Game.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_GameVersionName(), ecorePackage.getEString(), "GameVersionName", "V1", 1, 1, Game.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_GameVersionNumber(), ecorePackage.getEFloat(), "GameVersionNumber", "1.0", 1, 1,
				Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(gameFeatureContainerEClass, GameFeatureContainer.class, "GameFeatureContainer", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGameFeatureContainer_FeatureCategory(), ecorePackage.getEString(), "FeatureCategory",
				"Category Name", 1, 1, GameFeatureContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameAttributeContainerEClass, GameAttributeContainer.class, "GameAttributeContainer", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameAttributeContainer_GameAttributes(), this.getGameAttribute(), null, "GameAttributes",
				null, 0, -1, GameAttributeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameFeatureEClass, GameFeature.class, "GameFeature", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGameFeature_FeatureName(), ecorePackage.getEString(), "FeatureName", "FeatureName", 1, 1,
				GameFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(gameAttributeEClass, GameAttribute.class, "GameAttribute", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGameAttribute_DataStructureArray(), ecorePackage.getEBoolean(), "DataStructureArray", "false",
				1, 1, GameAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationBasedStructureEClass, EnumerationBasedStructure.class, "EnumerationBasedStructure",
				IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationBasedStructure_EnumStates(), this.getEnumState(), null, "EnumStates", null, 1, 256,
				EnumerationBasedStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumStateEClass, EnumState.class, "EnumState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataBasedStructureEClass, DataBasedStructure.class, "DataBasedStructure", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataBasedStructure_StructureAttributes(), this.getGameAttribute(), null,
				"StructureAttributes", null, 1, -1, DataBasedStructure.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanBasedAttributeEClass, BooleanBasedAttribute.class, "BooleanBasedAttribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanBasedAttribute_DefaultValue(), ecorePackage.getEBoolean(), "DefaultValue", "false", 1,
				1, BooleanBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueBasedAttributeEClass, ValueBasedAttribute.class, "ValueBasedAttribute", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(letterBasedAttributeEClass, LetterBasedAttribute.class, "LetterBasedAttribute", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nameBasedAttributeEClass, NameBasedAttribute.class, "NameBasedAttribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameBasedAttribute_DefaultValue(), ecorePackage.getEString(), "DefaultValue", null, 0, 1,
				NameBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(stringBasedAttributeEClass, StringBasedAttribute.class, "StringBasedAttribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringBasedAttribute_DefaultValue(), ecorePackage.getEString(), "DefaultValue", null, 0, 1,
				StringBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textBasedAttributeEClass, TextBasedAttribute.class, "TextBasedAttribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextBasedAttribute_DefaultValue(), ecorePackage.getEString(), "DefaultValue", null, 0, 1,
				TextBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(vector2DBasedAttributeEClass, Vector2DBasedAttribute.class, "Vector2DBasedAttribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVector2DBasedAttribute_X(), ecorePackage.getEFloat(), "X", "0.0", 1, 1,
				Vector2DBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector2DBasedAttribute_Y(), ecorePackage.getEFloat(), "Y", "0.0", 1, 1,
				Vector2DBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vectorBasedAttributeEClass, VectorBasedAttribute.class, "VectorBasedAttribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVectorBasedAttribute_X(), ecorePackage.getEFloat(), "X", "0.0", 1, 1,
				VectorBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVectorBasedAttribute_Y(), ecorePackage.getEFloat(), "Y", "0.0", 1, 1,
				VectorBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVectorBasedAttribute_Z(), ecorePackage.getEFloat(), "Z", "0.0", 1, 1,
				VectorBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVectorBasedAttribute_TOwningTransformation(), this.getTransformationBasedAttribute(),
				this.getTransformationBasedAttribute_Translation(), "TOwningTransformation", null, 0, 1,
				VectorBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVectorBasedAttribute_SOwningTransformation(), this.getTransformationBasedAttribute(),
				this.getTransformationBasedAttribute_Scale3D(), "SOwningTransformation", null, 0, 1,
				VectorBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotatorBasedAttributeEClass, RotatorBasedAttribute.class, "RotatorBasedAttribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotatorBasedAttribute_Roll(), ecorePackage.getEFloat(), "Roll", "0.0", 1, 1,
				RotatorBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotatorBasedAttribute_Pitch(), ecorePackage.getEFloat(), "Pitch", "0.0", 1, 1,
				RotatorBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotatorBasedAttribute_Yaw(), ecorePackage.getEFloat(), "Yaw", "0.0", 1, 1,
				RotatorBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRotatorBasedAttribute_ROwningTransformation(), this.getTransformationBasedAttribute(),
				this.getTransformationBasedAttribute_Rotation(), "ROwningTransformation", null, 0, 1,
				RotatorBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationBasedAttributeEClass, TransformationBasedAttribute.class,
				"TransformationBasedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformationBasedAttribute_Translation(), this.getVectorBasedAttribute(),
				this.getVectorBasedAttribute_TOwningTransformation(), "Translation", null, 1, 1,
				TransformationBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationBasedAttribute_Rotation(), this.getRotatorBasedAttribute(),
				this.getRotatorBasedAttribute_ROwningTransformation(), "Rotation", null, 1, 1,
				TransformationBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationBasedAttribute_Scale3D(), this.getVectorBasedAttribute(),
				this.getVectorBasedAttribute_SOwningTransformation(), "Scale3D", null, 1, 1,
				TransformationBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorBasedAttributeEClass, ColorBasedAttribute.class, "ColorBasedAttribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorBasedAttribute_R(), ecorePackage.getEInt(), "R", "0", 1, 1, ColorBasedAttribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorBasedAttribute_G(), ecorePackage.getEInt(), "G", "0", 1, 1, ColorBasedAttribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorBasedAttribute_B(), ecorePackage.getEInt(), "B", "0", 1, 1, ColorBasedAttribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorBasedAttribute_A(), ecorePackage.getEInt(), "A", "255", 1, 1, ColorBasedAttribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textureBasedAttributeEClass, TextureBasedAttribute.class, "TextureBasedAttribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gameItemContainerEClass, GameItemContainer.class, "GameItemContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameItemContainer_GameItems(), this.getGameItem(), null, "GameItems", null, 0, -1,
				GameItemContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameItemEClass, GameItem.class, "GameItem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameItem_ItemAttributeInstances(), this.getGameAttribute(), null, "ItemAttributeInstances",
				null, 0, -1, GameItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameItem_ItemModes(), this.getItemMode(), null, "ItemModes", null, 0, -1, GameItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameItem_DerivedItems(), this.getGameItem(), this.getGameItem_ParentItem(), "DerivedItems",
				null, 0, -1, GameItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameItem_ParentItem(), this.getGameItem(), this.getGameItem_DerivedItems(), "ParentItem",
				null, 0, 1, GameItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameItem_PlacableInventories(), this.getInventorySystem(),
				this.getInventorySystem_SystemItems(), "PlacableInventories", null, 1, 1, GameItem.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getGameItem_IsAbstract(), ecorePackage.getEBoolean(), "IsAbstract", "false", 1, 1,
				GameItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(itemModeEClass, ItemMode.class, "ItemMode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(gameSystemEClass, GameSystem.class, "GameSystem", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGameSystem_SystemName(), ecorePackage.getEString(), "SystemName", "SystemName", 1, 1,
				GameSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(attributeSystemEClass, AttributeSystem.class, "AttributeSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeSystem_ArrayConstraints(), this.getArrayConstraint(), null, "ArrayConstraints", null,
				0, -1, AttributeSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeSystem_SingleValueConstraints(), this.getSingleValueConstraint(), null,
				"SingleValueConstraints", null, 0, -1, AttributeSystem.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeSystem_ParentAttributeSystem(), this.getAttributeSystem(), null,
				"ParentAttributeSystem", null, 0, 1, AttributeSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameSystemConstraintEClass, GameSystemConstraint.class, "GameSystemConstraint", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeSystemConstraintEClass, AttributeSystemConstraint.class, "AttributeSystemConstraint",
				IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(baseGameConstraintRuleEClass, BaseGameConstraintRule.class, "BaseGameConstraintRule", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeConstraintRuleEClass, AttributeConstraintRule.class, "AttributeConstraintRule", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayConstraintEClass, ArrayConstraint.class, "ArrayConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayConstraint_ConstrainedAttributeInstance(), this.getGameAttribute(), null,
				"ConstrainedAttributeInstance", null, 1, 1, ArrayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanBasedConstraintEClass, BooleanBasedConstraint.class, "BooleanBasedConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanBasedConstraint_ConstrainedAttributeInstance(), this.getBooleanBasedAttribute(), null,
				"ConstrainedAttributeInstance", null, 1, 1, BooleanBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueBasedConstraintEClass, ValueBasedConstraint.class, "ValueBasedConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueBasedConstraint_ConstrainedAttributeInstance(), this.getValueBasedAttribute(), null,
				"ConstrainedAttributeInstance", null, 1, 1, ValueBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueBasedConstraint_BaseOrRangeConstraint(), this.getBaseOrRangeConstraint(), null,
				"BaseOrRangeConstraint", null, 0, 1, ValueBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueBasedConstraint_MarginOfError(), this.getMarginOfErrorConstraint(), null,
				"MarginOfError", null, 0, 1, ValueBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueBasedConstraint_RegenerationConstraint(), this.getRegenerationConstraint(), null,
				"RegenerationConstraint", null, 0, 1, ValueBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueBasedConstraint_DirectDependencyConstraint(), this.getDirectDependencyConstraint(), null,
				"DirectDependencyConstraint", null, 0, 1, ValueBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueBasedConstraint_DistortionConstraints(), this.getDistortionConstraint(), null,
				"DistortionConstraints", null, 0, -1, ValueBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minimumValueEClass, MinimumValue.class, "MinimumValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMinimumValue_MinimumAttribute(), this.getValueBasedAttribute(), null, "MinimumAttribute",
				null, 1, 1, MinimumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maximumValueEClass, MaximumValue.class, "MaximumValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaximumValue_MaximumAttribute(), this.getValueBasedAttribute(), null, "MaximumAttribute",
				null, 1, 1, MaximumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regenerationConstraintEClass, RegenerationConstraint.class, "RegenerationConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegenerationConstraint_RegenerationAttribute(), this.getValueBasedAttribute(), null,
				"RegenerationAttribute", null, 1, 1, RegenerationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyConstraintEClass, DependencyConstraint.class, "DependencyConstraint", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(letterBasedConstraintEClass, LetterBasedConstraint.class, "LetterBasedConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLetterBasedConstraint_ConstrainedAttributeInstance(), this.getLetterBasedAttribute(), null,
				"ConstrainedAttributeInstance", null, 1, 1, LetterBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLetterBasedConstraint_LetterLengthConstraint(), this.getLetterLengthConstraint(), null,
				"LetterLengthConstraint", null, 0, 1, LetterBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLetterBasedConstraint_LetterCustomizationConstraint(),
				this.getLetterCustomizationConstraint(), null, "LetterCustomizationConstraint", null, 0, 1,
				LetterBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventorySystemEClass, InventorySystem.class, "InventorySystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInventorySystem_InventoryConstraints(), this.getInventorySystemConstraint(), null,
				"InventoryConstraints", null, 0, 1, InventorySystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventorySystem_SystemItems(), this.getGameItem(), this.getGameItem_PlacableInventories(),
				"SystemItems", null, 0, -1, InventorySystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventorySystemConstraintEClass, InventorySystemConstraint.class, "InventorySystemConstraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInventorySystemConstraint_SelectionConstraint(), this.getSelectionConstraint(), null,
				"SelectionConstraint", null, 0, 1, InventorySystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventorySystemConstraint_EquipItemConstraint(), this.getEquipItemConstraint(), null,
				"EquipItemConstraint", null, 0, 1, InventorySystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventorySystemConstraint_SlotConstraint(), this.getSlotConstraint(), null, "SlotConstraint",
				null, 0, 1, InventorySystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventorySystemConstraint_StackWeightConstraint(), this.getStackWeightConstraint(), null,
				"StackWeightConstraint", null, 0, 1, InventorySystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventorySystemConstraint_AutoCraftConstraint(), this.getAutoCraftConstraint(), null,
				"AutoCraftConstraint", null, 0, 1, InventorySystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventorySystemConstraint_VainConstraint(), this.getVainConstraint(), null, "VainConstraint",
				null, 0, 1, InventorySystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventoryConstraintRuleEClass, InventoryConstraintRule.class, "InventoryConstraintRule", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(autoCraftConstraintEClass, AutoCraftConstraint.class, "AutoCraftConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stackWeightConstraintEClass, StackWeightConstraint.class, "StackWeightConstraint", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stackConstraintEClass, StackConstraint.class, "StackConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStackConstraint_StackAmount(), ecorePackage.getEInt(), "StackAmount", "1", 1, 1,
				StackConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(weightConstraintEClass, WeightConstraint.class, "WeightConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeightConstraint_TotalWeight(), ecorePackage.getEInt(), "TotalWeight", "1", 1, 1,
				WeightConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(slotConstraintEClass, SlotConstraint.class, "SlotConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlotConstraint_NumberOfSlots(), ecorePackage.getEInt(), "NumberOfSlots", "1", 1, 1,
				SlotConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlotConstraint_MaximumSlots(), ecorePackage.getEInt(), "MaximumSlots", "1", 1, 1,
				SlotConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(equipItemConstraintEClass, EquipItemConstraint.class, "EquipItemConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectionConstraintEClass, SelectionConstraint.class, "SelectionConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectionConstraint_SelectableAmount(), ecorePackage.getEInt(), "SelectableAmount", "1", 1, 1,
				SelectionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelBasedAttributeEClass, ModelBasedAttribute.class, "ModelBasedAttribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(particleBasedAttributeEClass, ParticleBasedAttribute.class, "ParticleBasedAttribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vainConstraintEClass, VainConstraint.class, "VainConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(baseValueConstraintEClass, BaseValueConstraint.class, "BaseValueConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseValueConstraint_DefaultBaseValue(), ecorePackage.getEFloat(), "DefaultBaseValue", "0.0",
				1, 1, BaseValueConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseOrRangeConstraintEClass, BaseOrRangeConstraint.class, "BaseOrRangeConstraint", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueRangeBasedConstraintEClass, ValueRangeBasedConstraint.class, "ValueRangeBasedConstraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueRangeBasedConstraint_MinimumValue(), this.getMinimumValue(), null, "MinimumValue", null,
				0, 1, ValueRangeBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueRangeBasedConstraint_MaximumValue(), this.getMaximumValue(), null, "MaximumValue", null,
				0, 1, ValueRangeBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueRangeBasedConstraint_Initializer(), this.getInitializationMode(), "Initializer",
				"Default", 1, 1, ValueRangeBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueRangeBasedConstraint_ConversionDependencyConstraint(),
				this.getConversionDependencyConstraint(),
				this.getConversionDependencyConstraint_ValueRangeBasedConstraint(), "ConversionDependencyConstraint",
				null, 0, 1, ValueRangeBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseValueRangedConstraintEClass, BaseValueRangedConstraint.class, "BaseValueRangedConstraint",
				IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseValueRangedConstraint_RemapValue(), ecorePackage.getEBoolean(), "RemapValue", "false", 1,
				1, BaseValueRangedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleValueConstraintEClass, SingleValueConstraint.class, "SingleValueConstraint", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleValueConstraint_Variability(), this.getVariabilityType(), "Variability", "Variable", 1,
				1, SingleValueConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(marginOfErrorConstraintEClass, MarginOfErrorConstraint.class, "MarginOfErrorConstraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarginOfErrorConstraint_MOEAttribute(), this.getValueBasedAttribute(), null, "MOEAttribute",
				null, 1, 1, MarginOfErrorConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioBasedAttributeEClass, AudioBasedAttribute.class, "AudioBasedAttribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(characterBasedAttributeEClass, CharacterBasedAttribute.class, "CharacterBasedAttribute",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacterBasedAttribute_DefaultValue(), ecorePackage.getEChar(), "DefaultValue", "A", 1, 1,
				CharacterBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerBasedAttributeEClass, IntegerBasedAttribute.class, "IntegerBasedAttribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerBasedAttribute_DefaultValue(), ecorePackage.getEInt(), "DefaultValue", "0", 1, 1,
				IntegerBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decimalBasedAttributeEClass, DecimalBasedAttribute.class, "DecimalBasedAttribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimalBasedAttribute_DefaultValue(), ecorePackage.getEFloat(), "DefaultValue", "0.0", 1, 1,
				DecimalBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directDependencyConstraintEClass, DirectDependencyConstraint.class, "DirectDependencyConstraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectDependencyConstraint_DependentAttributes(), this.getValueBasedAttribute(), null,
				"DependentAttributes", null, 1, -1, DirectDependencyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirectDependencyConstraint_DependencyFormula(), ecorePackage.getEString(),
				"DependencyFormula", null, 1, 1, DirectDependencyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conversionDependencyConstraintEClass, ConversionDependencyConstraint.class,
				"ConversionDependencyConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConversionDependencyConstraint_AttributeName(), ecorePackage.getEString(), "AttributeName",
				null, 1, 1, ConversionDependencyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConversionDependencyConstraint_ConversionUnitToBase(), ecorePackage.getEFloat(),
				"ConversionUnitToBase", "1.0", 1, 1, ConversionDependencyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConversionDependencyConstraint_ConversionChain(), this.getConversionDependencyConstraint(),
				null, "ConversionChain", null, 0, -1, ConversionDependencyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConversionDependencyConstraint_ValueRangeBasedConstraint(),
				this.getValueRangeBasedConstraint(), this.getValueRangeBasedConstraint_ConversionDependencyConstraint(),
				"ValueRangeBasedConstraint", null, 0, 1, ConversionDependencyConstraint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getConversionDependencyConstraint_NextAttributeInChain(), this.getValueBasedAttribute(), null,
				"NextAttributeInChain", null, 0, 1, ConversionDependencyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConversionDependencyConstraint_ConversionRate(), ecorePackage.getEFloat(), "ConversionRate",
				"1.0", 1, 1, ConversionDependencyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distortionConstraintEClass, DistortionConstraint.class, "DistortionConstraint", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDistortionConstraint_DistortionAttribute(), this.getValueBasedAttribute(), null,
				"DistortionAttribute", null, 1, 1, DistortionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistortionConstraint_DistortionMode(), this.getArithmeticOperations(), "DistortionMode",
				"Multiplication", 1, 1, DistortionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vector2DBasedConstraintEClass, Vector2DBasedConstraint.class, "Vector2DBasedConstraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVector2DBasedConstraint_ConstrainedAttributeInstance(), this.getVector2DBasedAttribute(),
				null, "ConstrainedAttributeInstance", null, 1, 1, Vector2DBasedConstraint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getVector2DBasedConstraint_Vector2DRangeBasedConstraint(),
				this.getVector2DRangeBasedConstraint(), null, "Vector2DRangeBasedConstraint", null, 0, 1,
				Vector2DBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vectorBasedConstraintEClass, VectorBasedConstraint.class, "VectorBasedConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVectorBasedConstraint_ConstrainedAttributeInstance(), this.getVectorBasedAttribute(), null,
				"ConstrainedAttributeInstance", null, 1, 1, VectorBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVectorBasedConstraint_VectorRangeBasedConstraint(), this.getVectorRangeBasedConstraint(),
				null, "VectorRangeBasedConstraint", null, 0, 1, VectorBasedConstraint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(rotatorBasedConstraintEClass, RotatorBasedConstraint.class, "RotatorBasedConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRotatorBasedConstraint_ConstrainedAttributeInstance(), this.getRotatorBasedAttribute(), null,
				"ConstrainedAttributeInstance", null, 1, 1, RotatorBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRotatorBasedConstraint_RotatorRangeBasedConstraint(), this.getRotatorRangeBasedConstraint(),
				null, "RotatorRangeBasedConstraint", null, 0, 1, RotatorBasedConstraint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(transformationBasedConstraintEClass, TransformationBasedConstraint.class,
				"TransformationBasedConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformationBasedConstraint_ConstrainedAttributeInstance(),
				this.getTransformationBasedAttribute(), null, "ConstrainedAttributeInstance", null, 1, 1,
				TransformationBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationBasedConstraint_TransformationRangeBasedConstraint(),
				this.getTransformationRangeBasedConstraint(), null, "TransformationRangeBasedConstraint", null, 0, 1,
				TransformationBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorBasedConstraintEClass, ColorBasedConstraint.class, "ColorBasedConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColorBasedConstraint_ConstrainedAttributeInstance(), this.getColorBasedAttribute(), null,
				"ConstrainedAttributeInstance", null, 1, 1, ColorBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColorBasedConstraint_ColorCustomizationConstraint(), this.getColorCustomizationConstraint(),
				null, "ColorCustomizationConstraint", null, 0, 1, ColorBasedConstraint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(textureBasedConstraintEClass, TextureBasedConstraint.class, "TextureBasedConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextureBasedConstraint_ConstrainedAttributeInstance(), this.getTextureBasedAttribute(), null,
				"ConstrainedAttributeInstance", null, 1, 1, TextureBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelBasedConstraintEClass, ModelBasedConstraint.class, "ModelBasedConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelBasedConstraint_ConstrainedAttributeInstance(), this.getModelBasedAttribute(), null,
				"ConstrainedAttributeInstance", null, 1, 1, ModelBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(particleBasedConstraintEClass, ParticleBasedConstraint.class, "ParticleBasedConstraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParticleBasedConstraint_ConstrainedAttributeInstance(), this.getParticleBasedAttribute(),
				null, "ConstrainedAttributeInstance", null, 1, 1, ParticleBasedConstraint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(audioBasedConstraintEClass, AudioBasedConstraint.class, "AudioBasedConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAudioBasedConstraint_ConstrainedAttributeInstance(), this.getAudioBasedAttribute(), null,
				"ConstrainedAttributeInstance", null, 1, 1, AudioBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(letterLengthConstraintEClass, LetterLengthConstraint.class, "LetterLengthConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLetterLengthConstraint_MaximumLengthAttribute(), this.getValueBasedAttribute(), null,
				"MaximumLengthAttribute", null, 0, 1, LetterLengthConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLetterLengthConstraint_MinimumLengthAttribute(), this.getValueBasedAttribute(), null,
				"MinimumLengthAttribute", null, 0, 1, LetterLengthConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(letterCustomizationConstraintEClass, LetterCustomizationConstraint.class,
				"LetterCustomizationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLetterCustomizationConstraint_FilterStrings(), this.getStringBasedAttribute(), null,
				"FilterStrings", null, 1, 1, LetterCustomizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueConstraintRuleEClass, ValueConstraintRule.class, "ValueConstraintRule", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(letterConstraintRuleEClass, LetterConstraintRule.class, "LetterConstraintRule", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vector2DRangeBasedConstraintEClass, Vector2DRangeBasedConstraint.class,
				"Vector2DRangeBasedConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVector2DRangeBasedConstraint_MinimumVector2DAttribute(), this.getVector2DBasedAttribute(),
				null, "MinimumVector2DAttribute", null, 0, 1, Vector2DRangeBasedConstraint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getVector2DRangeBasedConstraint_MaximumVector2DAttribute(), this.getVector2DBasedAttribute(),
				null, "MaximumVector2DAttribute", null, 0, 1, Vector2DRangeBasedConstraint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(vector2DConstraintRuleEClass, Vector2DConstraintRule.class, "Vector2DConstraintRule", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vectorConstraintRuleEClass, VectorConstraintRule.class, "VectorConstraintRule", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vectorRangeBasedConstraintEClass, VectorRangeBasedConstraint.class, "VectorRangeBasedConstraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVectorRangeBasedConstraint_MaximumVectorAttribute(), this.getVectorBasedAttribute(), null,
				"MaximumVectorAttribute", null, 0, 1, VectorRangeBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVectorRangeBasedConstraint_MinimumVectorAttribute(), this.getVectorBasedAttribute(), null,
				"MinimumVectorAttribute", null, 0, 1, VectorRangeBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeBasedConstraintEClass, RangeBasedConstraint.class, "RangeBasedConstraint", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRangeBasedConstraint_Limit(), this.getAdditionLimit(), "Limit", "NoLimit", 1, 1,
				RangeBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotatorConstraintRuleEClass, RotatorConstraintRule.class, "RotatorConstraintRule", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rotatorRangeBasedConstraintEClass, RotatorRangeBasedConstraint.class, "RotatorRangeBasedConstraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRotatorRangeBasedConstraint_MaximumRotatorAttribute(), this.getRotatorBasedAttribute(), null,
				"MaximumRotatorAttribute", null, 0, 1, RotatorRangeBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRotatorRangeBasedConstraint_MinimumRotatorAttribute(), this.getRotatorBasedAttribute(), null,
				"MinimumRotatorAttribute", null, 0, 1, RotatorRangeBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationConstraintRuleEClass, TransformationConstraintRule.class,
				"TransformationConstraintRule", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transformationRangeBasedConstraintEClass, TransformationRangeBasedConstraint.class,
				"TransformationRangeBasedConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformationRangeBasedConstraint_MaximumTransformationAttribute(),
				this.getTransformationBasedAttribute(), null, "MaximumTransformationAttribute", null, 0, 1,
				TransformationRangeBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationRangeBasedConstraint_MinimumTransformationAttribute(),
				this.getTransformationBasedAttribute(), null, "MinimumTransformationAttribute", null, 0, 1,
				TransformationRangeBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customizationTypeEClass, CustomizationType.class, "CustomizationType", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomizationType_FilterType(), this.getFilteringType(), "FilterType", "Inclusion", 1, 1,
				CustomizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(colorCustomizationConstraintEClass, ColorCustomizationConstraint.class,
				"ColorCustomizationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColorCustomizationConstraint_FilterColors(), this.getColorBasedAttribute(), null,
				"FilterColors", null, 1, 1, ColorCustomizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorConstraintRuleEClass, ColorConstraintRule.class, "ColorConstraintRule", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumBasedConstraintEClass, EnumBasedConstraint.class, "EnumBasedConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumBasedConstraint_ConstrainedAttributeInstance(), this.getEnumBasedAttribute(), null,
				"ConstrainedAttributeInstance", null, 1, 1, EnumBasedConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleEnumStructureEClass, SimpleEnumStructure.class, "SimpleEnumStructure", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bitmaskedEnumStructureEClass, BitmaskedEnumStructure.class, "BitmaskedEnumStructure", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gameStructureContainerEClass, GameStructureContainer.class, "GameStructureContainer", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameStructureContainer_GameStructures(), this.getGameStructure(), null, "GameStructures",
				null, 0, -1, GameStructureContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameStructureEClass, GameStructure.class, "GameStructure", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumBasedAttributeEClass, EnumBasedAttribute.class, "EnumBasedAttribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumBasedAttribute_EnumType(), this.getEnumerationBasedStructure(), null, "EnumType", null, 1,
				1, EnumBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureBasedAttributeEClass, StructureBasedAttribute.class, "StructureBasedAttribute",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructureBasedAttribute_DataType(), this.getDataBasedStructure(), null, "DataType", null, 1,
				1, StructureBasedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureBasedConstraintEClass, StructureBasedConstraint.class, "StructureBasedConstraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructureBasedConstraint_ConstrainedAttributeInstance(), this.getStructureBasedAttribute(),
				null, "ConstrainedAttributeInstance", null, 1, 1, StructureBasedConstraint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(getterDistortionConstraintEClass, GetterDistortionConstraint.class, "GetterDistortionConstraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setterDistortionConstraintEClass, SetterDistortionConstraint.class, "SetterDistortionConstraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(materialBasedConstraintEClass, MaterialBasedConstraint.class, "MaterialBasedConstraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaterialBasedConstraint_ConstrainedAttributeInstance(), this.getMaterialBasedAttribute(),
				null, "ConstrainedAttributeInstance", null, 1, 1, MaterialBasedConstraint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(materialBasedAttributeEClass, MaterialBasedAttribute.class, "MaterialBasedAttribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(animationBasedAttributeEClass, AnimationBasedAttribute.class, "AnimationBasedAttribute",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(animationBasedConstraintEClass, AnimationBasedConstraint.class, "AnimationBasedConstraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnimationBasedConstraint_ConstrainedAttributeInstance(), this.getAnimationBasedAttribute(),
				null, "ConstrainedAttributeInstance", null, 1, 1, AnimationBasedConstraint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(additionLimitEEnum, AdditionLimit.class, "AdditionLimit");
		addEEnumLiteral(additionLimitEEnum, AdditionLimit.NO_LIMIT);
		addEEnumLiteral(additionLimitEEnum, AdditionLimit.BOUNDED);

		initEEnum(variabilityTypeEEnum, VariabilityType.class, "VariabilityType");
		addEEnumLiteral(variabilityTypeEEnum, VariabilityType.CONSTANT);
		addEEnumLiteral(variabilityTypeEEnum, VariabilityType.VARIABLE);

		initEEnum(filteringTypeEEnum, FilteringType.class, "FilteringType");
		addEEnumLiteral(filteringTypeEEnum, FilteringType.INCLUSION);
		addEEnumLiteral(filteringTypeEEnum, FilteringType.EXCLUSION);

		initEEnum(arithmeticOperationsEEnum, ArithmeticOperations.class, "ArithmeticOperations");
		addEEnumLiteral(arithmeticOperationsEEnum, ArithmeticOperations.ADDITION);
		addEEnumLiteral(arithmeticOperationsEEnum, ArithmeticOperations.SUBTRACTION);
		addEEnumLiteral(arithmeticOperationsEEnum, ArithmeticOperations.MULTIPLICATION);
		addEEnumLiteral(arithmeticOperationsEEnum, ArithmeticOperations.DIVISION);

		initEEnum(initializationModeEEnum, InitializationMode.class, "InitializationMode");
		addEEnumLiteral(initializationModeEEnum, InitializationMode.DEFAULT);
		addEEnumLiteral(initializationModeEEnum, InitializationMode.MINIMUM);
		addEEnumLiteral(initializationModeEEnum, InitializationMode.MAXIMUM);

		// Create resource
		createResource(eNS_URI);
	}

} //UGSMLPackageImpl
