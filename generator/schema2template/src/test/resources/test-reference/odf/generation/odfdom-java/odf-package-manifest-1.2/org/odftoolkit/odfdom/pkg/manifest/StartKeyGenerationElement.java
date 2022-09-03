/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * Use is subject to license terms.
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.pkg.manifest;

import org.odftoolkit.odfdom.pkg.OdfPackageNamespace;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.pkg.OdfPackageNamespace;
/**
 * Manifest implementation of OpenDocument element  {@odf.element manifest:start-key-generation}.
 *
 */
public class StartKeyGenerationElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfPackageNamespace.MANIFEST, "start-key-generation");

	/**
	 * Create the instance of <code>StartKeyGenerationElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public StartKeyGenerationElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element manifest:start-key-generation}.
	 */
	@Override
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>KeySizeAttribute</code> , See {@odf.attribute manifest:key-size}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getKeySizeAttribute() {
		KeySizeAttribute attr = (KeySizeAttribute) getOdfAttribute(KeySizeAttribute.ATTRIBUTE_NAME);
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>KeySizeAttribute</code> , See {@odf.attribute manifest:key-size}
	 *
	 * @param keySizeValue   The type is <code>Integer</code>
	 */
	public void setKeySizeAttribute(Integer keySizeValue) {
		KeySizeAttribute attr = new KeySizeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(keySizeValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StartKeyGenerationNameAttribute</code> , See {@odf.attribute manifest:start-key-generation-name}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStartKeyGenerationNameAttribute() {
		StartKeyGenerationNameAttribute attr = (StartKeyGenerationNameAttribute) getOdfAttribute(StartKeyGenerationNameAttribute.ATTRIBUTE_NAME);
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StartKeyGenerationNameAttribute</code> , See {@odf.attribute manifest:start-key-generation-name}
	 *
	 * @param startKeyGenerationNameValue   The type is <code>String</code>
	 */
	public void setStartKeyGenerationNameAttribute(String startKeyGenerationNameValue) {
		StartKeyGenerationNameAttribute attr = new StartKeyGenerationNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(startKeyGenerationNameValue);
	}

}
