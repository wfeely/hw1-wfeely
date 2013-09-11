

/* First created by JCasGen Wed Sep 11 19:14:03 EDT 2013 */
package edu.cmu.cs.wfeely.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.DoubleArray;


/** Evaluation type. For answer scoring, ranking, and calculation of precision for each question and its set of answers.
 * Updated by JCasGen Wed Sep 11 19:14:03 EDT 2013
 * XML source: /home/hermes/git/hw1-wfeely/hw1-wfeely/src/main/resources/hw1-wfeely-typesystem.xml
 * @generated */
public class Eval extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Eval.class);
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
  protected Eval() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Eval(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Eval(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Eval(JCas jcas, int begin, int end) {
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
  //* Feature: question

  /** getter for question - gets Question object.
   * @generated */
  public Question getQuestion() {
    if (Eval_Type.featOkTst && ((Eval_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "edu.cmu.cs.wfeely.hw1.Eval");
    return (Question)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Eval_Type)jcasType).casFeatCode_question)));}
    
  /** setter for question - sets Question object. 
   * @generated */
  public void setQuestion(Question v) {
    if (Eval_Type.featOkTst && ((Eval_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "edu.cmu.cs.wfeely.hw1.Eval");
    jcasType.ll_cas.ll_setRefValue(addr, ((Eval_Type)jcasType).casFeatCode_question, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: answer

  /** getter for answer - gets Answer object array.
   * @generated */
  public FSArray getAnswer() {
    if (Eval_Type.featOkTst && ((Eval_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "edu.cmu.cs.wfeely.hw1.Eval");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Eval_Type)jcasType).casFeatCode_answer)));}
    
  /** setter for answer - sets Answer object array. 
   * @generated */
  public void setAnswer(FSArray v) {
    if (Eval_Type.featOkTst && ((Eval_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "edu.cmu.cs.wfeely.hw1.Eval");
    jcasType.ll_cas.ll_setRefValue(addr, ((Eval_Type)jcasType).casFeatCode_answer, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for answer - gets an indexed value - Answer object array.
   * @generated */
  public Answer getAnswer(int i) {
    if (Eval_Type.featOkTst && ((Eval_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "edu.cmu.cs.wfeely.hw1.Eval");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Eval_Type)jcasType).casFeatCode_answer), i);
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Eval_Type)jcasType).casFeatCode_answer), i)));}

  /** indexed setter for answer - sets an indexed value - Answer object array.
   * @generated */
  public void setAnswer(int i, Answer v) { 
    if (Eval_Type.featOkTst && ((Eval_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "edu.cmu.cs.wfeely.hw1.Eval");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Eval_Type)jcasType).casFeatCode_answer), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Eval_Type)jcasType).casFeatCode_answer), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: performance

  /** getter for performance - gets Double array for score of each answer [0..1].
   * @generated */
  public DoubleArray getPerformance() {
    if (Eval_Type.featOkTst && ((Eval_Type)jcasType).casFeat_performance == null)
      jcasType.jcas.throwFeatMissing("performance", "edu.cmu.cs.wfeely.hw1.Eval");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Eval_Type)jcasType).casFeatCode_performance)));}
    
  /** setter for performance - sets Double array for score of each answer [0..1]. 
   * @generated */
  public void setPerformance(DoubleArray v) {
    if (Eval_Type.featOkTst && ((Eval_Type)jcasType).casFeat_performance == null)
      jcasType.jcas.throwFeatMissing("performance", "edu.cmu.cs.wfeely.hw1.Eval");
    jcasType.ll_cas.ll_setRefValue(addr, ((Eval_Type)jcasType).casFeatCode_performance, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for performance - gets an indexed value - Double array for score of each answer [0..1].
   * @generated */
  public double getPerformance(int i) {
    if (Eval_Type.featOkTst && ((Eval_Type)jcasType).casFeat_performance == null)
      jcasType.jcas.throwFeatMissing("performance", "edu.cmu.cs.wfeely.hw1.Eval");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Eval_Type)jcasType).casFeatCode_performance), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Eval_Type)jcasType).casFeatCode_performance), i);}

  /** indexed setter for performance - sets an indexed value - Double array for score of each answer [0..1].
   * @generated */
  public void setPerformance(int i, double v) { 
    if (Eval_Type.featOkTst && ((Eval_Type)jcasType).casFeat_performance == null)
      jcasType.jcas.throwFeatMissing("performance", "edu.cmu.cs.wfeely.hw1.Eval");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Eval_Type)jcasType).casFeatCode_performance), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Eval_Type)jcasType).casFeatCode_performance), i, v);}
   
    
  //*--------------*
  //* Feature: p

  /** getter for p - gets Double p; precision of system (normalized by n).
   * @generated */
  public double getP() {
    if (Eval_Type.featOkTst && ((Eval_Type)jcasType).casFeat_p == null)
      jcasType.jcas.throwFeatMissing("p", "edu.cmu.cs.wfeely.hw1.Eval");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Eval_Type)jcasType).casFeatCode_p);}
    
  /** setter for p - sets Double p; precision of system (normalized by n). 
   * @generated */
  public void setP(double v) {
    if (Eval_Type.featOkTst && ((Eval_Type)jcasType).casFeat_p == null)
      jcasType.jcas.throwFeatMissing("p", "edu.cmu.cs.wfeely.hw1.Eval");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Eval_Type)jcasType).casFeatCode_p, v);}    
   
    
  //*--------------*
  //* Feature: n

  /** getter for n - gets Integer n; number of correct answers.
   * @generated */
  public int getN() {
    if (Eval_Type.featOkTst && ((Eval_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "edu.cmu.cs.wfeely.hw1.Eval");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Eval_Type)jcasType).casFeatCode_n);}
    
  /** setter for n - sets Integer n; number of correct answers. 
   * @generated */
  public void setN(int v) {
    if (Eval_Type.featOkTst && ((Eval_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "edu.cmu.cs.wfeely.hw1.Eval");
    jcasType.ll_cas.ll_setIntValue(addr, ((Eval_Type)jcasType).casFeatCode_n, v);}    
  }

    