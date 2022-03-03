/**
 * 
 */
package com.fidelity.greeter;

/**
 * Greets a visitor.
 * 
 * @author ROI
 *
 */
public interface Greeter {
	public void greet();
	public void setVisitor(Visitor v);
}
