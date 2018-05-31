package org.xtext.example.smalljava.typing;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.example.smalljava.smallJava.BoolConstant;
import org.xtext.example.smalljava.smallJava.SJAssignment;
import org.xtext.example.smalljava.smallJava.SJClass;
import org.xtext.example.smalljava.smallJava.SJExpression;
import org.xtext.example.smalljava.smallJava.SJMember;
import org.xtext.example.smalljava.smallJava.SJMemberSelection;
import org.xtext.example.smalljava.smallJava.SJMethod;
import org.xtext.example.smalljava.smallJava.SJNew;
import org.xtext.example.smalljava.smallJava.SJNull;
import org.xtext.example.smalljava.smallJava.SJReturn;
import org.xtext.example.smalljava.smallJava.SJSymbolRef;
import org.xtext.example.smalljava.smallJava.SJThis;
import org.xtext.example.smalljava.smallJava.SJVariableDeclaration;
import org.xtext.example.smalljava.smallJava.SmallJavaFactory;
import org.xtext.example.smalljava.smallJava.SmallJavaPackage;

@SuppressWarnings("all")
public class SmallJavaTypeComputer {
  private final static SmallJavaFactory factory = SmallJavaFactory.eINSTANCE;
  
  public final static SJClass BOOLEAN_TYPE = ObjectExtensions.<SJClass>operator_doubleArrow(SmallJavaTypeComputer.factory.createSJClass(), ((Procedure1<SJClass>) (SJClass it) -> {
    it.setName("booleanType");
  }));
  
  public final static SJClass NULL_TYPE = ObjectExtensions.<SJClass>operator_doubleArrow(SmallJavaTypeComputer.factory.createSJClass(), ((Procedure1<SJClass>) (SJClass it) -> {
    it.setName("nullType");
  }));
  
  public SJClass typeFor(final SJExpression e) {
    SJClass _switchResult = null;
    boolean _matched = false;
    if (e instanceof SJNew) {
      _matched=true;
      _switchResult = ((SJNew)e).getType();
    }
    if (!_matched) {
      if (e instanceof SJSymbolRef) {
        _matched=true;
        _switchResult = ((SJSymbolRef)e).getSymbol().getType();
      }
    }
    if (!_matched) {
      if (e instanceof SJMemberSelection) {
        _matched=true;
        _switchResult = ((SJMemberSelection)e).getMember().getType();
      }
    }
    if (!_matched) {
      if (e instanceof SJAssignment) {
        _matched=true;
        _switchResult = this.typeFor(((SJAssignment)e).getLeft());
      }
    }
    if (!_matched) {
      if (e instanceof SJThis) {
        _matched=true;
        _switchResult = EcoreUtil2.<SJClass>getContainerOfType(e, SJClass.class);
      }
    }
    if (!_matched) {
      if (e instanceof SJNull) {
        _matched=true;
        _switchResult = SmallJavaTypeComputer.NULL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        _switchResult = SmallJavaTypeComputer.BOOLEAN_TYPE;
      }
    }
    return _switchResult;
  }
  
  private final static SmallJavaPackage ep = SmallJavaPackage.eINSTANCE;
  
  public SJClass expectedType(final SJExpression e) {
    SJClass _xblockexpression = null;
    {
      final EObject c = e.eContainer();
      final EStructuralFeature f = e.eContainingFeature();
      SJClass _switchResult = null;
      boolean _matched = false;
      if (c instanceof SJVariableDeclaration) {
        _matched=true;
        _switchResult = ((SJVariableDeclaration)c).getType();
      }
      if (!_matched) {
        if (c instanceof SJAssignment) {
          EReference _sJAssignment_Right = SmallJavaTypeComputer.ep.getSJAssignment_Right();
          boolean _equals = Objects.equal(f, _sJAssignment_Right);
          if (_equals) {
            _matched=true;
            _switchResult = this.typeFor(((SJAssignment)c).getLeft());
          }
        }
      }
      if (!_matched) {
        if (c instanceof SJReturn) {
          _matched=true;
          _switchResult = EcoreUtil2.<SJMethod>getContainerOfType(c, SJMethod.class).getType();
        }
      }
      if (!_matched) {
        EReference _sJIfStatement_Expression = SmallJavaTypeComputer.ep.getSJIfStatement_Expression();
        boolean _equals = Objects.equal(f, _sJIfStatement_Expression);
        if (_equals) {
          _matched=true;
          _switchResult = SmallJavaTypeComputer.BOOLEAN_TYPE;
        }
      }
      if (!_matched) {
        if (c instanceof SJMemberSelection) {
          EReference _sJMemberSelection_Args = SmallJavaTypeComputer.ep.getSJMemberSelection_Args();
          boolean _equals_1 = Objects.equal(f, _sJMemberSelection_Args);
          if (_equals_1) {
            _matched=true;
            SJClass _xtrycatchfinallyexpression = null;
            try {
              SJMember _member = ((SJMemberSelection)c).getMember();
              _xtrycatchfinallyexpression = ((SJMethod) _member).getParams().get(((SJMemberSelection)c).getArgs().indexOf(e)).getType();
            } catch (final Throwable _t) {
              if (_t instanceof Throwable) {
                _xtrycatchfinallyexpression = null;
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
            _switchResult = _xtrycatchfinallyexpression;
          }
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}
