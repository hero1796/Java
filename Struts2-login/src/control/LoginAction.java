package control;

import model.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 2L;
	private User userBean;

	public String execute() throws Exception {
		UserDAO ud = new UserDAO();
		if (ud.checkLogin(userBean)) {
			return "success";
		} else {
			addActionError(getText("error.login"));
			return "input";
		}
	}

	public void validate() {
		if (userBean.getUsername().length() == 0) {
			addFieldError("userBean.username", "Username is required.");
		}
		if (userBean.getPassword().length() == 0) {
			addFieldError("userBean.password", "Password is required.");
		}
	}

	public User getUserBean() {
		return userBean;
	}

	public void setUserBean(User userBean) {
		this.userBean = userBean;
	}
}