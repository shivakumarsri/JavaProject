package org.app.units;

public class User extends AbstractEntity {

    //Username and password to login to the console QnA_app
    private String userName;

    private String password;

    private UserRole userRole;

    //Implementation of the abstract class defined in its parent class
    int id=0;

    @Override
    public void autoGenerateId() {
        id++;
        super.setId(id);
    }

    //getter and setter methods defined to access the  private variables of the class
    public void setUserName(String userName){ this.userName=userName; }

    public String getUserName(){ return userName; }

    public void setPassword(String password){ this.password=password;}

    public String getPassword(){ return password;}

    public void setUserRole(UserRole userRole){ this.userRole=userRole; }

    public UserRole getUserRole(){ return userRole;}

}
