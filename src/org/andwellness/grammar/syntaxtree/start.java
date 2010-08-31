//
// Generated by JTB 1.3.2
//

package org.andwellness.grammar.syntaxtree;

/**
 * Grammar production:
 * f0 -> sentence()
 * f1 -> <EOF>
 */
public class start implements Node {
   public sentence f0;
   public NodeToken f1;

   public start(sentence n0, NodeToken n1) {
      f0 = n0;
      f1 = n1;
   }

   public start(sentence n0) {
      f0 = n0;
      f1 = new NodeToken("");
   }

   public void accept(org.andwellness.grammar.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(org.andwellness.grammar.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(org.andwellness.grammar.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(org.andwellness.grammar.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}
