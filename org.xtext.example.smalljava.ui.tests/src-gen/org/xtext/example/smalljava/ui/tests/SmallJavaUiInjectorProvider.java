/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.smalljava.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.smalljava.ui.internal.SmalljavaActivator;

public class SmallJavaUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return SmalljavaActivator.getInstance().getInjector("org.xtext.example.smalljava.SmallJava");
	}

}
