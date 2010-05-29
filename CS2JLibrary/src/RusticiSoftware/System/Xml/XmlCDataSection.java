/*
   Copyright 2007-2010 Rustici Software, LLC

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

   Author(s):

   Kevin Glynn (kevin.glynn@scorm.com)
*/

package RusticiSoftware.System.Xml;

import org.w3c.dom.CDATASection;
import org.w3c.dom.Text;

public class XmlCDataSection extends XmlNode {

	
	protected XmlCDataSection()
	{
		
	}
	public XmlCDataSection(CDATASection t)
	{
	   setNode(t);	
	}
	
	private CDATASection getText()
	{
		return (CDATASection)getNode();
	}
	

	protected void getOuterXml(StringBuffer sb)
	{
		sb.append("<![CDATA[" + getText().getNodeValue() + "]]>");
	}

}
