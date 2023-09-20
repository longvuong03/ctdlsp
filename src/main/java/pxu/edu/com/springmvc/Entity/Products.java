package pxu.edu.com.springmvc.Entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private double price;

	@ManyToOne
	@JoinColumn(name = "product_type_id")
	private ProductType productType;

	@ManyToOne
	@JoinColumn(name = "product_tag_id")
	private ProductTag Tag;

	@OneToMany(mappedBy = "products")
	private List<CartDetail> cartDetail;

	@OneToMany(mappedBy = "products")
	private List<OrderDetail> orderDetail;

}
