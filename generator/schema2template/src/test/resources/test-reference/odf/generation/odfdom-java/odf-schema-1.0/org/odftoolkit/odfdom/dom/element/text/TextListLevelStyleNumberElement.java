/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.style.StyleTextPropertiesElement;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNumFormatAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNumLetterSyncAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNumPrefixAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNumSuffixAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextDisplayLevelsAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextStartValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextStyleNameAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:list-level-style-number}.
 *
 */
public class TextListLevelStyleNumberElement extends TextListLevelStyleElementBase {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "list-level-style-number");

	/**
	 * Create the instance of <code>TextListLevelStyleNumberElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextListLevelStyleNumberElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:list-level-style-number}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleNumFormatAttribute</code> , See {@odf.attribute style:num-format}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleNumFormatAttribute() {
		StyleNumFormatAttribute attr = (StyleNumFormatAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "num-format");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleNumFormatAttribute</code> , See {@odf.attribute style:num-format}
	 *
	 * @param styleNumFormatValue   The type is <code>String</code>
	 */
	public void setStyleNumFormatAttribute(String styleNumFormatValue) {
		StyleNumFormatAttribute attr = new StyleNumFormatAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleNumFormatValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleNumLetterSyncAttribute</code> , See {@odf.attribute style:num-letter-sync}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getStyleNumLetterSyncAttribute() {
		StyleNumLetterSyncAttribute attr = (StyleNumLetterSyncAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "num-letter-sync");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleNumLetterSyncAttribute</code> , See {@odf.attribute style:num-letter-sync}
	 *
	 * @param styleNumLetterSyncValue   The type is <code>Boolean</code>
	 */
	public void setStyleNumLetterSyncAttribute(Boolean styleNumLetterSyncValue) {
		StyleNumLetterSyncAttribute attr = new StyleNumLetterSyncAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(styleNumLetterSyncValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleNumPrefixAttribute</code> , See {@odf.attribute style:num-prefix}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleNumPrefixAttribute() {
		StyleNumPrefixAttribute attr = (StyleNumPrefixAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "num-prefix");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleNumPrefixAttribute</code> , See {@odf.attribute style:num-prefix}
	 *
	 * @param styleNumPrefixValue   The type is <code>String</code>
	 */
	public void setStyleNumPrefixAttribute(String styleNumPrefixValue) {
		StyleNumPrefixAttribute attr = new StyleNumPrefixAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleNumPrefixValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleNumSuffixAttribute</code> , See {@odf.attribute style:num-suffix}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleNumSuffixAttribute() {
		StyleNumSuffixAttribute attr = (StyleNumSuffixAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "num-suffix");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleNumSuffixAttribute</code> , See {@odf.attribute style:num-suffix}
	 *
	 * @param styleNumSuffixValue   The type is <code>String</code>
	 */
	public void setStyleNumSuffixAttribute(String styleNumSuffixValue) {
		StyleNumSuffixAttribute attr = new StyleNumSuffixAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleNumSuffixValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextDisplayLevelsAttribute</code> , See {@odf.attribute text:display-levels}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTextDisplayLevelsAttribute() {
		TextDisplayLevelsAttribute attr = (TextDisplayLevelsAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "display-levels");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return Integer.valueOf(TextDisplayLevelsAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextDisplayLevelsAttribute</code> , See {@odf.attribute text:display-levels}
	 *
	 * @param textDisplayLevelsValue   The type is <code>Integer</code>
	 */
	public void setTextDisplayLevelsAttribute(Integer textDisplayLevelsValue) {
		TextDisplayLevelsAttribute attr = new TextDisplayLevelsAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(textDisplayLevelsValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextStartValueAttribute</code> , See {@odf.attribute text:start-value}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTextStartValueAttribute() {
		TextStartValueAttribute attr = (TextStartValueAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "start-value");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return Integer.valueOf(TextStartValueAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextStartValueAttribute</code> , See {@odf.attribute text:start-value}
	 *
	 * @param textStartValueValue   The type is <code>Integer</code>
	 */
	public void setTextStartValueAttribute(Integer textStartValueValue) {
		TextStartValueAttribute attr = new TextStartValueAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(textStartValueValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextStyleNameAttribute</code> , See {@odf.attribute text:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextStyleNameAttribute() {
		TextStyleNameAttribute attr = (TextStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextStyleNameAttribute</code> , See {@odf.attribute text:style-name}
	 *
	 * @param textStyleNameValue   The type is <code>String</code>
	 */
	public void setTextStyleNameAttribute(String textStyleNameValue) {
		TextStyleNameAttribute attr = new TextStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textStyleNameValue);
	}

	/**
	 * Create child element {@odf.element style:text-properties}.
	 *
	 * @return the element {@odf.element style:text-properties}
	 */
	public StyleTextPropertiesElement newStyleTextPropertiesElement() {
		StyleTextPropertiesElement styleTextProperties = ((OdfFileDom) this.ownerDocument).newOdfElement(StyleTextPropertiesElement.class);
		this.appendChild(styleTextProperties);
		return styleTextProperties;
	}

  /**
   * Accept an visitor instance to allow the visitor to do some operations. Refer to visitor design
   * pattern to get a better understanding.
   *
   * @param visitor an instance of DefaultElementVisitor
   */
	@Override
	public void accept(ElementVisitor visitor) {
		if (visitor instanceof DefaultElementVisitor) {
			DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
			defaultVisitor.visit(this);
		} else {
			visitor.visit(this);
		}
	}
}
