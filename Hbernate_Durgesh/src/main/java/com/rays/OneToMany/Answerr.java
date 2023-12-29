package com.rays.OneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answer_many")
public class Answerr {

	@Id
	@Column(name = "answer_id")
	private int answerId;

	private String answer;

	@ManyToOne
	private Questionn question;

	@Override
	public String toString() {
		return answerId + " = " + answer;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Questionn getQuestion() {
		return question;
	}

	public void setQuestion(Questionn question) {
		this.question = question;
	}
}
