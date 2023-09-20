package pxu.edu.com.springmvc.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Carts")
public class Carts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int Id;

	@Column(name = "created_date")
	private Date createdDate;

	@OneToMany(mappedBy = "carts")
	private List<CartDetail> cartDetails;

	
}
