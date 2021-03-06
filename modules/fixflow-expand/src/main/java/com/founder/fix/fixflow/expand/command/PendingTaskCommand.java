/**
 * Copyright 1996-2013 Founder International Co.,Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author kenshin
 */
package com.founder.fix.fixflow.expand.command;

import com.founder.fix.fixflow.core.impl.command.AbstractCustomExpandTaskCommand;
import com.founder.fix.fixflow.core.impl.command.ExpandTaskCommand;
import com.founder.fix.fixflow.core.impl.util.StringUtil;

public class PendingTaskCommand extends AbstractCustomExpandTaskCommand{

	
	/**
	 * 转办的任务编号
	 */
	protected String pendingTaskId;
	
	/**
	 * 转办的用户编号
	 */
	protected String pendingUserId;
	
	
	public String getPendingUserId() {
		return pendingUserId;
	}


	public void setPendingUserId(String pendingUserId) {
		this.pendingUserId = pendingUserId;
	}



	public String getPendingTaskId() {
		return pendingTaskId;
	}





	public void setPendingTaskId(String pendingTaskId) {
		this.pendingTaskId = pendingTaskId;
	}





	public PendingTaskCommand(ExpandTaskCommand expandTaskCommand) {
		super(expandTaskCommand);
		// TODO Auto-generated constructor stub
		this.pendingTaskId=StringUtil.getString(expandTaskCommand.getParamMap().get("pendingTaskId"));
		this.pendingUserId=StringUtil.getString(expandTaskCommand.getParamMap().get("pendingUserId"));
	}
	
	
	
	


}
