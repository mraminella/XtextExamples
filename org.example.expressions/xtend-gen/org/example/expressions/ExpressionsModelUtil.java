package org.example.expressions;

import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.example.expressions.expressions.AbstractElement;
import org.example.expressions.expressions.Expression;
import org.example.expressions.expressions.ExpressionsModel;
import org.example.expressions.expressions.Variable;
import org.example.expressions.expressions.VariableRef;

@SuppressWarnings("all")
public class ExpressionsModelUtil {
  public boolean isVariableDefinedBefore(final VariableRef varRef) {
    return this.variablesDefinedBefore(varRef).contains(varRef.getVariable());
  }
  
  public Set<Variable> variablesDefinedBefore(final Expression e) {
    return this.variablesDefinedBefore(EcoreUtil2.<AbstractElement>getContainerOfType(e, AbstractElement.class));
  }
  
  public Set<Variable> variablesDefinedBefore(final AbstractElement containingElement) {
    Set<Variable> _xblockexpression = null;
    {
      EObject _eContainer = containingElement.eContainer();
      final EList<AbstractElement> allElements = ((ExpressionsModel) _eContainer).getElements();
      _xblockexpression = IterableExtensions.<Variable>toSet(EcoreUtil2.<Variable>typeSelect(allElements.subList(0, 
        allElements.indexOf(containingElement)), Variable.class));
    }
    return _xblockexpression;
  }
}
