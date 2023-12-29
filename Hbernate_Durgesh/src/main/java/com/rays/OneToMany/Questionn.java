package com.rays.OneToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "question_many")
public class Questionn {

	@Id
	@Column(name = "question_id")
	private int questionId;

	private String question;

	@OneToMany
	private List<Answerr> answer;

	public int getQuestionId() {
		return questionId;
	}

	@Override
	public String toString() {
		return questionId + " " + question + " " + answer;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answerr> getAnswer() {
		return answer; 
	}

	public void setAnswer(List<Answerr> answer) {
		this.answer = answer;
	}

	

}
