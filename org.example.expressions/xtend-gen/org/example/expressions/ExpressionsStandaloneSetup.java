/**
 * generated by Xtext 2.13.0
 */
package org.example.expressions;

import org.example.expressions.ExpressionsStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class ExpressionsStandaloneSetup extends ExpressionsStandaloneSetupGenerated {
  public static void doSetup() {
    new ExpressionsStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
