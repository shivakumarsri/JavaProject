package org.app.units;

public class Question extends AbstractEntity {

    private String questionBody;

    private User user;

    //Implementation of the abstract class defined in its parent class
    int id=0;

    @Override
    public void autoGenerateId() {
       id++;
       super.setId(id);
    }
    //getter and setter methods for the private attributes

    public void setQuestionBody(String questionBody){ this.questionBody=questionBody;}

    public String getQuestionBody(){ return questionBody ;}

    public void setUser(User user) { this.user = user; }

    public User getUser() { return user; }
}
