package com.Hibernate.HibernateTutorial.One2Many;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.List;

@Entity
public class QuestionOne2Many {
	
	@Id
	@Column(name = "Id")
	private int Qid;
	private String question;

	@OneToMany(mappedBy = "question")
	private List<AnswerOne2Many> answers;
	
	

	@Override
	public String toString() {
		return "QuestionOne2Many [Qid=" + Qid + ", question=" + question + ", answers=" + answers + "]";
	}
	public QuestionOne2Many() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuestionOne2Many(int qid, String question, List<AnswerOne2Many> answers) {
		super();
		Qid = qid;
		this.question = question;
		this.answers = answers;
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
	public List<AnswerOne2Many> getAnswers() {
		return answers;
	}
	public void setAnswers(List<AnswerOne2Many> answers) {
		this.answers = answers;
	}


}
