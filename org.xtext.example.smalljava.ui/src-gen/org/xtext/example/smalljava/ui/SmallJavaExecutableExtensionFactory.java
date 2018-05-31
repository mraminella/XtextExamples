/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.smalljava.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.smalljava.ui.internal.SmalljavaActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SmallJavaExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(SmalljavaActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		SmalljavaActivator activator = SmalljavaActivator.getInstance();
		return activator != null ? activator.getInjector(SmalljavaActivator.ORG_XTEXT_EXAMPLE_SMALLJAVA_SMALLJAVA) : null;
	}

}
