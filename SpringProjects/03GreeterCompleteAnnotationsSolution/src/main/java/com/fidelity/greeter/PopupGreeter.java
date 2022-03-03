/**
 * 
 */
package com.fidelity.greeter;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class PopupGreeter implements Greeter {
	private Visitor visitor;
	
	public Visitor getVisitor() {
		return visitor;
	}

	@Autowired
	@Qualifier("jerseyVisitor") //This is used for setter based DI
	public void setVisitor(Visitor visitor) {
		System.out.println("visitor set to " + visitor);
		this.visitor = visitor;
	}

	public void greet() {
		JOptionPane.showMessageDialog(null, visitor.getGreeting() + "," + visitor.getName());
	}

}
