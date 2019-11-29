package com.tyss.jpawithhibernate.onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "pencilbox")
public class PencilBox {

	@Id
	@Column
	private int boxid;
	@Column
	private String boxname;
	
	@Exclude
	@OneToMany(mappedBy = "pencilBox") //bidirectional
	private List<Pencil> pencil;
}
