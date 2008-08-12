/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portalweb.portlet.enterpriseadmin;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * <a href="AddUser3Test.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class AddUser3Test extends BaseTestCase {
	public void testAddUser3() throws Exception {
		selenium.click(RuntimeVariables.replace("link=Users"));
		selenium.waitForPageToLoad("30000");
		selenium.click(RuntimeVariables.replace("//input[@value='Add User']"));
		selenium.waitForPageToLoad("30000");
		selenium.typeKeys("_79_screenName",
			RuntimeVariables.replace("selenium03"));
		selenium.type("_79_emailAddress",
			RuntimeVariables.replace("test03@selenium.com"));
		selenium.select("_79_prefixId", RuntimeVariables.replace("label=Ms."));
		selenium.typeKeys("_79_firstName", RuntimeVariables.replace("selen03"));
		selenium.type("_79_middleName", RuntimeVariables.replace("lenn"));
		selenium.typeKeys("_79_lastName", RuntimeVariables.replace("nium03"));
		selenium.select("_79_suffixId", RuntimeVariables.replace("label=PhD."));
		selenium.select("_79_birthdayMonth",
			RuntimeVariables.replace("label=May"));
		selenium.select("_79_birthdayDay", RuntimeVariables.replace("label=5"));
		selenium.select("_79_birthdayYear",
			RuntimeVariables.replace("label=1986"));
		selenium.select("_79_male", RuntimeVariables.replace("label=Female"));
		selenium.typeKeys("_79_jobTitle",
			RuntimeVariables.replace("Selenium Test 03"));
		selenium.click(RuntimeVariables.replace("//input[@value='Save']"));
		selenium.waitForPageToLoad("30000");
		selenium.click(RuntimeVariables.replace("//input[@value='Add']"));
		selenium.waitForPageToLoad("30000");
		selenium.type("_79_address",
			RuntimeVariables.replace("test03@selenium.com"));
		selenium.select("_79_typeId", RuntimeVariables.replace("label=E-mail"));
		selenium.click("_79_primaryCheckbox");
		selenium.click(RuntimeVariables.replace("//input[@value='Save']"));
		selenium.waitForPageToLoad("30000");
		selenium.type("_79_comments",
			RuntimeVariables.replace("This is a test comment!"));
		selenium.click("link=Password");
		selenium.type("_79_password1", RuntimeVariables.replace("test"));
		selenium.type("_79_password2", RuntimeVariables.replace("test"));
		selenium.click(RuntimeVariables.replace("//input[@value='Save']"));
		selenium.waitForPageToLoad("30000");
		selenium.click(RuntimeVariables.replace("link=Return to Full Page"));
		selenium.waitForPageToLoad("30000");
	}
}