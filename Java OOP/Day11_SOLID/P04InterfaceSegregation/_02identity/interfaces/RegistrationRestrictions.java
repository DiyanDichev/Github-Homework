package Day11_SOLID.P04InterfaceSegregation._02identity.interfaces;

public interface RegistrationRestrictions {
    boolean getRequireUniqueEmail();

    int getMinRequiredPasswordLength();

    int getMaxRequiredPasswordLength();
}
