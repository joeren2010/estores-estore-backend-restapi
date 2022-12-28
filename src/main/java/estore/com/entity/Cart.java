package estore.com.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the carts database table.
 * 
 */
@Entity
@Table(name="carts")
@NamedQuery(name="Cart.findAll", query="SELECT c FROM Cart c")
public class Cart implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cartid")					//tells springboot to map to cartid
	private int cartId;						//by default: springboot will map this to cart_id
	@Column(name="productid")	
	private int productId;
	private int quantity;
	@Column(name="userid")	
	private int userId;

	
	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="cartid", referencedColumnName="productid", insertable = false, updatable = false)
	private Product product;
	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="cartid", referencedColumnName="userid", insertable = false, updatable = false)
	private User user;
	
	
	public Cart() {
	}

	public int getCartId() {
		return this.cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}