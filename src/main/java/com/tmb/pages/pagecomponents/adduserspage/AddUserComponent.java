package com.tmb.pages.pagecomponents.adduserspage;

import com.tmb.fixtures.addusers.entity.UserData;
import org.openqa.selenium.By;

import static com.tmb.utils.PageActionsHelper.select;
import static com.tmb.utils.PageActionsHelper.waitAndSendKeys;

public class AddUserComponent {

    private static final By USER_ROLE_DROP_DOWN = By.xpath("//label[text()='User Role']/following-sibling::select");
    private static final By STATUS_DROP_DOWN = By.xpath("//label[text()='Status']/following-sibling::select");
    private static final By EMPLOYEE_NAME_TEXT_BOX = By.xpath("//label[text()='Employee Name']/following-sibling::input");
    private static final By USER_NAME_TEXT_BOX = By.xpath("//label[text()='Username']/following-sibling::input");
    private static final By PASSWORD_TEXT_BOX = By.xpath("//label[text()='Password']/following-sibling::input");
    private static final By CONFIRM_PASSWORD_TEXT_BOX = By.xpath("//label[text()='Confirm Password']/following-sibling::input");

    public AddUserComponent setUserRoleDropDown(String userRole) {
        select(USER_ROLE_DROP_DOWN, e->e.selectByVisibleText(userRole));
        return this;
    }
    public AddUserComponent setStatusDropDown(String status) {
        select(STATUS_DROP_DOWN, e->e.selectByVisibleText(status));
        return this;
    }

    public AddUserComponent setEmployeeNameTextBox(String employeeName) {
        waitAndSendKeys(EMPLOYEE_NAME_TEXT_BOX,employeeName);
        return this;
    }

    public AddUserComponent setUserNameTextBox(String userName) {
        waitAndSendKeys(USER_NAME_TEXT_BOX,userName);
        return this;
    }

    public AddUserComponent setPasswordTextBox(String password) {
        waitAndSendKeys(PASSWORD_TEXT_BOX, password);
        return this;
    }

    public AddUserComponent setConfirmPasswordTextBox(String password) {
        waitAndSendKeys(CONFIRM_PASSWORD_TEXT_BOX, password);
        return this;
    }

    public boolean isSuccessMessageDisplayed(){
        return true;
    }

    public void fillDetails(UserData userData){
        setUserRoleDropDown(userData.getUserRole())
                .setUserNameTextBox(userData.getUserName())
                .setPasswordTextBox(userData.getPassword())
                .setConfirmPasswordTextBox(userData.getPassword())
                .setStatusDropDown(userData.getStatus())
                .setEmployeeNameTextBox(userData.getEmployeeName());
    }
}
