

/* First created by JCasGen Mon Sep 09 20:58:54 EDT 2013 */
package edu.cmu.cs.wfeely.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



import org.apache.uima.jcas.cas.StringArray;


/** Answer Type.
 * Updated by JCasGen Mon Sep 09 21:14:30 EDT 2013
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
  //* Feature: astring

  /** getter for astring - gets String for answer text.
   * @generated */
  public String getAstring() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_astring == null)
      jcasType.jcas.throwFeatMissing("astring", "edu.cmu.cs.wfeely.hw1.Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_astring);}
    
  /** setter for astring - sets String for answer text. 
   * @generated */
  public void setAstring(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_astring == null)
      jcasType.jcas.throwFeatMissing("astring", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_astring, v);}    
   
    
  //*--------------*
  //* Feature: tokens

  /** getter for tokens - gets Array of strings for tokens from answer string.
   * @generated */
  public StringArray getTokens() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.cs.wfeely.hw1.Answer");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets Array of strings for tokens from answer string. 
   * @generated */
  public void setTokens(StringArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokens - gets an indexed value - Array of strings for tokens from answer string.
   * @generated */
  public String getTokens(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokens), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokens), i);}

  /** indexed setter for tokens - sets an indexed value - Array of strings for tokens from answer string.
   * @generated */
  public void setTokens(int i, String v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokens), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokens), i, v);}
   
    
  //*--------------*
  //* Feature: gold

  /** getter for gold - gets Boolean gold standard (0 for not-an-answer, 1 for good-answer).
   * @generated */
  public boolean getGold() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_gold == null)
      jcasType.jcas.throwFeatMissing("gold", "edu.cmu.cs.wfeely.hw1.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_gold);}
    
  /** setter for gold - sets Boolean gold standard (0 for not-an-answer, 1 for good-answer). 
   * @generated */
  public void setGold(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_gold == null)
      jcasType.jcas.throwFeatMissing("gold", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_gold, v);}    
   
    
  //*--------------*
  //* Feature: guess

  /** getter for guess - gets Boolean guess (0 for not-an-answer, 1 for good-answer).
   * @generated */
  public boolean getGuess() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_guess == null)
      jcasType.jcas.throwFeatMissing("guess", "edu.cmu.cs.wfeely.hw1.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_guess);}
    
  /** setter for guess - sets Boolean guess (0 for not-an-answer, 1 for good-answer). 
   * @generated */
  public void setGuess(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_guess == null)
      jcasType.jcas.throwFeatMissing("guess", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_guess, v);}    
   
    
  //*--------------*
  //* Feature: agrams

  /** getter for agrams - gets Answer ngrams.
   * @generated */
  public Ngram getAgrams() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_agrams == null)
      jcasType.jcas.throwFeatMissing("agrams", "edu.cmu.cs.wfeely.hw1.Answer");
    return (Ngram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_agrams)));}
    
  /** setter for agrams - sets Answer ngrams. 
   * @generated */
  public void setAgrams(Ngram v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_agrams == null)
      jcasType.jcas.throwFeatMissing("agrams", "edu.cmu.cs.wfeely.hw1.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_agrams, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    