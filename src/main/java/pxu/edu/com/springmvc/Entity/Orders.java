package pxu.edu.com.springmvc.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "order_date")
    private Date orderDate;
    
    @Column(name = "shipping_address")
    private String shippingAddress;
    
    @OneToMany(mappedBy = "orders")
    private List<OrderDetail> orderDetails;
}
