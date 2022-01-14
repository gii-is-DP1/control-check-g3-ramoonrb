package org.springframework.samples.petclinic.recoveryroom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter

public class RecoveryRoom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@NotNull
    @Size(min = 3, max = 50)
    String name;
	
	@Min(0)
    double size;
	
	@NotNull
    boolean secure;
	
	@ManyToOne(optional=false)
	@NotNull
	@Transient
    RecoveryRoomType roomType;
}
