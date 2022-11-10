package com.example.spring.form;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class QuizForm {

	/** 識別ID　*/
	private Integer id;
	/** クイズの内容　*/
	@NotBlank
	private String question;
	/** クイズの解答 */
	private Boolean answer;
	/** 作成者 */
	@NotBlank
	private String author;
	/** 登録or変更判定用 */
	private Boolean newQuiz;
}
