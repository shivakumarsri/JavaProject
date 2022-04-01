package org.app.units;

public class Answer extends AbstractEntity {

    private String answerBody;

    private Question question;

    private User user;

    //Implementation of the abstract class defined in its parent class
    int id=0;

    @Override
    public void autoGenerateId() {
        id++;
        super.setId(id);
    }
    //getter and setter methods for private attributes


    public String getAnswerBody() {
        return answerBody;
    }

    public void setAnswerBody(String answerBody) {
        this.answerBody = answerBody;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Question getQuestion() {
        return question;
    }
}
