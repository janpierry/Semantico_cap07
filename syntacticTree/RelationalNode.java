package syntacticTree;

import parser.*;


public class RelationalNode extends ExpreNode {
    public ExpreNode expr1;
    public ExpreNode expr2;
    public ListNode lista;
    public Token possivelNull;

    public RelationalNode(Token t, ExpreNode e1, ExpreNode e2) {
        super(t);
        expr1 = e1;
        expr2 = e2;
    }

    //Construtor para expressões lógicas tipo: a or b and c xor d...
    public RelationalNode(Token a, ExpreNode e1, ListNode l){
    	super(null);
    	possivelNull = a;
    	expr1 = e1;
    	lista = l;
    }

    //Construtor para representar algo tipo: xor b. Serve para ser colocado no ListNode no construtor de cima
    public RelationalNode(Token b, Token c, ExpreNode e1){
    	super(b);
    	possivelNull = c;
    	expr1 = e1;
    }
}
