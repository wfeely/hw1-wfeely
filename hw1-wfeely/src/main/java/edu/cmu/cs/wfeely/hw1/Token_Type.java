
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

/** Token type.
 * Updated by JCasGen Wed Sep 11 19:14:03 EDT 2013
 * @generated */
public class Token_Type extends BaseAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Token_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Token_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Token(addr, Token_Type.this);
  			   Token_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Token(addr, Token_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Token.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.cs.wfeely.hw1.Token");
 
  /** @generated */
  final Feature casFeat_begin;
  /** @generated */
  final int     casFeatCode_begin;
  /** @generated */ 
  public int getBegin(int addr) {
        if (featOkTst && casFeat_begin == null)
      jcas.throwFeatMissing("begin", "edu.cmu.cs.wfeely.hw1.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_begin);
  }
  /** @generated */    
  public void setBegin(int addr, int v) {
        if (featOkTst && casFeat_begin == null)
      jcas.throwFeatMissing("begin", "edu.cmu.cs.wfeely.hw1.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_begin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_end;
  /** @generated */
  final int     casFeatCode_end;
  /** @generated */ 
  public int getEnd(int addr) {
        if (featOkTst && casFeat_end == null)
      jcas.throwFeatMissing("end", "edu.cmu.cs.wfeely.hw1.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_end);
  }
  /** @generated */    
  public void setEnd(int addr, int v) {
        if (featOkTst && casFeat_end == null)
      jcas.throwFeatMissing("end", "edu.cmu.cs.wfeely.hw1.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_end, v);}
    
  
 
  /** @generated */
  final Feature casFeat_token;
  /** @generated */
  final int     casFeatCode_token;
  /** @generated */ 
  public String getToken(int addr) {
        if (featOkTst && casFeat_token == null)
      jcas.throwFeatMissing("token", "edu.cmu.cs.wfeely.hw1.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_token);
  }
  /** @generated */    
  public void setToken(int addr, String v) {
        if (featOkTst && casFeat_token == null)
      jcas.throwFeatMissing("token", "edu.cmu.cs.wfeely.hw1.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_token, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Token_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_begin = jcas.getRequiredFeatureDE(casType, "begin", "uima.cas.Integer", featOkTst);
    casFeatCode_begin  = (null == casFeat_begin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_begin).getCode();

 
    casFeat_end = jcas.getRequiredFeatureDE(casType, "end", "uima.cas.Integer", featOkTst);
    casFeatCode_end  = (null == casFeat_end) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_end).getCode();

 
    casFeat_token = jcas.getRequiredFeatureDE(casType, "token", "uima.cas.String", featOkTst);
    casFeatCode_token  = (null == casFeat_token) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_token).getCode();

  }
}



    