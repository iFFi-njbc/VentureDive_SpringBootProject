package com.Hibernate.HibernateTutorial.One2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	@Column(name = "Id")
	private int Qid;
	private String question;
	@OneToOne
	@JoinColumn(name = "f_k") //to change the name of foreign key
	private Answer answer;
	@Override
	public String toString() {
		return "Question [Qid=" + Qid + ", question=" + question + ", answer=" + answer + "]";
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int qid, String question, Answer answer) {
		super();
		Qid = qid;
		this.question = question;
		this.answer = answer;
	}
	public int getQid() {
		return Qid;
	}
	public void setQid(int qid) {
		Qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

}
