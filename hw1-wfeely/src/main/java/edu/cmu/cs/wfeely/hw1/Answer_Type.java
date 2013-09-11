
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
 * Updated by JCasGen Wed Sep 11 19:14:02 EDT 2013
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
  public int getTokens(int addr, int i) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.cs.wfeely.hw1.Answer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i);
  }
   
  /** @generated */ 
  public void setTokens(int addr, int i, int v) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.cs.wfeely.hw1.Answer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokens), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_unigrams;
  /** @generated */
  final int     casFeatCode_unigrams;
  /** @generated */ 
  public int getUnigrams(int addr) {
        if (featOkTst && casFeat_unigrams == null)
      jcas.throwFeatMissing("unigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_unigrams);
  }
  /** @generated */    
  public void setUnigrams(int addr, int v) {
        if (featOkTst && casFeat_unigrams == null)
      jcas.throwFeatMissing("unigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_unigrams, v);}
    
   /** @generated */
  public int getUnigrams(int addr, int i) {
        if (featOkTst && casFeat_unigrams == null)
      jcas.throwFeatMissing("unigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_unigrams), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_unigrams), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_unigrams), i);
  }
   
  /** @generated */ 
  public void setUnigrams(int addr, int i, int v) {
        if (featOkTst && casFeat_unigrams == null)
      jcas.throwFeatMissing("unigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_unigrams), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_unigrams), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_unigrams), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_bigrams;
  /** @generated */
  final int     casFeatCode_bigrams;
  /** @generated */ 
  public int getBigrams(int addr) {
        if (featOkTst && casFeat_bigrams == null)
      jcas.throwFeatMissing("bigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_bigrams);
  }
  /** @generated */    
  public void setBigrams(int addr, int v) {
        if (featOkTst && casFeat_bigrams == null)
      jcas.throwFeatMissing("bigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_bigrams, v);}
    
   /** @generated */
  public int getBigrams(int addr, int i) {
        if (featOkTst && casFeat_bigrams == null)
      jcas.throwFeatMissing("bigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_bigrams), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_bigrams), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_bigrams), i);
  }
   
  /** @generated */ 
  public void setBigrams(int addr, int i, int v) {
        if (featOkTst && casFeat_bigrams == null)
      jcas.throwFeatMissing("bigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_bigrams), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_bigrams), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_bigrams), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_trigrams;
  /** @generated */
  final int     casFeatCode_trigrams;
  /** @generated */ 
  public int getTrigrams(int addr) {
        if (featOkTst && casFeat_trigrams == null)
      jcas.throwFeatMissing("trigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_trigrams);
  }
  /** @generated */    
  public void setTrigrams(int addr, int v) {
        if (featOkTst && casFeat_trigrams == null)
      jcas.throwFeatMissing("trigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_trigrams, v);}
    
   /** @generated */
  public int getTrigrams(int addr, int i) {
        if (featOkTst && casFeat_trigrams == null)
      jcas.throwFeatMissing("trigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_trigrams), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_trigrams), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_trigrams), i);
  }
   
  /** @generated */ 
  public void setTrigrams(int addr, int i, int v) {
        if (featOkTst && casFeat_trigrams == null)
      jcas.throwFeatMissing("trigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_trigrams), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_trigrams), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_trigrams), i, v);
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
    
  
 
  /** @generated */
  final Feature casFeat_begin;
  /** @generated */
  final int     casFeatCode_begin;
  /** @generated */ 
  public int getBegin(int addr) {
        if (featOkTst && casFeat_begin == null)
      jcas.throwFeatMissing("begin", "edu.cmu.cs.wfeely.hw1.Answer");
    return ll_cas.ll_getIntValue(addr, casFeatCode_begin);
  }
  /** @generated */    
  public void setBegin(int addr, int v) {
        if (featOkTst && casFeat_begin == null)
      jcas.throwFeatMissing("begin", "edu.cmu.cs.wfeely.hw1.Answer");
    ll_cas.ll_setIntValue(addr, casFeatCode_begin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_end;
  /** @generated */
  final int     casFeatCode_end;
  /** @generated */ 
  public int getEnd(int addr) {
        if (featOkTst && casFeat_end == null)
      jcas.throwFeatMissing("end", "edu.cmu.cs.wfeely.hw1.Answer");
    return ll_cas.ll_getIntValue(addr, casFeatCode_end);
  }
  /** @generated */    
  public void setEnd(int addr, int v) {
        if (featOkTst && casFeat_end == null)
      jcas.throwFeatMissing("end", "edu.cmu.cs.wfeely.hw1.Answer");
    ll_cas.ll_setIntValue(addr, casFeatCode_end, v);}
    
  
 
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_gold = jcas.getRequiredFeatureDE(casType, "gold", "uima.cas.Boolean", featOkTst);
    casFeatCode_gold  = (null == casFeat_gold) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gold).getCode();

 
    casFeat_guess = jcas.getRequiredFeatureDE(casType, "guess", "uima.cas.Boolean", featOkTst);
    casFeatCode_guess  = (null == casFeat_guess) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_guess).getCode();

 
    casFeat_begin = jcas.getRequiredFeatureDE(casType, "begin", "uima.cas.Integer", featOkTst);
    casFeatCode_begin  = (null == casFeat_begin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_begin).getCode();

 
    casFeat_end = jcas.getRequiredFeatureDE(casType, "end", "uima.cas.Integer", featOkTst);
    casFeatCode_end  = (null == casFeat_end) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_end).getCode();

 
    casFeat_tokens = jcas.getRequiredFeatureDE(casType, "tokens", "uima.cas.FSArray", featOkTst);
    casFeatCode_tokens  = (null == casFeat_tokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokens).getCode();

 
    casFeat_unigrams = jcas.getRequiredFeatureDE(casType, "unigrams", "uima.cas.FSArray", featOkTst);
    casFeatCode_unigrams  = (null == casFeat_unigrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_unigrams).getCode();

 
    casFeat_bigrams = jcas.getRequiredFeatureDE(casType, "bigrams", "uima.cas.FSArray", featOkTst);
    casFeatCode_bigrams  = (null == casFeat_bigrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_bigrams).getCode();

 
    casFeat_trigrams = jcas.getRequiredFeatureDE(casType, "trigrams", "uima.cas.FSArray", featOkTst);
    casFeatCode_trigrams  = (null == casFeat_trigrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_trigrams).getCode();

  }
}



    