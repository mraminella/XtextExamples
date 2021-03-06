/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.smalljava.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.smalljava.SmallJavaModelUtil;
import org.xtext.example.smalljava.smallJava.SJAssignment;
import org.xtext.example.smalljava.smallJava.SJClass;
import org.xtext.example.smalljava.smallJava.SJIfStatement;
import org.xtext.example.smalljava.smallJava.SJMemberSelection;
import org.xtext.example.smalljava.smallJava.SJMethod;
import org.xtext.example.smalljava.smallJava.SJNew;
import org.xtext.example.smalljava.smallJava.SJNull;
import org.xtext.example.smalljava.smallJava.SJProgram;
import org.xtext.example.smalljava.smallJava.SJReturn;
import org.xtext.example.smalljava.smallJava.SJStatement;
import org.xtext.example.smalljava.smallJava.SJSymbolRef;
import org.xtext.example.smalljava.smallJava.SJThis;
import org.xtext.example.smalljava.tests.SmallJavaInjectorProvider;
import org.xtext.example.smalljava.typing.SmallJavaTypeConformance;

@RunWith(XtextRunner.class)
@InjectWith(SmallJavaInjectorProvider.class)
@SuppressWarnings("all")
public class SmallJavaParsingTest {
  @Inject
  @Extension
  private ParseHelper<SJProgram> _parseHelper;
  
  @Inject
  @Extension
  private SmallJavaModelUtil _smallJavaModelUtil;
  
  private void assertAssociativity(final SJStatement s, final CharSequence expected) {
    Assert.assertEquals(expected.toString(), this.stringRepr(s));
  }
  
  private String stringRepr(final SJStatement s) {
    String _switchResult = null;
    boolean _matched = false;
    if (s instanceof SJAssignment) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(");
      String _stringRepr = this.stringRepr(((SJAssignment)s).getLeft());
      _builder.append(_stringRepr);
      _builder.append(" = ");
      String _stringRepr_1 = this.stringRepr(((SJAssignment)s).getRight());
      _builder.append(_stringRepr_1);
      _builder.append(")");
      _switchResult = _builder.toString();
    }
    if (!_matched) {
      if (s instanceof SJMemberSelection) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        String _stringRepr = this.stringRepr(((SJMemberSelection)s).getReceiver());
        _builder.append(_stringRepr);
        _builder.append(".");
        String _name = ((SJMemberSelection)s).getMember().getName();
        _builder.append(_name);
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (s instanceof SJThis) {
        _matched=true;
        _switchResult = "this";
      }
    }
    if (!_matched) {
      if (s instanceof SJNew) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("new ");
        String _name = ((SJNew)s).getType().getName();
        _builder.append(_name);
        _builder.append("()");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (s instanceof SJNull) {
        _matched=true;
        _switchResult = "null";
      }
    }
    if (!_matched) {
      if (s instanceof SJSymbolRef) {
        _matched=true;
        _switchResult = ((SJSymbolRef)s).getSymbol().getName();
      }
    }
    if (!_matched) {
      if (s instanceof SJReturn) {
        _matched=true;
        _switchResult = this.stringRepr(((SJReturn)s).getExpression());
      }
    }
    return _switchResult;
  }
  
  @Test
  public void testMemberSelectionLeftAssociativity() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() { return this.m().m(); }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this.assertAssociativity(IterableExtensions.<SJStatement>last(IterableExtensions.<SJMethod>head(this._smallJavaModelUtil.methods(IterableExtensions.<SJClass>head(this._parseHelper.parse(_builder).getClasses()))).getBody().getStatements()), "((this.m).m)");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAssignmentRightAssociativity() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("A f = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("A g = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("f = g = null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this.assertAssociativity(IterableExtensions.<SJStatement>last(IterableExtensions.<SJMethod>head(this._smallJavaModelUtil.methods(IterableExtensions.<SJClass>head(this._parseHelper.parse(_builder).getClasses()))).getBody().getStatements()), "(f = (g = null))");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testElse() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C c;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if (true)");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("if (false)");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("this.c = null;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("else");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("this.c = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return this.c;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      final Procedure1<SJProgram> _function = (SJProgram it) -> {
        SJStatement _head = IterableExtensions.<SJStatement>head(IterableExtensions.<SJMethod>head(this._smallJavaModelUtil.methods(IterableExtensions.<SJClass>head(it.getClasses()))).getBody().getStatements());
        final SJIfStatement ifS = ((SJIfStatement) _head);
        Assert.assertNull(ifS.getElseBlock());
      };
      ObjectExtensions.<SJProgram>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testElseWithBlock() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C c;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if (true) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("if (false)");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("this.c = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("} else");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("this.c = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return this.c;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      final Procedure1<SJProgram> _function = (SJProgram it) -> {
        SJStatement _head = IterableExtensions.<SJStatement>head(IterableExtensions.<SJMethod>head(this._smallJavaModelUtil.methods(IterableExtensions.<SJClass>head(it.getClasses()))).getBody().getStatements());
        final SJIfStatement ifS = ((SJIfStatement) _head);
        Assert.assertNotNull(ifS.getElseBlock());
      };
      ObjectExtensions.<SJProgram>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Inject
  @Extension
  private SmallJavaTypeConformance _smallJavaTypeConformance;
  
  @Test
  public void testClassConformance() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A{}");
      _builder.newLine();
      EList<SJClass> _classes = this._parseHelper.parse(_builder).getClasses();
      final Procedure1<EList<SJClass>> _function = (EList<SJClass> it) -> {
        Assert.assertTrue(this._smallJavaTypeConformance.isConformant(it.get(0), it.get(0)));
      };
      ObjectExtensions.<EList<SJClass>>operator_doubleArrow(_classes, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
