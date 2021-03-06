/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.smalljava.smallJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SJ Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.smalljava.smallJava.SJMember#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.smalljava.smallJava.SmallJavaPackage#getSJMember()
 * @model
 * @generated
 */
public interface SJMember extends SJNamedElement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(SJClass)
   * @see org.xtext.example.smalljava.smallJava.SmallJavaPackage#getSJMember_Type()
   * @model
   * @generated
   */
  SJClass getType();

  /**
   * Sets the value of the '{@link org.xtext.example.smalljava.smallJava.SJMember#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(SJClass value);

} // SJMember
