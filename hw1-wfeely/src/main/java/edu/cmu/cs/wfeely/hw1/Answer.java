

/* First created by JCasGen Mon Sep 09 20:58:54 EDT 2013 */
package edu.cmu.cs.wfeely.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



import org.apache.uima.jcas.cas.FSArray;


import org.apache.uima.jcas.cas.StringArray;


/** Answer Type.
 * Updated by JCasGen Wed Sep 11 19:14:02 EDT 2013
 * XML source: /home/hermes/git/hw1-wfeely/hw1-wfeely/src/main/resources/hw1-wfeely-typesystem.xml
 * @generated */
public class Answer extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answer(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: tokens

  /** getter for tokens - gets Token array for tokens from answer string.
   * @generated */
  public FSArray getTokens() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.cs.wfeely.hw1.Answer");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets Token array for tokens from answer string. 
   * @generated */
  public void setTokens(FSArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokens - gets an indexed value - Array of strings for tokens from answer string.
   * @generated */
  public Token getTokens(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokens), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokens), i)));}

  /** indexed setter for tokens - sets an indexed value - Token array for tokens from answer string.
   * @generated */
  public void setTokens(int i, Token v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokens), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokens), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: unigrams

  /** getter for unigrams - gets Ngram array for unigrams (1-order ngrams) from answer string.
   * @generated */
  public FSArray getUnigrams() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_unigrams == null)
      jcasType.jcas.throwFeatMissing("unigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_unigrams)));}
    
  /** setter for unigrams - sets Ngram array for unigrams (1-order ngrams) from answer string. 
   * @generated */
  public void setUnigrams(FSArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_unigrams == null)
      jcasType.jcas.throwFeatMissing("unigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_unigrams, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for unigrams - gets an indexed value - Ngram array for unigrams (1-order ngrams) from answer string.
   * @generated */
  public Ngram getUnigrams(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_unigrams == null)
      jcasType.jcas.throwFeatMissing("unigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_unigrams), i);
    return (Ngram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_unigrams), i)));}

  /** indexed setter for unigrams - sets an indexed value - Ngram array for unigrams (1-order ngrams) from answer string.
   * @generated */
  public void setUnigrams(int i, Ngram v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_unigrams == null)
      jcasType.jcas.throwFeatMissing("unigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_unigrams), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_unigrams), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: bigrams

  /** getter for bigrams - gets Ngram array for bigrams (2-order ngrams) from answer string.
   * @generated */
  public FSArray getBigrams() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_bigrams == null)
      jcasType.jcas.throwFeatMissing("bigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_bigrams)));}
    
  /** setter for bigrams - sets Ngram array for bigrams (2-order ngrams) from answer string. 
   * @generated */
  public void setBigrams(FSArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_bigrams == null)
      jcasType.jcas.throwFeatMissing("bigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_bigrams, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for bigrams - gets an indexed value - Ngram array for bigrams (2-order ngrams) from answer string.
   * @generated */
  public Ngram getBigrams(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_bigrams == null)
      jcasType.jcas.throwFeatMissing("bigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_bigrams), i);
    return (Ngram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_bigrams), i)));}

  /** indexed setter for bigrams - sets an indexed value - Ngram array for bigrams (2-order ngrams) from answer string.
   * @generated */
  public void setBigrams(int i, Ngram v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_bigrams == null)
      jcasType.jcas.throwFeatMissing("bigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_bigrams), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_bigrams), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: trigrams

  /** getter for trigrams - gets Ngram array for trigrams (3-order ngrams) from answer string.
   * @generated */
  public FSArray getTrigrams() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_trigrams == null)
      jcasType.jcas.throwFeatMissing("trigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_trigrams)));}
    
  /** setter for trigrams - sets Ngram array for trigrams (3-order ngrams) from answer string. 
   * @generated */
  public void setTrigrams(FSArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_trigrams == null)
      jcasType.jcas.throwFeatMissing("trigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_trigrams, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for trigrams - gets an indexed value - Ngram array for trigrams (3-order ngrams) from answer string.
   * @generated */
  public Ngram getTrigrams(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_trigrams == null)
      jcasType.jcas.throwFeatMissing("trigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_trigrams), i);
    return (Ngram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_trigrams), i)));}

  /** indexed setter for trigrams - sets an indexed value - Ngram array for trigrams (3-order ngrams) from answer string.
   * @generated */
  public void setTrigrams(int i, Ngram v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_trigrams == null)
      jcasType.jcas.throwFeatMissing("trigrams", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_trigrams), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_trigrams), i, jcasType.ll_cas.ll_getFSRef(v));}
    //*--------------*
  //* Feature: gold

  /** getter for gold - gets Boolean gold standard [0,1].  0 means "not an answer", 1 means "good answer."
   * @generated */
  public boolean getGold() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_gold == null)
      jcasType.jcas.throwFeatMissing("gold", "edu.cmu.cs.wfeely.hw1.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_gold);}
    
  /** setter for gold - sets Boolean gold standard [0,1].  0 means "not an answer", 1 means "good answer." 
   * @generated */
  public void setGold(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_gold == null)
      jcasType.jcas.throwFeatMissing("gold", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_gold, v);}    
   
    
  //*--------------*
  //* Feature: guess

  /** getter for guess - gets Boolean guess [0,1]. 0 means "not an answer", 1 means "good answer."
   * @generated */
  public boolean getGuess() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_guess == null)
      jcasType.jcas.throwFeatMissing("guess", "edu.cmu.cs.wfeely.hw1.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_guess);}
    
  /** setter for guess - sets Boolean guess [0,1]. 0 means "not an answer", 1 means "good answer." 
   * @generated */
  public void setGuess(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_guess == null)
      jcasType.jcas.throwFeatMissing("guess", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_guess, v);}    
   
    
  //*--------------*
  //* Feature: begin

  /** getter for begin - gets Beginning character offset for answer string.
   * @generated */
  public int getBegin() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "edu.cmu.cs.wfeely.hw1.Answer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Answer_Type)jcasType).casFeatCode_begin);}
    
  /** setter for begin - sets Beginning character offset for answer string. 
   * @generated */
  public void setBegin(int v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.ll_cas.ll_setIntValue(addr, ((Answer_Type)jcasType).casFeatCode_begin, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets Ending character offset for answer string.
   * @generated */
  public int getEnd() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "edu.cmu.cs.wfeely.hw1.Answer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Answer_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets Ending character offset for answer string. 
   * @generated */
  public void setEnd(int v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.ll_cas.ll_setIntValue(addr, ((Answer_Type)jcasType).casFeatCode_end, v);}    
   
    
}

    