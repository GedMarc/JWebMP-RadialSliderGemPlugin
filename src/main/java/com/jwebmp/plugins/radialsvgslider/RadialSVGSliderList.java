/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.radialsvgslider;

import com.jwebmp.core.base.html.List;
import com.jwebmp.core.base.html.interfaces.children.ListChildren;
import com.jwebmp.core.htmlbuilder.css.measurement.MeasurementCSS;
import com.jwebmp.core.htmlbuilder.css.padding.PaddingCSS;

/**
 * The data attributes for the radial
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 24, 2016
 */
@PaddingCSS(PaddingLeft = @MeasurementCSS(0))
public class RadialSVGSliderList
		extends List<ListChildren, RadialSVGSliderListAttributes, RadialSVGSliderEvents, RadialSVGSliderList>
		implements RadialSVGSliderChildren<ListChildren, RadialSVGSliderList>
{

	private static final long serialVersionUID = 1L;

	public RadialSVGSliderList()
	{
		//Basic List no configuration needed
	}
}
