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

import java.util.List;

import jfb.examples.gmf.math.diagram.edit.parts.OperatorInputEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.OperatorOutputEditPart;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;

public class OperatorCompartmentFigureListener implements FigureListener {
	
	private ListCompartmentEditPart compartmentEditPart = null;
	private RoundedRectangle roundedRectangle = null;
	
	public static final double MARGIN = 20; // The margin to apply before drawing our operator
	public static final double R = 50; // The base length
	public static final double REF_W = 2 * MARGIN + R * 6; // Reference width
	public static final double REF_H = 2 * MARGIN + R * 5; // Reference height

	public OperatorCompartmentFigureListener(ListCompartmentEditPart compartmentEditPart, RoundedRectangle roundedRectangle) {
		this.compartmentEditPart = compartmentEditPart;
		this.roundedRectangle = roundedRectangle;
	}
	
	@Override
	public void figureMoved(IFigure f) {
		ResizableCompartmentFigure figure = (ResizableCompartmentFigure) f;
		if (figure.getSize().width != 0) {
			IFigure contentPane = figure.getContentPane();
			Insets is = figure.getInsets();
			// Determine the scale to apply
			double xScale = ((double) figure.getSize().width - is.left - is.right) / REF_W;
			double yScale = ((double) figure.getSize().height - is.top - is.bottom) / REF_H;

			// Set the constraints (bounds) for the rounded rectangle
			Rectangle constraint = new Rectangle(
					(int) ((MARGIN + R) * xScale),
					(int) ((MARGIN) * yScale), 
					(int) (R * 4 * xScale),
					(int) (R * 5 * yScale));
			contentPane.setConstraint(roundedRectangle, constraint);

			// Set the constraints for the input and output nodes
			List<AbstractEditPart> childs = compartmentEditPart.getChildren();
			boolean firstInputProcessed = false;
			for (AbstractEditPart child : childs) {
				if (child instanceof AbstractGraphicalEditPart) {
					AbstractGraphicalEditPart gEditPart = (AbstractGraphicalEditPart) child;
					// Operator output ?
					if (gEditPart instanceof OperatorOutputEditPart) {
						constraint = new Rectangle(
								(int) ((REF_W - MARGIN - R) * xScale),
								(int) ((REF_H - R) / 2 * yScale),
								(int) (R * xScale), 
								(int) (R * yScale));
						contentPane.setConstraint(gEditPart.getFigure(), constraint);
					}
					// Operator input ?
					else if (gEditPart instanceof OperatorInputEditPart) {
						constraint = new Rectangle(
								(int) (MARGIN * xScale),
								!firstInputProcessed ? (int) ((MARGIN + R) * yScale) : (int) ((MARGIN + R * 3) * yScale),
								(int) (R * xScale), 
								(int) (R * yScale));
						contentPane.setConstraint(gEditPart.getFigure(), constraint);
						firstInputProcessed = true; // This boolean heps to know if we process the first or the seconde operator input
					}
				}
			}
		}
	}

}
