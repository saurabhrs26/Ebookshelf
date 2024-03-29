package com.example.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Builder
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString

public class JwtResponse {
	private String jwtToken;
	private String username;
	private long userId;
	private long cardId;
	private long MyshelfId;
	
}
