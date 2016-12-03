package com.jorugi.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class JorugiBoard {
	private Integer boardId;
	private String userId;
	private String boardContents;
	private String creationTm;
}
