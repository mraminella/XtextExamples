/*
 * generated by Xtext 2.13.0
 */
package org.example.expressions.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import org.example.expressions.interpreter.ExpressionsInterpreter
import com.google.inject.Inject
import org.example.expressions.expressions.ExpressionsModel

import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.*
class ExpressionsGenerator extends AbstractGenerator {
	@Inject extension ExpressionsInterpreter
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
	 resource.allContents.toIterable.filter(ExpressionsModel).forEach [
			fsa.generateFile
				('''�resource.URI.lastSegment�.evaluated''',
					interpretExpressions)
		]
	}
	def interpretExpressions(ExpressionsModel model) {
		model.elements.map [
			'''�getNode.getTokenText� ~> �interpret�'''
		].join("\n")
	}
}
