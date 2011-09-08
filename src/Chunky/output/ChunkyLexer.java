// $ANTLR 3.4 C:\\Source\\chunky\\src\\Chunky\\Chunky.g 2011-09-08 17:52:21

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ChunkyLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ChunkyLexer() {} 
    public ChunkyLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ChunkyLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Source\\chunky\\src\\Chunky\\Chunky.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:9:7: ( '!' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:9:9: '!'
            {
            match('!'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:10:7: ( '!=' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:10:9: '!='
            {
            match("!="); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:11:7: ( '&&' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:11:9: '&&'
            {
            match("&&"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:12:7: ( '&' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:12:9: '&'
            {
            match('&'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:13:7: ( '(' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:13:9: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:14:7: ( ')' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:14:9: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:15:7: ( '*' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:15:9: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:16:7: ( '+' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:16:9: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:17:7: ( ',' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:17:9: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:18:7: ( '-' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:18:9: '-'
            {
            match('-'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:19:7: ( '/' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:19:9: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:20:7: ( ';' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:20:9: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:21:7: ( '<' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:21:9: '<'
            {
            match('<'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:22:7: ( '<=' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:22:9: '<='
            {
            match("<="); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:23:7: ( '=' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:23:9: '='
            {
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:24:7: ( '==' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:24:9: '=='
            {
            match("=="); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:25:7: ( '>' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:25:9: '>'
            {
            match('>'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:26:7: ( '>=' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:26:9: '>='
            {
            match(">="); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:27:7: ( 'else' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:27:9: 'else'
            {
            match("else"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:28:7: ( '{' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:28:9: '{'
            {
            match('{'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:29:7: ( '|' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:29:9: '|'
            {
            match('|'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:30:7: ( '||' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:30:9: '||'
            {
            match("||"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:31:7: ( '}' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:31:9: '}'
            {
            match('}'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:97:2: ( '\"' (~ '\"' | '\\\\\"' )* '\"' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:97:4: '\"' (~ '\"' | '\\\\\"' )* '\"'
            {
            match('\"'); if (state.failed) return ;

            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:97:8: (~ '\"' | '\\\\\"' )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2=='\"') ) {
                        int LA1_4 = input.LA(3);

                        if ( ((LA1_4 >= '\u0000' && LA1_4 <= '\uFFFF')) ) {
                            alt1=2;
                        }

                        else {
                            alt1=1;
                        }


                    }
                    else if ( ((LA1_2 >= '\u0000' && LA1_2 <= '!')||(LA1_2 >= '#' && LA1_2 <= '\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '[')||(LA1_0 >= ']' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:97:9: ~ '\"'
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:97:14: '\\\\\"'
            	    {
            	    match("\\\""); if (state.failed) return ;



            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match('\"'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:100:4: ( 'if' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:100:6: 'if'
            {
            match("if"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:102:5: ( 'func' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:102:7: 'func'
            {
            match("func"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:104:4: ( ( LETTER | '_' ) ( LETTER | DIGIT | '_' )* )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:104:6: ( LETTER | '_' ) ( LETTER | DIGIT | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:104:21: ( LETTER | DIGIT | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:107:5: ( ( DIGIT )+ )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:107:7: ( DIGIT )+
            {
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:107:7: ( DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:110:2: ( ( DIGIT )* ( ( '.' ( DIGIT )+ )=> ( '.' ( DIGIT )+ ) |) )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:110:4: ( DIGIT )* ( ( '.' ( DIGIT )+ )=> ( '.' ( DIGIT )+ ) |)
            {
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:110:4: ( DIGIT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:110:13: ( ( '.' ( DIGIT )+ )=> ( '.' ( DIGIT )+ ) |)
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='.') && (synpred1_Chunky())) {
                alt6=1;
            }
            else {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:110:14: ( '.' ( DIGIT )+ )=> ( '.' ( DIGIT )+ )
                    {
                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:110:28: ( '.' ( DIGIT )+ )
                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:110:29: '.' ( DIGIT )+
                    {
                    match('.'); if (state.failed) return ;

                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:110:33: ( DIGIT )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:110:43: 
                    {
                    if ( state.backtracking==0 ) { _type = INT; }

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:113:4: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:113:6: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( state.backtracking==0 ) {_channel=99;}

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:120:5: ( '.' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:120:7: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:124:8: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:127:7: ( '0' .. '9' )
            // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    public void mTokens() throws RecognitionException {
        // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | STRING | IF | FUNC | ID | INT | FLOAT | WS | DOT )
        int alt7=31;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:10: T__18
                {
                mT__18(); if (state.failed) return ;


                }
                break;
            case 2 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:16: T__19
                {
                mT__19(); if (state.failed) return ;


                }
                break;
            case 3 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:22: T__20
                {
                mT__20(); if (state.failed) return ;


                }
                break;
            case 4 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:28: T__21
                {
                mT__21(); if (state.failed) return ;


                }
                break;
            case 5 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:34: T__22
                {
                mT__22(); if (state.failed) return ;


                }
                break;
            case 6 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:40: T__23
                {
                mT__23(); if (state.failed) return ;


                }
                break;
            case 7 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:46: T__24
                {
                mT__24(); if (state.failed) return ;


                }
                break;
            case 8 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:52: T__25
                {
                mT__25(); if (state.failed) return ;


                }
                break;
            case 9 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:58: T__26
                {
                mT__26(); if (state.failed) return ;


                }
                break;
            case 10 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:64: T__27
                {
                mT__27(); if (state.failed) return ;


                }
                break;
            case 11 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:70: T__28
                {
                mT__28(); if (state.failed) return ;


                }
                break;
            case 12 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:76: T__29
                {
                mT__29(); if (state.failed) return ;


                }
                break;
            case 13 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:82: T__30
                {
                mT__30(); if (state.failed) return ;


                }
                break;
            case 14 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:88: T__31
                {
                mT__31(); if (state.failed) return ;


                }
                break;
            case 15 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:94: T__32
                {
                mT__32(); if (state.failed) return ;


                }
                break;
            case 16 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:100: T__33
                {
                mT__33(); if (state.failed) return ;


                }
                break;
            case 17 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:106: T__34
                {
                mT__34(); if (state.failed) return ;


                }
                break;
            case 18 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:112: T__35
                {
                mT__35(); if (state.failed) return ;


                }
                break;
            case 19 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:118: T__36
                {
                mT__36(); if (state.failed) return ;


                }
                break;
            case 20 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:124: T__37
                {
                mT__37(); if (state.failed) return ;


                }
                break;
            case 21 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:130: T__38
                {
                mT__38(); if (state.failed) return ;


                }
                break;
            case 22 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:136: T__39
                {
                mT__39(); if (state.failed) return ;


                }
                break;
            case 23 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:142: T__40
                {
                mT__40(); if (state.failed) return ;


                }
                break;
            case 24 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:148: STRING
                {
                mSTRING(); if (state.failed) return ;


                }
                break;
            case 25 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:155: IF
                {
                mIF(); if (state.failed) return ;


                }
                break;
            case 26 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:158: FUNC
                {
                mFUNC(); if (state.failed) return ;


                }
                break;
            case 27 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:163: ID
                {
                mID(); if (state.failed) return ;


                }
                break;
            case 28 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:166: INT
                {
                mINT(); if (state.failed) return ;


                }
                break;
            case 29 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:170: FLOAT
                {
                mFLOAT(); if (state.failed) return ;


                }
                break;
            case 30 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:176: WS
                {
                mWS(); if (state.failed) return ;


                }
                break;
            case 31 :
                // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:1:179: DOT
                {
                mDOT(); if (state.failed) return ;


                }
                break;

        }

    }

    // $ANTLR start synpred1_Chunky
    public final void synpred1_Chunky_fragment() throws RecognitionException {
        // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:110:14: ( '.' ( DIGIT )+ )
        // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:110:15: '.' ( DIGIT )+
        {
        match('.'); if (state.failed) return ;

        // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:110:19: ( DIGIT )+
        int cnt8=0;
        loop8:
        do {
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                alt8=1;
            }


            switch (alt8) {
        	case 1 :
        	    // C:\\Source\\chunky\\src\\Chunky\\Chunky.g:
        	    {
        	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
        	        input.consume();
        	        state.failed=false;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        MismatchedSetException mse = new MismatchedSetException(null,input);
        	        recover(mse);
        	        throw mse;
        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt8 >= 1 ) break loop8;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(8, input);
                    throw eee;
            }
            cnt8++;
        } while (true);


        }

    }
    // $ANTLR end synpred1_Chunky

    public final boolean synpred1_Chunky() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Chunky_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\1\30\1\33\1\35\10\uffff\1\37\1\41\1\43\1\25\1\uffff\1\46\2\uffff"+
        "\2\25\1\uffff\1\51\1\52\14\uffff\1\25\2\uffff\1\54\1\25\2\uffff"+
        "\1\25\1\uffff\1\25\1\60\1\61\2\uffff";
    static final String DFA7_eofS =
        "\62\uffff";
    static final String DFA7_minS =
        "\1\11\1\75\1\46\10\uffff\3\75\1\154\1\uffff\1\174\2\uffff\1\146"+
        "\1\165\1\uffff\1\56\1\60\14\uffff\1\163\2\uffff\1\60\1\156\2\uffff"+
        "\1\145\1\uffff\1\143\2\60\2\uffff";
    static final String DFA7_maxS =
        "\1\175\1\75\1\46\10\uffff\3\75\1\154\1\uffff\1\174\2\uffff\1\146"+
        "\1\165\1\uffff\2\71\14\uffff\1\163\2\uffff\1\172\1\156\2\uffff\1"+
        "\145\1\uffff\1\143\2\172\2\uffff";
    static final String DFA7_acceptS =
        "\3\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\4\uffff\1\24\1\uffff"+
        "\1\27\1\30\2\uffff\1\33\2\uffff\1\35\1\36\1\2\1\1\1\3\1\4\1\16\1"+
        "\15\1\20\1\17\1\22\1\21\1\uffff\1\26\1\25\2\uffff\1\34\1\37\1\uffff"+
        "\1\31\3\uffff\1\23\1\32";
    static final String DFA7_specialS =
        "\62\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\1\1\1\22\3\uffff\1\2\1\uffff"+
            "\1\3\1\4\1\5\1\6\1\7\1\10\1\27\1\11\12\26\1\uffff\1\12\1\13"+
            "\1\14\1\15\2\uffff\32\25\4\uffff\1\25\1\uffff\4\25\1\16\1\24"+
            "\2\25\1\23\21\25\1\17\1\20\1\21",
            "\1\32",
            "\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36",
            "\1\40",
            "\1\42",
            "\1\44",
            "",
            "\1\45",
            "",
            "",
            "\1\47",
            "\1\50",
            "",
            "\1\30\1\uffff\12\26",
            "\12\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\55",
            "",
            "",
            "\1\56",
            "",
            "\1\57",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | STRING | IF | FUNC | ID | INT | FLOAT | WS | DOT );";
        }
    }
 

}