

/* First created by JCasGen Wed Sep 11 19:14:03 EDT 2013 */
package edu.cmu.cs.wfeely.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Token type.
 * Updated by JCasGen Wed Sep 11 19:14:03 EDT 2013
 * XML source: /home/hermes/git/hw1-wfeely/hw1-wfeely/src/main/resources/hw1-wfeely-typesystem.xml
 * @generated */
public class Token extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
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

  /** getter for begin - gets Beginning character offset for token.
   * @generated */
  public int getBegin() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "edu.cmu.cs.wfeely.hw1.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_begin);}
    
  /** setter for begin - sets Beginning character offset for token. 
   * @generated */
  public void setBegin(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "edu.cmu.cs.wfeely.hw1.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_begin, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets Ending character offset for token.
   * @generated */
  public int getEnd() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "edu.cmu.cs.wfeely.hw1.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets Ending character offset for token. 
   * @generated */
  public void setEnd(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "edu.cmu.cs.wfeely.hw1.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_end, v);}    
   
    
  //*--------------*
  //* Feature: token

  /** getter for token - gets Token string.
   * @generated */
  public String getToken() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_token == null)
      jcasType.jcas.throwFeatMissing("token", "edu.cmu.cs.wfeely.hw1.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_token);}
    
  /** setter for token - sets Token string. 
   * @generated */
  public void setToken(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_token == null)
      jcasType.jcas.throwFeatMissing("token", "edu.cmu.cs.wfeely.hw1.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_token, v);}    
  }

    