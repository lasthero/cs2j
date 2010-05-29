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

package RusticiSoftware.System;

public class NotImplementedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2547596193153245830L;

	/**
	 */
	public NotImplementedException() {
		super();
	}

	/**
	 * @param arg0
	 */
	public NotImplementedException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public NotImplementedException(Throwable arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public NotImplementedException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

}
