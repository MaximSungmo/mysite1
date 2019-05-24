package com.cafe24.mysite.action.board;

import com.cafe24.mysite.action.guestbook.DeleteAction;
import com.cafe24.mysite.action.guestbook.DeleteFormAction;
import com.cafe24.web.mvc.Action;
import com.cafe24.web.mvc.ActionFactory;

public class BoardActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		Action action = null;
		
		if ("view".equals(actionName)) {
			action = new ViewAction();
		} else if ("deleteform".equals(actionName)) {
			action = new DeleteFormAction();
		} else if ("delete".equals(actionName)) {
			action = new DeleteAction();
		} else {
			action = new BoardListAction();
		}

		return action;
	}

}
