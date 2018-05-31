package org.xtext.example.smalljava.typing

import org.xtext.example.smalljava.smallJava.SJClass
import org.xtext.example.smalljava.SmallJavaModelUtil
import com.google.inject.Inject

import static org.xtext.example.smalljava.typing.SmallJavaTypeComputer.*
class SmallJavaTypeConformance {
	@Inject extension SmallJavaModelUtil

	def isConformant(SJClass c1, SJClass c2) {
		c1 === NULL_TYPE || // null can be assigned to everything
		c1 === c2 ||
		c1.isSubclassOf(c2)
	}
	
	def isSubclassOf(SJClass c1, SJClass c2) {
		c1.classHierarchy.contains(c2)
	}
}

