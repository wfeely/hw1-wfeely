

/* First created by JCasGen Mon Sep 09 21:14:30 EDT 2013 */
package edu.cmu.cs.wfeely.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;


/** Ngram (space-separated string of n tokens) type.
 * Updated by JCasGen Wed Sep 11 19:14:02 EDT 2013
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
  //* Feature: begin

  /** getter for begin - gets Beginning character offset for ngram.
   * @generated */
  public int getBegin() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "edu.cmu.cs.wfeely.hw1.Ngram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_begin);}
    
  /** setter for begin - sets Beginning character offset for ngram. 
   * @generated */
  public void setBegin(int v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "edu.cmu.cs.wfeely.hw1.Ngram");
    jcasType.ll_cas.ll_setIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_begin, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets Ending character offset for ngram.
   * @generated */
  public int getEnd() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "edu.cmu.cs.wfeely.hw1.Ngram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets Ending character offset for ngram. 
   * @generated */
  public void setEnd(int v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "edu.cmu.cs.wfeely.hw1.Ngram");
    jcasType.ll_cas.ll_setIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_end, v);}    
   
    
  //*--------------*
  //* Feature: ngram

  /** getter for ngram - gets Ngram string.
   * @generated */
  public String getNgram() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_ngram == null)
      jcasType.jcas.throwFeatMissing("ngram", "edu.cmu.cs.wfeely.hw1.Ngram");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Ngram_Type)jcasType).casFeatCode_ngram);}
    
  /** setter for ngram - sets Ngram string. 
   * @generated */
  public void setNgram(String v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_ngram == null)
      jcasType.jcas.throwFeatMissing("ngram", "edu.cmu.cs.wfeely.hw1.Ngram");
    jcasType.ll_cas.ll_setStringValue(addr, ((Ngram_Type)jcasType).casFeatCode_ngram, v);}    
   
    
  //*--------------*
  //* Feature: order

  /** getter for order - gets Ngram order [1..3].
   * @generated */
  public int getOrder() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_order == null)
      jcasType.jcas.throwFeatMissing("order", "edu.cmu.cs.wfeely.hw1.Ngram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_order);}
    
  /** setter for order - sets Ngram order [1..3]. 
   * @generated */
  public void setOrder(int v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_order == null)
      jcasType.jcas.throwFeatMissing("order", "edu.cmu.cs.wfeely.hw1.Ngram");
    jcasType.ll_cas.ll_setIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_order, v);}    
  }

    