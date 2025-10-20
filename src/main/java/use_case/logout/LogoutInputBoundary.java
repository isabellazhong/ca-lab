package use_case.logout;

/**
 * Input Boundary for the logout use case.
 */
public interface LogoutInputBoundary {

    /**
     * Executes the Logout use case. After this executes,
     * there will be no logged-in user.
     */
    void execute(LogoutOutputData logoutOutputData);
}
