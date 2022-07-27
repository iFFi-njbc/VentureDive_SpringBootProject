package com.Hibernate.HibernateTutorial.One2Many;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class AnswerOne2Many {
	
	@Id
	@Column(name = "Id")
	private int Aid;
	private String answer;
	
	//Bi-Directional Mapping
	@ManyToOne
	private QuestionOne2Many question;
	
	
	public QuestionOne2Many getQuestion() {
		return question;
	}
	public void setQuestion(QuestionOne2Many question) {
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
	public AnswerOne2Many() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnswerOne2Many(int aid, String answer, QuestionOne2Many question) {
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
