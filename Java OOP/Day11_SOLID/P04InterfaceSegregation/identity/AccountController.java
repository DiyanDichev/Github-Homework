package Day11_SOLID.P04InterfaceSegregation.identity;

import Day11_SOLID.P04InterfaceSegregation.identity.interfaces.Account;

public class AccountController {
    private final Account manager;

    public AccountController(Account manager) {
        this.manager = manager;
    }
    public void changePassword(String oldPass,String newPass){
        this.manager.changePassword(oldPass,newPass);
    }
}
