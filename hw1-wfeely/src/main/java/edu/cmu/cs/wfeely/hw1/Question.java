

/* First created by JCasGen Mon Sep 09 20:58:54 EDT 2013 */
package edu.cmu.cs.wfeely.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



import org.apache.uima.jcas.cas.StringArray;


/** Question type.
 * Updated by JCasGen Mon Sep 09 21:14:30 EDT 2013
 * XML source: /home/hermes/git/hw1-wfeely/hw1-wfeely/src/main/resources/hw1-wfeely-typesystem.xml
 * @generated */
public class Question extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Question(JCas jcas, int begin, int end) {
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
  //* Feature: qstring

  /** getter for qstring - gets String for question text.
   * @generated */
  public String getQstring() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_qstring == null)
      jcasType.jcas.throwFeatMissing("qstring", "edu.cmu.cs.wfeely.hw1.Question");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Question_Type)jcasType).casFeatCode_qstring);}
    
  /** setter for qstring - sets String for question text. 
   * @generated */
  public void setQstring(String v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_qstring == null)
      jcasType.jcas.throwFeatMissing("qstring", "edu.cmu.cs.wfeely.hw1.Question");
    jcasType.ll_cas.ll_setStringValue(addr, ((Question_Type)jcasType).casFeatCode_qstring, v);}    
   
    
  //*--------------*
  //* Feature: tokens

  /** getter for tokens - gets Array of strings for tokens from question string.
   * @generated */
  public StringArray getTokens() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.cs.wfeely.hw1.Question");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets Array of strings for tokens from question string. 
   * @generated */
  public void setTokens(StringArray v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.cs.wfeely.hw1.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokens - gets an indexed value - Array of strings for tokens from question string.
   * @generated */
  public String getTokens(int i) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.cs.wfeely.hw1.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokens), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokens), i);}

  /** indexed setter for tokens - sets an indexed value - Array of strings for tokens from question string.
   * @generated */
  public void setTokens(int i, String v) { 
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.cs.wfeely.hw1.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokens), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokens), i, v);}
   
    
  //*--------------*
  //* Feature: qgrams

  /** getter for qgrams - gets Question ngrams.
   * @generated */
  public Ngram getQgrams() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_qgrams == null)
      jcasType.jcas.throwFeatMissing("qgrams", "edu.cmu.cs.wfeely.hw1.Question");
    return (Ngram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_qgrams)));}
    
  /** setter for qgrams - sets Question ngrams. 
   * @generated */
  public void setQgrams(Ngram v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_qgrams == null)
      jcasType.jcas.throwFeatMissing("qgrams", "edu.cmu.cs.wfeely.hw1.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_qgrams, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    