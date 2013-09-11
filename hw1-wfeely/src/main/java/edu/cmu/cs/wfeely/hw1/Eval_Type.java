
/* First created by JCasGen Wed Sep 11 19:14:03 EDT 2013 */
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

/** Evaluation type. For answer scoring, ranking, and calculation of precision for each question and its set of answers.
 * Updated by JCasGen Wed Sep 11 19:14:03 EDT 2013
 * @generated */
public class Eval_Type extends BaseAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Eval_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Eval_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Eval(addr, Eval_Type.this);
  			   Eval_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Eval(addr, Eval_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Eval.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.cs.wfeely.hw1.Eval");
 
  /** @generated */
  final Feature casFeat_question;
  /** @generated */
  final int     casFeatCode_question;
  /** @generated */ 
  public int getQuestion(int addr) {
        if (featOkTst && casFeat_question == null)
      jcas.throwFeatMissing("question", "edu.cmu.cs.wfeely.hw1.Eval");
    return ll_cas.ll_getRefValue(addr, casFeatCode_question);
  }
  /** @generated */    
  public void setQuestion(int addr, int v) {
        if (featOkTst && casFeat_question == null)
      jcas.throwFeatMissing("question", "edu.cmu.cs.wfeely.hw1.Eval");
    ll_cas.ll_setRefValue(addr, casFeatCode_question, v);}
    
  
 
  /** @generated */
  final Feature casFeat_answer;
  /** @generated */
  final int     casFeatCode_answer;
  /** @generated */ 
  public int getAnswer(int addr) {
        if (featOkTst && casFeat_answer == null)
      jcas.throwFeatMissing("answer", "edu.cmu.cs.wfeely.hw1.Eval");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answer);
  }
  /** @generated */    
  public void setAnswer(int addr, int v) {
        if (featOkTst && casFeat_answer == null)
      jcas.throwFeatMissing("answer", "edu.cmu.cs.wfeely.hw1.Eval");
    ll_cas.ll_setRefValue(addr, casFeatCode_answer, v);}
    
   /** @generated */
  public int getAnswer(int addr, int i) {
        if (featOkTst && casFeat_answer == null)
      jcas.throwFeatMissing("answer", "edu.cmu.cs.wfeely.hw1.Eval");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answer), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answer), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answer), i);
  }
   
  /** @generated */ 
  public void setAnswer(int addr, int i, int v) {
        if (featOkTst && casFeat_answer == null)
      jcas.throwFeatMissing("answer", "edu.cmu.cs.wfeely.hw1.Eval");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answer), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answer), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answer), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_performance;
  /** @generated */
  final int     casFeatCode_performance;
  /** @generated */ 
  public int getPerformance(int addr) {
        if (featOkTst && casFeat_performance == null)
      jcas.throwFeatMissing("performance", "edu.cmu.cs.wfeely.hw1.Eval");
    return ll_cas.ll_getRefValue(addr, casFeatCode_performance);
  }
  /** @generated */    
  public void setPerformance(int addr, int v) {
        if (featOkTst && casFeat_performance == null)
      jcas.throwFeatMissing("performance", "edu.cmu.cs.wfeely.hw1.Eval");
    ll_cas.ll_setRefValue(addr, casFeatCode_performance, v);}
    
   /** @generated */
  public double getPerformance(int addr, int i) {
        if (featOkTst && casFeat_performance == null)
      jcas.throwFeatMissing("performance", "edu.cmu.cs.wfeely.hw1.Eval");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_performance), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_performance), i);
	return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_performance), i);
  }
   
  /** @generated */ 
  public void setPerformance(int addr, int i, double v) {
        if (featOkTst && casFeat_performance == null)
      jcas.throwFeatMissing("performance", "edu.cmu.cs.wfeely.hw1.Eval");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_performance), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_performance), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_performance), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_p;
  /** @generated */
  final int     casFeatCode_p;
  /** @generated */ 
  public double getP(int addr) {
        if (featOkTst && casFeat_p == null)
      jcas.throwFeatMissing("p", "edu.cmu.cs.wfeely.hw1.Eval");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_p);
  }
  /** @generated */    
  public void setP(int addr, double v) {
        if (featOkTst && casFeat_p == null)
      jcas.throwFeatMissing("p", "edu.cmu.cs.wfeely.hw1.Eval");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_p, v);}
    
  
 
  /** @generated */
  final Feature casFeat_n;
  /** @generated */
  final int     casFeatCode_n;
  /** @generated */ 
  public int getN(int addr) {
        if (featOkTst && casFeat_n == null)
      jcas.throwFeatMissing("n", "edu.cmu.cs.wfeely.hw1.Eval");
    return ll_cas.ll_getIntValue(addr, casFeatCode_n);
  }
  /** @generated */    
  public void setN(int addr, int v) {
        if (featOkTst && casFeat_n == null)
      jcas.throwFeatMissing("n", "edu.cmu.cs.wfeely.hw1.Eval");
    ll_cas.ll_setIntValue(addr, casFeatCode_n, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Eval_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_question = jcas.getRequiredFeatureDE(casType, "question", "edu.cmu.cs.wfeely.hw1.Question", featOkTst);
    casFeatCode_question  = (null == casFeat_question) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_question).getCode();

 
    casFeat_answer = jcas.getRequiredFeatureDE(casType, "answer", "uima.cas.FSArray", featOkTst);
    casFeatCode_answer  = (null == casFeat_answer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answer).getCode();

 
    casFeat_performance = jcas.getRequiredFeatureDE(casType, "performance", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_performance  = (null == casFeat_performance) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_performance).getCode();

 
    casFeat_p = jcas.getRequiredFeatureDE(casType, "p", "uima.cas.Double", featOkTst);
    casFeatCode_p  = (null == casFeat_p) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_p).getCode();

 
    casFeat_n = jcas.getRequiredFeatureDE(casType, "n", "uima.cas.Integer", featOkTst);
    casFeatCode_n  = (null == casFeat_n) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_n).getCode();

  }
}



    