/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.smalljava.smallJava.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.smalljava.smallJava.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmallJavaFactoryImpl extends EFactoryImpl implements SmallJavaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SmallJavaFactory init()
  {
    try
    {
      SmallJavaFactory theSmallJavaFactory = (SmallJavaFactory)EPackage.Registry.INSTANCE.getEFactory(SmallJavaPackage.eNS_URI);
      if (theSmallJavaFactory != null)
      {
        return theSmallJavaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SmallJavaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallJavaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SmallJavaPackage.SJ_PROGRAM: return createSJProgram();
      case SmallJavaPackage.SJ_CLASS: return createSJClass();
      case SmallJavaPackage.SJ_MEMBER: return createSJMember();
      case SmallJavaPackage.SJ_FIELD: return createSJField();
      case SmallJavaPackage.SJ_METHOD: return createSJMethod();
      case SmallJavaPackage.SJ_PARAMETER: return createSJParameter();
      case SmallJavaPackage.SJ_BLOCK: return createSJBlock();
      case SmallJavaPackage.SJ_STATEMENT: return createSJStatement();
      case SmallJavaPackage.SJ_RETURN: return createSJReturn();
      case SmallJavaPackage.SJ_VARIABLE_DECLARATION: return createSJVariableDeclaration();
      case SmallJavaPackage.SJ_IF_STATEMENT: return createSJIfStatement();
      case SmallJavaPackage.SJ_SYMBOL: return createSJSymbol();
      case SmallJavaPackage.SJ_NAMED_ELEMENT: return createSJNamedElement();
      case SmallJavaPackage.SJ_EXPRESSION: return createSJExpression();
      case SmallJavaPackage.SJ_ASSIGNMENT: return createSJAssignment();
      case SmallJavaPackage.SJ_MEMBER_SELECTION: return createSJMemberSelection();
      case SmallJavaPackage.SJ_THIS: return createSJThis();
      case SmallJavaPackage.SJ_NULL: return createSJNull();
      case SmallJavaPackage.BOOL_CONSTANT: return createBoolConstant();
      case SmallJavaPackage.SJ_SYMBOL_REF: return createSJSymbolRef();
      case SmallJavaPackage.SJ_NEW: return createSJNew();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJProgram createSJProgram()
  {
    SJProgramImpl sjProgram = new SJProgramImpl();
    return sjProgram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJClass createSJClass()
  {
    SJClassImpl sjClass = new SJClassImpl();
    return sjClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJMember createSJMember()
  {
    SJMemberImpl sjMember = new SJMemberImpl();
    return sjMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJField createSJField()
  {
    SJFieldImpl sjField = new SJFieldImpl();
    return sjField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJMethod createSJMethod()
  {
    SJMethodImpl sjMethod = new SJMethodImpl();
    return sjMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJParameter createSJParameter()
  {
    SJParameterImpl sjParameter = new SJParameterImpl();
    return sjParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJBlock createSJBlock()
  {
    SJBlockImpl sjBlock = new SJBlockImpl();
    return sjBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJStatement createSJStatement()
  {
    SJStatementImpl sjStatement = new SJStatementImpl();
    return sjStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJReturn createSJReturn()
  {
    SJReturnImpl sjReturn = new SJReturnImpl();
    return sjReturn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJVariableDeclaration createSJVariableDeclaration()
  {
    SJVariableDeclarationImpl sjVariableDeclaration = new SJVariableDeclarationImpl();
    return sjVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJIfStatement createSJIfStatement()
  {
    SJIfStatementImpl sjIfStatement = new SJIfStatementImpl();
    return sjIfStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJSymbol createSJSymbol()
  {
    SJSymbolImpl sjSymbol = new SJSymbolImpl();
    return sjSymbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJNamedElement createSJNamedElement()
  {
    SJNamedElementImpl sjNamedElement = new SJNamedElementImpl();
    return sjNamedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJExpression createSJExpression()
  {
    SJExpressionImpl sjExpression = new SJExpressionImpl();
    return sjExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJAssignment createSJAssignment()
  {
    SJAssignmentImpl sjAssignment = new SJAssignmentImpl();
    return sjAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJMemberSelection createSJMemberSelection()
  {
    SJMemberSelectionImpl sjMemberSelection = new SJMemberSelectionImpl();
    return sjMemberSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJThis createSJThis()
  {
    SJThisImpl sjThis = new SJThisImpl();
    return sjThis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJNull createSJNull()
  {
    SJNullImpl sjNull = new SJNullImpl();
    return sjNull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolConstant createBoolConstant()
  {
    BoolConstantImpl boolConstant = new BoolConstantImpl();
    return boolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJSymbolRef createSJSymbolRef()
  {
    SJSymbolRefImpl sjSymbolRef = new SJSymbolRefImpl();
    return sjSymbolRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJNew createSJNew()
  {
    SJNewImpl sjNew = new SJNewImpl();
    return sjNew;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallJavaPackage getSmallJavaPackage()
  {
    return (SmallJavaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SmallJavaPackage getPackage()
  {
    return SmallJavaPackage.eINSTANCE;
  }

} //SmallJavaFactoryImpl
