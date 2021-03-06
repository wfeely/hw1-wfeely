
/* First created by JCasGen Mon Sep 09 21:14:30 EDT 2013 */
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

/** Ngram (space-separated string of n tokens) type.
 * Updated by JCasGen Wed Sep 11 19:14:02 EDT 2013
 * @generated */
public class Ngram_Type extends BaseAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Ngram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Ngram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Ngram(addr, Ngram_Type.this);
  			   Ngram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Ngram(addr, Ngram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Ngram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.cs.wfeely.hw1.Ngram");
 
  /** @generated */
  final Feature casFeat_begin;
  /** @generated */
  final int     casFeatCode_begin;
  /** @generated */ 
  public int getBegin(int addr) {
        if (featOkTst && casFeat_begin == null)
      jcas.throwFeatMissing("begin", "edu.cmu.cs.wfeely.hw1.Ngram");
    return ll_cas.ll_getIntValue(addr, casFeatCode_begin);
  }
  /** @generated */    
  public void setBegin(int addr, int v) {
        if (featOkTst && casFeat_begin == null)
      jcas.throwFeatMissing("begin", "edu.cmu.cs.wfeely.hw1.Ngram");
    ll_cas.ll_setIntValue(addr, casFeatCode_begin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_end;
  /** @generated */
  final int     casFeatCode_end;
  /** @generated */ 
  public int getEnd(int addr) {
        if (featOkTst && casFeat_end == null)
      jcas.throwFeatMissing("end", "edu.cmu.cs.wfeely.hw1.Ngram");
    return ll_cas.ll_getIntValue(addr, casFeatCode_end);
  }
  /** @generated */    
  public void setEnd(int addr, int v) {
        if (featOkTst && casFeat_end == null)
      jcas.throwFeatMissing("end", "edu.cmu.cs.wfeely.hw1.Ngram");
    ll_cas.ll_setIntValue(addr, casFeatCode_end, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ngram;
  /** @generated */
  final int     casFeatCode_ngram;
  /** @generated */ 
  public String getNgram(int addr) {
        if (featOkTst && casFeat_ngram == null)
      jcas.throwFeatMissing("ngram", "edu.cmu.cs.wfeely.hw1.Ngram");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ngram);
  }
  /** @generated */    
  public void setNgram(int addr, String v) {
        if (featOkTst && casFeat_ngram == null)
      jcas.throwFeatMissing("ngram", "edu.cmu.cs.wfeely.hw1.Ngram");
    ll_cas.ll_setStringValue(addr, casFeatCode_ngram, v);}
    
  
 
  /** @generated */
  final Feature casFeat_order;
  /** @generated */
  final int     casFeatCode_order;
  /** @generated */ 
  public int getOrder(int addr) {
        if (featOkTst && casFeat_order == null)
      jcas.throwFeatMissing("order", "edu.cmu.cs.wfeely.hw1.Ngram");
    return ll_cas.ll_getIntValue(addr, casFeatCode_order);
  }
  /** @generated */    
  public void setOrder(int addr, int v) {
        if (featOkTst && casFeat_order == null)
      jcas.throwFeatMissing("order", "edu.cmu.cs.wfeely.hw1.Ngram");
    ll_cas.ll_setIntValue(addr, casFeatCode_order, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Ngram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_begin = jcas.getRequiredFeatureDE(casType, "begin", "uima.cas.Integer", featOkTst);
    casFeatCode_begin  = (null == casFeat_begin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_begin).getCode();

 
    casFeat_end = jcas.getRequiredFeatureDE(casType, "end", "uima.cas.Integer", featOkTst);
    casFeatCode_end  = (null == casFeat_end) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_end).getCode();

 
    casFeat_ngram = jcas.getRequiredFeatureDE(casType, "ngram", "uima.cas.String", featOkTst);
    casFeatCode_ngram  = (null == casFeat_ngram) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ngram).getCode();

 
    casFeat_order = jcas.getRequiredFeatureDE(casType, "order", "uima.cas.Integer", featOkTst);
    casFeatCode_order  = (null == casFeat_order) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_order).getCode();

  }
}



    