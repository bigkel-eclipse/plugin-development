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

package jfb.examples.gmf.math.diagram.edit.parts.custom;

import jfb.examples.gmf.math.Number;
import jfb.examples.gmf.math.Operator;
import jfb.examples.gmf.math.OperatorInput;
import jfb.examples.gmf.math.PlusOperator;
import jfb.examples.gmf.math.Result;
import jfb.examples.gmf.math.diagram.util.CycleDetectionHelper;

import org.eclipse.emf.common.util.EList;

public class AutomaticComputationHelper {

	public static void numberValueChanged(Number number) {
		EList<OperatorInput> inputs = number.getOperatorInputs();
		for (OperatorInput operatorInput : inputs) {
			Operator op = operatorInput.getOperator();
			updateOperatorResult(op);
		}
	}

	public static void operatorOutputToResultConnectionChanged(Result result) {
		if (result.getOperatorOutput() == null) {
			result.setValue(0);
		}
		else {
			updateOperatorResult(result.getOperatorOutput().getOperator());
		}
	}

	public static void updateOperatorResult(Operator operator) {
		Result result = operator.getOutput().getResult();
		if (result!=null) {
			// If there is a cycle...
			if (CycleDetectionHelper.cycleDetected(result)) {
				result.setValue(0);
			}
			else {
				Number in1 = operator.getInputs().get(0).getNumber();
				Number in2 = operator.getInputs().get(1).getNumber();
				double _in1 = in1 != null ? in1.getValue() : 0;
				double _in2 = in2 != null ? in2.getValue() : 0;
				result.setValue(operator instanceof PlusOperator ? _in1 + _in2 : _in1 - _in2);
			}
		}
	}

}
