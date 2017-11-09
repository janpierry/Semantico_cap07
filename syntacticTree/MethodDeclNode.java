package syntacticTree;

import parser.*;


public class MethodDeclNode extends GeneralNode {
    public int dim;
    public Token isFinal;
    public Token escopo;
    public PrimitiveTypeNode tipo;
    public Token name;
    public MethodBodyNode body;

    public MethodDeclNode(Token a, Token b, Token t, int k, Token t2, MethodBodyNode m) {
        super(t);
        escopo = a;
        isFinal = b;
        dim = k;
        name = t2;
        body = m;
    }
}
