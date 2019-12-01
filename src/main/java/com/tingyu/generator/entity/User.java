package com.tingyu.generator.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * @author Essionshy
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class User 
{
	private Integer	id;
	private String	lastName;
	private String	password;
	private String	gender;
	
	private Date	gmtCreate;
	private Date	gmtModified;

}
