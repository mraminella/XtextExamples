package org.xtext.example.smalljava.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.smalljava.services.SmallJavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSmallJavaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'class'", "'{'", "'}'", "'extends'", "';'", "'('", "')'", "','", "'return'", "'='", "'if'", "'else'", "'.'", "'this'", "'null'", "'new'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSmallJavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallJavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallJavaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmallJava.g"; }


    	private SmallJavaGrammarAccess grammarAccess;

    	public void setGrammarAccess(SmallJavaGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSJProgram"
    // InternalSmallJava.g:54:1: entryRuleSJProgram : ruleSJProgram EOF ;
    public final void entryRuleSJProgram() throws RecognitionException {
        try {
            // InternalSmallJava.g:55:1: ( ruleSJProgram EOF )
            // InternalSmallJava.g:56:1: ruleSJProgram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSJProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJProgramRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSJProgram"


    // $ANTLR start "ruleSJProgram"
    // InternalSmallJava.g:63:1: ruleSJProgram : ( ( rule__SJProgram__ClassesAssignment )* ) ;
    public final void ruleSJProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:67:2: ( ( ( rule__SJProgram__ClassesAssignment )* ) )
            // InternalSmallJava.g:68:2: ( ( rule__SJProgram__ClassesAssignment )* )
            {
            // InternalSmallJava.g:68:2: ( ( rule__SJProgram__ClassesAssignment )* )
            // InternalSmallJava.g:69:3: ( rule__SJProgram__ClassesAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJProgramAccess().getClassesAssignment()); 
            }
            // InternalSmallJava.g:70:3: ( rule__SJProgram__ClassesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSmallJava.g:70:4: rule__SJProgram__ClassesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__SJProgram__ClassesAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJProgramAccess().getClassesAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSJProgram"


    // $ANTLR start "entryRuleSJClass"
    // InternalSmallJava.g:79:1: entryRuleSJClass : ruleSJClass EOF ;
    public final void entryRuleSJClass() throws RecognitionException {
        try {
            // InternalSmallJava.g:80:1: ( ruleSJClass EOF )
            // InternalSmallJava.g:81:1: ruleSJClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSJClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSJClass"


    // $ANTLR start "ruleSJClass"
    // InternalSmallJava.g:88:1: ruleSJClass : ( ( rule__SJClass__Group__0 ) ) ;
    public final void ruleSJClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:92:2: ( ( ( rule__SJClass__Group__0 ) ) )
            // InternalSmallJava.g:93:2: ( ( rule__SJClass__Group__0 ) )
            {
            // InternalSmallJava.g:93:2: ( ( rule__SJClass__Group__0 ) )
            // InternalSmallJava.g:94:3: ( rule__SJClass__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getGroup()); 
            }
            // InternalSmallJava.g:95:3: ( rule__SJClass__Group__0 )
            // InternalSmallJava.g:95:4: rule__SJClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SJClass__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSJClass"


    // $ANTLR start "entryRuleSJMember"
    // InternalSmallJava.g:104:1: entryRuleSJMember : ruleSJMember EOF ;
    public final void entryRuleSJMember() throws RecognitionException {
        try {
            // InternalSmallJava.g:105:1: ( ruleSJMember EOF )
            // InternalSmallJava.g:106:1: ruleSJMember EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSJMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMemberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSJMember"


    // $ANTLR start "ruleSJMember"
    // InternalSmallJava.g:113:1: ruleSJMember : ( ( rule__SJMember__Alternatives ) ) ;
    public final void ruleSJMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:117:2: ( ( ( rule__SJMember__Alternatives ) ) )
            // InternalSmallJava.g:118:2: ( ( rule__SJMember__Alternatives ) )
            {
            // InternalSmallJava.g:118:2: ( ( rule__SJMember__Alternatives ) )
            // InternalSmallJava.g:119:3: ( rule__SJMember__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMemberAccess().getAlternatives()); 
            }
            // InternalSmallJava.g:120:3: ( rule__SJMember__Alternatives )
            // InternalSmallJava.g:120:4: rule__SJMember__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SJMember__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMemberAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSJMember"


    // $ANTLR start "ruleSJTypedDeclaration"
    // InternalSmallJava.g:130:1: ruleSJTypedDeclaration : ( ( rule__SJTypedDeclaration__Group__0 ) ) ;
    public final void ruleSJTypedDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:134:2: ( ( ( rule__SJTypedDeclaration__Group__0 ) ) )
            // InternalSmallJava.g:135:2: ( ( rule__SJTypedDeclaration__Group__0 ) )
            {
            // InternalSmallJava.g:135:2: ( ( rule__SJTypedDeclaration__Group__0 ) )
            // InternalSmallJava.g:136:3: ( rule__SJTypedDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTypedDeclarationAccess().getGroup()); 
            }
            // InternalSmallJava.g:137:3: ( rule__SJTypedDeclaration__Group__0 )
            // InternalSmallJava.g:137:4: rule__SJTypedDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SJTypedDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTypedDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSJTypedDeclaration"


    // $ANTLR start "entryRuleSJField"
    // InternalSmallJava.g:146:1: entryRuleSJField : ruleSJField EOF ;
    public final void entryRuleSJField() throws RecognitionException {
        try {
            // InternalSmallJava.g:147:1: ( ruleSJField EOF )
            // InternalSmallJava.g:148:1: ruleSJField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSJField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJFieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSJField"


    // $ANTLR start "ruleSJField"
    // InternalSmallJava.g:155:1: ruleSJField : ( ( rule__SJField__Group__0 ) ) ;
    public final void ruleSJField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:159:2: ( ( ( rule__SJField__Group__0 ) ) )
            // InternalSmallJava.g:160:2: ( ( rule__SJField__Group__0 ) )
            {
            // InternalSmallJava.g:160:2: ( ( rule__SJField__Group__0 ) )
            // InternalSmallJava.g:161:3: ( rule__SJField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJFieldAccess().getGroup()); 
            }
            // InternalSmallJava.g:162:3: ( rule__SJField__Group__0 )
            // InternalSmallJava.g:162:4: rule__SJField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SJField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSJField"


    // $ANTLR start "entryRuleSJMethod"
    // InternalSmallJava.g:171:1: entryRuleSJMethod : ruleSJMethod EOF ;
    public final void entryRuleSJMethod() throws RecognitionException {
        try {
            // InternalSmallJava.g:172:1: ( ruleSJMethod EOF )
            // InternalSmallJava.g:173:1: ruleSJMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSJMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSJMethod"


    // $ANTLR start "ruleSJMethod"
    // InternalSmallJava.g:180:1: ruleSJMethod : ( ( rule__SJMethod__Group__0 ) ) ;
    public final void ruleSJMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:184:2: ( ( ( rule__SJMethod__Group__0 ) ) )
            // InternalSmallJava.g:185:2: ( ( rule__SJMethod__Group__0 ) )
            {
            // InternalSmallJava.g:185:2: ( ( rule__SJMethod__Group__0 ) )
            // InternalSmallJava.g:186:3: ( rule__SJMethod__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getGroup()); 
            }
            // InternalSmallJava.g:187:3: ( rule__SJMethod__Group__0 )
            // InternalSmallJava.g:187:4: rule__SJMethod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SJMethod__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSJMethod"


    // $ANTLR start "entryRuleSJParameter"
    // InternalSmallJava.g:196:1: entryRuleSJParameter : ruleSJParameter EOF ;
    public final void entryRuleSJParameter() throws RecognitionException {
        try {
            // InternalSmallJava.g:197:1: ( ruleSJParameter EOF )
            // InternalSmallJava.g:198:1: ruleSJParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSJParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSJParameter"


    // $ANTLR start "ruleSJParameter"
    // InternalSmallJava.g:205:1: ruleSJParameter : ( ruleSJTypedDeclaration ) ;
    public final void ruleSJParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:209:2: ( ( ruleSJTypedDeclaration ) )
            // InternalSmallJava.g:210:2: ( ruleSJTypedDeclaration )
            {
            // InternalSmallJava.g:210:2: ( ruleSJTypedDeclaration )
            // InternalSmallJava.g:211:3: ruleSJTypedDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJParameterAccess().getSJTypedDeclarationParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJTypedDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJParameterAccess().getSJTypedDeclarationParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSJParameter"


    // $ANTLR start "entryRuleSJBlock"
    // InternalSmallJava.g:221:1: entryRuleSJBlock : ruleSJBlock EOF ;
    public final void entryRuleSJBlock() throws RecognitionException {
        try {
            // InternalSmallJava.g:222:1: ( ruleSJBlock EOF )
            // InternalSmallJava.g:223:1: ruleSJBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSJBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJBlockRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSJBlock"


    // $ANTLR start "ruleSJBlock"
    // InternalSmallJava.g:230:1: ruleSJBlock : ( ( rule__SJBlock__Group__0 ) ) ;
    public final void ruleSJBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:234:2: ( ( ( rule__SJBlock__Group__0 ) ) )
            // InternalSmallJava.g:235:2: ( ( rule__SJBlock__Group__0 ) )
            {
            // InternalSmallJava.g:235:2: ( ( rule__SJBlock__Group__0 ) )
            // InternalSmallJava.g:236:3: ( rule__SJBlock__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJBlockAccess().getGroup()); 
            }
            // InternalSmallJava.g:237:3: ( rule__SJBlock__Group__0 )
            // InternalSmallJava.g:237:4: rule__SJBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SJBlock__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJBlockAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSJBlock"


    // $ANTLR start "entryRuleSJStatement"
    // InternalSmallJava.g:246:1: entryRuleSJStatement : ruleSJStatement EOF ;
    public final void entryRuleSJStatement() throws RecognitionException {
        try {
            // InternalSmallJava.g:247:1: ( ruleSJStatement EOF )
            // InternalSmallJava.g:248:1: ruleSJStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSJStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSJStatement"


    // $ANTLR start "ruleSJStatement"
    // InternalSmallJava.g:255:1: ruleSJStatement : ( ( rule__SJStatement__Alternatives ) ) ;
    public final void ruleSJStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:259:2: ( ( ( rule__SJStatement__Alternatives ) ) )
            // InternalSmallJava.g:260:2: ( ( rule__SJStatement__Alternatives ) )
            {
            // InternalSmallJava.g:260:2: ( ( rule__SJStatement__Alternatives ) )
            // InternalSmallJava.g:261:3: ( rule__SJStatement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJStatementAccess().getAlternatives()); 
            }
            // InternalSmallJava.g:262:3: ( rule__SJStatement__Alternatives )
            // InternalSmallJava.g:262:4: rule__SJStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SJStatement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJStatementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSJStatement"


    // $ANTLR start "entryRuleSJReturn"
    // InternalSmallJava.g:271:1: entryRuleSJReturn : ruleSJReturn EOF ;
    public final void entryRuleSJReturn() throws RecognitionException {
        try {
            // InternalSmallJava.g:272:1: ( ruleSJReturn EOF )
            // InternalSmallJava.g:273:1: ruleSJReturn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJReturnRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSJReturn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJReturnRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSJReturn"


    // $ANTLR start "ruleSJReturn"
    // InternalSmallJava.g:280:1: ruleSJReturn : ( ( rule__SJReturn__Group__0 ) ) ;
    public final void ruleSJReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:284:2: ( ( ( rule__SJReturn__Group__0 ) ) )
            // InternalSmallJava.g:285:2: ( ( rule__SJReturn__Group__0 ) )
            {
            // InternalSmallJava.g:285:2: ( ( rule__SJReturn__Group__0 ) )
            // InternalSmallJava.g:286:3: ( rule__SJReturn__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJReturnAccess().getGroup()); 
            }
            // InternalSmallJava.g:287:3: ( rule__SJReturn__Group__0 )
            // InternalSmallJava.g:287:4: rule__SJReturn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SJReturn__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJReturnAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSJReturn"


    // $ANTLR start "entryRuleSJVariableDeclaration"
    // InternalSmallJava.g:296:1: entryRuleSJVariableDeclaration : ruleSJVariableDeclaration EOF ;
    public final void entryRuleSJVariableDeclaration() throws RecognitionException {
        try {
            // InternalSmallJava.g:297:1: ( ruleSJVariableDeclaration EOF )
            // InternalSmallJava.g:298:1: ruleSJVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSJVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJVariableDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSJVariableDeclaration"


    // $ANTLR start "ruleSJVariableDeclaration"
    // InternalSmallJava.g:305:1: ruleSJVariableDeclaration : ( ( rule__SJVariableDeclaration__Group__0 ) ) ;
    public final void ruleSJVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:309:2: ( ( ( rule__SJVariableDeclaration__Group__0 ) ) )
            // InternalSmallJava.g:310:2: ( ( rule__SJVariableDeclaration__Group__0 ) )
            {
            // InternalSmallJava.g:310:2: ( ( rule__SJVariableDeclaration__Group__0 ) )
            // InternalSmallJava.g:311:3: ( rule__SJVariableDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJVariableDeclarationAccess().getGroup()); 
            }
            // InternalSmallJava.g:312:3: ( rule__SJVariableDeclaration__Group__0 )
            // InternalSmallJava.g:312:4: rule__SJVariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SJVariableDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJVariableDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSJVariableDeclaration"


    // $ANTLR start "entryRuleSJIfStatement"
    // InternalSmallJava.g:321:1: entryRuleSJIfStatement : ruleSJIfStatement EOF ;
    public final void entryRuleSJIfStatement() throws RecognitionException {
        try {
            // InternalSmallJava.g:322:1: ( ruleSJIfStatement EOF )
            // InternalSmallJava.g:323:1: ruleSJIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSJIfStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSJIfStatement"


    // $ANTLR start "ruleSJIfStatement"
    // InternalSmallJava.g:330:1: ruleSJIfStatement : ( ( rule__SJIfStatement__Group__0 ) ) ;
    public final void ruleSJIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:334:2: ( ( ( rule__SJIfStatement__Group__0 ) ) )
            // InternalSmallJava.g:335:2: ( ( rule__SJIfStatement__Group__0 ) )
            {
            // InternalSmallJava.g:335:2: ( ( rule__SJIfStatement__Group__0 ) )
            // InternalSmallJava.g:336:3: ( rule__SJIfStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getGroup()); 
            }
            // InternalSmallJava.g:337:3: ( rule__SJIfStatement__Group__0 )
            // InternalSmallJava.g:337:4: rule__SJIfStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SJIfStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSJIfStatement"


    // $ANTLR start "entryRuleSJIfBlock"
    // InternalSmallJava.g:346:1: entryRuleSJIfBlock : ruleSJIfBlock EOF ;
    public final void entryRuleSJIfBlock() throws RecognitionException {
        try {
            // InternalSmallJava.g:347:1: ( ruleSJIfBlock EOF )
            // InternalSmallJava.g:348:1: ruleSJIfBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSJIfBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfBlockRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSJIfBlock"


    // $ANTLR start "ruleSJIfBlock"
    // InternalSmallJava.g:355:1: ruleSJIfBlock : ( ( rule__SJIfBlock__Alternatives ) ) ;
    public final void ruleSJIfBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:359:2: ( ( ( rule__SJIfBlock__Alternatives ) ) )
            // InternalSmallJava.g:360:2: ( ( rule__SJIfBlock__Alternatives ) )
            {
            // InternalSmallJava.g:360:2: ( ( rule__SJIfBlock__Alternatives ) )
            // InternalSmallJava.g:361:3: ( rule__SJIfBlock__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfBlockAccess().getAlternatives()); 
            }
            // InternalSmallJava.g:362:3: ( rule__SJIfBlock__Alternatives )
            // InternalSmallJava.g:362:4: rule__SJIfBlock__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SJIfBlock__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfBlockAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSJIfBlock"


    // $ANTLR start "entryRuleSJSymbol"
    // InternalSmallJava.g:371:1: entryRuleSJSymbol : ruleSJSymbol EOF ;
    public final void entryRuleSJSymbol() throws RecognitionException {
        try {
            // InternalSmallJava.g:372:1: ( ruleSJSymbol EOF )
            // InternalSmallJava.g:373:1: ruleSJSymbol EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSymbolRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSJSymbol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSymbolRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSJSymbol"


    // $ANTLR start "ruleSJSymbol"
    // InternalSmallJava.g:380:1: ruleSJSymbol : ( ( rule__SJSymbol__Alternatives ) ) ;
    public final void ruleSJSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:384:2: ( ( ( rule__SJSymbol__Alternatives ) ) )
            // InternalSmallJava.g:385:2: ( ( rule__SJSymbol__Alternatives ) )
            {
            // InternalSmallJava.g:385:2: ( ( rule__SJSymbol__Alternatives ) )
            // InternalSmallJava.g:386:3: ( rule__SJSymbol__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSymbolAccess().getAlternatives()); 
            }
            // InternalSmallJava.g:387:3: ( rule__SJSymbol__Alternatives )
            // InternalSmallJava.g:387:4: rule__SJSymbol__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SJSymbol__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSymbolAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSJSymbol"


    // $ANTLR start "entryRuleSJExpression"
    // InternalSmallJava.g:396:1: entryRuleSJExpression : ruleSJExpression EOF ;
    public final void entryRuleSJExpression() throws RecognitionException {
        try {
            // InternalSmallJava.g:397:1: ( ruleSJExpression EOF )
            // InternalSmallJava.g:398:1: ruleSJExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSJExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSJExpression"


    // $ANTLR start "ruleSJExpression"
    // InternalSmallJava.g:405:1: ruleSJExpression : ( ruleSJAssignment ) ;
    public final void ruleSJExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:409:2: ( ( ruleSJAssignment ) )
            // InternalSmallJava.g:410:2: ( ruleSJAssignment )
            {
            // InternalSmallJava.g:410:2: ( ruleSJAssignment )
            // InternalSmallJava.g:411:3: ruleSJAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJExpressionAccess().getSJAssignmentParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJExpressionAccess().getSJAssignmentParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSJExpression"


    // $ANTLR start "entryRuleSJAssignment"
    // InternalSmallJava.g:421:1: entryRuleSJAssignment : ruleSJAssignment EOF ;
    public final void entryRuleSJAssignment() throws RecognitionException {
        try {
            // InternalSmallJava.g:422:1: ( ruleSJAssignment EOF )
            // InternalSmallJava.g:423:1: ruleSJAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSJAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSJAssignment"


    // $ANTLR start "ruleSJAssignment"
    // InternalSmallJava.g:430:1: ruleSJAssignment : ( ( rule__SJAssignment__Group__0 ) ) ;
    public final void ruleSJAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:434:2: ( ( ( rule__SJAssignment__Group__0 ) ) )
            // InternalSmallJava.g:435:2: ( ( rule__SJAssignment__Group__0 ) )
            {
            // InternalSmallJava.g:435:2: ( ( rule__SJAssignment__Group__0 ) )
            // InternalSmallJava.g:436:3: ( rule__SJAssignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJAssignmentAccess().getGroup()); 
            }
            // InternalSmallJava.g:437:3: ( rule__SJAssignment__Group__0 )
            // InternalSmallJava.g:437:4: rule__SJAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SJAssignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJAssignmentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSJAssignment"


    // $ANTLR start "entryRuleSJSelectionExpression"
    // InternalSmallJava.g:446:1: entryRuleSJSelectionExpression : ruleSJSelectionExpression EOF ;
    public final void entryRuleSJSelectionExpression() throws RecognitionException {
        try {
            // InternalSmallJava.g:447:1: ( ruleSJSelectionExpression EOF )
            // InternalSmallJava.g:448:1: ruleSJSelectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSJSelectionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSJSelectionExpression"


    // $ANTLR start "ruleSJSelectionExpression"
    // InternalSmallJava.g:455:1: ruleSJSelectionExpression : ( ( rule__SJSelectionExpression__Group__0 ) ) ;
    public final void ruleSJSelectionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:459:2: ( ( ( rule__SJSelectionExpression__Group__0 ) ) )
            // InternalSmallJava.g:460:2: ( ( rule__SJSelectionExpression__Group__0 ) )
            {
            // InternalSmallJava.g:460:2: ( ( rule__SJSelectionExpression__Group__0 ) )
            // InternalSmallJava.g:461:3: ( rule__SJSelectionExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getGroup()); 
            }
            // InternalSmallJava.g:462:3: ( rule__SJSelectionExpression__Group__0 )
            // InternalSmallJava.g:462:4: rule__SJSelectionExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SJSelectionExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSJSelectionExpression"


    // $ANTLR start "entryRuleSJTerminalExpression"
    // InternalSmallJava.g:471:1: entryRuleSJTerminalExpression : ruleSJTerminalExpression EOF ;
    public final void entryRuleSJTerminalExpression() throws RecognitionException {
        try {
            // InternalSmallJava.g:472:1: ( ruleSJTerminalExpression EOF )
            // InternalSmallJava.g:473:1: ruleSJTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSJTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSJTerminalExpression"


    // $ANTLR start "ruleSJTerminalExpression"
    // InternalSmallJava.g:480:1: ruleSJTerminalExpression : ( ( rule__SJTerminalExpression__Alternatives ) ) ;
    public final void ruleSJTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:484:2: ( ( ( rule__SJTerminalExpression__Alternatives ) ) )
            // InternalSmallJava.g:485:2: ( ( rule__SJTerminalExpression__Alternatives ) )
            {
            // InternalSmallJava.g:485:2: ( ( rule__SJTerminalExpression__Alternatives ) )
            // InternalSmallJava.g:486:3: ( rule__SJTerminalExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getAlternatives()); 
            }
            // InternalSmallJava.g:487:3: ( rule__SJTerminalExpression__Alternatives )
            // InternalSmallJava.g:487:4: rule__SJTerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSJTerminalExpression"


    // $ANTLR start "rule__SJMember__Alternatives"
    // InternalSmallJava.g:495:1: rule__SJMember__Alternatives : ( ( ruleSJField ) | ( ruleSJMethod ) );
    public final void rule__SJMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:499:1: ( ( ruleSJField ) | ( ruleSJMethod ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==18) ) {
                        alt2=2;
                    }
                    else if ( (LA2_2==17) ) {
                        alt2=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmallJava.g:500:2: ( ruleSJField )
                    {
                    // InternalSmallJava.g:500:2: ( ruleSJField )
                    // InternalSmallJava.g:501:3: ruleSJField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJMemberAccess().getSJFieldParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSJField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJMemberAccess().getSJFieldParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallJava.g:506:2: ( ruleSJMethod )
                    {
                    // InternalSmallJava.g:506:2: ( ruleSJMethod )
                    // InternalSmallJava.g:507:3: ruleSJMethod
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJMemberAccess().getSJMethodParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSJMethod();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJMemberAccess().getSJMethodParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMember__Alternatives"


    // $ANTLR start "rule__SJStatement__Alternatives"
    // InternalSmallJava.g:516:1: rule__SJStatement__Alternatives : ( ( ruleSJVariableDeclaration ) | ( ruleSJReturn ) | ( ( rule__SJStatement__Group_2__0 ) ) | ( ruleSJIfStatement ) );
    public final void rule__SJStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:520:1: ( ( ruleSJVariableDeclaration ) | ( ruleSJReturn ) | ( ( rule__SJStatement__Group_2__0 ) ) | ( ruleSJIfStatement ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    alt3=1;
                }
                else if ( (LA3_1==17||LA3_1==22||LA3_1==25) ) {
                    alt3=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 11:
            case 12:
            case 18:
            case 26:
            case 27:
            case 28:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSmallJava.g:521:2: ( ruleSJVariableDeclaration )
                    {
                    // InternalSmallJava.g:521:2: ( ruleSJVariableDeclaration )
                    // InternalSmallJava.g:522:3: ruleSJVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJStatementAccess().getSJVariableDeclarationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSJVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJStatementAccess().getSJVariableDeclarationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallJava.g:527:2: ( ruleSJReturn )
                    {
                    // InternalSmallJava.g:527:2: ( ruleSJReturn )
                    // InternalSmallJava.g:528:3: ruleSJReturn
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJStatementAccess().getSJReturnParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSJReturn();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJStatementAccess().getSJReturnParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSmallJava.g:533:2: ( ( rule__SJStatement__Group_2__0 ) )
                    {
                    // InternalSmallJava.g:533:2: ( ( rule__SJStatement__Group_2__0 ) )
                    // InternalSmallJava.g:534:3: ( rule__SJStatement__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJStatementAccess().getGroup_2()); 
                    }
                    // InternalSmallJava.g:535:3: ( rule__SJStatement__Group_2__0 )
                    // InternalSmallJava.g:535:4: rule__SJStatement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SJStatement__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJStatementAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSmallJava.g:539:2: ( ruleSJIfStatement )
                    {
                    // InternalSmallJava.g:539:2: ( ruleSJIfStatement )
                    // InternalSmallJava.g:540:3: ruleSJIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJStatementAccess().getSJIfStatementParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSJIfStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJStatementAccess().getSJIfStatementParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJStatement__Alternatives"


    // $ANTLR start "rule__SJIfBlock__Alternatives"
    // InternalSmallJava.g:549:1: rule__SJIfBlock__Alternatives : ( ( ( rule__SJIfBlock__StatementsAssignment_0 ) ) | ( ruleSJBlock ) );
    public final void rule__SJIfBlock__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:553:1: ( ( ( rule__SJIfBlock__StatementsAssignment_0 ) ) | ( ruleSJBlock ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||(LA4_0>=11 && LA4_0<=12)||LA4_0==18||LA4_0==21||LA4_0==23||(LA4_0>=26 && LA4_0<=28)) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmallJava.g:554:2: ( ( rule__SJIfBlock__StatementsAssignment_0 ) )
                    {
                    // InternalSmallJava.g:554:2: ( ( rule__SJIfBlock__StatementsAssignment_0 ) )
                    // InternalSmallJava.g:555:3: ( rule__SJIfBlock__StatementsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJIfBlockAccess().getStatementsAssignment_0()); 
                    }
                    // InternalSmallJava.g:556:3: ( rule__SJIfBlock__StatementsAssignment_0 )
                    // InternalSmallJava.g:556:4: rule__SJIfBlock__StatementsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SJIfBlock__StatementsAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJIfBlockAccess().getStatementsAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallJava.g:560:2: ( ruleSJBlock )
                    {
                    // InternalSmallJava.g:560:2: ( ruleSJBlock )
                    // InternalSmallJava.g:561:3: ruleSJBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJIfBlockAccess().getSJBlockParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSJBlock();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJIfBlockAccess().getSJBlockParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfBlock__Alternatives"


    // $ANTLR start "rule__SJSymbol__Alternatives"
    // InternalSmallJava.g:570:1: rule__SJSymbol__Alternatives : ( ( ruleSJVariableDeclaration ) | ( ruleSJParameter ) );
    public final void rule__SJSymbol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:574:1: ( ( ruleSJVariableDeclaration ) | ( ruleSJParameter ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==EOF) ) {
                        alt5=2;
                    }
                    else if ( (LA5_2==22) ) {
                        alt5=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSmallJava.g:575:2: ( ruleSJVariableDeclaration )
                    {
                    // InternalSmallJava.g:575:2: ( ruleSJVariableDeclaration )
                    // InternalSmallJava.g:576:3: ruleSJVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJSymbolAccess().getSJVariableDeclarationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSJVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJSymbolAccess().getSJVariableDeclarationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallJava.g:581:2: ( ruleSJParameter )
                    {
                    // InternalSmallJava.g:581:2: ( ruleSJParameter )
                    // InternalSmallJava.g:582:3: ruleSJParameter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJSymbolAccess().getSJParameterParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSJParameter();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJSymbolAccess().getSJParameterParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSymbol__Alternatives"


    // $ANTLR start "rule__SJTerminalExpression__Alternatives"
    // InternalSmallJava.g:591:1: rule__SJTerminalExpression__Alternatives : ( ( ( rule__SJTerminalExpression__Group_0__0 ) ) | ( ( rule__SJTerminalExpression__Group_1__0 ) ) | ( ( rule__SJTerminalExpression__Group_2__0 ) ) | ( ( rule__SJTerminalExpression__Group_3__0 ) ) | ( ( rule__SJTerminalExpression__Group_4__0 ) ) | ( ( rule__SJTerminalExpression__Group_5__0 ) ) );
    public final void rule__SJTerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:595:1: ( ( ( rule__SJTerminalExpression__Group_0__0 ) ) | ( ( rule__SJTerminalExpression__Group_1__0 ) ) | ( ( rule__SJTerminalExpression__Group_2__0 ) ) | ( ( rule__SJTerminalExpression__Group_3__0 ) ) | ( ( rule__SJTerminalExpression__Group_4__0 ) ) | ( ( rule__SJTerminalExpression__Group_5__0 ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt6=1;
                }
                break;
            case 27:
                {
                alt6=2;
                }
                break;
            case 11:
            case 12:
                {
                alt6=3;
                }
                break;
            case RULE_ID:
                {
                alt6=4;
                }
                break;
            case 28:
                {
                alt6=5;
                }
                break;
            case 18:
                {
                alt6=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSmallJava.g:596:2: ( ( rule__SJTerminalExpression__Group_0__0 ) )
                    {
                    // InternalSmallJava.g:596:2: ( ( rule__SJTerminalExpression__Group_0__0 ) )
                    // InternalSmallJava.g:597:3: ( rule__SJTerminalExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJTerminalExpressionAccess().getGroup_0()); 
                    }
                    // InternalSmallJava.g:598:3: ( rule__SJTerminalExpression__Group_0__0 )
                    // InternalSmallJava.g:598:4: rule__SJTerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SJTerminalExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJTerminalExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallJava.g:602:2: ( ( rule__SJTerminalExpression__Group_1__0 ) )
                    {
                    // InternalSmallJava.g:602:2: ( ( rule__SJTerminalExpression__Group_1__0 ) )
                    // InternalSmallJava.g:603:3: ( rule__SJTerminalExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJTerminalExpressionAccess().getGroup_1()); 
                    }
                    // InternalSmallJava.g:604:3: ( rule__SJTerminalExpression__Group_1__0 )
                    // InternalSmallJava.g:604:4: rule__SJTerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SJTerminalExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJTerminalExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSmallJava.g:608:2: ( ( rule__SJTerminalExpression__Group_2__0 ) )
                    {
                    // InternalSmallJava.g:608:2: ( ( rule__SJTerminalExpression__Group_2__0 ) )
                    // InternalSmallJava.g:609:3: ( rule__SJTerminalExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJTerminalExpressionAccess().getGroup_2()); 
                    }
                    // InternalSmallJava.g:610:3: ( rule__SJTerminalExpression__Group_2__0 )
                    // InternalSmallJava.g:610:4: rule__SJTerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SJTerminalExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJTerminalExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSmallJava.g:614:2: ( ( rule__SJTerminalExpression__Group_3__0 ) )
                    {
                    // InternalSmallJava.g:614:2: ( ( rule__SJTerminalExpression__Group_3__0 ) )
                    // InternalSmallJava.g:615:3: ( rule__SJTerminalExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJTerminalExpressionAccess().getGroup_3()); 
                    }
                    // InternalSmallJava.g:616:3: ( rule__SJTerminalExpression__Group_3__0 )
                    // InternalSmallJava.g:616:4: rule__SJTerminalExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SJTerminalExpression__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJTerminalExpressionAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSmallJava.g:620:2: ( ( rule__SJTerminalExpression__Group_4__0 ) )
                    {
                    // InternalSmallJava.g:620:2: ( ( rule__SJTerminalExpression__Group_4__0 ) )
                    // InternalSmallJava.g:621:3: ( rule__SJTerminalExpression__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJTerminalExpressionAccess().getGroup_4()); 
                    }
                    // InternalSmallJava.g:622:3: ( rule__SJTerminalExpression__Group_4__0 )
                    // InternalSmallJava.g:622:4: rule__SJTerminalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SJTerminalExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJTerminalExpressionAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSmallJava.g:626:2: ( ( rule__SJTerminalExpression__Group_5__0 ) )
                    {
                    // InternalSmallJava.g:626:2: ( ( rule__SJTerminalExpression__Group_5__0 ) )
                    // InternalSmallJava.g:627:3: ( rule__SJTerminalExpression__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJTerminalExpressionAccess().getGroup_5()); 
                    }
                    // InternalSmallJava.g:628:3: ( rule__SJTerminalExpression__Group_5__0 )
                    // InternalSmallJava.g:628:4: rule__SJTerminalExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SJTerminalExpression__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJTerminalExpressionAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Alternatives"


    // $ANTLR start "rule__SJTerminalExpression__ValueAlternatives_2_1_0"
    // InternalSmallJava.g:636:1: rule__SJTerminalExpression__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__SJTerminalExpression__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:640:1: ( ( 'true' ) | ( 'false' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmallJava.g:641:2: ( 'true' )
                    {
                    // InternalSmallJava.g:641:2: ( 'true' )
                    // InternalSmallJava.g:642:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallJava.g:647:2: ( 'false' )
                    {
                    // InternalSmallJava.g:647:2: ( 'false' )
                    // InternalSmallJava.g:648:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__SJClass__Group__0"
    // InternalSmallJava.g:657:1: rule__SJClass__Group__0 : rule__SJClass__Group__0__Impl rule__SJClass__Group__1 ;
    public final void rule__SJClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:661:1: ( rule__SJClass__Group__0__Impl rule__SJClass__Group__1 )
            // InternalSmallJava.g:662:2: rule__SJClass__Group__0__Impl rule__SJClass__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SJClass__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJClass__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group__0"


    // $ANTLR start "rule__SJClass__Group__0__Impl"
    // InternalSmallJava.g:669:1: rule__SJClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__SJClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:673:1: ( ( 'class' ) )
            // InternalSmallJava.g:674:1: ( 'class' )
            {
            // InternalSmallJava.g:674:1: ( 'class' )
            // InternalSmallJava.g:675:2: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getClassKeyword_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getClassKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group__0__Impl"


    // $ANTLR start "rule__SJClass__Group__1"
    // InternalSmallJava.g:684:1: rule__SJClass__Group__1 : rule__SJClass__Group__1__Impl rule__SJClass__Group__2 ;
    public final void rule__SJClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:688:1: ( rule__SJClass__Group__1__Impl rule__SJClass__Group__2 )
            // InternalSmallJava.g:689:2: rule__SJClass__Group__1__Impl rule__SJClass__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SJClass__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJClass__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group__1"


    // $ANTLR start "rule__SJClass__Group__1__Impl"
    // InternalSmallJava.g:696:1: rule__SJClass__Group__1__Impl : ( ( rule__SJClass__NameAssignment_1 ) ) ;
    public final void rule__SJClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:700:1: ( ( ( rule__SJClass__NameAssignment_1 ) ) )
            // InternalSmallJava.g:701:1: ( ( rule__SJClass__NameAssignment_1 ) )
            {
            // InternalSmallJava.g:701:1: ( ( rule__SJClass__NameAssignment_1 ) )
            // InternalSmallJava.g:702:2: ( rule__SJClass__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getNameAssignment_1()); 
            }
            // InternalSmallJava.g:703:2: ( rule__SJClass__NameAssignment_1 )
            // InternalSmallJava.g:703:3: rule__SJClass__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SJClass__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group__1__Impl"


    // $ANTLR start "rule__SJClass__Group__2"
    // InternalSmallJava.g:711:1: rule__SJClass__Group__2 : rule__SJClass__Group__2__Impl rule__SJClass__Group__3 ;
    public final void rule__SJClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:715:1: ( rule__SJClass__Group__2__Impl rule__SJClass__Group__3 )
            // InternalSmallJava.g:716:2: rule__SJClass__Group__2__Impl rule__SJClass__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SJClass__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJClass__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group__2"


    // $ANTLR start "rule__SJClass__Group__2__Impl"
    // InternalSmallJava.g:723:1: rule__SJClass__Group__2__Impl : ( ( rule__SJClass__Group_2__0 )? ) ;
    public final void rule__SJClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:727:1: ( ( ( rule__SJClass__Group_2__0 )? ) )
            // InternalSmallJava.g:728:1: ( ( rule__SJClass__Group_2__0 )? )
            {
            // InternalSmallJava.g:728:1: ( ( rule__SJClass__Group_2__0 )? )
            // InternalSmallJava.g:729:2: ( rule__SJClass__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getGroup_2()); 
            }
            // InternalSmallJava.g:730:2: ( rule__SJClass__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmallJava.g:730:3: rule__SJClass__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SJClass__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group__2__Impl"


    // $ANTLR start "rule__SJClass__Group__3"
    // InternalSmallJava.g:738:1: rule__SJClass__Group__3 : rule__SJClass__Group__3__Impl rule__SJClass__Group__4 ;
    public final void rule__SJClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:742:1: ( rule__SJClass__Group__3__Impl rule__SJClass__Group__4 )
            // InternalSmallJava.g:743:2: rule__SJClass__Group__3__Impl rule__SJClass__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__SJClass__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJClass__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group__3"


    // $ANTLR start "rule__SJClass__Group__3__Impl"
    // InternalSmallJava.g:750:1: rule__SJClass__Group__3__Impl : ( '{' ) ;
    public final void rule__SJClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:754:1: ( ( '{' ) )
            // InternalSmallJava.g:755:1: ( '{' )
            {
            // InternalSmallJava.g:755:1: ( '{' )
            // InternalSmallJava.g:756:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group__3__Impl"


    // $ANTLR start "rule__SJClass__Group__4"
    // InternalSmallJava.g:765:1: rule__SJClass__Group__4 : rule__SJClass__Group__4__Impl rule__SJClass__Group__5 ;
    public final void rule__SJClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:769:1: ( rule__SJClass__Group__4__Impl rule__SJClass__Group__5 )
            // InternalSmallJava.g:770:2: rule__SJClass__Group__4__Impl rule__SJClass__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__SJClass__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJClass__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group__4"


    // $ANTLR start "rule__SJClass__Group__4__Impl"
    // InternalSmallJava.g:777:1: rule__SJClass__Group__4__Impl : ( ( rule__SJClass__MembersAssignment_4 )* ) ;
    public final void rule__SJClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:781:1: ( ( ( rule__SJClass__MembersAssignment_4 )* ) )
            // InternalSmallJava.g:782:1: ( ( rule__SJClass__MembersAssignment_4 )* )
            {
            // InternalSmallJava.g:782:1: ( ( rule__SJClass__MembersAssignment_4 )* )
            // InternalSmallJava.g:783:2: ( rule__SJClass__MembersAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getMembersAssignment_4()); 
            }
            // InternalSmallJava.g:784:2: ( rule__SJClass__MembersAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSmallJava.g:784:3: rule__SJClass__MembersAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SJClass__MembersAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getMembersAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group__4__Impl"


    // $ANTLR start "rule__SJClass__Group__5"
    // InternalSmallJava.g:792:1: rule__SJClass__Group__5 : rule__SJClass__Group__5__Impl ;
    public final void rule__SJClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:796:1: ( rule__SJClass__Group__5__Impl )
            // InternalSmallJava.g:797:2: rule__SJClass__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJClass__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group__5"


    // $ANTLR start "rule__SJClass__Group__5__Impl"
    // InternalSmallJava.g:803:1: rule__SJClass__Group__5__Impl : ( '}' ) ;
    public final void rule__SJClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:807:1: ( ( '}' ) )
            // InternalSmallJava.g:808:1: ( '}' )
            {
            // InternalSmallJava.g:808:1: ( '}' )
            // InternalSmallJava.g:809:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group__5__Impl"


    // $ANTLR start "rule__SJClass__Group_2__0"
    // InternalSmallJava.g:819:1: rule__SJClass__Group_2__0 : rule__SJClass__Group_2__0__Impl rule__SJClass__Group_2__1 ;
    public final void rule__SJClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:823:1: ( rule__SJClass__Group_2__0__Impl rule__SJClass__Group_2__1 )
            // InternalSmallJava.g:824:2: rule__SJClass__Group_2__0__Impl rule__SJClass__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__SJClass__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJClass__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group_2__0"


    // $ANTLR start "rule__SJClass__Group_2__0__Impl"
    // InternalSmallJava.g:831:1: rule__SJClass__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__SJClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:835:1: ( ( 'extends' ) )
            // InternalSmallJava.g:836:1: ( 'extends' )
            {
            // InternalSmallJava.g:836:1: ( 'extends' )
            // InternalSmallJava.g:837:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getExtendsKeyword_2_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getExtendsKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group_2__0__Impl"


    // $ANTLR start "rule__SJClass__Group_2__1"
    // InternalSmallJava.g:846:1: rule__SJClass__Group_2__1 : rule__SJClass__Group_2__1__Impl ;
    public final void rule__SJClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:850:1: ( rule__SJClass__Group_2__1__Impl )
            // InternalSmallJava.g:851:2: rule__SJClass__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJClass__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group_2__1"


    // $ANTLR start "rule__SJClass__Group_2__1__Impl"
    // InternalSmallJava.g:857:1: rule__SJClass__Group_2__1__Impl : ( ( rule__SJClass__SuperclassAssignment_2_1 ) ) ;
    public final void rule__SJClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:861:1: ( ( ( rule__SJClass__SuperclassAssignment_2_1 ) ) )
            // InternalSmallJava.g:862:1: ( ( rule__SJClass__SuperclassAssignment_2_1 ) )
            {
            // InternalSmallJava.g:862:1: ( ( rule__SJClass__SuperclassAssignment_2_1 ) )
            // InternalSmallJava.g:863:2: ( rule__SJClass__SuperclassAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getSuperclassAssignment_2_1()); 
            }
            // InternalSmallJava.g:864:2: ( rule__SJClass__SuperclassAssignment_2_1 )
            // InternalSmallJava.g:864:3: rule__SJClass__SuperclassAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SJClass__SuperclassAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getSuperclassAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group_2__1__Impl"


    // $ANTLR start "rule__SJTypedDeclaration__Group__0"
    // InternalSmallJava.g:873:1: rule__SJTypedDeclaration__Group__0 : rule__SJTypedDeclaration__Group__0__Impl rule__SJTypedDeclaration__Group__1 ;
    public final void rule__SJTypedDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:877:1: ( rule__SJTypedDeclaration__Group__0__Impl rule__SJTypedDeclaration__Group__1 )
            // InternalSmallJava.g:878:2: rule__SJTypedDeclaration__Group__0__Impl rule__SJTypedDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SJTypedDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJTypedDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTypedDeclaration__Group__0"


    // $ANTLR start "rule__SJTypedDeclaration__Group__0__Impl"
    // InternalSmallJava.g:885:1: rule__SJTypedDeclaration__Group__0__Impl : ( ( rule__SJTypedDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__SJTypedDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:889:1: ( ( ( rule__SJTypedDeclaration__TypeAssignment_0 ) ) )
            // InternalSmallJava.g:890:1: ( ( rule__SJTypedDeclaration__TypeAssignment_0 ) )
            {
            // InternalSmallJava.g:890:1: ( ( rule__SJTypedDeclaration__TypeAssignment_0 ) )
            // InternalSmallJava.g:891:2: ( rule__SJTypedDeclaration__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTypedDeclarationAccess().getTypeAssignment_0()); 
            }
            // InternalSmallJava.g:892:2: ( rule__SJTypedDeclaration__TypeAssignment_0 )
            // InternalSmallJava.g:892:3: rule__SJTypedDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SJTypedDeclaration__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTypedDeclarationAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTypedDeclaration__Group__0__Impl"


    // $ANTLR start "rule__SJTypedDeclaration__Group__1"
    // InternalSmallJava.g:900:1: rule__SJTypedDeclaration__Group__1 : rule__SJTypedDeclaration__Group__1__Impl ;
    public final void rule__SJTypedDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:904:1: ( rule__SJTypedDeclaration__Group__1__Impl )
            // InternalSmallJava.g:905:2: rule__SJTypedDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJTypedDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTypedDeclaration__Group__1"


    // $ANTLR start "rule__SJTypedDeclaration__Group__1__Impl"
    // InternalSmallJava.g:911:1: rule__SJTypedDeclaration__Group__1__Impl : ( ( rule__SJTypedDeclaration__NameAssignment_1 ) ) ;
    public final void rule__SJTypedDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:915:1: ( ( ( rule__SJTypedDeclaration__NameAssignment_1 ) ) )
            // InternalSmallJava.g:916:1: ( ( rule__SJTypedDeclaration__NameAssignment_1 ) )
            {
            // InternalSmallJava.g:916:1: ( ( rule__SJTypedDeclaration__NameAssignment_1 ) )
            // InternalSmallJava.g:917:2: ( rule__SJTypedDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTypedDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalSmallJava.g:918:2: ( rule__SJTypedDeclaration__NameAssignment_1 )
            // InternalSmallJava.g:918:3: rule__SJTypedDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SJTypedDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTypedDeclarationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTypedDeclaration__Group__1__Impl"


    // $ANTLR start "rule__SJField__Group__0"
    // InternalSmallJava.g:927:1: rule__SJField__Group__0 : rule__SJField__Group__0__Impl rule__SJField__Group__1 ;
    public final void rule__SJField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:931:1: ( rule__SJField__Group__0__Impl rule__SJField__Group__1 )
            // InternalSmallJava.g:932:2: rule__SJField__Group__0__Impl rule__SJField__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SJField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJField__Group__0"


    // $ANTLR start "rule__SJField__Group__0__Impl"
    // InternalSmallJava.g:939:1: rule__SJField__Group__0__Impl : ( ruleSJTypedDeclaration ) ;
    public final void rule__SJField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:943:1: ( ( ruleSJTypedDeclaration ) )
            // InternalSmallJava.g:944:1: ( ruleSJTypedDeclaration )
            {
            // InternalSmallJava.g:944:1: ( ruleSJTypedDeclaration )
            // InternalSmallJava.g:945:2: ruleSJTypedDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJFieldAccess().getSJTypedDeclarationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJTypedDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJFieldAccess().getSJTypedDeclarationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJField__Group__0__Impl"


    // $ANTLR start "rule__SJField__Group__1"
    // InternalSmallJava.g:954:1: rule__SJField__Group__1 : rule__SJField__Group__1__Impl ;
    public final void rule__SJField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:958:1: ( rule__SJField__Group__1__Impl )
            // InternalSmallJava.g:959:2: rule__SJField__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJField__Group__1"


    // $ANTLR start "rule__SJField__Group__1__Impl"
    // InternalSmallJava.g:965:1: rule__SJField__Group__1__Impl : ( ';' ) ;
    public final void rule__SJField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:969:1: ( ( ';' ) )
            // InternalSmallJava.g:970:1: ( ';' )
            {
            // InternalSmallJava.g:970:1: ( ';' )
            // InternalSmallJava.g:971:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJFieldAccess().getSemicolonKeyword_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJFieldAccess().getSemicolonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJField__Group__1__Impl"


    // $ANTLR start "rule__SJMethod__Group__0"
    // InternalSmallJava.g:981:1: rule__SJMethod__Group__0 : rule__SJMethod__Group__0__Impl rule__SJMethod__Group__1 ;
    public final void rule__SJMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:985:1: ( rule__SJMethod__Group__0__Impl rule__SJMethod__Group__1 )
            // InternalSmallJava.g:986:2: rule__SJMethod__Group__0__Impl rule__SJMethod__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__SJMethod__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJMethod__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group__0"


    // $ANTLR start "rule__SJMethod__Group__0__Impl"
    // InternalSmallJava.g:993:1: rule__SJMethod__Group__0__Impl : ( ruleSJTypedDeclaration ) ;
    public final void rule__SJMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:997:1: ( ( ruleSJTypedDeclaration ) )
            // InternalSmallJava.g:998:1: ( ruleSJTypedDeclaration )
            {
            // InternalSmallJava.g:998:1: ( ruleSJTypedDeclaration )
            // InternalSmallJava.g:999:2: ruleSJTypedDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getSJTypedDeclarationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJTypedDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getSJTypedDeclarationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group__0__Impl"


    // $ANTLR start "rule__SJMethod__Group__1"
    // InternalSmallJava.g:1008:1: rule__SJMethod__Group__1 : rule__SJMethod__Group__1__Impl rule__SJMethod__Group__2 ;
    public final void rule__SJMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1012:1: ( rule__SJMethod__Group__1__Impl rule__SJMethod__Group__2 )
            // InternalSmallJava.g:1013:2: rule__SJMethod__Group__1__Impl rule__SJMethod__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__SJMethod__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJMethod__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group__1"


    // $ANTLR start "rule__SJMethod__Group__1__Impl"
    // InternalSmallJava.g:1020:1: rule__SJMethod__Group__1__Impl : ( '(' ) ;
    public final void rule__SJMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1024:1: ( ( '(' ) )
            // InternalSmallJava.g:1025:1: ( '(' )
            {
            // InternalSmallJava.g:1025:1: ( '(' )
            // InternalSmallJava.g:1026:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group__1__Impl"


    // $ANTLR start "rule__SJMethod__Group__2"
    // InternalSmallJava.g:1035:1: rule__SJMethod__Group__2 : rule__SJMethod__Group__2__Impl rule__SJMethod__Group__3 ;
    public final void rule__SJMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1039:1: ( rule__SJMethod__Group__2__Impl rule__SJMethod__Group__3 )
            // InternalSmallJava.g:1040:2: rule__SJMethod__Group__2__Impl rule__SJMethod__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__SJMethod__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJMethod__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group__2"


    // $ANTLR start "rule__SJMethod__Group__2__Impl"
    // InternalSmallJava.g:1047:1: rule__SJMethod__Group__2__Impl : ( ( rule__SJMethod__Group_2__0 )? ) ;
    public final void rule__SJMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1051:1: ( ( ( rule__SJMethod__Group_2__0 )? ) )
            // InternalSmallJava.g:1052:1: ( ( rule__SJMethod__Group_2__0 )? )
            {
            // InternalSmallJava.g:1052:1: ( ( rule__SJMethod__Group_2__0 )? )
            // InternalSmallJava.g:1053:2: ( rule__SJMethod__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getGroup_2()); 
            }
            // InternalSmallJava.g:1054:2: ( rule__SJMethod__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmallJava.g:1054:3: rule__SJMethod__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SJMethod__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group__2__Impl"


    // $ANTLR start "rule__SJMethod__Group__3"
    // InternalSmallJava.g:1062:1: rule__SJMethod__Group__3 : rule__SJMethod__Group__3__Impl rule__SJMethod__Group__4 ;
    public final void rule__SJMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1066:1: ( rule__SJMethod__Group__3__Impl rule__SJMethod__Group__4 )
            // InternalSmallJava.g:1067:2: rule__SJMethod__Group__3__Impl rule__SJMethod__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__SJMethod__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJMethod__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group__3"


    // $ANTLR start "rule__SJMethod__Group__3__Impl"
    // InternalSmallJava.g:1074:1: rule__SJMethod__Group__3__Impl : ( ')' ) ;
    public final void rule__SJMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1078:1: ( ( ')' ) )
            // InternalSmallJava.g:1079:1: ( ')' )
            {
            // InternalSmallJava.g:1079:1: ( ')' )
            // InternalSmallJava.g:1080:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group__3__Impl"


    // $ANTLR start "rule__SJMethod__Group__4"
    // InternalSmallJava.g:1089:1: rule__SJMethod__Group__4 : rule__SJMethod__Group__4__Impl ;
    public final void rule__SJMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1093:1: ( rule__SJMethod__Group__4__Impl )
            // InternalSmallJava.g:1094:2: rule__SJMethod__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJMethod__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group__4"


    // $ANTLR start "rule__SJMethod__Group__4__Impl"
    // InternalSmallJava.g:1100:1: rule__SJMethod__Group__4__Impl : ( ( rule__SJMethod__BodyAssignment_4 ) ) ;
    public final void rule__SJMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1104:1: ( ( ( rule__SJMethod__BodyAssignment_4 ) ) )
            // InternalSmallJava.g:1105:1: ( ( rule__SJMethod__BodyAssignment_4 ) )
            {
            // InternalSmallJava.g:1105:1: ( ( rule__SJMethod__BodyAssignment_4 ) )
            // InternalSmallJava.g:1106:2: ( rule__SJMethod__BodyAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getBodyAssignment_4()); 
            }
            // InternalSmallJava.g:1107:2: ( rule__SJMethod__BodyAssignment_4 )
            // InternalSmallJava.g:1107:3: rule__SJMethod__BodyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SJMethod__BodyAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getBodyAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group__4__Impl"


    // $ANTLR start "rule__SJMethod__Group_2__0"
    // InternalSmallJava.g:1116:1: rule__SJMethod__Group_2__0 : rule__SJMethod__Group_2__0__Impl rule__SJMethod__Group_2__1 ;
    public final void rule__SJMethod__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1120:1: ( rule__SJMethod__Group_2__0__Impl rule__SJMethod__Group_2__1 )
            // InternalSmallJava.g:1121:2: rule__SJMethod__Group_2__0__Impl rule__SJMethod__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__SJMethod__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJMethod__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group_2__0"


    // $ANTLR start "rule__SJMethod__Group_2__0__Impl"
    // InternalSmallJava.g:1128:1: rule__SJMethod__Group_2__0__Impl : ( ( rule__SJMethod__ParamsAssignment_2_0 ) ) ;
    public final void rule__SJMethod__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1132:1: ( ( ( rule__SJMethod__ParamsAssignment_2_0 ) ) )
            // InternalSmallJava.g:1133:1: ( ( rule__SJMethod__ParamsAssignment_2_0 ) )
            {
            // InternalSmallJava.g:1133:1: ( ( rule__SJMethod__ParamsAssignment_2_0 ) )
            // InternalSmallJava.g:1134:2: ( rule__SJMethod__ParamsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getParamsAssignment_2_0()); 
            }
            // InternalSmallJava.g:1135:2: ( rule__SJMethod__ParamsAssignment_2_0 )
            // InternalSmallJava.g:1135:3: rule__SJMethod__ParamsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SJMethod__ParamsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getParamsAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group_2__0__Impl"


    // $ANTLR start "rule__SJMethod__Group_2__1"
    // InternalSmallJava.g:1143:1: rule__SJMethod__Group_2__1 : rule__SJMethod__Group_2__1__Impl ;
    public final void rule__SJMethod__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1147:1: ( rule__SJMethod__Group_2__1__Impl )
            // InternalSmallJava.g:1148:2: rule__SJMethod__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJMethod__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group_2__1"


    // $ANTLR start "rule__SJMethod__Group_2__1__Impl"
    // InternalSmallJava.g:1154:1: rule__SJMethod__Group_2__1__Impl : ( ( rule__SJMethod__Group_2_1__0 )* ) ;
    public final void rule__SJMethod__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1158:1: ( ( ( rule__SJMethod__Group_2_1__0 )* ) )
            // InternalSmallJava.g:1159:1: ( ( rule__SJMethod__Group_2_1__0 )* )
            {
            // InternalSmallJava.g:1159:1: ( ( rule__SJMethod__Group_2_1__0 )* )
            // InternalSmallJava.g:1160:2: ( rule__SJMethod__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getGroup_2_1()); 
            }
            // InternalSmallJava.g:1161:2: ( rule__SJMethod__Group_2_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSmallJava.g:1161:3: rule__SJMethod__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SJMethod__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group_2__1__Impl"


    // $ANTLR start "rule__SJMethod__Group_2_1__0"
    // InternalSmallJava.g:1170:1: rule__SJMethod__Group_2_1__0 : rule__SJMethod__Group_2_1__0__Impl rule__SJMethod__Group_2_1__1 ;
    public final void rule__SJMethod__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1174:1: ( rule__SJMethod__Group_2_1__0__Impl rule__SJMethod__Group_2_1__1 )
            // InternalSmallJava.g:1175:2: rule__SJMethod__Group_2_1__0__Impl rule__SJMethod__Group_2_1__1
            {
            pushFollow(FOLLOW_4);
            rule__SJMethod__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJMethod__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group_2_1__0"


    // $ANTLR start "rule__SJMethod__Group_2_1__0__Impl"
    // InternalSmallJava.g:1182:1: rule__SJMethod__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SJMethod__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1186:1: ( ( ',' ) )
            // InternalSmallJava.g:1187:1: ( ',' )
            {
            // InternalSmallJava.g:1187:1: ( ',' )
            // InternalSmallJava.g:1188:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group_2_1__0__Impl"


    // $ANTLR start "rule__SJMethod__Group_2_1__1"
    // InternalSmallJava.g:1197:1: rule__SJMethod__Group_2_1__1 : rule__SJMethod__Group_2_1__1__Impl ;
    public final void rule__SJMethod__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1201:1: ( rule__SJMethod__Group_2_1__1__Impl )
            // InternalSmallJava.g:1202:2: rule__SJMethod__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJMethod__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group_2_1__1"


    // $ANTLR start "rule__SJMethod__Group_2_1__1__Impl"
    // InternalSmallJava.g:1208:1: rule__SJMethod__Group_2_1__1__Impl : ( ( rule__SJMethod__ParamsAssignment_2_1_1 ) ) ;
    public final void rule__SJMethod__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1212:1: ( ( ( rule__SJMethod__ParamsAssignment_2_1_1 ) ) )
            // InternalSmallJava.g:1213:1: ( ( rule__SJMethod__ParamsAssignment_2_1_1 ) )
            {
            // InternalSmallJava.g:1213:1: ( ( rule__SJMethod__ParamsAssignment_2_1_1 ) )
            // InternalSmallJava.g:1214:2: ( rule__SJMethod__ParamsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getParamsAssignment_2_1_1()); 
            }
            // InternalSmallJava.g:1215:2: ( rule__SJMethod__ParamsAssignment_2_1_1 )
            // InternalSmallJava.g:1215:3: rule__SJMethod__ParamsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SJMethod__ParamsAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getParamsAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group_2_1__1__Impl"


    // $ANTLR start "rule__SJBlock__Group__0"
    // InternalSmallJava.g:1224:1: rule__SJBlock__Group__0 : rule__SJBlock__Group__0__Impl rule__SJBlock__Group__1 ;
    public final void rule__SJBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1228:1: ( rule__SJBlock__Group__0__Impl rule__SJBlock__Group__1 )
            // InternalSmallJava.g:1229:2: rule__SJBlock__Group__0__Impl rule__SJBlock__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__SJBlock__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJBlock__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJBlock__Group__0"


    // $ANTLR start "rule__SJBlock__Group__0__Impl"
    // InternalSmallJava.g:1236:1: rule__SJBlock__Group__0__Impl : ( () ) ;
    public final void rule__SJBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1240:1: ( ( () ) )
            // InternalSmallJava.g:1241:1: ( () )
            {
            // InternalSmallJava.g:1241:1: ( () )
            // InternalSmallJava.g:1242:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJBlockAccess().getSJBlockAction_0()); 
            }
            // InternalSmallJava.g:1243:2: ()
            // InternalSmallJava.g:1243:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJBlockAccess().getSJBlockAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJBlock__Group__0__Impl"


    // $ANTLR start "rule__SJBlock__Group__1"
    // InternalSmallJava.g:1251:1: rule__SJBlock__Group__1 : rule__SJBlock__Group__1__Impl rule__SJBlock__Group__2 ;
    public final void rule__SJBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1255:1: ( rule__SJBlock__Group__1__Impl rule__SJBlock__Group__2 )
            // InternalSmallJava.g:1256:2: rule__SJBlock__Group__1__Impl rule__SJBlock__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__SJBlock__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJBlock__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJBlock__Group__1"


    // $ANTLR start "rule__SJBlock__Group__1__Impl"
    // InternalSmallJava.g:1263:1: rule__SJBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__SJBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1267:1: ( ( '{' ) )
            // InternalSmallJava.g:1268:1: ( '{' )
            {
            // InternalSmallJava.g:1268:1: ( '{' )
            // InternalSmallJava.g:1269:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJBlock__Group__1__Impl"


    // $ANTLR start "rule__SJBlock__Group__2"
    // InternalSmallJava.g:1278:1: rule__SJBlock__Group__2 : rule__SJBlock__Group__2__Impl rule__SJBlock__Group__3 ;
    public final void rule__SJBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1282:1: ( rule__SJBlock__Group__2__Impl rule__SJBlock__Group__3 )
            // InternalSmallJava.g:1283:2: rule__SJBlock__Group__2__Impl rule__SJBlock__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__SJBlock__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJBlock__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJBlock__Group__2"


    // $ANTLR start "rule__SJBlock__Group__2__Impl"
    // InternalSmallJava.g:1290:1: rule__SJBlock__Group__2__Impl : ( ( rule__SJBlock__StatementsAssignment_2 )* ) ;
    public final void rule__SJBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1294:1: ( ( ( rule__SJBlock__StatementsAssignment_2 )* ) )
            // InternalSmallJava.g:1295:1: ( ( rule__SJBlock__StatementsAssignment_2 )* )
            {
            // InternalSmallJava.g:1295:1: ( ( rule__SJBlock__StatementsAssignment_2 )* )
            // InternalSmallJava.g:1296:2: ( rule__SJBlock__StatementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJBlockAccess().getStatementsAssignment_2()); 
            }
            // InternalSmallJava.g:1297:2: ( rule__SJBlock__StatementsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=11 && LA12_0<=12)||LA12_0==18||LA12_0==21||LA12_0==23||(LA12_0>=26 && LA12_0<=28)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSmallJava.g:1297:3: rule__SJBlock__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SJBlock__StatementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJBlockAccess().getStatementsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJBlock__Group__2__Impl"


    // $ANTLR start "rule__SJBlock__Group__3"
    // InternalSmallJava.g:1305:1: rule__SJBlock__Group__3 : rule__SJBlock__Group__3__Impl ;
    public final void rule__SJBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1309:1: ( rule__SJBlock__Group__3__Impl )
            // InternalSmallJava.g:1310:2: rule__SJBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJBlock__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJBlock__Group__3"


    // $ANTLR start "rule__SJBlock__Group__3__Impl"
    // InternalSmallJava.g:1316:1: rule__SJBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__SJBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1320:1: ( ( '}' ) )
            // InternalSmallJava.g:1321:1: ( '}' )
            {
            // InternalSmallJava.g:1321:1: ( '}' )
            // InternalSmallJava.g:1322:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJBlockAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJBlock__Group__3__Impl"


    // $ANTLR start "rule__SJStatement__Group_2__0"
    // InternalSmallJava.g:1332:1: rule__SJStatement__Group_2__0 : rule__SJStatement__Group_2__0__Impl rule__SJStatement__Group_2__1 ;
    public final void rule__SJStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1336:1: ( rule__SJStatement__Group_2__0__Impl rule__SJStatement__Group_2__1 )
            // InternalSmallJava.g:1337:2: rule__SJStatement__Group_2__0__Impl rule__SJStatement__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__SJStatement__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJStatement__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJStatement__Group_2__0"


    // $ANTLR start "rule__SJStatement__Group_2__0__Impl"
    // InternalSmallJava.g:1344:1: rule__SJStatement__Group_2__0__Impl : ( ruleSJExpression ) ;
    public final void rule__SJStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1348:1: ( ( ruleSJExpression ) )
            // InternalSmallJava.g:1349:1: ( ruleSJExpression )
            {
            // InternalSmallJava.g:1349:1: ( ruleSJExpression )
            // InternalSmallJava.g:1350:2: ruleSJExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJStatementAccess().getSJExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJStatementAccess().getSJExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJStatement__Group_2__0__Impl"


    // $ANTLR start "rule__SJStatement__Group_2__1"
    // InternalSmallJava.g:1359:1: rule__SJStatement__Group_2__1 : rule__SJStatement__Group_2__1__Impl ;
    public final void rule__SJStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1363:1: ( rule__SJStatement__Group_2__1__Impl )
            // InternalSmallJava.g:1364:2: rule__SJStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJStatement__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJStatement__Group_2__1"


    // $ANTLR start "rule__SJStatement__Group_2__1__Impl"
    // InternalSmallJava.g:1370:1: rule__SJStatement__Group_2__1__Impl : ( ';' ) ;
    public final void rule__SJStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1374:1: ( ( ';' ) )
            // InternalSmallJava.g:1375:1: ( ';' )
            {
            // InternalSmallJava.g:1375:1: ( ';' )
            // InternalSmallJava.g:1376:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJStatementAccess().getSemicolonKeyword_2_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJStatementAccess().getSemicolonKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJStatement__Group_2__1__Impl"


    // $ANTLR start "rule__SJReturn__Group__0"
    // InternalSmallJava.g:1386:1: rule__SJReturn__Group__0 : rule__SJReturn__Group__0__Impl rule__SJReturn__Group__1 ;
    public final void rule__SJReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1390:1: ( rule__SJReturn__Group__0__Impl rule__SJReturn__Group__1 )
            // InternalSmallJava.g:1391:2: rule__SJReturn__Group__0__Impl rule__SJReturn__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__SJReturn__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJReturn__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJReturn__Group__0"


    // $ANTLR start "rule__SJReturn__Group__0__Impl"
    // InternalSmallJava.g:1398:1: rule__SJReturn__Group__0__Impl : ( 'return' ) ;
    public final void rule__SJReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1402:1: ( ( 'return' ) )
            // InternalSmallJava.g:1403:1: ( 'return' )
            {
            // InternalSmallJava.g:1403:1: ( 'return' )
            // InternalSmallJava.g:1404:2: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJReturnAccess().getReturnKeyword_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJReturnAccess().getReturnKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJReturn__Group__0__Impl"


    // $ANTLR start "rule__SJReturn__Group__1"
    // InternalSmallJava.g:1413:1: rule__SJReturn__Group__1 : rule__SJReturn__Group__1__Impl rule__SJReturn__Group__2 ;
    public final void rule__SJReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1417:1: ( rule__SJReturn__Group__1__Impl rule__SJReturn__Group__2 )
            // InternalSmallJava.g:1418:2: rule__SJReturn__Group__1__Impl rule__SJReturn__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__SJReturn__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJReturn__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJReturn__Group__1"


    // $ANTLR start "rule__SJReturn__Group__1__Impl"
    // InternalSmallJava.g:1425:1: rule__SJReturn__Group__1__Impl : ( ( rule__SJReturn__ExpressionAssignment_1 ) ) ;
    public final void rule__SJReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1429:1: ( ( ( rule__SJReturn__ExpressionAssignment_1 ) ) )
            // InternalSmallJava.g:1430:1: ( ( rule__SJReturn__ExpressionAssignment_1 ) )
            {
            // InternalSmallJava.g:1430:1: ( ( rule__SJReturn__ExpressionAssignment_1 ) )
            // InternalSmallJava.g:1431:2: ( rule__SJReturn__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJReturnAccess().getExpressionAssignment_1()); 
            }
            // InternalSmallJava.g:1432:2: ( rule__SJReturn__ExpressionAssignment_1 )
            // InternalSmallJava.g:1432:3: rule__SJReturn__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SJReturn__ExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJReturnAccess().getExpressionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJReturn__Group__1__Impl"


    // $ANTLR start "rule__SJReturn__Group__2"
    // InternalSmallJava.g:1440:1: rule__SJReturn__Group__2 : rule__SJReturn__Group__2__Impl ;
    public final void rule__SJReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1444:1: ( rule__SJReturn__Group__2__Impl )
            // InternalSmallJava.g:1445:2: rule__SJReturn__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJReturn__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJReturn__Group__2"


    // $ANTLR start "rule__SJReturn__Group__2__Impl"
    // InternalSmallJava.g:1451:1: rule__SJReturn__Group__2__Impl : ( ';' ) ;
    public final void rule__SJReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1455:1: ( ( ';' ) )
            // InternalSmallJava.g:1456:1: ( ';' )
            {
            // InternalSmallJava.g:1456:1: ( ';' )
            // InternalSmallJava.g:1457:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJReturnAccess().getSemicolonKeyword_2()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJReturnAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJReturn__Group__2__Impl"


    // $ANTLR start "rule__SJVariableDeclaration__Group__0"
    // InternalSmallJava.g:1467:1: rule__SJVariableDeclaration__Group__0 : rule__SJVariableDeclaration__Group__0__Impl rule__SJVariableDeclaration__Group__1 ;
    public final void rule__SJVariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1471:1: ( rule__SJVariableDeclaration__Group__0__Impl rule__SJVariableDeclaration__Group__1 )
            // InternalSmallJava.g:1472:2: rule__SJVariableDeclaration__Group__0__Impl rule__SJVariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__SJVariableDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJVariableDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJVariableDeclaration__Group__0"


    // $ANTLR start "rule__SJVariableDeclaration__Group__0__Impl"
    // InternalSmallJava.g:1479:1: rule__SJVariableDeclaration__Group__0__Impl : ( ruleSJTypedDeclaration ) ;
    public final void rule__SJVariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1483:1: ( ( ruleSJTypedDeclaration ) )
            // InternalSmallJava.g:1484:1: ( ruleSJTypedDeclaration )
            {
            // InternalSmallJava.g:1484:1: ( ruleSJTypedDeclaration )
            // InternalSmallJava.g:1485:2: ruleSJTypedDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJVariableDeclarationAccess().getSJTypedDeclarationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJTypedDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJVariableDeclarationAccess().getSJTypedDeclarationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJVariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__SJVariableDeclaration__Group__1"
    // InternalSmallJava.g:1494:1: rule__SJVariableDeclaration__Group__1 : rule__SJVariableDeclaration__Group__1__Impl rule__SJVariableDeclaration__Group__2 ;
    public final void rule__SJVariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1498:1: ( rule__SJVariableDeclaration__Group__1__Impl rule__SJVariableDeclaration__Group__2 )
            // InternalSmallJava.g:1499:2: rule__SJVariableDeclaration__Group__1__Impl rule__SJVariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__SJVariableDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJVariableDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJVariableDeclaration__Group__1"


    // $ANTLR start "rule__SJVariableDeclaration__Group__1__Impl"
    // InternalSmallJava.g:1506:1: rule__SJVariableDeclaration__Group__1__Impl : ( '=' ) ;
    public final void rule__SJVariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1510:1: ( ( '=' ) )
            // InternalSmallJava.g:1511:1: ( '=' )
            {
            // InternalSmallJava.g:1511:1: ( '=' )
            // InternalSmallJava.g:1512:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJVariableDeclarationAccess().getEqualsSignKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJVariableDeclarationAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJVariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__SJVariableDeclaration__Group__2"
    // InternalSmallJava.g:1521:1: rule__SJVariableDeclaration__Group__2 : rule__SJVariableDeclaration__Group__2__Impl rule__SJVariableDeclaration__Group__3 ;
    public final void rule__SJVariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1525:1: ( rule__SJVariableDeclaration__Group__2__Impl rule__SJVariableDeclaration__Group__3 )
            // InternalSmallJava.g:1526:2: rule__SJVariableDeclaration__Group__2__Impl rule__SJVariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__SJVariableDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJVariableDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJVariableDeclaration__Group__2"


    // $ANTLR start "rule__SJVariableDeclaration__Group__2__Impl"
    // InternalSmallJava.g:1533:1: rule__SJVariableDeclaration__Group__2__Impl : ( ( rule__SJVariableDeclaration__ExpressionAssignment_2 ) ) ;
    public final void rule__SJVariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1537:1: ( ( ( rule__SJVariableDeclaration__ExpressionAssignment_2 ) ) )
            // InternalSmallJava.g:1538:1: ( ( rule__SJVariableDeclaration__ExpressionAssignment_2 ) )
            {
            // InternalSmallJava.g:1538:1: ( ( rule__SJVariableDeclaration__ExpressionAssignment_2 ) )
            // InternalSmallJava.g:1539:2: ( rule__SJVariableDeclaration__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJVariableDeclarationAccess().getExpressionAssignment_2()); 
            }
            // InternalSmallJava.g:1540:2: ( rule__SJVariableDeclaration__ExpressionAssignment_2 )
            // InternalSmallJava.g:1540:3: rule__SJVariableDeclaration__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SJVariableDeclaration__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJVariableDeclarationAccess().getExpressionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJVariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__SJVariableDeclaration__Group__3"
    // InternalSmallJava.g:1548:1: rule__SJVariableDeclaration__Group__3 : rule__SJVariableDeclaration__Group__3__Impl ;
    public final void rule__SJVariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1552:1: ( rule__SJVariableDeclaration__Group__3__Impl )
            // InternalSmallJava.g:1553:2: rule__SJVariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJVariableDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJVariableDeclaration__Group__3"


    // $ANTLR start "rule__SJVariableDeclaration__Group__3__Impl"
    // InternalSmallJava.g:1559:1: rule__SJVariableDeclaration__Group__3__Impl : ( ';' ) ;
    public final void rule__SJVariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1563:1: ( ( ';' ) )
            // InternalSmallJava.g:1564:1: ( ';' )
            {
            // InternalSmallJava.g:1564:1: ( ';' )
            // InternalSmallJava.g:1565:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJVariableDeclarationAccess().getSemicolonKeyword_3()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJVariableDeclarationAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJVariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__SJIfStatement__Group__0"
    // InternalSmallJava.g:1575:1: rule__SJIfStatement__Group__0 : rule__SJIfStatement__Group__0__Impl rule__SJIfStatement__Group__1 ;
    public final void rule__SJIfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1579:1: ( rule__SJIfStatement__Group__0__Impl rule__SJIfStatement__Group__1 )
            // InternalSmallJava.g:1580:2: rule__SJIfStatement__Group__0__Impl rule__SJIfStatement__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__SJIfStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJIfStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group__0"


    // $ANTLR start "rule__SJIfStatement__Group__0__Impl"
    // InternalSmallJava.g:1587:1: rule__SJIfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__SJIfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1591:1: ( ( 'if' ) )
            // InternalSmallJava.g:1592:1: ( 'if' )
            {
            // InternalSmallJava.g:1592:1: ( 'if' )
            // InternalSmallJava.g:1593:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getIfKeyword_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group__0__Impl"


    // $ANTLR start "rule__SJIfStatement__Group__1"
    // InternalSmallJava.g:1602:1: rule__SJIfStatement__Group__1 : rule__SJIfStatement__Group__1__Impl rule__SJIfStatement__Group__2 ;
    public final void rule__SJIfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1606:1: ( rule__SJIfStatement__Group__1__Impl rule__SJIfStatement__Group__2 )
            // InternalSmallJava.g:1607:2: rule__SJIfStatement__Group__1__Impl rule__SJIfStatement__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__SJIfStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJIfStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group__1"


    // $ANTLR start "rule__SJIfStatement__Group__1__Impl"
    // InternalSmallJava.g:1614:1: rule__SJIfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__SJIfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1618:1: ( ( '(' ) )
            // InternalSmallJava.g:1619:1: ( '(' )
            {
            // InternalSmallJava.g:1619:1: ( '(' )
            // InternalSmallJava.g:1620:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group__1__Impl"


    // $ANTLR start "rule__SJIfStatement__Group__2"
    // InternalSmallJava.g:1629:1: rule__SJIfStatement__Group__2 : rule__SJIfStatement__Group__2__Impl rule__SJIfStatement__Group__3 ;
    public final void rule__SJIfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1633:1: ( rule__SJIfStatement__Group__2__Impl rule__SJIfStatement__Group__3 )
            // InternalSmallJava.g:1634:2: rule__SJIfStatement__Group__2__Impl rule__SJIfStatement__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__SJIfStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJIfStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group__2"


    // $ANTLR start "rule__SJIfStatement__Group__2__Impl"
    // InternalSmallJava.g:1641:1: rule__SJIfStatement__Group__2__Impl : ( ( rule__SJIfStatement__ExpressionAssignment_2 ) ) ;
    public final void rule__SJIfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1645:1: ( ( ( rule__SJIfStatement__ExpressionAssignment_2 ) ) )
            // InternalSmallJava.g:1646:1: ( ( rule__SJIfStatement__ExpressionAssignment_2 ) )
            {
            // InternalSmallJava.g:1646:1: ( ( rule__SJIfStatement__ExpressionAssignment_2 ) )
            // InternalSmallJava.g:1647:2: ( rule__SJIfStatement__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getExpressionAssignment_2()); 
            }
            // InternalSmallJava.g:1648:2: ( rule__SJIfStatement__ExpressionAssignment_2 )
            // InternalSmallJava.g:1648:3: rule__SJIfStatement__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SJIfStatement__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getExpressionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group__2__Impl"


    // $ANTLR start "rule__SJIfStatement__Group__3"
    // InternalSmallJava.g:1656:1: rule__SJIfStatement__Group__3 : rule__SJIfStatement__Group__3__Impl rule__SJIfStatement__Group__4 ;
    public final void rule__SJIfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1660:1: ( rule__SJIfStatement__Group__3__Impl rule__SJIfStatement__Group__4 )
            // InternalSmallJava.g:1661:2: rule__SJIfStatement__Group__3__Impl rule__SJIfStatement__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__SJIfStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJIfStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group__3"


    // $ANTLR start "rule__SJIfStatement__Group__3__Impl"
    // InternalSmallJava.g:1668:1: rule__SJIfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__SJIfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1672:1: ( ( ')' ) )
            // InternalSmallJava.g:1673:1: ( ')' )
            {
            // InternalSmallJava.g:1673:1: ( ')' )
            // InternalSmallJava.g:1674:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group__3__Impl"


    // $ANTLR start "rule__SJIfStatement__Group__4"
    // InternalSmallJava.g:1683:1: rule__SJIfStatement__Group__4 : rule__SJIfStatement__Group__4__Impl rule__SJIfStatement__Group__5 ;
    public final void rule__SJIfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1687:1: ( rule__SJIfStatement__Group__4__Impl rule__SJIfStatement__Group__5 )
            // InternalSmallJava.g:1688:2: rule__SJIfStatement__Group__4__Impl rule__SJIfStatement__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__SJIfStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJIfStatement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group__4"


    // $ANTLR start "rule__SJIfStatement__Group__4__Impl"
    // InternalSmallJava.g:1695:1: rule__SJIfStatement__Group__4__Impl : ( ( rule__SJIfStatement__ThenBlockAssignment_4 ) ) ;
    public final void rule__SJIfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1699:1: ( ( ( rule__SJIfStatement__ThenBlockAssignment_4 ) ) )
            // InternalSmallJava.g:1700:1: ( ( rule__SJIfStatement__ThenBlockAssignment_4 ) )
            {
            // InternalSmallJava.g:1700:1: ( ( rule__SJIfStatement__ThenBlockAssignment_4 ) )
            // InternalSmallJava.g:1701:2: ( rule__SJIfStatement__ThenBlockAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getThenBlockAssignment_4()); 
            }
            // InternalSmallJava.g:1702:2: ( rule__SJIfStatement__ThenBlockAssignment_4 )
            // InternalSmallJava.g:1702:3: rule__SJIfStatement__ThenBlockAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SJIfStatement__ThenBlockAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getThenBlockAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group__4__Impl"


    // $ANTLR start "rule__SJIfStatement__Group__5"
    // InternalSmallJava.g:1710:1: rule__SJIfStatement__Group__5 : rule__SJIfStatement__Group__5__Impl ;
    public final void rule__SJIfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1714:1: ( rule__SJIfStatement__Group__5__Impl )
            // InternalSmallJava.g:1715:2: rule__SJIfStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJIfStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group__5"


    // $ANTLR start "rule__SJIfStatement__Group__5__Impl"
    // InternalSmallJava.g:1721:1: rule__SJIfStatement__Group__5__Impl : ( ( rule__SJIfStatement__Group_5__0 )? ) ;
    public final void rule__SJIfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1725:1: ( ( ( rule__SJIfStatement__Group_5__0 )? ) )
            // InternalSmallJava.g:1726:1: ( ( rule__SJIfStatement__Group_5__0 )? )
            {
            // InternalSmallJava.g:1726:1: ( ( rule__SJIfStatement__Group_5__0 )? )
            // InternalSmallJava.g:1727:2: ( rule__SJIfStatement__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getGroup_5()); 
            }
            // InternalSmallJava.g:1728:2: ( rule__SJIfStatement__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                int LA13_1 = input.LA(2);

                if ( (synpred19_InternalSmallJava()) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalSmallJava.g:1728:3: rule__SJIfStatement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SJIfStatement__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group__5__Impl"


    // $ANTLR start "rule__SJIfStatement__Group_5__0"
    // InternalSmallJava.g:1737:1: rule__SJIfStatement__Group_5__0 : rule__SJIfStatement__Group_5__0__Impl rule__SJIfStatement__Group_5__1 ;
    public final void rule__SJIfStatement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1741:1: ( rule__SJIfStatement__Group_5__0__Impl rule__SJIfStatement__Group_5__1 )
            // InternalSmallJava.g:1742:2: rule__SJIfStatement__Group_5__0__Impl rule__SJIfStatement__Group_5__1
            {
            pushFollow(FOLLOW_19);
            rule__SJIfStatement__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJIfStatement__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group_5__0"


    // $ANTLR start "rule__SJIfStatement__Group_5__0__Impl"
    // InternalSmallJava.g:1749:1: rule__SJIfStatement__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__SJIfStatement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1753:1: ( ( ( 'else' ) ) )
            // InternalSmallJava.g:1754:1: ( ( 'else' ) )
            {
            // InternalSmallJava.g:1754:1: ( ( 'else' ) )
            // InternalSmallJava.g:1755:2: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getElseKeyword_5_0()); 
            }
            // InternalSmallJava.g:1756:2: ( 'else' )
            // InternalSmallJava.g:1756:3: 'else'
            {
            match(input,24,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getElseKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group_5__0__Impl"


    // $ANTLR start "rule__SJIfStatement__Group_5__1"
    // InternalSmallJava.g:1764:1: rule__SJIfStatement__Group_5__1 : rule__SJIfStatement__Group_5__1__Impl ;
    public final void rule__SJIfStatement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1768:1: ( rule__SJIfStatement__Group_5__1__Impl )
            // InternalSmallJava.g:1769:2: rule__SJIfStatement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJIfStatement__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group_5__1"


    // $ANTLR start "rule__SJIfStatement__Group_5__1__Impl"
    // InternalSmallJava.g:1775:1: rule__SJIfStatement__Group_5__1__Impl : ( ( rule__SJIfStatement__ElseBlockAssignment_5_1 ) ) ;
    public final void rule__SJIfStatement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1779:1: ( ( ( rule__SJIfStatement__ElseBlockAssignment_5_1 ) ) )
            // InternalSmallJava.g:1780:1: ( ( rule__SJIfStatement__ElseBlockAssignment_5_1 ) )
            {
            // InternalSmallJava.g:1780:1: ( ( rule__SJIfStatement__ElseBlockAssignment_5_1 ) )
            // InternalSmallJava.g:1781:2: ( rule__SJIfStatement__ElseBlockAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getElseBlockAssignment_5_1()); 
            }
            // InternalSmallJava.g:1782:2: ( rule__SJIfStatement__ElseBlockAssignment_5_1 )
            // InternalSmallJava.g:1782:3: rule__SJIfStatement__ElseBlockAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SJIfStatement__ElseBlockAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getElseBlockAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group_5__1__Impl"


    // $ANTLR start "rule__SJAssignment__Group__0"
    // InternalSmallJava.g:1791:1: rule__SJAssignment__Group__0 : rule__SJAssignment__Group__0__Impl rule__SJAssignment__Group__1 ;
    public final void rule__SJAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1795:1: ( rule__SJAssignment__Group__0__Impl rule__SJAssignment__Group__1 )
            // InternalSmallJava.g:1796:2: rule__SJAssignment__Group__0__Impl rule__SJAssignment__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__SJAssignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJAssignment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJAssignment__Group__0"


    // $ANTLR start "rule__SJAssignment__Group__0__Impl"
    // InternalSmallJava.g:1803:1: rule__SJAssignment__Group__0__Impl : ( ruleSJSelectionExpression ) ;
    public final void rule__SJAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1807:1: ( ( ruleSJSelectionExpression ) )
            // InternalSmallJava.g:1808:1: ( ruleSJSelectionExpression )
            {
            // InternalSmallJava.g:1808:1: ( ruleSJSelectionExpression )
            // InternalSmallJava.g:1809:2: ruleSJSelectionExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJAssignmentAccess().getSJSelectionExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJSelectionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJAssignmentAccess().getSJSelectionExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJAssignment__Group__0__Impl"


    // $ANTLR start "rule__SJAssignment__Group__1"
    // InternalSmallJava.g:1818:1: rule__SJAssignment__Group__1 : rule__SJAssignment__Group__1__Impl ;
    public final void rule__SJAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1822:1: ( rule__SJAssignment__Group__1__Impl )
            // InternalSmallJava.g:1823:2: rule__SJAssignment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJAssignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJAssignment__Group__1"


    // $ANTLR start "rule__SJAssignment__Group__1__Impl"
    // InternalSmallJava.g:1829:1: rule__SJAssignment__Group__1__Impl : ( ( rule__SJAssignment__Group_1__0 )? ) ;
    public final void rule__SJAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1833:1: ( ( ( rule__SJAssignment__Group_1__0 )? ) )
            // InternalSmallJava.g:1834:1: ( ( rule__SJAssignment__Group_1__0 )? )
            {
            // InternalSmallJava.g:1834:1: ( ( rule__SJAssignment__Group_1__0 )? )
            // InternalSmallJava.g:1835:2: ( rule__SJAssignment__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJAssignmentAccess().getGroup_1()); 
            }
            // InternalSmallJava.g:1836:2: ( rule__SJAssignment__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSmallJava.g:1836:3: rule__SJAssignment__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SJAssignment__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJAssignmentAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJAssignment__Group__1__Impl"


    // $ANTLR start "rule__SJAssignment__Group_1__0"
    // InternalSmallJava.g:1845:1: rule__SJAssignment__Group_1__0 : rule__SJAssignment__Group_1__0__Impl rule__SJAssignment__Group_1__1 ;
    public final void rule__SJAssignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1849:1: ( rule__SJAssignment__Group_1__0__Impl rule__SJAssignment__Group_1__1 )
            // InternalSmallJava.g:1850:2: rule__SJAssignment__Group_1__0__Impl rule__SJAssignment__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__SJAssignment__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJAssignment__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJAssignment__Group_1__0"


    // $ANTLR start "rule__SJAssignment__Group_1__0__Impl"
    // InternalSmallJava.g:1857:1: rule__SJAssignment__Group_1__0__Impl : ( () ) ;
    public final void rule__SJAssignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1861:1: ( ( () ) )
            // InternalSmallJava.g:1862:1: ( () )
            {
            // InternalSmallJava.g:1862:1: ( () )
            // InternalSmallJava.g:1863:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJAssignmentAccess().getSJAssignmentLeftAction_1_0()); 
            }
            // InternalSmallJava.g:1864:2: ()
            // InternalSmallJava.g:1864:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJAssignmentAccess().getSJAssignmentLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJAssignment__Group_1__0__Impl"


    // $ANTLR start "rule__SJAssignment__Group_1__1"
    // InternalSmallJava.g:1872:1: rule__SJAssignment__Group_1__1 : rule__SJAssignment__Group_1__1__Impl rule__SJAssignment__Group_1__2 ;
    public final void rule__SJAssignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1876:1: ( rule__SJAssignment__Group_1__1__Impl rule__SJAssignment__Group_1__2 )
            // InternalSmallJava.g:1877:2: rule__SJAssignment__Group_1__1__Impl rule__SJAssignment__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__SJAssignment__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJAssignment__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJAssignment__Group_1__1"


    // $ANTLR start "rule__SJAssignment__Group_1__1__Impl"
    // InternalSmallJava.g:1884:1: rule__SJAssignment__Group_1__1__Impl : ( '=' ) ;
    public final void rule__SJAssignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1888:1: ( ( '=' ) )
            // InternalSmallJava.g:1889:1: ( '=' )
            {
            // InternalSmallJava.g:1889:1: ( '=' )
            // InternalSmallJava.g:1890:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJAssignmentAccess().getEqualsSignKeyword_1_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJAssignmentAccess().getEqualsSignKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJAssignment__Group_1__1__Impl"


    // $ANTLR start "rule__SJAssignment__Group_1__2"
    // InternalSmallJava.g:1899:1: rule__SJAssignment__Group_1__2 : rule__SJAssignment__Group_1__2__Impl ;
    public final void rule__SJAssignment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1903:1: ( rule__SJAssignment__Group_1__2__Impl )
            // InternalSmallJava.g:1904:2: rule__SJAssignment__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJAssignment__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJAssignment__Group_1__2"


    // $ANTLR start "rule__SJAssignment__Group_1__2__Impl"
    // InternalSmallJava.g:1910:1: rule__SJAssignment__Group_1__2__Impl : ( ( rule__SJAssignment__RightAssignment_1_2 ) ) ;
    public final void rule__SJAssignment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1914:1: ( ( ( rule__SJAssignment__RightAssignment_1_2 ) ) )
            // InternalSmallJava.g:1915:1: ( ( rule__SJAssignment__RightAssignment_1_2 ) )
            {
            // InternalSmallJava.g:1915:1: ( ( rule__SJAssignment__RightAssignment_1_2 ) )
            // InternalSmallJava.g:1916:2: ( rule__SJAssignment__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJAssignmentAccess().getRightAssignment_1_2()); 
            }
            // InternalSmallJava.g:1917:2: ( rule__SJAssignment__RightAssignment_1_2 )
            // InternalSmallJava.g:1917:3: rule__SJAssignment__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SJAssignment__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJAssignmentAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJAssignment__Group_1__2__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group__0"
    // InternalSmallJava.g:1926:1: rule__SJSelectionExpression__Group__0 : rule__SJSelectionExpression__Group__0__Impl rule__SJSelectionExpression__Group__1 ;
    public final void rule__SJSelectionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1930:1: ( rule__SJSelectionExpression__Group__0__Impl rule__SJSelectionExpression__Group__1 )
            // InternalSmallJava.g:1931:2: rule__SJSelectionExpression__Group__0__Impl rule__SJSelectionExpression__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__SJSelectionExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJSelectionExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group__0"


    // $ANTLR start "rule__SJSelectionExpression__Group__0__Impl"
    // InternalSmallJava.g:1938:1: rule__SJSelectionExpression__Group__0__Impl : ( ruleSJTerminalExpression ) ;
    public final void rule__SJSelectionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1942:1: ( ( ruleSJTerminalExpression ) )
            // InternalSmallJava.g:1943:1: ( ruleSJTerminalExpression )
            {
            // InternalSmallJava.g:1943:1: ( ruleSJTerminalExpression )
            // InternalSmallJava.g:1944:2: ruleSJTerminalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getSJTerminalExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getSJTerminalExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group__0__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group__1"
    // InternalSmallJava.g:1953:1: rule__SJSelectionExpression__Group__1 : rule__SJSelectionExpression__Group__1__Impl ;
    public final void rule__SJSelectionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1957:1: ( rule__SJSelectionExpression__Group__1__Impl )
            // InternalSmallJava.g:1958:2: rule__SJSelectionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJSelectionExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group__1"


    // $ANTLR start "rule__SJSelectionExpression__Group__1__Impl"
    // InternalSmallJava.g:1964:1: rule__SJSelectionExpression__Group__1__Impl : ( ( rule__SJSelectionExpression__Group_1__0 )* ) ;
    public final void rule__SJSelectionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1968:1: ( ( ( rule__SJSelectionExpression__Group_1__0 )* ) )
            // InternalSmallJava.g:1969:1: ( ( rule__SJSelectionExpression__Group_1__0 )* )
            {
            // InternalSmallJava.g:1969:1: ( ( rule__SJSelectionExpression__Group_1__0 )* )
            // InternalSmallJava.g:1970:2: ( rule__SJSelectionExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getGroup_1()); 
            }
            // InternalSmallJava.g:1971:2: ( rule__SJSelectionExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSmallJava.g:1971:3: rule__SJSelectionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__SJSelectionExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group__1__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1__0"
    // InternalSmallJava.g:1980:1: rule__SJSelectionExpression__Group_1__0 : rule__SJSelectionExpression__Group_1__0__Impl rule__SJSelectionExpression__Group_1__1 ;
    public final void rule__SJSelectionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1984:1: ( rule__SJSelectionExpression__Group_1__0__Impl rule__SJSelectionExpression__Group_1__1 )
            // InternalSmallJava.g:1985:2: rule__SJSelectionExpression__Group_1__0__Impl rule__SJSelectionExpression__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__SJSelectionExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJSelectionExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1__0"


    // $ANTLR start "rule__SJSelectionExpression__Group_1__0__Impl"
    // InternalSmallJava.g:1992:1: rule__SJSelectionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SJSelectionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:1996:1: ( ( () ) )
            // InternalSmallJava.g:1997:1: ( () )
            {
            // InternalSmallJava.g:1997:1: ( () )
            // InternalSmallJava.g:1998:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getSJMemberSelectionReceiverAction_1_0()); 
            }
            // InternalSmallJava.g:1999:2: ()
            // InternalSmallJava.g:1999:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getSJMemberSelectionReceiverAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1__1"
    // InternalSmallJava.g:2007:1: rule__SJSelectionExpression__Group_1__1 : rule__SJSelectionExpression__Group_1__1__Impl rule__SJSelectionExpression__Group_1__2 ;
    public final void rule__SJSelectionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2011:1: ( rule__SJSelectionExpression__Group_1__1__Impl rule__SJSelectionExpression__Group_1__2 )
            // InternalSmallJava.g:2012:2: rule__SJSelectionExpression__Group_1__1__Impl rule__SJSelectionExpression__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__SJSelectionExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJSelectionExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1__1"


    // $ANTLR start "rule__SJSelectionExpression__Group_1__1__Impl"
    // InternalSmallJava.g:2019:1: rule__SJSelectionExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__SJSelectionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2023:1: ( ( '.' ) )
            // InternalSmallJava.g:2024:1: ( '.' )
            {
            // InternalSmallJava.g:2024:1: ( '.' )
            // InternalSmallJava.g:2025:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getFullStopKeyword_1_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getFullStopKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1__2"
    // InternalSmallJava.g:2034:1: rule__SJSelectionExpression__Group_1__2 : rule__SJSelectionExpression__Group_1__2__Impl rule__SJSelectionExpression__Group_1__3 ;
    public final void rule__SJSelectionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2038:1: ( rule__SJSelectionExpression__Group_1__2__Impl rule__SJSelectionExpression__Group_1__3 )
            // InternalSmallJava.g:2039:2: rule__SJSelectionExpression__Group_1__2__Impl rule__SJSelectionExpression__Group_1__3
            {
            pushFollow(FOLLOW_9);
            rule__SJSelectionExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJSelectionExpression__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1__2"


    // $ANTLR start "rule__SJSelectionExpression__Group_1__2__Impl"
    // InternalSmallJava.g:2046:1: rule__SJSelectionExpression__Group_1__2__Impl : ( ( rule__SJSelectionExpression__MemberAssignment_1_2 ) ) ;
    public final void rule__SJSelectionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2050:1: ( ( ( rule__SJSelectionExpression__MemberAssignment_1_2 ) ) )
            // InternalSmallJava.g:2051:1: ( ( rule__SJSelectionExpression__MemberAssignment_1_2 ) )
            {
            // InternalSmallJava.g:2051:1: ( ( rule__SJSelectionExpression__MemberAssignment_1_2 ) )
            // InternalSmallJava.g:2052:2: ( rule__SJSelectionExpression__MemberAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getMemberAssignment_1_2()); 
            }
            // InternalSmallJava.g:2053:2: ( rule__SJSelectionExpression__MemberAssignment_1_2 )
            // InternalSmallJava.g:2053:3: rule__SJSelectionExpression__MemberAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SJSelectionExpression__MemberAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getMemberAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1__2__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1__3"
    // InternalSmallJava.g:2061:1: rule__SJSelectionExpression__Group_1__3 : rule__SJSelectionExpression__Group_1__3__Impl ;
    public final void rule__SJSelectionExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2065:1: ( rule__SJSelectionExpression__Group_1__3__Impl )
            // InternalSmallJava.g:2066:2: rule__SJSelectionExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJSelectionExpression__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1__3"


    // $ANTLR start "rule__SJSelectionExpression__Group_1__3__Impl"
    // InternalSmallJava.g:2072:1: rule__SJSelectionExpression__Group_1__3__Impl : ( ( rule__SJSelectionExpression__Group_1_3__0 )? ) ;
    public final void rule__SJSelectionExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2076:1: ( ( ( rule__SJSelectionExpression__Group_1_3__0 )? ) )
            // InternalSmallJava.g:2077:1: ( ( rule__SJSelectionExpression__Group_1_3__0 )? )
            {
            // InternalSmallJava.g:2077:1: ( ( rule__SJSelectionExpression__Group_1_3__0 )? )
            // InternalSmallJava.g:2078:2: ( rule__SJSelectionExpression__Group_1_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getGroup_1_3()); 
            }
            // InternalSmallJava.g:2079:2: ( rule__SJSelectionExpression__Group_1_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSmallJava.g:2079:3: rule__SJSelectionExpression__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SJSelectionExpression__Group_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getGroup_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1__3__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3__0"
    // InternalSmallJava.g:2088:1: rule__SJSelectionExpression__Group_1_3__0 : rule__SJSelectionExpression__Group_1_3__0__Impl rule__SJSelectionExpression__Group_1_3__1 ;
    public final void rule__SJSelectionExpression__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2092:1: ( rule__SJSelectionExpression__Group_1_3__0__Impl rule__SJSelectionExpression__Group_1_3__1 )
            // InternalSmallJava.g:2093:2: rule__SJSelectionExpression__Group_1_3__0__Impl rule__SJSelectionExpression__Group_1_3__1
            {
            pushFollow(FOLLOW_23);
            rule__SJSelectionExpression__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJSelectionExpression__Group_1_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3__0"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3__0__Impl"
    // InternalSmallJava.g:2100:1: rule__SJSelectionExpression__Group_1_3__0__Impl : ( ( rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0 ) ) ;
    public final void rule__SJSelectionExpression__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2104:1: ( ( ( rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0 ) ) )
            // InternalSmallJava.g:2105:1: ( ( rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0 ) )
            {
            // InternalSmallJava.g:2105:1: ( ( rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0 ) )
            // InternalSmallJava.g:2106:2: ( rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getMethodinvocationAssignment_1_3_0()); 
            }
            // InternalSmallJava.g:2107:2: ( rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0 )
            // InternalSmallJava.g:2107:3: rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0
            {
            pushFollow(FOLLOW_2);
            rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getMethodinvocationAssignment_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3__0__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3__1"
    // InternalSmallJava.g:2115:1: rule__SJSelectionExpression__Group_1_3__1 : rule__SJSelectionExpression__Group_1_3__1__Impl rule__SJSelectionExpression__Group_1_3__2 ;
    public final void rule__SJSelectionExpression__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2119:1: ( rule__SJSelectionExpression__Group_1_3__1__Impl rule__SJSelectionExpression__Group_1_3__2 )
            // InternalSmallJava.g:2120:2: rule__SJSelectionExpression__Group_1_3__1__Impl rule__SJSelectionExpression__Group_1_3__2
            {
            pushFollow(FOLLOW_23);
            rule__SJSelectionExpression__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJSelectionExpression__Group_1_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3__1"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3__1__Impl"
    // InternalSmallJava.g:2127:1: rule__SJSelectionExpression__Group_1_3__1__Impl : ( ( rule__SJSelectionExpression__Group_1_3_1__0 )? ) ;
    public final void rule__SJSelectionExpression__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2131:1: ( ( ( rule__SJSelectionExpression__Group_1_3_1__0 )? ) )
            // InternalSmallJava.g:2132:1: ( ( rule__SJSelectionExpression__Group_1_3_1__0 )? )
            {
            // InternalSmallJava.g:2132:1: ( ( rule__SJSelectionExpression__Group_1_3_1__0 )? )
            // InternalSmallJava.g:2133:2: ( rule__SJSelectionExpression__Group_1_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getGroup_1_3_1()); 
            }
            // InternalSmallJava.g:2134:2: ( rule__SJSelectionExpression__Group_1_3_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||(LA17_0>=11 && LA17_0<=12)||LA17_0==18||(LA17_0>=26 && LA17_0<=28)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSmallJava.g:2134:3: rule__SJSelectionExpression__Group_1_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SJSelectionExpression__Group_1_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getGroup_1_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3__1__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3__2"
    // InternalSmallJava.g:2142:1: rule__SJSelectionExpression__Group_1_3__2 : rule__SJSelectionExpression__Group_1_3__2__Impl ;
    public final void rule__SJSelectionExpression__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2146:1: ( rule__SJSelectionExpression__Group_1_3__2__Impl )
            // InternalSmallJava.g:2147:2: rule__SJSelectionExpression__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJSelectionExpression__Group_1_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3__2"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3__2__Impl"
    // InternalSmallJava.g:2153:1: rule__SJSelectionExpression__Group_1_3__2__Impl : ( ')' ) ;
    public final void rule__SJSelectionExpression__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2157:1: ( ( ')' ) )
            // InternalSmallJava.g:2158:1: ( ')' )
            {
            // InternalSmallJava.g:2158:1: ( ')' )
            // InternalSmallJava.g:2159:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3__2__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3_1__0"
    // InternalSmallJava.g:2169:1: rule__SJSelectionExpression__Group_1_3_1__0 : rule__SJSelectionExpression__Group_1_3_1__0__Impl rule__SJSelectionExpression__Group_1_3_1__1 ;
    public final void rule__SJSelectionExpression__Group_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2173:1: ( rule__SJSelectionExpression__Group_1_3_1__0__Impl rule__SJSelectionExpression__Group_1_3_1__1 )
            // InternalSmallJava.g:2174:2: rule__SJSelectionExpression__Group_1_3_1__0__Impl rule__SJSelectionExpression__Group_1_3_1__1
            {
            pushFollow(FOLLOW_12);
            rule__SJSelectionExpression__Group_1_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJSelectionExpression__Group_1_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3_1__0"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3_1__0__Impl"
    // InternalSmallJava.g:2181:1: rule__SJSelectionExpression__Group_1_3_1__0__Impl : ( ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_0 ) ) ;
    public final void rule__SJSelectionExpression__Group_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2185:1: ( ( ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_0 ) ) )
            // InternalSmallJava.g:2186:1: ( ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_0 ) )
            {
            // InternalSmallJava.g:2186:1: ( ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_0 ) )
            // InternalSmallJava.g:2187:2: ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getArgsAssignment_1_3_1_0()); 
            }
            // InternalSmallJava.g:2188:2: ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_0 )
            // InternalSmallJava.g:2188:3: rule__SJSelectionExpression__ArgsAssignment_1_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SJSelectionExpression__ArgsAssignment_1_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getArgsAssignment_1_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3_1__0__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3_1__1"
    // InternalSmallJava.g:2196:1: rule__SJSelectionExpression__Group_1_3_1__1 : rule__SJSelectionExpression__Group_1_3_1__1__Impl ;
    public final void rule__SJSelectionExpression__Group_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2200:1: ( rule__SJSelectionExpression__Group_1_3_1__1__Impl )
            // InternalSmallJava.g:2201:2: rule__SJSelectionExpression__Group_1_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJSelectionExpression__Group_1_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3_1__1"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3_1__1__Impl"
    // InternalSmallJava.g:2207:1: rule__SJSelectionExpression__Group_1_3_1__1__Impl : ( ( rule__SJSelectionExpression__Group_1_3_1_1__0 )* ) ;
    public final void rule__SJSelectionExpression__Group_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2211:1: ( ( ( rule__SJSelectionExpression__Group_1_3_1_1__0 )* ) )
            // InternalSmallJava.g:2212:1: ( ( rule__SJSelectionExpression__Group_1_3_1_1__0 )* )
            {
            // InternalSmallJava.g:2212:1: ( ( rule__SJSelectionExpression__Group_1_3_1_1__0 )* )
            // InternalSmallJava.g:2213:2: ( rule__SJSelectionExpression__Group_1_3_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getGroup_1_3_1_1()); 
            }
            // InternalSmallJava.g:2214:2: ( rule__SJSelectionExpression__Group_1_3_1_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSmallJava.g:2214:3: rule__SJSelectionExpression__Group_1_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SJSelectionExpression__Group_1_3_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getGroup_1_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3_1__1__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3_1_1__0"
    // InternalSmallJava.g:2223:1: rule__SJSelectionExpression__Group_1_3_1_1__0 : rule__SJSelectionExpression__Group_1_3_1_1__0__Impl rule__SJSelectionExpression__Group_1_3_1_1__1 ;
    public final void rule__SJSelectionExpression__Group_1_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2227:1: ( rule__SJSelectionExpression__Group_1_3_1_1__0__Impl rule__SJSelectionExpression__Group_1_3_1_1__1 )
            // InternalSmallJava.g:2228:2: rule__SJSelectionExpression__Group_1_3_1_1__0__Impl rule__SJSelectionExpression__Group_1_3_1_1__1
            {
            pushFollow(FOLLOW_16);
            rule__SJSelectionExpression__Group_1_3_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJSelectionExpression__Group_1_3_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3_1_1__0"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3_1_1__0__Impl"
    // InternalSmallJava.g:2235:1: rule__SJSelectionExpression__Group_1_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__SJSelectionExpression__Group_1_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2239:1: ( ( ',' ) )
            // InternalSmallJava.g:2240:1: ( ',' )
            {
            // InternalSmallJava.g:2240:1: ( ',' )
            // InternalSmallJava.g:2241:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3_1_1__0__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3_1_1__1"
    // InternalSmallJava.g:2250:1: rule__SJSelectionExpression__Group_1_3_1_1__1 : rule__SJSelectionExpression__Group_1_3_1_1__1__Impl ;
    public final void rule__SJSelectionExpression__Group_1_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2254:1: ( rule__SJSelectionExpression__Group_1_3_1_1__1__Impl )
            // InternalSmallJava.g:2255:2: rule__SJSelectionExpression__Group_1_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJSelectionExpression__Group_1_3_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3_1_1__1"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3_1_1__1__Impl"
    // InternalSmallJava.g:2261:1: rule__SJSelectionExpression__Group_1_3_1_1__1__Impl : ( ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1 ) ) ;
    public final void rule__SJSelectionExpression__Group_1_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2265:1: ( ( ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1 ) ) )
            // InternalSmallJava.g:2266:1: ( ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1 ) )
            {
            // InternalSmallJava.g:2266:1: ( ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1 ) )
            // InternalSmallJava.g:2267:2: ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getArgsAssignment_1_3_1_1_1()); 
            }
            // InternalSmallJava.g:2268:2: ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1 )
            // InternalSmallJava.g:2268:3: rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getArgsAssignment_1_3_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3_1_1__1__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_0__0"
    // InternalSmallJava.g:2277:1: rule__SJTerminalExpression__Group_0__0 : rule__SJTerminalExpression__Group_0__0__Impl rule__SJTerminalExpression__Group_0__1 ;
    public final void rule__SJTerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2281:1: ( rule__SJTerminalExpression__Group_0__0__Impl rule__SJTerminalExpression__Group_0__1 )
            // InternalSmallJava.g:2282:2: rule__SJTerminalExpression__Group_0__0__Impl rule__SJTerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_24);
            rule__SJTerminalExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_0__0"


    // $ANTLR start "rule__SJTerminalExpression__Group_0__0__Impl"
    // InternalSmallJava.g:2289:1: rule__SJTerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__SJTerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2293:1: ( ( () ) )
            // InternalSmallJava.g:2294:1: ( () )
            {
            // InternalSmallJava.g:2294:1: ( () )
            // InternalSmallJava.g:2295:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSJThisAction_0_0()); 
            }
            // InternalSmallJava.g:2296:2: ()
            // InternalSmallJava.g:2296:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSJThisAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_0__0__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_0__1"
    // InternalSmallJava.g:2304:1: rule__SJTerminalExpression__Group_0__1 : rule__SJTerminalExpression__Group_0__1__Impl ;
    public final void rule__SJTerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2308:1: ( rule__SJTerminalExpression__Group_0__1__Impl )
            // InternalSmallJava.g:2309:2: rule__SJTerminalExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_0__1"


    // $ANTLR start "rule__SJTerminalExpression__Group_0__1__Impl"
    // InternalSmallJava.g:2315:1: rule__SJTerminalExpression__Group_0__1__Impl : ( 'this' ) ;
    public final void rule__SJTerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2319:1: ( ( 'this' ) )
            // InternalSmallJava.g:2320:1: ( 'this' )
            {
            // InternalSmallJava.g:2320:1: ( 'this' )
            // InternalSmallJava.g:2321:2: 'this'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getThisKeyword_0_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getThisKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_0__1__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_1__0"
    // InternalSmallJava.g:2331:1: rule__SJTerminalExpression__Group_1__0 : rule__SJTerminalExpression__Group_1__0__Impl rule__SJTerminalExpression__Group_1__1 ;
    public final void rule__SJTerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2335:1: ( rule__SJTerminalExpression__Group_1__0__Impl rule__SJTerminalExpression__Group_1__1 )
            // InternalSmallJava.g:2336:2: rule__SJTerminalExpression__Group_1__0__Impl rule__SJTerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__SJTerminalExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_1__0"


    // $ANTLR start "rule__SJTerminalExpression__Group_1__0__Impl"
    // InternalSmallJava.g:2343:1: rule__SJTerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SJTerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2347:1: ( ( () ) )
            // InternalSmallJava.g:2348:1: ( () )
            {
            // InternalSmallJava.g:2348:1: ( () )
            // InternalSmallJava.g:2349:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSJNullAction_1_0()); 
            }
            // InternalSmallJava.g:2350:2: ()
            // InternalSmallJava.g:2350:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSJNullAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_1__1"
    // InternalSmallJava.g:2358:1: rule__SJTerminalExpression__Group_1__1 : rule__SJTerminalExpression__Group_1__1__Impl ;
    public final void rule__SJTerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2362:1: ( rule__SJTerminalExpression__Group_1__1__Impl )
            // InternalSmallJava.g:2363:2: rule__SJTerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_1__1"


    // $ANTLR start "rule__SJTerminalExpression__Group_1__1__Impl"
    // InternalSmallJava.g:2369:1: rule__SJTerminalExpression__Group_1__1__Impl : ( 'null' ) ;
    public final void rule__SJTerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2373:1: ( ( 'null' ) )
            // InternalSmallJava.g:2374:1: ( 'null' )
            {
            // InternalSmallJava.g:2374:1: ( 'null' )
            // InternalSmallJava.g:2375:2: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getNullKeyword_1_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getNullKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_2__0"
    // InternalSmallJava.g:2385:1: rule__SJTerminalExpression__Group_2__0 : rule__SJTerminalExpression__Group_2__0__Impl rule__SJTerminalExpression__Group_2__1 ;
    public final void rule__SJTerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2389:1: ( rule__SJTerminalExpression__Group_2__0__Impl rule__SJTerminalExpression__Group_2__1 )
            // InternalSmallJava.g:2390:2: rule__SJTerminalExpression__Group_2__0__Impl rule__SJTerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__SJTerminalExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_2__0"


    // $ANTLR start "rule__SJTerminalExpression__Group_2__0__Impl"
    // InternalSmallJava.g:2397:1: rule__SJTerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__SJTerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2401:1: ( ( () ) )
            // InternalSmallJava.g:2402:1: ( () )
            {
            // InternalSmallJava.g:2402:1: ( () )
            // InternalSmallJava.g:2403:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getBoolConstantAction_2_0()); 
            }
            // InternalSmallJava.g:2404:2: ()
            // InternalSmallJava.g:2404:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getBoolConstantAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_2__0__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_2__1"
    // InternalSmallJava.g:2412:1: rule__SJTerminalExpression__Group_2__1 : rule__SJTerminalExpression__Group_2__1__Impl ;
    public final void rule__SJTerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2416:1: ( rule__SJTerminalExpression__Group_2__1__Impl )
            // InternalSmallJava.g:2417:2: rule__SJTerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_2__1"


    // $ANTLR start "rule__SJTerminalExpression__Group_2__1__Impl"
    // InternalSmallJava.g:2423:1: rule__SJTerminalExpression__Group_2__1__Impl : ( ( rule__SJTerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__SJTerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2427:1: ( ( ( rule__SJTerminalExpression__ValueAssignment_2_1 ) ) )
            // InternalSmallJava.g:2428:1: ( ( rule__SJTerminalExpression__ValueAssignment_2_1 ) )
            {
            // InternalSmallJava.g:2428:1: ( ( rule__SJTerminalExpression__ValueAssignment_2_1 ) )
            // InternalSmallJava.g:2429:2: ( rule__SJTerminalExpression__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getValueAssignment_2_1()); 
            }
            // InternalSmallJava.g:2430:2: ( rule__SJTerminalExpression__ValueAssignment_2_1 )
            // InternalSmallJava.g:2430:3: rule__SJTerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__ValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getValueAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_2__1__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_3__0"
    // InternalSmallJava.g:2439:1: rule__SJTerminalExpression__Group_3__0 : rule__SJTerminalExpression__Group_3__0__Impl rule__SJTerminalExpression__Group_3__1 ;
    public final void rule__SJTerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2443:1: ( rule__SJTerminalExpression__Group_3__0__Impl rule__SJTerminalExpression__Group_3__1 )
            // InternalSmallJava.g:2444:2: rule__SJTerminalExpression__Group_3__0__Impl rule__SJTerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__SJTerminalExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_3__0"


    // $ANTLR start "rule__SJTerminalExpression__Group_3__0__Impl"
    // InternalSmallJava.g:2451:1: rule__SJTerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__SJTerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2455:1: ( ( () ) )
            // InternalSmallJava.g:2456:1: ( () )
            {
            // InternalSmallJava.g:2456:1: ( () )
            // InternalSmallJava.g:2457:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSJSymbolRefAction_3_0()); 
            }
            // InternalSmallJava.g:2458:2: ()
            // InternalSmallJava.g:2458:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSJSymbolRefAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_3__0__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_3__1"
    // InternalSmallJava.g:2466:1: rule__SJTerminalExpression__Group_3__1 : rule__SJTerminalExpression__Group_3__1__Impl ;
    public final void rule__SJTerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2470:1: ( rule__SJTerminalExpression__Group_3__1__Impl )
            // InternalSmallJava.g:2471:2: rule__SJTerminalExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_3__1"


    // $ANTLR start "rule__SJTerminalExpression__Group_3__1__Impl"
    // InternalSmallJava.g:2477:1: rule__SJTerminalExpression__Group_3__1__Impl : ( ( rule__SJTerminalExpression__SymbolAssignment_3_1 ) ) ;
    public final void rule__SJTerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2481:1: ( ( ( rule__SJTerminalExpression__SymbolAssignment_3_1 ) ) )
            // InternalSmallJava.g:2482:1: ( ( rule__SJTerminalExpression__SymbolAssignment_3_1 ) )
            {
            // InternalSmallJava.g:2482:1: ( ( rule__SJTerminalExpression__SymbolAssignment_3_1 ) )
            // InternalSmallJava.g:2483:2: ( rule__SJTerminalExpression__SymbolAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSymbolAssignment_3_1()); 
            }
            // InternalSmallJava.g:2484:2: ( rule__SJTerminalExpression__SymbolAssignment_3_1 )
            // InternalSmallJava.g:2484:3: rule__SJTerminalExpression__SymbolAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__SymbolAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSymbolAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_3__1__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_4__0"
    // InternalSmallJava.g:2493:1: rule__SJTerminalExpression__Group_4__0 : rule__SJTerminalExpression__Group_4__0__Impl rule__SJTerminalExpression__Group_4__1 ;
    public final void rule__SJTerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2497:1: ( rule__SJTerminalExpression__Group_4__0__Impl rule__SJTerminalExpression__Group_4__1 )
            // InternalSmallJava.g:2498:2: rule__SJTerminalExpression__Group_4__0__Impl rule__SJTerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_27);
            rule__SJTerminalExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_4__0"


    // $ANTLR start "rule__SJTerminalExpression__Group_4__0__Impl"
    // InternalSmallJava.g:2505:1: rule__SJTerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__SJTerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2509:1: ( ( () ) )
            // InternalSmallJava.g:2510:1: ( () )
            {
            // InternalSmallJava.g:2510:1: ( () )
            // InternalSmallJava.g:2511:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSJNewAction_4_0()); 
            }
            // InternalSmallJava.g:2512:2: ()
            // InternalSmallJava.g:2512:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSJNewAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_4__0__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_4__1"
    // InternalSmallJava.g:2520:1: rule__SJTerminalExpression__Group_4__1 : rule__SJTerminalExpression__Group_4__1__Impl rule__SJTerminalExpression__Group_4__2 ;
    public final void rule__SJTerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2524:1: ( rule__SJTerminalExpression__Group_4__1__Impl rule__SJTerminalExpression__Group_4__2 )
            // InternalSmallJava.g:2525:2: rule__SJTerminalExpression__Group_4__1__Impl rule__SJTerminalExpression__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__SJTerminalExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_4__1"


    // $ANTLR start "rule__SJTerminalExpression__Group_4__1__Impl"
    // InternalSmallJava.g:2532:1: rule__SJTerminalExpression__Group_4__1__Impl : ( 'new' ) ;
    public final void rule__SJTerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2536:1: ( ( 'new' ) )
            // InternalSmallJava.g:2537:1: ( 'new' )
            {
            // InternalSmallJava.g:2537:1: ( 'new' )
            // InternalSmallJava.g:2538:2: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getNewKeyword_4_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getNewKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_4__1__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_4__2"
    // InternalSmallJava.g:2547:1: rule__SJTerminalExpression__Group_4__2 : rule__SJTerminalExpression__Group_4__2__Impl rule__SJTerminalExpression__Group_4__3 ;
    public final void rule__SJTerminalExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2551:1: ( rule__SJTerminalExpression__Group_4__2__Impl rule__SJTerminalExpression__Group_4__3 )
            // InternalSmallJava.g:2552:2: rule__SJTerminalExpression__Group_4__2__Impl rule__SJTerminalExpression__Group_4__3
            {
            pushFollow(FOLLOW_9);
            rule__SJTerminalExpression__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_4__2"


    // $ANTLR start "rule__SJTerminalExpression__Group_4__2__Impl"
    // InternalSmallJava.g:2559:1: rule__SJTerminalExpression__Group_4__2__Impl : ( ( rule__SJTerminalExpression__TypeAssignment_4_2 ) ) ;
    public final void rule__SJTerminalExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2563:1: ( ( ( rule__SJTerminalExpression__TypeAssignment_4_2 ) ) )
            // InternalSmallJava.g:2564:1: ( ( rule__SJTerminalExpression__TypeAssignment_4_2 ) )
            {
            // InternalSmallJava.g:2564:1: ( ( rule__SJTerminalExpression__TypeAssignment_4_2 ) )
            // InternalSmallJava.g:2565:2: ( rule__SJTerminalExpression__TypeAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getTypeAssignment_4_2()); 
            }
            // InternalSmallJava.g:2566:2: ( rule__SJTerminalExpression__TypeAssignment_4_2 )
            // InternalSmallJava.g:2566:3: rule__SJTerminalExpression__TypeAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__TypeAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getTypeAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_4__2__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_4__3"
    // InternalSmallJava.g:2574:1: rule__SJTerminalExpression__Group_4__3 : rule__SJTerminalExpression__Group_4__3__Impl rule__SJTerminalExpression__Group_4__4 ;
    public final void rule__SJTerminalExpression__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2578:1: ( rule__SJTerminalExpression__Group_4__3__Impl rule__SJTerminalExpression__Group_4__4 )
            // InternalSmallJava.g:2579:2: rule__SJTerminalExpression__Group_4__3__Impl rule__SJTerminalExpression__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__SJTerminalExpression__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__Group_4__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_4__3"


    // $ANTLR start "rule__SJTerminalExpression__Group_4__3__Impl"
    // InternalSmallJava.g:2586:1: rule__SJTerminalExpression__Group_4__3__Impl : ( '(' ) ;
    public final void rule__SJTerminalExpression__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2590:1: ( ( '(' ) )
            // InternalSmallJava.g:2591:1: ( '(' )
            {
            // InternalSmallJava.g:2591:1: ( '(' )
            // InternalSmallJava.g:2592:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getLeftParenthesisKeyword_4_3()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getLeftParenthesisKeyword_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_4__3__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_4__4"
    // InternalSmallJava.g:2601:1: rule__SJTerminalExpression__Group_4__4 : rule__SJTerminalExpression__Group_4__4__Impl ;
    public final void rule__SJTerminalExpression__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2605:1: ( rule__SJTerminalExpression__Group_4__4__Impl )
            // InternalSmallJava.g:2606:2: rule__SJTerminalExpression__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__Group_4__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_4__4"


    // $ANTLR start "rule__SJTerminalExpression__Group_4__4__Impl"
    // InternalSmallJava.g:2612:1: rule__SJTerminalExpression__Group_4__4__Impl : ( ')' ) ;
    public final void rule__SJTerminalExpression__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2616:1: ( ( ')' ) )
            // InternalSmallJava.g:2617:1: ( ')' )
            {
            // InternalSmallJava.g:2617:1: ( ')' )
            // InternalSmallJava.g:2618:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getRightParenthesisKeyword_4_4()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getRightParenthesisKeyword_4_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_4__4__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_5__0"
    // InternalSmallJava.g:2628:1: rule__SJTerminalExpression__Group_5__0 : rule__SJTerminalExpression__Group_5__0__Impl rule__SJTerminalExpression__Group_5__1 ;
    public final void rule__SJTerminalExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2632:1: ( rule__SJTerminalExpression__Group_5__0__Impl rule__SJTerminalExpression__Group_5__1 )
            // InternalSmallJava.g:2633:2: rule__SJTerminalExpression__Group_5__0__Impl rule__SJTerminalExpression__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__SJTerminalExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_5__0"


    // $ANTLR start "rule__SJTerminalExpression__Group_5__0__Impl"
    // InternalSmallJava.g:2640:1: rule__SJTerminalExpression__Group_5__0__Impl : ( '(' ) ;
    public final void rule__SJTerminalExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2644:1: ( ( '(' ) )
            // InternalSmallJava.g:2645:1: ( '(' )
            {
            // InternalSmallJava.g:2645:1: ( '(' )
            // InternalSmallJava.g:2646:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_5__0__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_5__1"
    // InternalSmallJava.g:2655:1: rule__SJTerminalExpression__Group_5__1 : rule__SJTerminalExpression__Group_5__1__Impl rule__SJTerminalExpression__Group_5__2 ;
    public final void rule__SJTerminalExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2659:1: ( rule__SJTerminalExpression__Group_5__1__Impl rule__SJTerminalExpression__Group_5__2 )
            // InternalSmallJava.g:2660:2: rule__SJTerminalExpression__Group_5__1__Impl rule__SJTerminalExpression__Group_5__2
            {
            pushFollow(FOLLOW_18);
            rule__SJTerminalExpression__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_5__1"


    // $ANTLR start "rule__SJTerminalExpression__Group_5__1__Impl"
    // InternalSmallJava.g:2667:1: rule__SJTerminalExpression__Group_5__1__Impl : ( ruleSJExpression ) ;
    public final void rule__SJTerminalExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2671:1: ( ( ruleSJExpression ) )
            // InternalSmallJava.g:2672:1: ( ruleSJExpression )
            {
            // InternalSmallJava.g:2672:1: ( ruleSJExpression )
            // InternalSmallJava.g:2673:2: ruleSJExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSJExpressionParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSJExpressionParserRuleCall_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_5__1__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_5__2"
    // InternalSmallJava.g:2682:1: rule__SJTerminalExpression__Group_5__2 : rule__SJTerminalExpression__Group_5__2__Impl ;
    public final void rule__SJTerminalExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2686:1: ( rule__SJTerminalExpression__Group_5__2__Impl )
            // InternalSmallJava.g:2687:2: rule__SJTerminalExpression__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_5__2"


    // $ANTLR start "rule__SJTerminalExpression__Group_5__2__Impl"
    // InternalSmallJava.g:2693:1: rule__SJTerminalExpression__Group_5__2__Impl : ( ')' ) ;
    public final void rule__SJTerminalExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2697:1: ( ( ')' ) )
            // InternalSmallJava.g:2698:1: ( ')' )
            {
            // InternalSmallJava.g:2698:1: ( ')' )
            // InternalSmallJava.g:2699:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_5__2__Impl"


    // $ANTLR start "rule__SJProgram__ClassesAssignment"
    // InternalSmallJava.g:2709:1: rule__SJProgram__ClassesAssignment : ( ruleSJClass ) ;
    public final void rule__SJProgram__ClassesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2713:1: ( ( ruleSJClass ) )
            // InternalSmallJava.g:2714:2: ( ruleSJClass )
            {
            // InternalSmallJava.g:2714:2: ( ruleSJClass )
            // InternalSmallJava.g:2715:3: ruleSJClass
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJProgramAccess().getClassesSJClassParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJProgramAccess().getClassesSJClassParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJProgram__ClassesAssignment"


    // $ANTLR start "rule__SJClass__NameAssignment_1"
    // InternalSmallJava.g:2724:1: rule__SJClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SJClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2728:1: ( ( RULE_ID ) )
            // InternalSmallJava.g:2729:2: ( RULE_ID )
            {
            // InternalSmallJava.g:2729:2: ( RULE_ID )
            // InternalSmallJava.g:2730:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__NameAssignment_1"


    // $ANTLR start "rule__SJClass__SuperclassAssignment_2_1"
    // InternalSmallJava.g:2739:1: rule__SJClass__SuperclassAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__SJClass__SuperclassAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2743:1: ( ( ( RULE_ID ) ) )
            // InternalSmallJava.g:2744:2: ( ( RULE_ID ) )
            {
            // InternalSmallJava.g:2744:2: ( ( RULE_ID ) )
            // InternalSmallJava.g:2745:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getSuperclassSJClassCrossReference_2_1_0()); 
            }
            // InternalSmallJava.g:2746:3: ( RULE_ID )
            // InternalSmallJava.g:2747:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getSuperclassSJClassIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getSuperclassSJClassIDTerminalRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getSuperclassSJClassCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__SuperclassAssignment_2_1"


    // $ANTLR start "rule__SJClass__MembersAssignment_4"
    // InternalSmallJava.g:2758:1: rule__SJClass__MembersAssignment_4 : ( ruleSJMember ) ;
    public final void rule__SJClass__MembersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2762:1: ( ( ruleSJMember ) )
            // InternalSmallJava.g:2763:2: ( ruleSJMember )
            {
            // InternalSmallJava.g:2763:2: ( ruleSJMember )
            // InternalSmallJava.g:2764:3: ruleSJMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getMembersSJMemberParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getMembersSJMemberParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__MembersAssignment_4"


    // $ANTLR start "rule__SJTypedDeclaration__TypeAssignment_0"
    // InternalSmallJava.g:2773:1: rule__SJTypedDeclaration__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SJTypedDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2777:1: ( ( ( RULE_ID ) ) )
            // InternalSmallJava.g:2778:2: ( ( RULE_ID ) )
            {
            // InternalSmallJava.g:2778:2: ( ( RULE_ID ) )
            // InternalSmallJava.g:2779:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTypedDeclarationAccess().getTypeSJClassCrossReference_0_0()); 
            }
            // InternalSmallJava.g:2780:3: ( RULE_ID )
            // InternalSmallJava.g:2781:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTypedDeclarationAccess().getTypeSJClassIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTypedDeclarationAccess().getTypeSJClassIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTypedDeclarationAccess().getTypeSJClassCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTypedDeclaration__TypeAssignment_0"


    // $ANTLR start "rule__SJTypedDeclaration__NameAssignment_1"
    // InternalSmallJava.g:2792:1: rule__SJTypedDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SJTypedDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2796:1: ( ( RULE_ID ) )
            // InternalSmallJava.g:2797:2: ( RULE_ID )
            {
            // InternalSmallJava.g:2797:2: ( RULE_ID )
            // InternalSmallJava.g:2798:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTypedDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTypedDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTypedDeclaration__NameAssignment_1"


    // $ANTLR start "rule__SJMethod__ParamsAssignment_2_0"
    // InternalSmallJava.g:2807:1: rule__SJMethod__ParamsAssignment_2_0 : ( ruleSJParameter ) ;
    public final void rule__SJMethod__ParamsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2811:1: ( ( ruleSJParameter ) )
            // InternalSmallJava.g:2812:2: ( ruleSJParameter )
            {
            // InternalSmallJava.g:2812:2: ( ruleSJParameter )
            // InternalSmallJava.g:2813:3: ruleSJParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getParamsSJParameterParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getParamsSJParameterParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__ParamsAssignment_2_0"


    // $ANTLR start "rule__SJMethod__ParamsAssignment_2_1_1"
    // InternalSmallJava.g:2822:1: rule__SJMethod__ParamsAssignment_2_1_1 : ( ruleSJParameter ) ;
    public final void rule__SJMethod__ParamsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2826:1: ( ( ruleSJParameter ) )
            // InternalSmallJava.g:2827:2: ( ruleSJParameter )
            {
            // InternalSmallJava.g:2827:2: ( ruleSJParameter )
            // InternalSmallJava.g:2828:3: ruleSJParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getParamsSJParameterParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getParamsSJParameterParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__ParamsAssignment_2_1_1"


    // $ANTLR start "rule__SJMethod__BodyAssignment_4"
    // InternalSmallJava.g:2837:1: rule__SJMethod__BodyAssignment_4 : ( ruleSJBlock ) ;
    public final void rule__SJMethod__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2841:1: ( ( ruleSJBlock ) )
            // InternalSmallJava.g:2842:2: ( ruleSJBlock )
            {
            // InternalSmallJava.g:2842:2: ( ruleSJBlock )
            // InternalSmallJava.g:2843:3: ruleSJBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getBodySJBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getBodySJBlockParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__BodyAssignment_4"


    // $ANTLR start "rule__SJBlock__StatementsAssignment_2"
    // InternalSmallJava.g:2852:1: rule__SJBlock__StatementsAssignment_2 : ( ruleSJStatement ) ;
    public final void rule__SJBlock__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2856:1: ( ( ruleSJStatement ) )
            // InternalSmallJava.g:2857:2: ( ruleSJStatement )
            {
            // InternalSmallJava.g:2857:2: ( ruleSJStatement )
            // InternalSmallJava.g:2858:3: ruleSJStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJBlockAccess().getStatementsSJStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJBlockAccess().getStatementsSJStatementParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJBlock__StatementsAssignment_2"


    // $ANTLR start "rule__SJReturn__ExpressionAssignment_1"
    // InternalSmallJava.g:2867:1: rule__SJReturn__ExpressionAssignment_1 : ( ruleSJExpression ) ;
    public final void rule__SJReturn__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2871:1: ( ( ruleSJExpression ) )
            // InternalSmallJava.g:2872:2: ( ruleSJExpression )
            {
            // InternalSmallJava.g:2872:2: ( ruleSJExpression )
            // InternalSmallJava.g:2873:3: ruleSJExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJReturnAccess().getExpressionSJExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJReturnAccess().getExpressionSJExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJReturn__ExpressionAssignment_1"


    // $ANTLR start "rule__SJVariableDeclaration__ExpressionAssignment_2"
    // InternalSmallJava.g:2882:1: rule__SJVariableDeclaration__ExpressionAssignment_2 : ( ruleSJExpression ) ;
    public final void rule__SJVariableDeclaration__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2886:1: ( ( ruleSJExpression ) )
            // InternalSmallJava.g:2887:2: ( ruleSJExpression )
            {
            // InternalSmallJava.g:2887:2: ( ruleSJExpression )
            // InternalSmallJava.g:2888:3: ruleSJExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJVariableDeclarationAccess().getExpressionSJExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJVariableDeclarationAccess().getExpressionSJExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJVariableDeclaration__ExpressionAssignment_2"


    // $ANTLR start "rule__SJIfStatement__ExpressionAssignment_2"
    // InternalSmallJava.g:2897:1: rule__SJIfStatement__ExpressionAssignment_2 : ( ruleSJExpression ) ;
    public final void rule__SJIfStatement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2901:1: ( ( ruleSJExpression ) )
            // InternalSmallJava.g:2902:2: ( ruleSJExpression )
            {
            // InternalSmallJava.g:2902:2: ( ruleSJExpression )
            // InternalSmallJava.g:2903:3: ruleSJExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getExpressionSJExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getExpressionSJExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__ExpressionAssignment_2"


    // $ANTLR start "rule__SJIfStatement__ThenBlockAssignment_4"
    // InternalSmallJava.g:2912:1: rule__SJIfStatement__ThenBlockAssignment_4 : ( ruleSJIfBlock ) ;
    public final void rule__SJIfStatement__ThenBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2916:1: ( ( ruleSJIfBlock ) )
            // InternalSmallJava.g:2917:2: ( ruleSJIfBlock )
            {
            // InternalSmallJava.g:2917:2: ( ruleSJIfBlock )
            // InternalSmallJava.g:2918:3: ruleSJIfBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getThenBlockSJIfBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJIfBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getThenBlockSJIfBlockParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__ThenBlockAssignment_4"


    // $ANTLR start "rule__SJIfStatement__ElseBlockAssignment_5_1"
    // InternalSmallJava.g:2927:1: rule__SJIfStatement__ElseBlockAssignment_5_1 : ( ruleSJIfBlock ) ;
    public final void rule__SJIfStatement__ElseBlockAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2931:1: ( ( ruleSJIfBlock ) )
            // InternalSmallJava.g:2932:2: ( ruleSJIfBlock )
            {
            // InternalSmallJava.g:2932:2: ( ruleSJIfBlock )
            // InternalSmallJava.g:2933:3: ruleSJIfBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getElseBlockSJIfBlockParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJIfBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getElseBlockSJIfBlockParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__ElseBlockAssignment_5_1"


    // $ANTLR start "rule__SJIfBlock__StatementsAssignment_0"
    // InternalSmallJava.g:2942:1: rule__SJIfBlock__StatementsAssignment_0 : ( ruleSJStatement ) ;
    public final void rule__SJIfBlock__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2946:1: ( ( ruleSJStatement ) )
            // InternalSmallJava.g:2947:2: ( ruleSJStatement )
            {
            // InternalSmallJava.g:2947:2: ( ruleSJStatement )
            // InternalSmallJava.g:2948:3: ruleSJStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfBlockAccess().getStatementsSJStatementParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfBlockAccess().getStatementsSJStatementParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfBlock__StatementsAssignment_0"


    // $ANTLR start "rule__SJAssignment__RightAssignment_1_2"
    // InternalSmallJava.g:2957:1: rule__SJAssignment__RightAssignment_1_2 : ( ruleSJExpression ) ;
    public final void rule__SJAssignment__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2961:1: ( ( ruleSJExpression ) )
            // InternalSmallJava.g:2962:2: ( ruleSJExpression )
            {
            // InternalSmallJava.g:2962:2: ( ruleSJExpression )
            // InternalSmallJava.g:2963:3: ruleSJExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJAssignmentAccess().getRightSJExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJAssignmentAccess().getRightSJExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJAssignment__RightAssignment_1_2"


    // $ANTLR start "rule__SJSelectionExpression__MemberAssignment_1_2"
    // InternalSmallJava.g:2972:1: rule__SJSelectionExpression__MemberAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__SJSelectionExpression__MemberAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2976:1: ( ( ( RULE_ID ) ) )
            // InternalSmallJava.g:2977:2: ( ( RULE_ID ) )
            {
            // InternalSmallJava.g:2977:2: ( ( RULE_ID ) )
            // InternalSmallJava.g:2978:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getMemberSJMemberCrossReference_1_2_0()); 
            }
            // InternalSmallJava.g:2979:3: ( RULE_ID )
            // InternalSmallJava.g:2980:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getMemberSJMemberIDTerminalRuleCall_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getMemberSJMemberIDTerminalRuleCall_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getMemberSJMemberCrossReference_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__MemberAssignment_1_2"


    // $ANTLR start "rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0"
    // InternalSmallJava.g:2991:1: rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0 : ( ( '(' ) ) ;
    public final void rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:2995:1: ( ( ( '(' ) ) )
            // InternalSmallJava.g:2996:2: ( ( '(' ) )
            {
            // InternalSmallJava.g:2996:2: ( ( '(' ) )
            // InternalSmallJava.g:2997:3: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0()); 
            }
            // InternalSmallJava.g:2998:3: ( '(' )
            // InternalSmallJava.g:2999:4: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0"


    // $ANTLR start "rule__SJSelectionExpression__ArgsAssignment_1_3_1_0"
    // InternalSmallJava.g:3010:1: rule__SJSelectionExpression__ArgsAssignment_1_3_1_0 : ( ruleSJExpression ) ;
    public final void rule__SJSelectionExpression__ArgsAssignment_1_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:3014:1: ( ( ruleSJExpression ) )
            // InternalSmallJava.g:3015:2: ( ruleSJExpression )
            {
            // InternalSmallJava.g:3015:2: ( ruleSJExpression )
            // InternalSmallJava.g:3016:3: ruleSJExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getArgsSJExpressionParserRuleCall_1_3_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getArgsSJExpressionParserRuleCall_1_3_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__ArgsAssignment_1_3_1_0"


    // $ANTLR start "rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1"
    // InternalSmallJava.g:3025:1: rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1 : ( ruleSJExpression ) ;
    public final void rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:3029:1: ( ( ruleSJExpression ) )
            // InternalSmallJava.g:3030:2: ( ruleSJExpression )
            {
            // InternalSmallJava.g:3030:2: ( ruleSJExpression )
            // InternalSmallJava.g:3031:3: ruleSJExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getArgsSJExpressionParserRuleCall_1_3_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSJExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getArgsSJExpressionParserRuleCall_1_3_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1"


    // $ANTLR start "rule__SJTerminalExpression__ValueAssignment_2_1"
    // InternalSmallJava.g:3040:1: rule__SJTerminalExpression__ValueAssignment_2_1 : ( ( rule__SJTerminalExpression__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__SJTerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:3044:1: ( ( ( rule__SJTerminalExpression__ValueAlternatives_2_1_0 ) ) )
            // InternalSmallJava.g:3045:2: ( ( rule__SJTerminalExpression__ValueAlternatives_2_1_0 ) )
            {
            // InternalSmallJava.g:3045:2: ( ( rule__SJTerminalExpression__ValueAlternatives_2_1_0 ) )
            // InternalSmallJava.g:3046:3: ( rule__SJTerminalExpression__ValueAlternatives_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getValueAlternatives_2_1_0()); 
            }
            // InternalSmallJava.g:3047:3: ( rule__SJTerminalExpression__ValueAlternatives_2_1_0 )
            // InternalSmallJava.g:3047:4: rule__SJTerminalExpression__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SJTerminalExpression__ValueAlternatives_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getValueAlternatives_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__ValueAssignment_2_1"


    // $ANTLR start "rule__SJTerminalExpression__SymbolAssignment_3_1"
    // InternalSmallJava.g:3055:1: rule__SJTerminalExpression__SymbolAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__SJTerminalExpression__SymbolAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:3059:1: ( ( ( RULE_ID ) ) )
            // InternalSmallJava.g:3060:2: ( ( RULE_ID ) )
            {
            // InternalSmallJava.g:3060:2: ( ( RULE_ID ) )
            // InternalSmallJava.g:3061:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSymbolSJSymbolCrossReference_3_1_0()); 
            }
            // InternalSmallJava.g:3062:3: ( RULE_ID )
            // InternalSmallJava.g:3063:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSymbolSJSymbolIDTerminalRuleCall_3_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSymbolSJSymbolIDTerminalRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSymbolSJSymbolCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__SymbolAssignment_3_1"


    // $ANTLR start "rule__SJTerminalExpression__TypeAssignment_4_2"
    // InternalSmallJava.g:3074:1: rule__SJTerminalExpression__TypeAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__SJTerminalExpression__TypeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallJava.g:3078:1: ( ( ( RULE_ID ) ) )
            // InternalSmallJava.g:3079:2: ( ( RULE_ID ) )
            {
            // InternalSmallJava.g:3079:2: ( ( RULE_ID ) )
            // InternalSmallJava.g:3080:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getTypeSJClassCrossReference_4_2_0()); 
            }
            // InternalSmallJava.g:3081:3: ( RULE_ID )
            // InternalSmallJava.g:3082:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getTypeSJClassIDTerminalRuleCall_4_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getTypeSJClassIDTerminalRuleCall_4_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getTypeSJClassCrossReference_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__TypeAssignment_4_2"

    // $ANTLR start synpred19_InternalSmallJava
    public final void synpred19_InternalSmallJava_fragment() throws RecognitionException {   
        // InternalSmallJava.g:1728:3: ( rule__SJIfStatement__Group_5__0 )
        // InternalSmallJava.g:1728:3: rule__SJIfStatement__Group_5__0
        {
        pushFollow(FOLLOW_2);
        rule__SJIfStatement__Group_5__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalSmallJava

    // Delegated rules

    public final boolean synpred19_InternalSmallJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalSmallJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000001CA49810L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000001CA41812L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001C041810L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000001CA45810L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000001C0C1810L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});

}