package org.xtext.example.smalljava.typing

import org.xtext.example.smalljava.smallJava.SJClass
import org.xtext.example.smalljava.smallJava.SJExpression
import org.xtext.example.smalljava.smallJava.SJNew
import org.xtext.example.smalljava.smallJava.SJSymbolRef
import org.xtext.example.smalljava.smallJava.SJMemberSelection
import org.xtext.example.smalljava.smallJava.SJAssignment
import org.xtext.example.smalljava.smallJava.SJThis

import static extension org.eclipse.xtext.EcoreUtil2.*
import org.xtext.example.smalljava.smallJava.SmallJavaFactory
import org.xtext.example.smalljava.smallJava.SJNull
import org.xtext.example.smalljava.smallJava.SJVariableDeclaration
import org.xtext.example.smalljava.smallJava.SJReturn
import org.xtext.example.smalljava.smallJava.SJMethod
import org.xtext.example.smalljava.smallJava.SmallJavaPackage
import org.xtext.example.smalljava.smallJava.BoolConstant

class SmallJavaTypeComputer {
	private static val factory = SmallJavaFactory.eINSTANCE
	public static val BOOLEAN_TYPE = factory.createSJClass => [name = 'booleanType']
	public static val NULL_TYPE = factory.createSJClass => [name = 'nullType']
	
	def SJClass typeFor(SJExpression e) {
		switch (e) {
			SJNew: e.type
			SJSymbolRef: e.symbol.type
			SJMemberSelection:	e.member.type
			SJAssignment: e.left.typeFor
			SJThis:	e.getContainerOfType(SJClass)
			SJNull: NULL_TYPE
			BoolConstant: BOOLEAN_TYPE
		}
	}
	
	static val ep = SmallJavaPackage.eINSTANCE
	def expectedType(SJExpression e) {
		val c = e.eContainer
		val f = e.eContainingFeature
		switch (c) {
			SJVariableDeclaration:
				c.type
			SJAssignment case f == ep.SJAssignment_Right:
				typeFor(c.left)
			SJReturn:
				c.getContainerOfType(SJMethod).type
			case f == ep.SJIfStatement_Expression:
				BOOLEAN_TYPE
			SJMemberSelection case f == ep.SJMemberSelection_Args: {
				try {
					(c.member as SJMethod).params.get(c.args.indexOf(e)).type
				} catch (Throwable t) {
					null
				}
			}
		}
	}
}
