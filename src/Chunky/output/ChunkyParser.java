// $ANTLR 3.4 C:\\Source\\chunky\\src\\Chunky\\Chunky.g 2011-09-08 17:52:21

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ChunkyParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARGS", "BLOCK", "CALL", "DIGIT", "DOT", "FLOAT", "FUNC", "ID", "IF", "INT", "LETTER", "PARAMS", "STRING", "WS", "'!'", "'!='", "'&&'", "'&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'else'", "'{'", "'|'", "'||'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int ARGS=4;
    public static final int BLOCK=5;
    public static final int CALL=6;
    public static final int DIGIT=7;
    public static final int DOT=8;
    public static final int FLOAT=9;
    public static final int FUNC=10;
    public static final int ID=11;
    public static final int IF=12;
    public static final int INT=13;
    public static final int LETTER=14;
    public static final int PARAMS=15;
    public static final int STRING=16;
    public static final int WS=17;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "call", "exprs", "func_expr", "not", "block", "args", 
    "add", "dot", "mul", "comp", "program", "if_expr", "params", "term", 
    "bool", "expr"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public ChunkyParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public ChunkyParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public ChunkyParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return ChunkyParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Source\\chunky\\src\\Chunky\\Chunky.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:19:1: program : exprs ;
    public final ChunkyParser.program_return program() throws RecognitionException {
        ChunkyParser.program_return retval = new ChunkyParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ChunkyParser.exprs_return exprs1 =null;



        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 0);

        try {
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:20:2: ( exprs )
            dbg.enterAlt(1);

            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:20:4: exprs
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(20,4);
            pushFollow(FOLLOW_exprs_in_program80);
            exprs1=exprs();

            state._fsp--;

            adaptor.addChild(root_0, exprs1.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(21, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "program"


    public static class params_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:23:1: params : (p+= ID ( ',' p+= ID )* )? -> ^( PARAMS ( $p)* ) ;
    public final ChunkyParser.params_return params() throws RecognitionException {
        ChunkyParser.params_return retval = new ChunkyParser.params_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal2=null;
        Token p=null;
        List list_p=null;

        CommonTree char_literal2_tree=null;
        CommonTree p_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");

        try { dbg.enterRule(getGrammarFileName(), "params");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(23, 0);

        try {
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:24:2: ( (p+= ID ( ',' p+= ID )* )? -> ^( PARAMS ( $p)* ) )
            dbg.enterAlt(1);

            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:24:4: (p+= ID ( ',' p+= ID )* )?
            {
            dbg.location(24,4);
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:24:4: (p+= ID ( ',' p+= ID )* )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:24:5: p+= ID ( ',' p+= ID )*
                    {
                    dbg.location(24,6);
                    p=(Token)match(input,ID,FOLLOW_ID_in_params94);  
                    stream_ID.add(p);

                    if (list_p==null) list_p=new ArrayList();
                    list_p.add(p);

                    dbg.location(24,11);
                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:24:11: ( ',' p+= ID )*
                    try { dbg.enterSubRule(1);

                    loop1:
                    do {
                        int alt1=2;
                        try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==26) ) {
                            alt1=1;
                        }


                        } finally {dbg.exitDecision(1);}

                        switch (alt1) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:24:12: ',' p+= ID
                    	    {
                    	    dbg.location(24,12);
                    	    char_literal2=(Token)match(input,26,FOLLOW_26_in_params97);  
                    	    stream_26.add(char_literal2);

                    	    dbg.location(24,17);
                    	    p=(Token)match(input,ID,FOLLOW_ID_in_params101);  
                    	    stream_ID.add(p);

                    	    if (list_p==null) list_p=new ArrayList();
                    	    list_p.add(p);


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(1);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}


            // AST REWRITE
            // elements: p
            // token labels: 
            // rule labels: retval
            // token list labels: p
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_p=new RewriteRuleTokenStream(adaptor,"token p", list_p);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 25:3: -> ^( PARAMS ( $p)* )
            {
                dbg.location(25,6);
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:25:6: ^( PARAMS ( $p)* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(25,8);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                dbg.location(25,16);
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:25:16: ( $p)*
                while ( stream_p.hasNext() ) {
                    dbg.location(25,16);
                    adaptor.addChild(root_1, stream_p.nextNode());

                }
                stream_p.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(26, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "params");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "params"


    public static class func_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func_expr"
    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:28:1: func_expr : FUNC ^ '(' ! params ')' ! block ;
    public final ChunkyParser.func_expr_return func_expr() throws RecognitionException {
        ChunkyParser.func_expr_return retval = new ChunkyParser.func_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token FUNC3=null;
        Token char_literal4=null;
        Token char_literal6=null;
        ChunkyParser.params_return params5 =null;

        ChunkyParser.block_return block7 =null;


        CommonTree FUNC3_tree=null;
        CommonTree char_literal4_tree=null;
        CommonTree char_literal6_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "func_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(28, 0);

        try {
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:29:2: ( FUNC ^ '(' ! params ')' ! block )
            dbg.enterAlt(1);

            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:29:4: FUNC ^ '(' ! params ')' ! block
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(29,8);
            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func_expr128); 
            FUNC3_tree = 
            (CommonTree)adaptor.create(FUNC3)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(FUNC3_tree, root_0);

            dbg.location(29,13);
            char_literal4=(Token)match(input,22,FOLLOW_22_in_func_expr131); 
            dbg.location(29,15);
            pushFollow(FOLLOW_params_in_func_expr134);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());
            dbg.location(29,25);
            char_literal6=(Token)match(input,23,FOLLOW_23_in_func_expr136); 
            dbg.location(29,27);
            pushFollow(FOLLOW_block_in_func_expr139);
            block7=block();

            state._fsp--;

            adaptor.addChild(root_0, block7.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(30, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "func_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "func_expr"


    public static class if_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_expr"
    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:32:1: if_expr : IF '(' cond= expr ')' if_body= block ( 'else' (a= if_expr -> ^( IF $cond $if_body $a) |b= block -> ^( IF $cond $if_body $b) ) | -> ^( IF $cond $if_body) ) ;
    public final ChunkyParser.if_expr_return if_expr() throws RecognitionException {
        ChunkyParser.if_expr_return retval = new ChunkyParser.if_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IF8=null;
        Token char_literal9=null;
        Token char_literal10=null;
        Token string_literal11=null;
        ChunkyParser.expr_return cond =null;

        ChunkyParser.block_return if_body =null;

        ChunkyParser.if_expr_return a =null;

        ChunkyParser.block_return b =null;


        CommonTree IF8_tree=null;
        CommonTree char_literal9_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree string_literal11_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_if_expr=new RewriteRuleSubtreeStream(adaptor,"rule if_expr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "if_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(32, 0);

        try {
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:33:2: ( IF '(' cond= expr ')' if_body= block ( 'else' (a= if_expr -> ^( IF $cond $if_body $a) |b= block -> ^( IF $cond $if_body $b) ) | -> ^( IF $cond $if_body) ) )
            dbg.enterAlt(1);

            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:33:4: IF '(' cond= expr ')' if_body= block ( 'else' (a= if_expr -> ^( IF $cond $if_body $a) |b= block -> ^( IF $cond $if_body $b) ) | -> ^( IF $cond $if_body) )
            {
            dbg.location(33,4);
            IF8=(Token)match(input,IF,FOLLOW_IF_in_if_expr150);  
            stream_IF.add(IF8);

            dbg.location(33,7);
            char_literal9=(Token)match(input,22,FOLLOW_22_in_if_expr152);  
            stream_22.add(char_literal9);

            dbg.location(33,15);
            pushFollow(FOLLOW_expr_in_if_expr156);
            cond=expr();

            state._fsp--;

            stream_expr.add(cond.getTree());
            dbg.location(33,21);
            char_literal10=(Token)match(input,23,FOLLOW_23_in_if_expr158);  
            stream_23.add(char_literal10);

            dbg.location(33,32);
            pushFollow(FOLLOW_block_in_if_expr162);
            if_body=block();

            state._fsp--;

            stream_block.add(if_body.getTree());
            dbg.location(34,3);
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:34:3: ( 'else' (a= if_expr -> ^( IF $cond $if_body $a) |b= block -> ^( IF $cond $if_body $b) ) | -> ^( IF $cond $if_body) )
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
                alt4=1;
            }
            else if ( (LA4_0==DOT||(LA4_0 >= 19 && LA4_0 <= 35)||(LA4_0 >= 38 && LA4_0 <= 39)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:34:5: 'else' (a= if_expr -> ^( IF $cond $if_body $a) |b= block -> ^( IF $cond $if_body $b) )
                    {
                    dbg.location(34,5);
                    string_literal11=(Token)match(input,36,FOLLOW_36_in_if_expr168);  
                    stream_36.add(string_literal11);

                    dbg.location(34,12);
                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:34:12: (a= if_expr -> ^( IF $cond $if_body $a) |b= block -> ^( IF $cond $if_body $b) )
                    int alt3=2;
                    try { dbg.enterSubRule(3);
                    try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==IF) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==37) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    } finally {dbg.exitDecision(3);}

                    switch (alt3) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:34:14: a= if_expr
                            {
                            dbg.location(34,15);
                            pushFollow(FOLLOW_if_expr_in_if_expr174);
                            a=if_expr();

                            state._fsp--;

                            stream_if_expr.add(a.getTree());

                            // AST REWRITE
                            // elements: if_body, a, IF, cond
                            // token labels: 
                            // rule labels: retval, if_body, a, cond
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_if_body=new RewriteRuleSubtreeStream(adaptor,"rule if_body",if_body!=null?if_body.tree:null);
                            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);
                            RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond",cond!=null?cond.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 34:24: -> ^( IF $cond $if_body $a)
                            {
                                dbg.location(34,27);
                                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:34:27: ^( IF $cond $if_body $a)
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                dbg.location(34,29);
                                root_1 = (CommonTree)adaptor.becomeRoot(
                                stream_IF.nextNode()
                                , root_1);

                                dbg.location(34,33);
                                adaptor.addChild(root_1, stream_cond.nextTree());
                                dbg.location(34,39);
                                adaptor.addChild(root_1, stream_if_body.nextTree());
                                dbg.location(34,48);
                                adaptor.addChild(root_1, stream_a.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:35:8: b= block
                            {
                            dbg.location(35,9);
                            pushFollow(FOLLOW_block_in_if_expr200);
                            b=block();

                            state._fsp--;

                            stream_block.add(b.getTree());

                            // AST REWRITE
                            // elements: if_body, IF, b, cond
                            // token labels: 
                            // rule labels: retval, b, if_body, cond
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                            RewriteRuleSubtreeStream stream_if_body=new RewriteRuleSubtreeStream(adaptor,"rule if_body",if_body!=null?if_body.tree:null);
                            RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond",cond!=null?cond.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 35:17: -> ^( IF $cond $if_body $b)
                            {
                                dbg.location(35,20);
                                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:35:20: ^( IF $cond $if_body $b)
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                dbg.location(35,22);
                                root_1 = (CommonTree)adaptor.becomeRoot(
                                stream_IF.nextNode()
                                , root_1);

                                dbg.location(35,26);
                                adaptor.addChild(root_1, stream_cond.nextTree());
                                dbg.location(35,32);
                                adaptor.addChild(root_1, stream_if_body.nextTree());
                                dbg.location(35,41);
                                adaptor.addChild(root_1, stream_b.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(3);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:37:10: 
                    {
                    // AST REWRITE
                    // elements: cond, IF, if_body
                    // token labels: 
                    // rule labels: retval, if_body, cond
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_if_body=new RewriteRuleSubtreeStream(adaptor,"rule if_body",if_body!=null?if_body.tree:null);
                    RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond",cond!=null?cond.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 37:10: -> ^( IF $cond $if_body)
                    {
                        dbg.location(37,13);
                        // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:37:13: ^( IF $cond $if_body)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(37,15);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_IF.nextNode()
                        , root_1);

                        dbg.location(37,19);
                        adaptor.addChild(root_1, stream_cond.nextTree());
                        dbg.location(37,25);
                        adaptor.addChild(root_1, stream_if_body.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(39, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "if_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "if_expr"


    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:41:1: term : ( ID | '(' ! expr ')' !| INT | FLOAT | STRING | if_expr | func_expr );
    public final ChunkyParser.term_return term() throws RecognitionException {
        ChunkyParser.term_return retval = new ChunkyParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID12=null;
        Token char_literal13=null;
        Token char_literal15=null;
        Token INT16=null;
        Token FLOAT17=null;
        Token STRING18=null;
        ChunkyParser.expr_return expr14 =null;

        ChunkyParser.if_expr_return if_expr19 =null;

        ChunkyParser.func_expr_return func_expr20 =null;


        CommonTree ID12_tree=null;
        CommonTree char_literal13_tree=null;
        CommonTree char_literal15_tree=null;
        CommonTree INT16_tree=null;
        CommonTree FLOAT17_tree=null;
        CommonTree STRING18_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(41, 0);

        try {
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:41:5: ( ID | '(' ! expr ')' !| INT | FLOAT | STRING | if_expr | func_expr )
            int alt5=7;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case INT:
                {
                alt5=3;
                }
                break;
            case FLOAT:
                {
                alt5=4;
                }
                break;
            case STRING:
                {
                alt5=5;
                }
                break;
            case IF:
                {
                alt5=6;
                }
                break;
            case FUNC:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:41:7: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(41,7);
                    ID12=(Token)match(input,ID,FOLLOW_ID_in_term257); 
                    ID12_tree = 
                    (CommonTree)adaptor.create(ID12)
                    ;
                    adaptor.addChild(root_0, ID12_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:42:4: '(' ! expr ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(42,7);
                    char_literal13=(Token)match(input,22,FOLLOW_22_in_term262); 
                    dbg.location(42,9);
                    pushFollow(FOLLOW_expr_in_term265);
                    expr14=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr14.getTree());
                    dbg.location(42,17);
                    char_literal15=(Token)match(input,23,FOLLOW_23_in_term267); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:43:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(43,4);
                    INT16=(Token)match(input,INT,FOLLOW_INT_in_term273); 
                    INT16_tree = 
                    (CommonTree)adaptor.create(INT16)
                    ;
                    adaptor.addChild(root_0, INT16_tree);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:44:4: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(44,4);
                    FLOAT17=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_term278); 
                    FLOAT17_tree = 
                    (CommonTree)adaptor.create(FLOAT17)
                    ;
                    adaptor.addChild(root_0, FLOAT17_tree);


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:45:4: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(45,4);
                    STRING18=(Token)match(input,STRING,FOLLOW_STRING_in_term283); 
                    STRING18_tree = 
                    (CommonTree)adaptor.create(STRING18)
                    ;
                    adaptor.addChild(root_0, STRING18_tree);


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:46:4: if_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(46,4);
                    pushFollow(FOLLOW_if_expr_in_term288);
                    if_expr19=if_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, if_expr19.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:47:4: func_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(47,4);
                    pushFollow(FOLLOW_func_expr_in_term293);
                    func_expr20=func_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, func_expr20.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(48, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "term"


    public static class dot_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dot"
    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:50:1: dot : term ( DOT ^ ID )* ( '=' ^ expr )? ;
    public final ChunkyParser.dot_return dot() throws RecognitionException {
        ChunkyParser.dot_return retval = new ChunkyParser.dot_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOT22=null;
        Token ID23=null;
        Token char_literal24=null;
        ChunkyParser.term_return term21 =null;

        ChunkyParser.expr_return expr25 =null;


        CommonTree DOT22_tree=null;
        CommonTree ID23_tree=null;
        CommonTree char_literal24_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dot");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(50, 0);

        try {
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:51:2: ( term ( DOT ^ ID )* ( '=' ^ expr )? )
            dbg.enterAlt(1);

            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:51:4: term ( DOT ^ ID )* ( '=' ^ expr )?
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(51,4);
            pushFollow(FOLLOW_term_in_dot304);
            term21=term();

            state._fsp--;

            adaptor.addChild(root_0, term21.getTree());
            dbg.location(51,9);
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:51:9: ( DOT ^ ID )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==DOT) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:51:10: DOT ^ ID
            	    {
            	    dbg.location(51,13);
            	    DOT22=(Token)match(input,DOT,FOLLOW_DOT_in_dot307); 
            	    DOT22_tree = 
            	    (CommonTree)adaptor.create(DOT22)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(DOT22_tree, root_0);

            	    dbg.location(51,15);
            	    ID23=(Token)match(input,ID,FOLLOW_ID_in_dot310); 
            	    ID23_tree = 
            	    (CommonTree)adaptor.create(ID23)
            	    ;
            	    adaptor.addChild(root_0, ID23_tree);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}

            dbg.location(52,3);
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:52:3: ( '=' ^ expr )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:52:4: '=' ^ expr
                    {
                    dbg.location(52,7);
                    char_literal24=(Token)match(input,32,FOLLOW_32_in_dot318); 
                    char_literal24_tree = 
                    (CommonTree)adaptor.create(char_literal24)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal24_tree, root_0);

                    dbg.location(52,9);
                    pushFollow(FOLLOW_expr_in_dot321);
                    expr25=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr25.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(53, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dot");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dot"


    public static class args_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "args"
    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:55:1: args : (b= expr ( ',' b= expr )* )? -> ^( ARGS $b) ;
    public final ChunkyParser.args_return args() throws RecognitionException {
        ChunkyParser.args_return retval = new ChunkyParser.args_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal26=null;
        ChunkyParser.expr_return b =null;


        CommonTree char_literal26_tree=null;
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "args");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(55, 0);

        try {
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:55:5: ( (b= expr ( ',' b= expr )* )? -> ^( ARGS $b) )
            dbg.enterAlt(1);

            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:55:7: (b= expr ( ',' b= expr )* )?
            {
            dbg.location(55,7);
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:55:7: (b= expr ( ',' b= expr )* )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( ((LA9_0 >= FLOAT && LA9_0 <= INT)||LA9_0==STRING||LA9_0==18||LA9_0==22) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:55:8: b= expr ( ',' b= expr )*
                    {
                    dbg.location(55,9);
                    pushFollow(FOLLOW_expr_in_args335);
                    b=expr();

                    state._fsp--;

                    stream_expr.add(b.getTree());
                    dbg.location(55,15);
                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:55:15: ( ',' b= expr )*
                    try { dbg.enterSubRule(8);

                    loop8:
                    do {
                        int alt8=2;
                        try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==26) ) {
                            alt8=1;
                        }


                        } finally {dbg.exitDecision(8);}

                        switch (alt8) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:55:16: ',' b= expr
                    	    {
                    	    dbg.location(55,16);
                    	    char_literal26=(Token)match(input,26,FOLLOW_26_in_args338);  
                    	    stream_26.add(char_literal26);

                    	    dbg.location(55,21);
                    	    pushFollow(FOLLOW_expr_in_args342);
                    	    b=expr();

                    	    state._fsp--;

                    	    stream_expr.add(b.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(8);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}


            // AST REWRITE
            // elements: b
            // token labels: 
            // rule labels: retval, b
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 56:3: -> ^( ARGS $b)
            {
                dbg.location(56,6);
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:56:6: ^( ARGS $b)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(56,8);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ARGS, "ARGS")
                , root_1);

                dbg.location(56,14);
                adaptor.addChild(root_1, stream_b.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(57, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "args");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "args"


    public static class call_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "call"
    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:59:1: call : (t= dot -> $t) ( '(' args ')' -> ^( CALL $call args ) )* ;
    public final ChunkyParser.call_return call() throws RecognitionException {
        ChunkyParser.call_return retval = new ChunkyParser.call_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal27=null;
        Token char_literal29=null;
        ChunkyParser.dot_return t =null;

        ChunkyParser.args_return args28 =null;


        CommonTree char_literal27_tree=null;
        CommonTree char_literal29_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        RewriteRuleSubtreeStream stream_dot=new RewriteRuleSubtreeStream(adaptor,"rule dot");
        try { dbg.enterRule(getGrammarFileName(), "call");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(59, 0);

        try {
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:59:5: ( (t= dot -> $t) ( '(' args ')' -> ^( CALL $call args ) )* )
            dbg.enterAlt(1);

            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:59:7: (t= dot -> $t) ( '(' args ')' -> ^( CALL $call args ) )*
            {
            dbg.location(59,7);
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:59:7: (t= dot -> $t)
            dbg.enterAlt(1);

            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:59:8: t= dot
            {
            dbg.location(59,9);
            pushFollow(FOLLOW_dot_in_call369);
            t=dot();

            state._fsp--;

            stream_dot.add(t.getTree());

            // AST REWRITE
            // elements: t
            // token labels: 
            // rule labels: retval, t
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 59:13: -> $t
            {
                dbg.location(59,16);
                adaptor.addChild(root_0, stream_t.nextTree());

            }


            retval.tree = root_0;

            }

            dbg.location(60,3);
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:60:3: ( '(' args ')' -> ^( CALL $call args ) )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:61:4: '(' args ')'
            	    {
            	    dbg.location(61,4);
            	    char_literal27=(Token)match(input,22,FOLLOW_22_in_call382);  
            	    stream_22.add(char_literal27);

            	    dbg.location(61,8);
            	    pushFollow(FOLLOW_args_in_call384);
            	    args28=args();

            	    state._fsp--;

            	    stream_args.add(args28.getTree());
            	    dbg.location(61,13);
            	    char_literal29=(Token)match(input,23,FOLLOW_23_in_call386);  
            	    stream_23.add(char_literal29);


            	    // AST REWRITE
            	    // elements: call, args
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 62:4: -> ^( CALL $call args )
            	    {
            	        dbg.location(62,7);
            	        // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:62:7: ^( CALL $call args )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        dbg.location(62,9);
            	        root_1 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(CALL, "CALL")
            	        , root_1);

            	        dbg.location(62,15);
            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        dbg.location(62,20);
            	        adaptor.addChild(root_1, stream_args.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(64, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "call");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "call"


    public static class not_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "not"
    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:66:1: not : ( '!' ^)? call ;
    public final ChunkyParser.not_return not() throws RecognitionException {
        ChunkyParser.not_return retval = new ChunkyParser.not_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal30=null;
        ChunkyParser.call_return call31 =null;


        CommonTree char_literal30_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "not");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(66, 0);

        try {
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:66:5: ( ( '!' ^)? call )
            dbg.enterAlt(1);

            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:66:7: ( '!' ^)? call
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(66,10);
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:66:10: ( '!' ^)?
            int alt11=2;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:66:10: '!' ^
                    {
                    dbg.location(66,10);
                    char_literal30=(Token)match(input,18,FOLLOW_18_in_not415); 
                    char_literal30_tree = 
                    (CommonTree)adaptor.create(char_literal30)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal30_tree, root_0);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}

            dbg.location(66,13);
            pushFollow(FOLLOW_call_in_not419);
            call31=call();

            state._fsp--;

            adaptor.addChild(root_0, call31.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(67, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "not");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "not"


    public static class mul_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mul"
    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:69:1: mul : not ( ( '*' | '/' ) ^ not )* ;
    public final ChunkyParser.mul_return mul() throws RecognitionException {
        ChunkyParser.mul_return retval = new ChunkyParser.mul_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set33=null;
        ChunkyParser.not_return not32 =null;

        ChunkyParser.not_return not34 =null;


        CommonTree set33_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "mul");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(69, 0);

        try {
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:69:5: ( not ( ( '*' | '/' ) ^ not )* )
            dbg.enterAlt(1);

            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:69:7: not ( ( '*' | '/' ) ^ not )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(69,7);
            pushFollow(FOLLOW_not_in_mul429);
            not32=not();

            state._fsp--;

            adaptor.addChild(root_0, not32.getTree());
            dbg.location(69,11);
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:69:11: ( ( '*' | '/' ) ^ not )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==24||LA12_0==28) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:69:12: ( '*' | '/' ) ^ not
            	    {
            	    dbg.location(69,23);
            	    set33=(Token)input.LT(1);

            	    set33=(Token)input.LT(1);

            	    if ( input.LA(1)==24||input.LA(1)==28 ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set33)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(69,25);
            	    pushFollow(FOLLOW_not_in_mul441);
            	    not34=not();

            	    state._fsp--;

            	    adaptor.addChild(root_0, not34.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(70, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mul");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "mul"


    public static class add_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:72:1: add : mul ( ( '+' | '-' ) ^ mul )* ;
    public final ChunkyParser.add_return add() throws RecognitionException {
        ChunkyParser.add_return retval = new ChunkyParser.add_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set36=null;
        ChunkyParser.mul_return mul35 =null;

        ChunkyParser.mul_return mul37 =null;


        CommonTree set36_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "add");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(72, 0);

        try {
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:72:5: ( mul ( ( '+' | '-' ) ^ mul )* )
            dbg.enterAlt(1);

            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:72:7: mul ( ( '+' | '-' ) ^ mul )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(72,7);
            pushFollow(FOLLOW_mul_in_add453);
            mul35=mul();

            state._fsp--;

            adaptor.addChild(root_0, mul35.getTree());
            dbg.location(72,11);
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:72:11: ( ( '+' | '-' ) ^ mul )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==25||LA13_0==27) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:72:12: ( '+' | '-' ) ^ mul
            	    {
            	    dbg.location(72,23);
            	    set36=(Token)input.LT(1);

            	    set36=(Token)input.LT(1);

            	    if ( input.LA(1)==25||input.LA(1)==27 ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set36)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(72,25);
            	    pushFollow(FOLLOW_mul_in_add465);
            	    mul37=mul();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mul37.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(73, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "add");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "add"


    public static class comp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comp"
    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:75:1: comp : add ( ( '==' | '<' | '<=' | '>=' | '>' | '!=' ) ^ add )* ;
    public final ChunkyParser.comp_return comp() throws RecognitionException {
        ChunkyParser.comp_return retval = new ChunkyParser.comp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set39=null;
        ChunkyParser.add_return add38 =null;

        ChunkyParser.add_return add40 =null;


        CommonTree set39_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "comp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 0);

        try {
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:75:5: ( add ( ( '==' | '<' | '<=' | '>=' | '>' | '!=' ) ^ add )* )
            dbg.enterAlt(1);

            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:75:7: add ( ( '==' | '<' | '<=' | '>=' | '>' | '!=' ) ^ add )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(75,7);
            pushFollow(FOLLOW_add_in_comp476);
            add38=add();

            state._fsp--;

            adaptor.addChild(root_0, add38.getTree());
            dbg.location(75,11);
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:75:11: ( ( '==' | '<' | '<=' | '>=' | '>' | '!=' ) ^ add )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                int LA14_0 = input.LA(1);

                if ( (LA14_0==19||(LA14_0 >= 30 && LA14_0 <= 31)||(LA14_0 >= 33 && LA14_0 <= 35)) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:75:12: ( '==' | '<' | '<=' | '>=' | '>' | '!=' ) ^ add
            	    {
            	    dbg.location(75,51);
            	    set39=(Token)input.LT(1);

            	    set39=(Token)input.LT(1);

            	    if ( input.LA(1)==19||(input.LA(1) >= 30 && input.LA(1) <= 31)||(input.LA(1) >= 33 && input.LA(1) <= 35) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set39)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(75,53);
            	    pushFollow(FOLLOW_add_in_comp504);
            	    add40=add();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add40.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);
            } finally {dbg.exitSubRule(14);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(76, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "comp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "comp"


    public static class bool_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool"
    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:78:1: bool : comp ( ( '&' | '&&' | '|' | '||' ) ^ comp )* ;
    public final ChunkyParser.bool_return bool() throws RecognitionException {
        ChunkyParser.bool_return retval = new ChunkyParser.bool_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set42=null;
        ChunkyParser.comp_return comp41 =null;

        ChunkyParser.comp_return comp43 =null;


        CommonTree set42_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bool");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(78, 0);

        try {
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:78:5: ( comp ( ( '&' | '&&' | '|' | '||' ) ^ comp )* )
            dbg.enterAlt(1);

            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:78:7: comp ( ( '&' | '&&' | '|' | '||' ) ^ comp )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(78,7);
            pushFollow(FOLLOW_comp_in_bool515);
            comp41=comp();

            state._fsp--;

            adaptor.addChild(root_0, comp41.getTree());
            dbg.location(78,12);
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:78:12: ( ( '&' | '&&' | '|' | '||' ) ^ comp )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                int LA15_0 = input.LA(1);

                if ( ((LA15_0 >= 20 && LA15_0 <= 21)||(LA15_0 >= 38 && LA15_0 <= 39)) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:78:13: ( '&' | '&&' | '|' | '||' ) ^ comp
            	    {
            	    dbg.location(78,38);
            	    set42=(Token)input.LT(1);

            	    set42=(Token)input.LT(1);

            	    if ( (input.LA(1) >= 20 && input.LA(1) <= 21)||(input.LA(1) >= 38 && input.LA(1) <= 39) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set42)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(78,40);
            	    pushFollow(FOLLOW_comp_in_bool535);
            	    comp43=comp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comp43.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);
            } finally {dbg.exitSubRule(15);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(79, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "bool");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "bool"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:81:1: expr : bool ;
    public final ChunkyParser.expr_return expr() throws RecognitionException {
        ChunkyParser.expr_return retval = new ChunkyParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ChunkyParser.bool_return bool44 =null;



        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(81, 0);

        try {
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:81:5: ( bool )
            dbg.enterAlt(1);

            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:81:7: bool
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(81,7);
            pushFollow(FOLLOW_bool_in_expr546);
            bool44=bool();

            state._fsp--;

            adaptor.addChild(root_0, bool44.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(82, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr"


    public static class exprs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprs"
    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:84:1: exprs : ( (e+= expr )? ';' )+ -> ^( BLOCK ( $e)* ) ;
    public final ChunkyParser.exprs_return exprs() throws RecognitionException {
        ChunkyParser.exprs_return retval = new ChunkyParser.exprs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal45=null;
        List list_e=null;
        RuleReturnScope e = null;
        CommonTree char_literal45_tree=null;
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "exprs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 0);

        try {
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:85:2: ( ( (e+= expr )? ';' )+ -> ^( BLOCK ( $e)* ) )
            dbg.enterAlt(1);

            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:85:4: ( (e+= expr )? ';' )+
            {
            dbg.location(85,4);
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:85:4: ( (e+= expr )? ';' )+
            int cnt17=0;
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17, decisionCanBacktrack[17]);

                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= FLOAT && LA17_0 <= INT)||LA17_0==STRING||LA17_0==18||LA17_0==22||LA17_0==29) ) {
                    alt17=1;
                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:85:5: (e+= expr )? ';'
            	    {
            	    dbg.location(85,6);
            	    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:85:6: (e+= expr )?
            	    int alt16=2;
            	    try { dbg.enterSubRule(16);
            	    try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            	    int LA16_0 = input.LA(1);

            	    if ( ((LA16_0 >= FLOAT && LA16_0 <= INT)||LA16_0==STRING||LA16_0==18||LA16_0==22) ) {
            	        alt16=1;
            	    }
            	    } finally {dbg.exitDecision(16);}

            	    switch (alt16) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:85:6: e+= expr
            	            {
            	            dbg.location(85,6);
            	            pushFollow(FOLLOW_expr_in_exprs560);
            	            e=expr();

            	            state._fsp--;

            	            stream_expr.add(e.getTree());
            	            if (list_e==null) list_e=new ArrayList();
            	            list_e.add(e.getTree());


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(16);}

            	    dbg.location(85,14);
            	    char_literal45=(Token)match(input,29,FOLLOW_29_in_exprs563);  
            	    stream_29.add(char_literal45);


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt17++;
            } while (true);
            } finally {dbg.exitSubRule(17);}


            // AST REWRITE
            // elements: e
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: e
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"token e",list_e);
            root_0 = (CommonTree)adaptor.nil();
            // 86:3: -> ^( BLOCK ( $e)* )
            {
                dbg.location(86,6);
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:86:6: ^( BLOCK ( $e)* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(86,8);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                dbg.location(86,15);
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:86:15: ( $e)*
                while ( stream_e.hasNext() ) {
                    dbg.location(86,15);
                    adaptor.addChild(root_1, stream_e.nextTree());

                }
                stream_e.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(87, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprs");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprs"


    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:89:1: block : '{' ! ( exprs )? '}' !;
    public final ChunkyParser.block_return block() throws RecognitionException {
        ChunkyParser.block_return retval = new ChunkyParser.block_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal46=null;
        Token char_literal48=null;
        ChunkyParser.exprs_return exprs47 =null;


        CommonTree char_literal46_tree=null;
        CommonTree char_literal48_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 0);

        try {
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:90:2: ( '{' ! ( exprs )? '}' !)
            dbg.enterAlt(1);

            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:90:4: '{' ! ( exprs )? '}' !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(90,7);
            char_literal46=(Token)match(input,37,FOLLOW_37_in_block589); 
            dbg.location(90,9);
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:90:9: ( exprs )?
            int alt18=2;
            try { dbg.enterSubRule(18);
            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

            int LA18_0 = input.LA(1);

            if ( ((LA18_0 >= FLOAT && LA18_0 <= INT)||LA18_0==STRING||LA18_0==18||LA18_0==22||LA18_0==29) ) {
                alt18=1;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:90:9: exprs
                    {
                    dbg.location(90,9);
                    pushFollow(FOLLOW_exprs_in_block592);
                    exprs47=exprs();

                    state._fsp--;

                    adaptor.addChild(root_0, exprs47.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(18);}

            dbg.location(90,19);
            char_literal48=(Token)match(input,40,FOLLOW_40_in_block595); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(91, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "block"

    // Delegated rules


 

    public static final BitSet FOLLOW_exprs_in_program80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_params94 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_params97 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_params101 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_FUNC_in_func_expr128 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_func_expr131 = new BitSet(new long[]{0x0000000000800800L});
    public static final BitSet FOLLOW_params_in_func_expr134 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_func_expr136 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_block_in_func_expr139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_expr150 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_if_expr152 = new BitSet(new long[]{0x0000000000453E00L});
    public static final BitSet FOLLOW_expr_in_if_expr156 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_if_expr158 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_block_in_if_expr162 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_if_expr168 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_if_expr_in_if_expr174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_if_expr200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_term262 = new BitSet(new long[]{0x0000000000453E00L});
    public static final BitSet FOLLOW_expr_in_term265 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_term267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_term273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_term278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_term283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_term288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_expr_in_term293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_dot304 = new BitSet(new long[]{0x0000000100000102L});
    public static final BitSet FOLLOW_DOT_in_dot307 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_dot310 = new BitSet(new long[]{0x0000000100000102L});
    public static final BitSet FOLLOW_32_in_dot318 = new BitSet(new long[]{0x0000000000453E00L});
    public static final BitSet FOLLOW_expr_in_dot321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_args335 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_args338 = new BitSet(new long[]{0x0000000000453E00L});
    public static final BitSet FOLLOW_expr_in_args342 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_dot_in_call369 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_call382 = new BitSet(new long[]{0x0000000000C53E00L});
    public static final BitSet FOLLOW_args_in_call384 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_call386 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18_in_not415 = new BitSet(new long[]{0x0000000000413E00L});
    public static final BitSet FOLLOW_call_in_not419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_in_mul429 = new BitSet(new long[]{0x0000000011000002L});
    public static final BitSet FOLLOW_set_in_mul432 = new BitSet(new long[]{0x0000000000453E00L});
    public static final BitSet FOLLOW_not_in_mul441 = new BitSet(new long[]{0x0000000011000002L});
    public static final BitSet FOLLOW_mul_in_add453 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_set_in_add456 = new BitSet(new long[]{0x0000000000453E00L});
    public static final BitSet FOLLOW_mul_in_add465 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_add_in_comp476 = new BitSet(new long[]{0x0000000EC0080002L});
    public static final BitSet FOLLOW_set_in_comp479 = new BitSet(new long[]{0x0000000000453E00L});
    public static final BitSet FOLLOW_add_in_comp504 = new BitSet(new long[]{0x0000000EC0080002L});
    public static final BitSet FOLLOW_comp_in_bool515 = new BitSet(new long[]{0x000000C000300002L});
    public static final BitSet FOLLOW_set_in_bool518 = new BitSet(new long[]{0x0000000000453E00L});
    public static final BitSet FOLLOW_comp_in_bool535 = new BitSet(new long[]{0x000000C000300002L});
    public static final BitSet FOLLOW_bool_in_expr546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprs560 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_exprs563 = new BitSet(new long[]{0x0000000020453E02L});
    public static final BitSet FOLLOW_37_in_block589 = new BitSet(new long[]{0x0000010020453E00L});
    public static final BitSet FOLLOW_exprs_in_block592 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_block595 = new BitSet(new long[]{0x0000000000000002L});

}