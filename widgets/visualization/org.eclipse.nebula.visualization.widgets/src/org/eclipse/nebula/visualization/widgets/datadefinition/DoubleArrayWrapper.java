/*******************************************************************************
 * Copyright (c) 2010 Oak Ridge National Laboratory.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package org.eclipse.nebula.visualization.widgets.datadefinition;

/**A wrapper for double[].
 * @author Xihui Chen
 *
 */
public class DoubleArrayWrapper implements IPrimaryArrayWrapper {
	
	public double[] data;
	
	

	public DoubleArrayWrapper(double[] data) {
		this.data = data;
	}

	public void setData(double[] data) {
		this.data = data;
	}
	
	public double get(int i) {
		return data[i];
	}

	public int getSize() {
		return data.length;
	}

}
