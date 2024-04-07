/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

public class loggedUser {
    
    private static int adminUser;

    public static int getAdminUser() {
        return adminUser;
    }
    
    public static void setAdminUser(int adminUser) {
        loggedUser.adminUser = adminUser;
    }
    
}
