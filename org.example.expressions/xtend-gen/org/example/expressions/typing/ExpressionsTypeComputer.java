package org.example.expressions.typing;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.expressions.ExpressionsModelUtil;
import org.example.expressions.expressions.And;
import org.example.expressions.expressions.BoolConstant;
import org.example.expressions.expressions.Comparison;
import org.example.expressions.expressions.Equality;
import org.example.expressions.expressions.Expression;
import org.example.expressions.expressions.IntConstant;
import org.example.expressions.expressions.Minus;
import org.example.expressions.expressions.MulOrDiv;
import org.example.expressions.expressions.Not;
import org.example.expressions.expressions.Or;
import org.example.expressions.expressions.Plus;
import org.example.expressions.expressions.StringConstant;
import org.example.expressions.expressions.VariableRef;
import org.example.expressions.typing.BoolType;
import org.example.expressions.typing.ExpressionsType;
import org.example.expressions.typing.IntType;
import org.example.expressions.typing.StringType;

@SuppressWarnings("all")
public class ExpressionsTypeComputer {
  public final static StringType STRING_TYPE = new StringType();
  
  public final static IntType INT_TYPE = new IntType();
  
  public final static BoolType BOOL_TYPE = new BoolType();
  
  public boolean isStringType(final ExpressionsType type) {
    return (type == ExpressionsTypeComputer.STRING_TYPE);
  }
  
  public boolean isIntType(final ExpressionsType type) {
    return (type == ExpressionsTypeComputer.INT_TYPE);
  }
  
  public boolean isBoolType(final ExpressionsType type) {
    return (type == ExpressionsTypeComputer.BOOL_TYPE);
  }
  
  protected ExpressionsType _typeFor(final Expression e) {
    ExpressionsType _switchResult = null;
    boolean _matched = false;
    if (e instanceof StringConstant) {
      _matched=true;
      _switchResult = ExpressionsTypeComputer.STRING_TYPE;
    }
    if (!_matched) {
      if (e instanceof IntConstant) {
        _matched=true;
        _switchResult = ExpressionsTypeComputer.INT_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        _switchResult = ExpressionsTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        _matched=true;
        _switchResult = ExpressionsTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof MulOrDiv) {
        _matched=true;
        _switchResult = ExpressionsTypeComputer.INT_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        _matched=true;
        _switchResult = ExpressionsTypeComputer.INT_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        _matched=true;
        _switchResult = ExpressionsTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        _matched=true;
        _switchResult = ExpressionsTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        _matched=true;
        _switchResult = ExpressionsTypeComputer.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof Or) {
        _matched=true;
        _switchResult = ExpressionsTypeComputer.BOOL_TYPE;
      }
    }
    return _switchResult;
  }
  
  protected ExpressionsType _typeFor(final Plus e) {
    ExpressionsType _xblockexpression = null;
    {
      final ExpressionsType leftType = this.typeFor(e.getLeft());
      Expression _right = e.getRight();
      ExpressionsType _typeFor = null;
      if (_right!=null) {
        _typeFor=this.typeFor(_right);
      }
      final ExpressionsType rightType = _typeFor;
      ExpressionsType _xifexpression = null;
      if ((this.isStringType(leftType) || this.isStringType(rightType))) {
        _xifexpression = ExpressionsTypeComputer.STRING_TYPE;
      } else {
        _xifexpression = ExpressionsTypeComputer.INT_TYPE;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  @Inject
  @Extension
  private ExpressionsModelUtil _expressionsModelUtil;
  
  protected ExpressionsType _typeFor(final VariableRef varRef) {
    boolean _isVariableDefinedBefore = this._expressionsModelUtil.isVariableDefinedBefore(varRef);
    boolean _not = (!_isVariableDefinedBefore);
    if (_not) {
      return null;
    } else {
      return this.typeFor(varRef.getVariable().getExpression());
    }
  }
  
  public ExpressionsType typeFor(final Expression e) {
    if (e instanceof Plus) {
      return _typeFor((Plus)e);
    } else if (e instanceof VariableRef) {
      return _typeFor((VariableRef)e);
    } else if (e != null) {
      return _typeFor(e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
