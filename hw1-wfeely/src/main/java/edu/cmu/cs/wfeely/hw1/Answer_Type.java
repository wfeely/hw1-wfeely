
/* First created by JCasGen Mon Sep 09 20:58:54 EDT 2013 */
package edu.cmu.cs.wfeely.hw1;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Answer Type.
 * Updated by JCasGen Mon Sep 09 21:09:54 EDT 2013
 * @generated */
public class Answer_Type extends BaseAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.cs.wfeely.hw1.Answer");



  /** @generated */
  final Feature casFeat_astring;
  /** @generated */
  final int     casFeatCode_astring;
  /** @generated */ 
  public String getAstring(int addr) {
        if (featOkTst && casFeat_astring == null)
      jcas.throwFeatMissing("astring", "edu.cmu.cs.wfeely.hw1.Answer");
    return ll_cas.ll_getStringValue(addr, casFeatCode_astring);
  }
  /** @generated */    
  public void setAstring(int addr, String v) {
        if (featOkTst && casFeat_astring == null)
      jcas.throwFeatMissing("astring", "edu.cmu.cs.wfeely.hw1.Answer");
    ll_cas.ll_setStringValue(addr, casFeatCode_astring, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tokens;
  /** @generated */
  final int     casFeatCode_tokens;
  /** @generated */ 
  public int getTokens(int addr) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.cs.wfeely.hw1.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokens);
  }
  /** @generated */    
  public void setTokens(int addr, int v) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.cs.wfeely.hw1.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokens, v);}
    
   /** @generated */
  public String getTokens(int addr, int i) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.cs.wfeely.hw1.Answer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i);
  }
   
  /** @generated */ 
  public void setTokens(int addr, int i, String v) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.cs.wfeely.hw1.Answer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_gold;
  /** @generated */
  final int     casFeatCode_gold;
  /** @generated */ 
  public boolean getGold(int addr) {
        if (featOkTst && casFeat_gold == null)
      jcas.throwFeatMissing("gold", "edu.cmu.cs.wfeely.hw1.Answer");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_gold);
  }
  /** @generated */    
  public void setGold(int addr, boolean v) {
        if (featOkTst && casFeat_gold == null)
      jcas.throwFeatMissing("gold", "edu.cmu.cs.wfeely.hw1.Answer");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_gold, v);}
    
  
 
  /** @generated */
  final Feature casFeat_guess;
  /** @generated */
  final int     casFeatCode_guess;
  /** @generated */ 
  public boolean getGuess(int addr) {
        if (featOkTst && casFeat_guess == null)
      jcas.throwFeatMissing("guess", "edu.cmu.cs.wfeely.hw1.Answer");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_guess);
  }
  /** @generated */    
  public void setGuess(int addr, boolean v) {
        if (featOkTst && casFeat_guess == null)
      jcas.throwFeatMissing("guess", "edu.cmu.cs.wfeely.hw1.Answer");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_guess, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_astring = jcas.getRequiredFeatureDE(casType, "astring", "uima.cas.String", featOkTst);
    casFeatCode_astring  = (null == casFeat_astring) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_astring).getCode();

 
    casFeat_tokens = jcas.getRequiredFeatureDE(casType, "tokens", "uima.cas.StringArray", featOkTst);
    casFeatCode_tokens  = (null == casFeat_tokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokens).getCode();

 
    casFeat_gold = jcas.getRequiredFeatureDE(casType, "gold", "uima.cas.Boolean", featOkTst);
    casFeatCode_gold  = (null == casFeat_gold) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gold).getCode();

 
    casFeat_guess = jcas.getRequiredFeatureDE(casType, "guess", "uima.cas.Boolean", featOkTst);
    casFeatCode_guess  = (null == casFeat_guess) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_guess).getCode();

  }
}



    