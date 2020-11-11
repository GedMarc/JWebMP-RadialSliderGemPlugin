/*
 * Copyright (C) 2017 GedMarc
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

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.htmlbuilder.css.lists.ListCSS;
import com.jwebmp.core.htmlbuilder.css.lists.ListStyleType;
import com.jwebmp.core.plugins.ComponentInformation;

import jakarta.validation.constraints.NotNull;

/**
 * An implementation of the Radial SVG Slider.
 * <p>
 * Customized to be generic. https://codyhouse.co/gem/radial-svg-slider/
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "Radial SVG Slider Gem",
		description = "A carousel-like slider that animates the screen changes in a radial fashion",
		url = "https://codyhouse.co/demo/radial-svg-slider/index.html")
public class RadialSVGSlider
		extends Div<RadialSVGSliderChildren, RadialSVGSliderAttributes, RadialSVGSliderFeatures, RadialSVGSliderEvents, RadialSVGSlider>
{


	private RadialSVGSliderFeature feature;

	@ListCSS(ListStyleType = ListStyleType.none)

	private RadialSVGSliderList radialSliderList;

	public RadialSVGSlider()
	{
		addFeature(getFeature());
		addClass("cd-radial-slider-wrapper");
		addAttribute(GlobalAttributes.Style, "margin-top: 0px;margin-bottom: 0px;");
	}

	public final RadialSVGSliderFeature getFeature()
	{
		if (feature == null)
		{
			feature = new RadialSVGSliderFeature(this);
		}
		return feature;
	}

	/**
	 * Sets the classes correctly on the children
	 */
	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			int size = getRadialSliderList().getChildren()
			                                .size();
			if (size > 0)
			{
				getRadialSliderList().getChildren()
				                     .stream()
				                     .findFirst()
				                     .get()
				                     .addClass("visible");
			}
			if (size > 1)
			{
				getRadialSliderList().getChildren()
				                     .iterator()
				                     .next()
				                     .addClass("next-slide");
				getRadialSliderList().getChildren()
				                     .toArray(new ComponentHierarchyBase[getRadialSliderList().getChildren()
				                                                                              .size()])[getRadialSliderList().getChildren()
				                                                                                                             .size() - 1].addClass("prev-slide");
			}
		}
		super.preConfigure();
	}

	/**
	 * Renders the default stuff that doesn't need to be built
	 *
	 * @return
	 */
	@Override
	protected StringBuilder renderAfterChildren()
	{
		return new StringBuilder(
				getNewLine() +
				getNewLine() +
				getCurrentTabIndentString() +
				"\t" +
				"<ul class=\"cd-radial-slider-navigation\" style=\"list-style-type:none;\">" +
				getNewLine() +
				getCurrentTabIndentString() +
				"\t" +
				"\t" +
				"<li><a href=\"#0\" class=\"next\">Next</a></li>" +
				getNewLine() +
				getCurrentTabIndentString() +
				"\t" +
				"\t" +
				"<li><a href=\"#0\" class=\"prev\">Prev</a></li>" +
				getNewLine() +
				getCurrentTabIndentString() +
				"\t" +
				"</ul> <!-- .cd-radial-slider-navigation -->" +
				getNewLine() +
				getCurrentTabIndentString() +
				"\t" +
				"" +
				getNewLine() +
				getCurrentTabIndentString() +
				"\t" +
				"<div class=\"cd-round-mask\">" +
				getNewLine() +
				getCurrentTabIndentString() +
				"\t" +
				"\t" +
				"<svg viewBox=\"0 0 1400 800\">" +
				getNewLine() +
				getCurrentTabIndentString() +
				"\t" +
				"\t" +
				"\t" +
				"<defs>" +
				getNewLine() +
				getCurrentTabIndentString() +
				"\t" +
				"\t" +
				"\t" +
				"\t" +
				"<mask id=\"cd-left-mask\" height='800px' width=\"1400px\" x=\"0\" y=\"0\" maskUnits=\"userSpaceOnUse\">" +
				getNewLine() +
				getCurrentTabIndentString() +
				"\t" +
				"\t" +
				"\t" +
				"\t" +
				"\t" +
				"<path fill=\"white\" d=\"M0,0v800h1400V0H0z M110,460c-33.137,0-60-26.863-60-60s26.863-60,60-60s60,26.863,60,60S143.137,460,110,460z\"/>" +
				getNewLine() +
				getCurrentTabIndentString() +
				"\t" +
				"\t" +
				"\t" +
				"\t" +
				"</mask>" +
				getNewLine() +
				getCurrentTabIndentString() +
				"\t" +
				"" +
				getNewLine() +
				getCurrentTabIndentString() +
				"\t" +
				"\t" +
				"\t" +
				"\t" +
				"<mask id=\"cd-right-mask\" height='800px' width=\"1400px\" x=\"0\" y=\"0\" maskUnits=\"userSpaceOnUse\">" +
				getNewLine() +
				getCurrentTabIndentString() +
				"\t" +
				"\t" +
				"\t" +
				"\t" +
				"\t" +
				"<path fill=\"white\" d=\"M0,0v800h1400V0H0z M1290,460c-33.137,0-60-26.863-60-60s26.863-60,60-60s60,26.863,60,60S1323.137,460,1290,460z\"/>" +
				getNewLine() +
				getCurrentTabIndentString() +
				"\t" +
				"\t" +
				"\t" +
				"\t" +
				"</mask>" +
				getNewLine() +
				getCurrentTabIndentString() +
				"\t" +
				"\t" +
				"\t" +
				"</defs>" +
				getNewLine() +
				getCurrentTabIndentString() +
				"\t" +
				"\t" +
				"</svg>" +
				getNewLine() +
				getCurrentTabIndentString() +
				"\t" +
				"</div>");
	}

	/**
	 * Returns the radial slider list
	 *
	 * @return
	 */
	@NotNull
	public RadialSVGSliderList getRadialSliderList()
	{
		if (radialSliderList == null)
		{
			setRadialSliderList(new RadialSVGSliderList());
		}
		return radialSliderList;
	}

	/**
	 * Sets the radial slider list
	 *
	 * @param radialSliderList
	 */
	public void setRadialSliderList(RadialSVGSliderList radialSliderList)
	{
		remove(this.radialSliderList);
		this.radialSliderList = radialSliderList;
		if (this.radialSliderList != null)
		{
			this.radialSliderList.addClass("cd-radial-slider");
			this.radialSliderList.addAttribute(RadialSVGSliderListAttributes.Radius1, 60);
			this.radialSliderList.addAttribute(RadialSVGSliderListAttributes.Radius2, 1364);
			this.radialSliderList.addAttribute(RadialSVGSliderListAttributes.CenterX1, 110);
			this.radialSliderList.addAttribute(RadialSVGSliderListAttributes.CenterX2, 1290);
			this.radialSliderList.addAttribute(GlobalAttributes.Style, "margin-top: 0px;margin-bottom: 0px;padding-left:0");
			add(this.radialSliderList);
		}
	}

	/**
	 * Adds a face to this
	 *
	 * @param content
	 * 		The content div to add
	 *
	 * @return
	 */
	public RadialSVGSliderListItem addFace(Div content)
	{
		return addFace(content, "");
	}

	/**
	 * Adds a face to this
	 *
	 * @param content
	 * 		The content div to add
	 * @param backgroundUrl
	 * 		The background image URL to apply
	 *
	 * @return
	 */
	public RadialSVGSliderListItem addFace(Div content, String backgroundUrl)
	{
		RadialSVGSliderListItem li = new RadialSVGSliderListItem();
		li.setContent(content);
		if (backgroundUrl != null)
		{
			li.setFaceBackgroundImageUrl(backgroundUrl);
		}
		getRadialSliderList().add(li);
		return li;
	}

	@Override
	public RadialSVGSliderOptions getOptions()
	{
		return getFeature().getOptions();
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getFeature().hashCode();
		result = 31 * result + getRadialSliderList().hashCode();
		return result;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof RadialSVGSlider))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		RadialSVGSlider that = (RadialSVGSlider) o;

		if (!getFeature().equals(that.getFeature()))
		{
			return false;
		}
		return getRadialSliderList().equals(that.getRadialSliderList());
	}
}
