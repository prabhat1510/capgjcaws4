/**
 * 
 */
package com.lm.greeter;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component ("greeter")
public class PopupGreeter implements Greeter {
	@Autowired
	@Qualifier("amarilloVis")
	private Visitor visitor;
	
	public Visitor getVisitor() {
		return visitor;
	}

	

	public void setVisitor(Visitor visitor) {
		System.out.println("visitor set to " + visitor);
		this.visitor = visitor;
	}

	public void greet() {
		JOptionPane.showMessageDialog(null, visitor.getGreeting() + "," + visitor.getName());
	}

}
