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

package jfb.examples.gmf.math.diagram.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jfb.examples.gmf.math.OperatorInput;
import jfb.examples.gmf.math.Result;
import org.eclipse.emf.common.util.EList;

public class CycleDetectionHelper {

	/**
	 * Navigate through the model from one result to detect if there is a cycle. 
	 * @param fromResult the result from which the navigation starts.
	 * @return a boolean indicating if a cycle has been detected.
	 */
	public static boolean cycleDetected(Result fromResult) {
		List<Result> processedResults = new ArrayList<Result>();
		processedResults.add(fromResult);
		return cycleDetected(processedResults, fromResult);
	}
	
	/**
	 * Navigate through the model from one result to detect if there is a cycle. 
	 * @param processedResults result already processed during this navigation.
	 * @param result the result to process.
	 * @return a boolean indicating if a cycle has been detected.
	 */
	private static boolean cycleDetected(List<Result> processedResults, Result result) {
		System.out.println("cycleDetected(" + processedResults + ", " + result + ")");
		EList<OperatorInput> inputs = result.getOperatorInputs();
		boolean cycleDetected = false;
		for (Iterator<OperatorInput> it = inputs.iterator(); it.hasNext()
				&& !cycleDetected;) {
			OperatorInput operatorInput = it.next();
			cycleDetected = cycleDetected(processedResults, operatorInput);
		}
		return cycleDetected;

	}

	/**
	 * Navigate through the model from one result to detect if there is a cycle. 
	 * @param processedResults result already processed during this navigation.
	 * @param input the input to examine.
	 * @return a boolean indicating if a cycle has been detected.
	 */
	private static boolean cycleDetected(List<Result> processedResults, OperatorInput input) {
		System.out.println("cycleDetected(" + processedResults + ", " + input + ")");
		boolean cycleDetected = false;
		if (input != null) {
			Result nextResult = input.getOperator().getOutput().getResult();
			if (nextResult != null) {
				// A cycle is detected if we meet once again the first result in the stack 
				cycleDetected = processedResults.get(0) == nextResult;
				// If no cycle is detected at this point, we proceed with the next result
				if (!cycleDetected) {
					// but only if we haven't already met this result (which would mean that 
					// our diagram contains a cycle but for a different result from the
					// one on which we are working for this time, ie. processedResults.get(0)).
					if (!processedResults.contains(nextResult)) {
						processedResults.add(nextResult);
						cycleDetected = cycleDetected(processedResults, nextResult);
					}
				}
			}
		}
		return cycleDetected;
	}

}
