package com.Hibernate.HibernateTutorial.One2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	
	@Id
	@Column(name = "Id")
	private int Aid;
	private String answer;
	
	//Bi-Directional Mapping
	@OneToOne(mappedBy = "answer")
	private Question question;
	
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public int getAid() {
		return Aid;
	}
	public void setAid(int aid) {
		Aid = aid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int aid, String answer, Question question) {
		super();
		Aid = aid;
		this.answer = answer;
		this.question = question;
	}
	@Override
	public String toString() {
		return "Answer [Aid=" + Aid + ", answer=" + answer + ", question=" + question + "]";
	}

}
