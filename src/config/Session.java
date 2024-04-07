// Session.java
package config;

import java.util.HashMap;
import java.util.Map;

public class Session {
    private static Map<String, Object> sessionData = new HashMap<>();
    private static int loggedInUserId = -1; // Default value indicating no user logged in

    public static boolean login(int id) {
        if (id != 0) {
            sessionData.put("loggedIn", true);
            loggedInUserId = id; // Set the logged-in user ID
            return true;
        } else {
            return false;
        }
    }

    // Method to check if the user is logged in
    public static boolean isLoggedIn() {
        return sessionData.containsKey("loggedIn") && (boolean) sessionData.get("loggedIn");
    }

    // Method to get the ID of the logged-in user
    public static int getLoggedInUserId() {
        return loggedInUserId; // Return the logged-in user ID
    }

    // Method to logout user
    public static void logout() {
        sessionData.clear();
        loggedInUserId = -1; // Reset the logged-in user ID
    }
}
