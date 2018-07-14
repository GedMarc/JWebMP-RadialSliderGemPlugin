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

import com.jwebmp.base.html.*;
import com.jwebmp.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.utilities.GUIDGenerator;

/**
 * A default SVG slider list item(face) that renders
 *
 * @author GedMarc
 * @since Oct 26, 2016
 */
public class RadialSVGSliderListItem
		extends ListItem
{

	private static final long serialVersionUID = 1L;

	/**
	 * The background image URL to use
	 */
	private String faceBackgroundImageUrl = "bower_components/radial-svg-slider-jwebswing/img/img-1.jpg";
	private String clipPathUniqueID;
	private String circleUniqueID;

	/**
	 * The content container
	 */
	private Div contentContainer;
	/**
	 * The content wrapper
	 */
	private Div contentWrapper;
	/**
	 * The physical content
	 */
	private Div content;
	private boolean rendered;

	/**
	 * Constructs a new face (list item) for the Radial SVG Slider
	 */
	public RadialSVGSliderListItem()
	{
		clipPathUniqueID = GUIDGenerator.generateGuid();
		circleUniqueID = GUIDGenerator.generateGuid();
	}

	/**
	 * Creates a default slide
	 *
	 * @param headerText
	 * 		The header text of the slide
	 * @param defaultText
	 * 		The default text of the slide
	 * @param linkUrl
	 * 		The link for the main button
	 * @param linkText
	 * 		the text for the link
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Div createDefaultSlide(String headerText, String defaultText, String linkUrl, String linkText)
	{
		Div d = new Div();
		H2 hText = new H2(headerText);
		Paragraph p = new Paragraph(defaultText);
		Link newLink = new Link(linkUrl);
		newLink.addClass("cd-btn");
		newLink.setText(linkText);

		d.add(hText);
		d.add(p);
		d.add(newLink);
		return d;
	}

	/**
	 * Generates the SVG syntax for the face
	 *
	 * @return
	 */
	@Override
	protected StringBuilder renderBeforeChildren()
	{
		if (!rendered)
		{
			rendered = true;
			return new StringBuilder(
					getNewLine() +
					getCurrentTabIndentString() +
					"\t" +
					"<div class=\"svg-wrapper\">" +
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
					"<title>Animated SVG</title>" +
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
					"<clipPath id=\"" +
					clipPathUniqueID +
					"\">" +
					getNewLine() +
					getCurrentTabIndentString() +
					"\t" +
					"\t" +
					"\t" +
					"\t" +
					"\t" +
					"<circle id=\"" +
					circleUniqueID +
					"\" cx=\"110\" cy=\"400\" r=\"1364\"/>" +
					getNewLine() +
					getCurrentTabIndentString() +
					"\t" +
					"\t" +
					"\t" +
					"\t" +
					"</clipPath>" +
					getNewLine() +
					getCurrentTabIndentString() +
					"\t" +
					"\t" +
					"\t" +
					"</defs>" +
					getNewLine() +
					getCurrentTabIndentString() +
					"" +
					getNewLine() +
					getCurrentTabIndentString() +
					"\t" +
					"\t" +
					"\t" +
					"<image height='800px' width=\"1400px\" clip-path=\"url(#" +
					clipPathUniqueID +
					")\" xlink:href=\"" +
					getFaceBackgroundImageUrl() +
					"\"></image>" +
					getNewLine() +
					getCurrentTabIndentString() +
					"\t" +
					"\t" +
					"</svg>" +
					getNewLine() +
					getCurrentTabIndentString() +
					"\t" +
					"</div>" +
					getNewLine());
		}
		else
		{
			return null;
		}
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			if (getChildren().isEmpty())
			{
				getContent(); //force the build of the wrapper
			}
			JQueryPageConfigurator.setRequired(true);
		}

		super.preConfigure();
	}

	/**
	 * Returns the content. Never null
	 *
	 * @return
	 */
	public Div getContent()
	{
		if (content == null)
		{
			setContent(new Div());
		}
		return content;
	}

	/**
	 * Sets the content.
	 *
	 * @param content
	 */
	@SuppressWarnings("unchecked")
	public void setContent(Div content)
	{
		this.content = content;
		if (this.content != null)
		{
			getContentWrapper().add(this.content);
		}
	}

	/**
	 * Returns the contentContainer wrapper
	 *
	 * @return
	 */
	protected Div getContentWrapper()
	{
		if (contentWrapper == null)
		{
			setContentWrapper(new Div());
		}
		return contentWrapper;
	}

	/**
	 * Returns the contentContainer div. Never Null
	 *
	 * @return
	 */
	protected Div getContentContainer()
	{
		if (contentContainer == null)
		{
			setContentContainer(new Div());
		}
		return contentContainer;
	}

	/**
	 * Sets the contentContainer Div
	 *
	 * @param contentContainer
	 */
	protected void setContentContainer(Div contentContainer)
	{
		this.contentContainer = contentContainer;
		if (this.contentContainer != null)
		{
			this.contentContainer.addClass("cd-radial-slider-content");
			add(contentContainer);
		}
	}

	/**
	 * Sets the contentContainer wrapper
	 *
	 * @param contentWrapper
	 */
	@SuppressWarnings("unchecked")
	protected void setContentWrapper(Div contentWrapper)
	{
		this.contentWrapper = contentWrapper;
		if (this.contentWrapper != null)
		{
			this.contentWrapper.addClass("wrapper");
			getContentContainer().add(this.contentWrapper);
		}
	}

	/**
	 * Returns the background image URL assigned
	 *
	 * @return
	 */
	public String getFaceBackgroundImageUrl()
	{
		return faceBackgroundImageUrl;
	}

	/**
	 * Sets the face background image URL
	 *
	 * @param faceBackgroundImageUrl
	 */
	public void setFaceBackgroundImageUrl(String faceBackgroundImageUrl)
	{
		this.faceBackgroundImageUrl = faceBackgroundImageUrl;
	}

	/**
	 * Returns the current id given to the clip path element
	 *
	 * @return
	 */
	public String getClipPathUniqueID()
	{
		return clipPathUniqueID;
	}

	/**
	 * Sets the unique id given to the clip path element
	 *
	 * @param clipPathUniqueID
	 */
	public void setClipPathUniqueID(String clipPathUniqueID)
	{
		this.clipPathUniqueID = clipPathUniqueID;
	}

	/**
	 * Gets the unique id assigned to the circles
	 *
	 * @return
	 */
	public String getCircleUniqueID()
	{
		return circleUniqueID;
	}

	/**
	 * Sets the assigned numbers to the circles
	 *
	 * @param circleUniqueID
	 */
	public void setCircleUniqueID(String circleUniqueID)
	{
		this.circleUniqueID = circleUniqueID;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof RadialSVGSliderListItem))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		RadialSVGSliderListItem that = (RadialSVGSliderListItem) o;

		if (rendered != that.rendered)
		{
			return false;
		}
		if (getFaceBackgroundImageUrl() != null ? !getFaceBackgroundImageUrl().equals(that.getFaceBackgroundImageUrl()) : that.getFaceBackgroundImageUrl() != null)
		{
			return false;
		}
		if (!getClipPathUniqueID().equals(that.getClipPathUniqueID()))
		{
			return false;
		}
		if (getCircleUniqueID() != null ? !getCircleUniqueID().equals(that.getCircleUniqueID()) : that.getCircleUniqueID() != null)
		{
			return false;
		}
		if (!getContentContainer().equals(that.getContentContainer()))
		{
			return false;
		}
		if (!getContentWrapper().equals(that.getContentWrapper()))
		{
			return false;
		}
		return getContent().equals(that.getContent());
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
