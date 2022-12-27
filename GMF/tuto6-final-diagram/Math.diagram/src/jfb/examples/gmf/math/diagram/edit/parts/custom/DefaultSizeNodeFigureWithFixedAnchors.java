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

import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;

public class DefaultSizeNodeFigureWithFixedAnchors extends
		DefaultSizeNodeFigure {

	private HashMap<String, FixedConnectionAnchor> anchors = new HashMap<String, FixedConnectionAnchor>();

	public DefaultSizeNodeFigureWithFixedAnchors(Dimension defSize, HashMap<String, PrecisionPoint> anchorLocations) {
		this(defSize.width, defSize.height, anchorLocations);
	}

	public DefaultSizeNodeFigureWithFixedAnchors(int width, int height, HashMap<String, PrecisionPoint> anchorLocations) {
		super(width, height);
		if (anchorLocations.size()==0)
			throw new IllegalArgumentException("At least one fixed anchor must be specified");
		Iterator<String> terminals = anchorLocations.keySet().iterator();
		while (terminals.hasNext()) {
			String terminal = terminals.next();
			PrecisionPoint anchorLocation = anchorLocations.get(terminal);
			anchors.put(terminal, new FixedConnectionAnchor(this, anchorLocation));
		}
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchorAt(Point p) {
		return findNearestAnchorFrom(p);
	}
	
	@Override
	public ConnectionAnchor getTargetConnectionAnchorAt(Point p) {
		return findNearestAnchorFrom(p);
	}

	@Override
	public ConnectionAnchor getConnectionAnchor(String terminal) {
		return anchors.get(terminal);
	}
	
	@Override
	public String getConnectionAnchorTerminal(ConnectionAnchor c) {
		String selectedTerminal = null;
		Iterator<String> terminals = anchors.keySet().iterator();
		while (terminals.hasNext() && selectedTerminal==null) {
			String terminal = terminals.next();
			FixedConnectionAnchor anchor = anchors.get(terminal);
			if (anchor == c) {
				selectedTerminal = terminal;
			}
		}
		return selectedTerminal;
	}

	private ConnectionAnchor findNearestAnchorFrom(Point point) {
		ConnectionAnchor result = null;
		if (point == null || anchors.size()==1) {
			result = anchors.values().iterator().next();
		}
		else {
			double minDistance = Double.MAX_VALUE;
			String nearestTerminal = null;
			Iterator<String> terminals = anchors.keySet().iterator();
			while (terminals.hasNext()) {
				String terminal = terminals.next();
				FixedConnectionAnchor anchor = anchors.get(terminal);
				Point anchorPosition = anchor.getLocation();
				double distance = point.getDistance(anchorPosition);
				if (distance < minDistance) {
					minDistance = distance;
					nearestTerminal = terminal;
				}
			}
			result = anchors.get(nearestTerminal);
		}
		return result;
	}

}
