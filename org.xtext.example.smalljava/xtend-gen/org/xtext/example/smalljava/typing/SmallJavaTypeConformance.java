package org.xtext.example.smalljava.typing;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.smalljava.SmallJavaModelUtil;
import org.xtext.example.smalljava.smallJava.SJClass;
import org.xtext.example.smalljava.typing.SmallJavaTypeComputer;

@SuppressWarnings("all")
public class SmallJavaTypeConformance {
  @Inject
  @Extension
  private SmallJavaModelUtil _smallJavaModelUtil;
  
  public boolean isConformant(final SJClass c1, final SJClass c2) {
    return (((c1 == SmallJavaTypeComputer.NULL_TYPE) || 
      (c1 == c2)) || 
      this.isSubclassOf(c1, c2));
  }
  
  public boolean isSubclassOf(final SJClass c1, final SJClass c2) {
    return this._smallJavaModelUtil.classHierarchy(c1).contains(c2);
  }
}
