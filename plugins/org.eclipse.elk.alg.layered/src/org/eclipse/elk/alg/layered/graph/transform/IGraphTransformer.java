/*******************************************************************************
 * Copyright (c) 2010, 2015 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Kiel University - initial API and implementation
 *******************************************************************************/
package org.eclipse.elk.alg.layered.graph.transform;

import org.eclipse.elk.alg.layered.graph.LGraph;

/**
 * Interface for importer classes for the layered graph structure.
 * 
 * <p>Graph importers are encouraged to set the {@link LayeredOptions#GRAPH_PROPERTIES}
 * property on imported graphs.</p>
 *
 * @param <T> the type of graph that this importer can transform into a layered graph.
 * @author msp
 * @kieler.design 2012-08-10 chsch grh
 * @kieler.rating proposed yellow by msp
 */
public interface IGraphTransformer<T> {
    
    /**
     * Create a layered graph from the given graph.
     * 
     * @param graph the graph to turn into a layered graph.
     * @return a layered graph, or {@code null} if the input was not recognized
     */
    LGraph importGraph(T graph);
    
    /**
     * Apply the computed layout of the given layered graph to the original input graph.
     * 
     * <dl>
     *   <dt>Precondition:</dt><dd>the graph has all its dummy nodes and edges removed;
     *     edges that were reversed during layout have been restored to their original
     *     orientation</dd>
     *   <dt>Postcondition:</dt><dd>none</dd>
     * </dl>
     * 
     * @param layeredGraph a graph for which layout is applied
     */
    void applyLayout(LGraph layeredGraph);

}
