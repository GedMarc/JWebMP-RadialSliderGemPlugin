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

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 */
@PluginInformation(pluginName = "Radial SVG Slider Gem",
		pluginUniqueName = "radial-svg-slider-gem",
		pluginDescription = "Quickly implement beautiful slides with this gem",
		pluginVersion = "0.1",
		pluginDependancyUniqueIDs = "jquery",
		pluginCategories = "carousel, slider, gem, radial",
		pluginSubtitle = "A simple, responsive slider, with a radial transition effect powered by SVG clipPath and mask elements.",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-RadialSliderGemPlugin",
		pluginSourceUrl = "https://github.com/GedMarc/JWebMP-RadialSliderGemPlugin",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-RadialSliderGemPlugin/wiki",
		pluginOriginalHomepage = "https://codyhouse.co/gem/radial-svg-slider/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/RadialSliderGemPlugin.jar/download",
		pluginIconUrl = "bower_components/radial-svg-slider-jwebswing/example.png",
		pluginIconImageUrl = "bower_components/radial-svg-slider-jwebswing/example.png",
		pluginLastUpdatedDate = "2017/03/04")
public class RadialSVGSliderGemPageConfigurator
		implements IPageConfigurator<RadialSVGSliderGemPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return RadialSVGSliderGemPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		RadialSVGSliderGemPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		return page;
	}

	@Override
	public boolean enabled()
	{
		return RadialSVGSliderGemPageConfigurator.enabled;
	}

}
