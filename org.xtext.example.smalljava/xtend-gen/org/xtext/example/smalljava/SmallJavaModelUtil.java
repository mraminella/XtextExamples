package org.xtext.example.smalljava;

import com.google.common.collect.Iterables;
import java.util.LinkedHashSet;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.xtext.example.smalljava.smallJava.SJBlock;
import org.xtext.example.smalljava.smallJava.SJClass;
import org.xtext.example.smalljava.smallJava.SJField;
import org.xtext.example.smalljava.smallJava.SJMethod;
import org.xtext.example.smalljava.smallJava.SJReturn;

@SuppressWarnings("all")
public class SmallJavaModelUtil {
  public Iterable<SJField> fields(final SJClass c) {
    return Iterables.<SJField>filter(c.getMembers(), SJField.class);
  }
  
  public Iterable<SJMethod> methods(final SJClass c) {
    return Iterables.<SJMethod>filter(c.getMembers(), SJMethod.class);
  }
  
  public SJReturn returnStatement(final SJMethod m) {
    return this.returnStatement(m.getBody());
  }
  
  public SJReturn returnStatement(final SJBlock block) {
    return IterableExtensions.<SJReturn>head(Iterables.<SJReturn>filter(block.getStatements(), SJReturn.class));
  }
  
  public LinkedHashSet<SJClass> classHierarchy(final SJClass c) {
    LinkedHashSet<SJClass> _xblockexpression = null;
    {
      final LinkedHashSet<SJClass> visited = CollectionLiterals.<SJClass>newLinkedHashSet();
      SJClass current = c.getSuperclass();
      while (((current != null) && (!visited.contains(current)))) {
        {
          visited.add(current);
          current = current.getSuperclass();
        }
      }
      _xblockexpression = visited;
    }
    return _xblockexpression;
  }
  
  public Map<String, SJMethod> classHierarchyMethods(final SJClass c) {
    final Function1<SJClass, Iterable<SJMethod>> _function = (SJClass it) -> {
      return this.methods(it);
    };
    final Function1<SJMethod, String> _function_1 = (SJMethod it) -> {
      return it.getName();
    };
    return IterableExtensions.<String, SJMethod>toMap(Iterables.<SJMethod>concat(ListExtensions.<SJClass, Iterable<SJMethod>>map(ListExtensions.<SJClass>reverseView(IterableExtensions.<SJClass>toList(this.classHierarchy(c))), _function)), _function_1);
  }
}
