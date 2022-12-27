/*
 * Copyright (c) 2009, Jean-François Brazeau. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 *  1. Redistributions of source code must retain the above copyright notice,
 *     this list of conditions and the following disclaimer.
 * 
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 * 
 *  3. The name of the author may not be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIEDWARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS
 * OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE
 * USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package jfb.examples.gmf.math;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jfb.examples.gmf.math.MathFactory
 * @model kind="package"
 * @generated
 */
public interface MathPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "math";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///jfb/examples/gmf/math.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jfb.examples.gmf.math";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MathPackage eINSTANCE = jfb.examples.gmf.math.impl.MathPackageImpl.init();

	/**
	 * The meta object id for the '{@link jfb.examples.gmf.math.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jfb.examples.gmf.math.impl.NumberImpl
	 * @see jfb.examples.gmf.math.impl.MathPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Operator Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__OPERATOR_INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link jfb.examples.gmf.math.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jfb.examples.gmf.math.impl.EntryImpl
	 * @see jfb.examples.gmf.math.impl.MathPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Operator Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__OPERATOR_INPUTS = NUMBER__OPERATOR_INPUTS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__VALUE = NUMBER__VALUE;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link jfb.examples.gmf.math.impl.MathDiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jfb.examples.gmf.math.impl.MathDiagramImpl
	 * @see jfb.examples.gmf.math.impl.MathPackageImpl#getMathDiagram()
	 * @generated
	 */
	int MATH_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_DIAGRAM__OPERATORS = 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_DIAGRAM__ENTRIES = 1;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_DIAGRAM__RESULTS = 2;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link jfb.examples.gmf.math.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jfb.examples.gmf.math.impl.OperatorImpl
	 * @see jfb.examples.gmf.math.impl.MathPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 4;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__OUTPUT = 1;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link jfb.examples.gmf.math.impl.MinusOperatorImpl <em>Minus Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jfb.examples.gmf.math.impl.MinusOperatorImpl
	 * @see jfb.examples.gmf.math.impl.MathPackageImpl#getMinusOperator()
	 * @generated
	 */
	int MINUS_OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATOR__INPUTS = OPERATOR__INPUTS;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATOR__OUTPUT = OPERATOR__OUTPUT;

	/**
	 * The number of structural features of the '<em>Minus Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link jfb.examples.gmf.math.impl.OperatorInputImpl <em>Operator Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jfb.examples.gmf.math.impl.OperatorInputImpl
	 * @see jfb.examples.gmf.math.impl.MathPackageImpl#getOperatorInput()
	 * @generated
	 */
	int OPERATOR_INPUT = 5;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_INPUT__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_INPUT__NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Operator Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_INPUT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link jfb.examples.gmf.math.impl.OperatorOutputImpl <em>Operator Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jfb.examples.gmf.math.impl.OperatorOutputImpl
	 * @see jfb.examples.gmf.math.impl.MathPackageImpl#getOperatorOutput()
	 * @generated
	 */
	int OPERATOR_OUTPUT = 6;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OUTPUT__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OUTPUT__RESULT = 1;

	/**
	 * The number of structural features of the '<em>Operator Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OUTPUT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link jfb.examples.gmf.math.impl.PlusOperatorImpl <em>Plus Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jfb.examples.gmf.math.impl.PlusOperatorImpl
	 * @see jfb.examples.gmf.math.impl.MathPackageImpl#getPlusOperator()
	 * @generated
	 */
	int PLUS_OPERATOR = 7;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR__INPUTS = OPERATOR__INPUTS;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR__OUTPUT = OPERATOR__OUTPUT;

	/**
	 * The number of structural features of the '<em>Plus Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link jfb.examples.gmf.math.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jfb.examples.gmf.math.impl.ResultImpl
	 * @see jfb.examples.gmf.math.impl.MathPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 8;

	/**
	 * The feature id for the '<em><b>Operator Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__OPERATOR_INPUTS = NUMBER__OPERATOR_INPUTS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__VALUE = NUMBER__VALUE;

	/**
	 * The feature id for the '<em><b>Operator Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__OPERATOR_OUTPUT = NUMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link jfb.examples.gmf.math.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see jfb.examples.gmf.math.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for class '{@link jfb.examples.gmf.math.MathDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see jfb.examples.gmf.math.MathDiagram
	 * @generated
	 */
	EClass getMathDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link jfb.examples.gmf.math.MathDiagram#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operators</em>'.
	 * @see jfb.examples.gmf.math.MathDiagram#getOperators()
	 * @see #getMathDiagram()
	 * @generated
	 */
	EReference getMathDiagram_Operators();

	/**
	 * Returns the meta object for the containment reference list '{@link jfb.examples.gmf.math.MathDiagram#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see jfb.examples.gmf.math.MathDiagram#getEntries()
	 * @see #getMathDiagram()
	 * @generated
	 */
	EReference getMathDiagram_Entries();

	/**
	 * Returns the meta object for the containment reference list '{@link jfb.examples.gmf.math.MathDiagram#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see jfb.examples.gmf.math.MathDiagram#getResults()
	 * @see #getMathDiagram()
	 * @generated
	 */
	EReference getMathDiagram_Results();

	/**
	 * Returns the meta object for class '{@link jfb.examples.gmf.math.MinusOperator <em>Minus Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus Operator</em>'.
	 * @see jfb.examples.gmf.math.MinusOperator
	 * @generated
	 */
	EClass getMinusOperator();

	/**
	 * Returns the meta object for class '{@link jfb.examples.gmf.math.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see jfb.examples.gmf.math.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for the reference list '{@link jfb.examples.gmf.math.Number#getOperatorInputs <em>Operator Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operator Inputs</em>'.
	 * @see jfb.examples.gmf.math.Number#getOperatorInputs()
	 * @see #getNumber()
	 * @generated
	 */
	EReference getNumber_OperatorInputs();

	/**
	 * Returns the meta object for the attribute '{@link jfb.examples.gmf.math.Number#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jfb.examples.gmf.math.Number#getValue()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_Value();

	/**
	 * Returns the meta object for class '{@link jfb.examples.gmf.math.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see jfb.examples.gmf.math.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link jfb.examples.gmf.math.Operator#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see jfb.examples.gmf.math.Operator#getInputs()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link jfb.examples.gmf.math.Operator#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see jfb.examples.gmf.math.Operator#getOutput()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Output();

	/**
	 * Returns the meta object for class '{@link jfb.examples.gmf.math.OperatorInput <em>Operator Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Input</em>'.
	 * @see jfb.examples.gmf.math.OperatorInput
	 * @generated
	 */
	EClass getOperatorInput();

	/**
	 * Returns the meta object for the container reference '{@link jfb.examples.gmf.math.OperatorInput#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operator</em>'.
	 * @see jfb.examples.gmf.math.OperatorInput#getOperator()
	 * @see #getOperatorInput()
	 * @generated
	 */
	EReference getOperatorInput_Operator();

	/**
	 * Returns the meta object for the reference '{@link jfb.examples.gmf.math.OperatorInput#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Number</em>'.
	 * @see jfb.examples.gmf.math.OperatorInput#getNumber()
	 * @see #getOperatorInput()
	 * @generated
	 */
	EReference getOperatorInput_Number();

	/**
	 * Returns the meta object for class '{@link jfb.examples.gmf.math.OperatorOutput <em>Operator Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Output</em>'.
	 * @see jfb.examples.gmf.math.OperatorOutput
	 * @generated
	 */
	EClass getOperatorOutput();

	/**
	 * Returns the meta object for the container reference '{@link jfb.examples.gmf.math.OperatorOutput#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operator</em>'.
	 * @see jfb.examples.gmf.math.OperatorOutput#getOperator()
	 * @see #getOperatorOutput()
	 * @generated
	 */
	EReference getOperatorOutput_Operator();

	/**
	 * Returns the meta object for the reference '{@link jfb.examples.gmf.math.OperatorOutput#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result</em>'.
	 * @see jfb.examples.gmf.math.OperatorOutput#getResult()
	 * @see #getOperatorOutput()
	 * @generated
	 */
	EReference getOperatorOutput_Result();

	/**
	 * Returns the meta object for class '{@link jfb.examples.gmf.math.PlusOperator <em>Plus Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus Operator</em>'.
	 * @see jfb.examples.gmf.math.PlusOperator
	 * @generated
	 */
	EClass getPlusOperator();

	/**
	 * Returns the meta object for class '{@link jfb.examples.gmf.math.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see jfb.examples.gmf.math.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for the reference '{@link jfb.examples.gmf.math.Result#getOperatorOutput <em>Operator Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operator Output</em>'.
	 * @see jfb.examples.gmf.math.Result#getOperatorOutput()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_OperatorOutput();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MathFactory getMathFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jfb.examples.gmf.math.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jfb.examples.gmf.math.impl.EntryImpl
		 * @see jfb.examples.gmf.math.impl.MathPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '{@link jfb.examples.gmf.math.impl.MathDiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jfb.examples.gmf.math.impl.MathDiagramImpl
		 * @see jfb.examples.gmf.math.impl.MathPackageImpl#getMathDiagram()
		 * @generated
		 */
		EClass MATH_DIAGRAM = eINSTANCE.getMathDiagram();

		/**
		 * The meta object literal for the '<em><b>Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATH_DIAGRAM__OPERATORS = eINSTANCE.getMathDiagram_Operators();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATH_DIAGRAM__ENTRIES = eINSTANCE.getMathDiagram_Entries();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATH_DIAGRAM__RESULTS = eINSTANCE.getMathDiagram_Results();

		/**
		 * The meta object literal for the '{@link jfb.examples.gmf.math.impl.MinusOperatorImpl <em>Minus Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jfb.examples.gmf.math.impl.MinusOperatorImpl
		 * @see jfb.examples.gmf.math.impl.MathPackageImpl#getMinusOperator()
		 * @generated
		 */
		EClass MINUS_OPERATOR = eINSTANCE.getMinusOperator();

		/**
		 * The meta object literal for the '{@link jfb.examples.gmf.math.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jfb.examples.gmf.math.impl.NumberImpl
		 * @see jfb.examples.gmf.math.impl.MathPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em><b>Operator Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER__OPERATOR_INPUTS = eINSTANCE.getNumber_OperatorInputs();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__VALUE = eINSTANCE.getNumber_Value();

		/**
		 * The meta object literal for the '{@link jfb.examples.gmf.math.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jfb.examples.gmf.math.impl.OperatorImpl
		 * @see jfb.examples.gmf.math.impl.MathPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__INPUTS = eINSTANCE.getOperator_Inputs();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__OUTPUT = eINSTANCE.getOperator_Output();

		/**
		 * The meta object literal for the '{@link jfb.examples.gmf.math.impl.OperatorInputImpl <em>Operator Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jfb.examples.gmf.math.impl.OperatorInputImpl
		 * @see jfb.examples.gmf.math.impl.MathPackageImpl#getOperatorInput()
		 * @generated
		 */
		EClass OPERATOR_INPUT = eINSTANCE.getOperatorInput();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_INPUT__OPERATOR = eINSTANCE.getOperatorInput_Operator();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_INPUT__NUMBER = eINSTANCE.getOperatorInput_Number();

		/**
		 * The meta object literal for the '{@link jfb.examples.gmf.math.impl.OperatorOutputImpl <em>Operator Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jfb.examples.gmf.math.impl.OperatorOutputImpl
		 * @see jfb.examples.gmf.math.impl.MathPackageImpl#getOperatorOutput()
		 * @generated
		 */
		EClass OPERATOR_OUTPUT = eINSTANCE.getOperatorOutput();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_OUTPUT__OPERATOR = eINSTANCE.getOperatorOutput_Operator();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_OUTPUT__RESULT = eINSTANCE.getOperatorOutput_Result();

		/**
		 * The meta object literal for the '{@link jfb.examples.gmf.math.impl.PlusOperatorImpl <em>Plus Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jfb.examples.gmf.math.impl.PlusOperatorImpl
		 * @see jfb.examples.gmf.math.impl.MathPackageImpl#getPlusOperator()
		 * @generated
		 */
		EClass PLUS_OPERATOR = eINSTANCE.getPlusOperator();

		/**
		 * The meta object literal for the '{@link jfb.examples.gmf.math.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jfb.examples.gmf.math.impl.ResultImpl
		 * @see jfb.examples.gmf.math.impl.MathPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '<em><b>Operator Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__OPERATOR_OUTPUT = eINSTANCE.getResult_OperatorOutput();

	}

} //MathPackage
