package Day11_SOLID.P04InterfaceSegregation.identity.interfaces;

public interface RegistrationRestrictions {
    boolean getRequireUniqueEmail();

    int getMinRequiredPasswordLength();

    int getMaxRequiredPasswordLength();
}
