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
package za.co.mmagon.jwebswing.plugins.radialsvgslider;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class RadialSVGSliderFeature extends Feature<RadialSVGSliderOptions, RadialSVGSliderFeature> implements RadialSVGSliderFeatures, GlobalFeatures
{

	private static final long serialVersionUID = 1L;

	private RadialSVGSliderOptions options;

	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
	 * <p>
	 *
	 * @param forComponent
	 */
	public RadialSVGSliderFeature(Component forComponent)
	{
		super("RadialSVGSliderFeature");
		setComponent(forComponent);
		getJavascriptReferences().add(SnapSVGReferencePool.SnapSVG.getJavaScriptReference());
		getJavascriptReferences().add(RadialSVGSliderReferencePool.RadialSVG.getJavaScriptReference());
		getCssReferences().add(RadialSVGSliderReferencePool.RadialSVG.getCssReference());
	}

	/**
	 * Returns all the tooltip options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public RadialSVGSliderOptions getOptions()
	{
		if (options == null)
		{
			options = new RadialSVGSliderOptions();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		//Nothing Needed
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof RadialSVGSliderFeature))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		RadialSVGSliderFeature that = (RadialSVGSliderFeature) o;

		return getOptions().equals(that.getOptions());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getOptions().hashCode();
		return result;
	}
}
