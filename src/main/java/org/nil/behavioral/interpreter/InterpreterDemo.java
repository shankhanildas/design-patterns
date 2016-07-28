package org.nil.behavioral.interpreter;

public class InterpreterDemo {

	static Expression buildInterpreterTree(){
		Expression terminal1 = new TerminalExpression("aws");
		Expression terminal2 = new TerminalExpression("hadoop");
		Expression terminal3 = new TerminalExpression("node");
		
		Expression alternation1 = new AndExpression(terminal2, terminal3);
		
		Expression alternation2 = new OrExpression(terminal1, alternation1);
		
		return alternation2;
	}
	
	public static void main(String[] args) {
		String context = "hadoop cloud node mongo express angular";
		Expression define = buildInterpreterTree();
		System.out.println("Context is " + define.interpret(context));
	}

}
