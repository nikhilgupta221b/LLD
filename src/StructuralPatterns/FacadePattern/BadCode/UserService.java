package StructuralPatterns.FacadePattern.BadCode;

public class UserService {
    public String getUserName(String userId) {
        return "Username for " + userId + " is username";
    }
}
