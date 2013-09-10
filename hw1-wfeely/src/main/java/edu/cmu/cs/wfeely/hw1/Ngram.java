

/* First created by JCasGen Mon Sep 09 21:14:30 EDT 2013 */
package edu.cmu.cs.wfeely.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;


/** Ngram type for ngrams.
 * Updated by JCasGen Mon Sep 09 21:14:30 EDT 2013
 * XML source: /home/hermes/git/hw1-wfeely/hw1-wfeely/src/main/resources/hw1-wfeely-typesystem.xml
 * @generated */
public class Ngram extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Ngram.class);
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
  protected Ngram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Ngram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Ngram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Ngram(JCas jcas, int begin, int end) {
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
  //* Feature: unigrams

  /** getter for unigrams - gets Array of unigram strings (single token words).
   * @generated */
  public StringArray getUnigrams() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_unigrams == null)
      jcasType.jcas.throwFeatMissing("unigrams", "edu.cmu.cs.wfeely.hw1.Ngram");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_unigrams)));}
    
  /** setter for unigrams - sets Array of unigram strings (single token words). 
   * @generated */
  public void setUnigrams(StringArray v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_unigrams == null)
      jcasType.jcas.throwFeatMissing("unigrams", "edu.cmu.cs.wfeely.hw1.Ngram");
    jcasType.ll_cas.ll_setRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_unigrams, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for unigrams - gets an indexed value - Array of unigram strings (single token words).
   * @generated */
  public String getUnigrams(int i) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_unigrams == null)
      jcasType.jcas.throwFeatMissing("unigrams", "edu.cmu.cs.wfeely.hw1.Ngram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_unigrams), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_unigrams), i);}

  /** indexed setter for unigrams - sets an indexed value - Array of unigram strings (single token words).
   * @generated */
  public void setUnigrams(int i, String v) { 
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_unigrams == null)
      jcasType.jcas.throwFeatMissing("unigrams", "edu.cmu.cs.wfeely.hw1.Ngram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_unigrams), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_unigrams), i, v);}
   
    
  //*--------------*
  //* Feature: bigrams

  /** getter for bigrams - gets Array of bigram strings (2-token pairs).
   * @generated */
  public StringArray getBigrams() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_bigrams == null)
      jcasType.jcas.throwFeatMissing("bigrams", "edu.cmu.cs.wfeely.hw1.Ngram");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_bigrams)));}
    
  /** setter for bigrams - sets Array of bigram strings (2-token pairs). 
   * @generated */
  public void setBigrams(StringArray v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_bigrams == null)
      jcasType.jcas.throwFeatMissing("bigrams", "edu.cmu.cs.wfeely.hw1.Ngram");
    jcasType.ll_cas.ll_setRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_bigrams, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for bigrams - gets an indexed value - Array of bigram strings (2-token pairs).
   * @generated */
  public String getBigrams(int i) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_bigrams == null)
      jcasType.jcas.throwFeatMissing("bigrams", "edu.cmu.cs.wfeely.hw1.Ngram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_bigrams), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_bigrams), i);}

  /** indexed setter for bigrams - sets an indexed value - Array of bigram strings (2-token pairs).
   * @generated */
  public void setBigrams(int i, String v) { 
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_bigrams == null)
      jcasType.jcas.throwFeatMissing("bigrams", "edu.cmu.cs.wfeely.hw1.Ngram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_bigrams), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_bigrams), i, v);}
   
    
  //*--------------*
  //* Feature: trigrams

  /** getter for trigrams - gets Array of trigram strings (3-token triples).
   * @generated */
  public StringArray getTrigrams() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_trigrams == null)
      jcasType.jcas.throwFeatMissing("trigrams", "edu.cmu.cs.wfeely.hw1.Ngram");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_trigrams)));}
    
  /** setter for trigrams - sets Array of trigram strings (3-token triples). 
   * @generated */
  public void setTrigrams(StringArray v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_trigrams == null)
      jcasType.jcas.throwFeatMissing("trigrams", "edu.cmu.cs.wfeely.hw1.Ngram");
    jcasType.ll_cas.ll_setRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_trigrams, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for trigrams - gets an indexed value - Array of trigram strings (3-token triples).
   * @generated */
  public String getTrigrams(int i) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_trigrams == null)
      jcasType.jcas.throwFeatMissing("trigrams", "edu.cmu.cs.wfeely.hw1.Ngram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_trigrams), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_trigrams), i);}

  /** indexed setter for trigrams - sets an indexed value - Array of trigram strings (3-token triples).
   * @generated */
  public void setTrigrams(int i, String v) { 
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_trigrams == null)
      jcasType.jcas.throwFeatMissing("trigrams", "edu.cmu.cs.wfeely.hw1.Ngram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_trigrams), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_trigrams), i, v);}
  }

    