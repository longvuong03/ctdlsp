package pxu.edu.com.springmvc.Entity;

import javax.persistence.*;

@Entity
@Table(name = "cart_detail")
public class CartDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "quantity")
	private int quantity;

	@ManyToOne
	@JoinColumn(name = "cart_id")
	private Carts carts;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Products products;
}
