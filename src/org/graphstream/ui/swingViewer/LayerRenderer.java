/*
 * Copyright 2006 - 2012
 *      Stefan Balev       <stefan.balev@graphstream-project.org>
 *      Julien Baudry	<julien.baudry@graphstream-project.org>
 *      Antoine Dutot	<antoine.dutot@graphstream-project.org>
 *      Yoann Pigné	<yoann.pigne@graphstream-project.org>
 *      Guilhelm Savin	<guilhelm.savin@graphstream-project.org>
 *  
 * GraphStream is a library whose purpose is to handle static or dynamic
 * graph, create them from scratch, file or any source and display them.
 * 
 * This program is free software distributed under the terms of two licenses, the
 * CeCILL-C license that fits European law, and the GNU Lesser General Public
 * License. You can  use, modify and/ or redistribute the software under the terms
 * of the CeCILL-C license as circulated by CEA, CNRS and INRIA at the following
 * URL <http://www.cecill.info> or under the terms of the GNU LGPL as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL-C and LGPL licenses and that you accept their terms.
 */
package org.graphstream.ui.swingViewer;

import java.awt.Graphics2D;

import org.graphstream.ui.graphicGraph.GraphicGraph;

/**
 * A specific rendering class that can be plugged in any view (and in any graph
 * renderer) and is called to draw under or above the graph, before and after the
 * rendering of a frame.
 * 
 * @see View#setForeLayoutRenderer(LayerRenderer)
 * @see View#setBackLayerRenderer(LayerRenderer)
 */
public interface LayerRenderer {
	/**
	 * Tells whether the renderer operates in pixels units or in graph units. If you prefer
	 * to do your rendering in pixel units, return true, else you will use the units defined
	 * in the graph (GU, graph units) 
	 * @return True if in pixel units.
	 */
	boolean rendersInPX();
	
	/**
	 * Render something under or above the graph.
	 * 
	 * @param graphics
	 *            The Swing graphics.
	 * @param graph
	 *            The graphic representation of the graph.
	 * @param camera
	 *            The actual view, graph metrics, etc.
	 */
	void render(Graphics2D graphics, GraphicGraph graph, Camera camera);
}
