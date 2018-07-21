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

import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;

/**
 * @author GedMarc
 * @version 1.0
 * @since Oct 24, 2016
 */
public enum RadialSVGSliderListAttributes
		implements AttributeDefinitions
{
	Radius1("data-radius1"),
	Radius2("data-radius2"),
	CenterX1("data-centerx1"),
	CenterX2("data-centerx2");
	private final String name;

	RadialSVGSliderListAttributes(String name)
	{
		this.name = name;
	}

	@Override
	public boolean isKeyword()
	{
		return false;
	}

	@Override
	public String toString()
	{
		return name;
	}
}
